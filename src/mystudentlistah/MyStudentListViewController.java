/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystudentlistah;

import accesso.AccessStudenteController;
import java.io.IOException;
import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
/**
 *
 * @author lorenzocibellis
 */
public class MyStudentListViewController implements Initializable {   

    Student x = null;
        private Label label;
    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField codeField;
    @FXML
    private Button addButton;
    @FXML
    private Button delButton;
    @FXML
    private TableView<Student> studentsTable;
    @FXML
    private TableColumn<Student, String> nameClm;
    @FXML
    private TableColumn<Student, String> surnameClm;
    @FXML
    private TableColumn<Student, String> codeClm;
    
    
   
    private ObservableList<Student> students;
    @FXML
    private Button multiple;
    @FXML
    private Button single;
    @FXML
    private Button info;
    @FXML
    private SplitPane pane;
    @FXML
    private MenuItem close;


    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        students = FXCollections.observableArrayList();
        
        nameClm.setCellValueFactory(s -> { return new SimpleStringProperty(s.getValue().getName()); });   // freccetta, a sx c'è il parametro del metodo,e a dx il corpo del metodo con un eventuale restituzuione
        surnameClm.setCellValueFactory(new PropertyValueFactory("surname"));  // dato questo nome va a vedere se esiste get seguito da surname, se esiste si fa restituire il valore e lo avvolge in una simple property
        codeClm.setCellValueFactory(new PropertyValueFactory("code"));  // dato questo nome va a vedere se e siste get seguito da code, se esiste si fa restituire il valore e lo avvolge in una simple property

        
        studentsTable.setItems(students);
        
        addButton.disableProperty().bind(Bindings.createBooleanBinding( //non permette di aggiungere studenti se non hanno nome,cognome e matricola
                () -> ((nameField.getText().isEmpty() || surnameField.getText().isEmpty() || codeField.getText().isEmpty() )), nameField.textProperty(), surnameField.textProperty() , codeField.textProperty()));
    
        single.disableProperty().set(true); //all'apertura disabilita il pulsante di selezione singola 
        
        
        EventHandler<KeyEvent> enterHandler = event-> { //Evento di inserimento con tasto ENTER- nome: enterHandler
            if(event.getCode() == javafx.scene.input.KeyCode.ENTER)
            try {
                addStudent(null);
            } catch (IOException ex) {
                Logger.getLogger(MyStudentListViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        };
        
        pane.setOnKeyPressed(enterHandler);
        studentsTable.setOnKeyPressed(enterHandler); 
        
        EventHandler<KeyEvent> cancHandler = event-> { //Evento di cancellazione con tasto D- nome : cancHandler
            if(event.getCode() == javafx.scene.input.KeyCode.D)
                delStudent(null);
        };
        
        studentsTable.setOnKeyPressed(cancHandler);
    }    

    @FXML
    private void addStudent(ActionEvent event) throws IOException {
        String matricola = codeField.getText();
        if(matricola.length() <= 0 )
            return;
        for(int i = 0 ; i < matricola.length() ; i++){
            if(!Character.isDigit(matricola.charAt(i)))
                return;
        }
        Student t = new Student(nameField.getText(), surnameField.getText(), codeField.getText());
        if(students.contains(t)){ //controlla la matricola
            
        Parent root = FXMLLoader.load(getClass().getResource("/popUp/Error.fxml")); //carica popUp.Error
        Scene s = new Scene(root);
        Stage pp = new Stage();
        
        pp.setScene(s);
        pp.initModality(Modality.APPLICATION_MODAL); // non permette l'interazione con altre finestre se non il pop-up
        pp.show(); //Mostra popUp.Error
    }
        else{
            students.add(t);
            students.sort(Comparator.naturalOrder()); // ordina la lista
        }
    
    }

    @FXML
    private void delStudent(ActionEvent event) {
        
        students.removeAll(studentsTable.getSelectionModel().getSelectedItems()); // recupera la lista di oggetti selezionati e li rimuove
        
    }


    @FXML
    private void multipleOn(ActionEvent event) throws IOException {
        single.disableProperty().set(false); //abilita il pulsante di selezione singola
        
        Parent root = FXMLLoader.load(getClass().getResource("/popUp/HowToSelectMultiple.fxml"));
        Scene scene = new Scene(root);
        Stage avviso = new Stage();
        
        avviso.setScene(scene);
        avviso.initModality(Modality.APPLICATION_MODAL); // non permette l'interazione con altre finestre se non il pop-up
        avviso.show();
        studentsTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); // permette la selezione multipla
        
        multiple.disableProperty().set(true); //disabilita il pulsante di selezione multipla
        info.disableProperty().set(true);   //disabilita il pulsante di apertura informazioni
    }

    @FXML
    private void deactivateMul(ActionEvent event) {
        multiple.disableProperty().set(false); //abilita il pulsante di selezione multipla
        studentsTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE); // non permette la selezione multipla
        single.disableProperty().set(true); //disabilita il pulsante di selezione singola
        info.disableProperty().set(false); //abilita il pulsante di apertura informazioni

    }

    @FXML
    private void openInfo(ActionEvent event) throws IOException {
       // ((Stage)info.getScene().getWindow()).close();
        FXMLLoader base = new FXMLLoader(getClass().getResource("/accesso/AccessStudente.fxml"));
        Parent root = base.load();
        
        AccessStudenteController ctr = base.getController();
        
        ctr.set(studentsTable.getSelectionModel().getSelectedItem());
        
        Scene scene = new Scene(root);
        Stage avviso = new Stage();
        
        avviso.setScene(scene);
        avviso.initModality(Modality.APPLICATION_MODAL); // non permette l'interazione con altre finestre se non il pop-up
        
        
        avviso.show();

        
    }

    @FXML
    private void closeApp(ActionEvent event) {
    }
}
