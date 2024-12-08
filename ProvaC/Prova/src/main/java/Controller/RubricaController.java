/**
 * @file RubricaController.java
 * 
 * @brief Classe Controller per la gestione dell'interfaccia dell'applicazione "Rubrica".
 * 
 * Questa classe gestisce le interazioni con l'utente e le azioni sulla Rubrica.
 *
 * @see GestioneRubrica.Rubrica
 * @see Controller.Controller
 */



package Controller;

import GestioneRubrica.Contatto;
import GestioneRubrica.Rubrica;
import com.mycompany.prova.App;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class RubricaController implements Initializable {

    @FXML
    private TableView<Contatto> rubricaList;
    @FXML
    private TableColumn<Contatto, String> cognomeClm;
    @FXML
    private TableColumn<Contatto, String> nomeClm;

    
   
    
    private Rubrica rubricaPointer;
    
    @FXML
    private javafx.scene.control.Button Open;
    @FXML
    private javafx.scene.control.Button addButton;
            
            
    
     @Override
    public void initialize(URL location, ResourceBundle resources) {
    
        
        this.rubricaPointer = new Rubrica();
        
         
       
        nomeClm.setCellValueFactory(s -> { return new SimpleStringProperty(s.getValue().getNome()); });   // freccetta, a sx c'è il parametro del metodo,e a dx il corpo del metodo con un eventuale restituzuione
        cognomeClm.setCellValueFactory(new PropertyValueFactory("cognome"));  // dato questo nome va a vedere se esiste get seguito da surname, se esiste si fa restituire il valore e lo avvolge in una simple property

        
        rubricaList.setItems(rubricaPointer.getContactList());   // collega i dati della rubrica alla tableview
        rubricaList.getSelectionModel().setSelectionMode(javafx.scene.control.SelectionMode.MULTIPLE);
        
        
        
        
        
    }
    
    
    /**
     * @brief Imposta la tabella con una nuova istanza di Rubrica.
     * 
     * @param r la nuova Rubrica da visualizzare nella tabella
     * 
     * @pre r deve essere diverso da null.
     * 
     * @post il controller conterrà il puntatore alla rubrica r.
    
    @FXML
    private void setRubricaList(Rubrica r) {
    
        this.rubricaPointer = r;
        
    }

    /**
     * @brief Aggiunge un nuovo contatto alla Rubrica.
     * 
     * @param e evento che attiva l'aggiunta del contatto
     */
    @FXML
    private void add(javafx.event.ActionEvent event) throws IOException {
        
        
        FXMLLoader f = App.getFXML("Contatto");
        Parent root = f.load();
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        
        
    }

    
    
    
    
    
    
    /**
     * @brief Effettua una ricerca di contatti nella Rubrica.
     * 
     * @param e evento che attiva la ricerca
     */
    private void research(ActionEvent e) {
        
        /*if(!researchField.getText().isEmpty())
            rubricaList.setItems(rubricaPointer.ricercaContatti(researchField.getText()).getContactList());
        else
            rubricaList.setItems(rubricaPointer.getContactList());*/
        
    }

    /**
     * @brief Elimina un contatto selezionato dalla Rubrica.
     * 
     * @param e evento che attiva l'eliminazione
     */
    private void delete(ActionEvent e) {
    
        rubricaPointer.rimuoviContatto(rubricaList.getSelectionModel().getSelectedItems());
        
    }

    /**
     * @brief Apre i dettagli di un contatto selezionato.
     * 
     * @param e evento che attiva l'apertura del contatto
     */
    @FXML
    private void openContact(javafx.event.ActionEvent event) throws IOException {
    
        Contatto temp = (Contatto) rubricaList.getSelectionModel().getSelectedItem();
                
        if(temp == null)
            return;
        
        
        FXMLLoader base = new FXMLLoader(getClass().getResource("Contatto.fxml"));
        Parent root = base.load();
        
        ContattoController ctr = base.getController();
        
        
        ctr.setController(temp, rubricaPointer);
        
        Scene scene = new Scene(root);
        Stage avviso = new Stage();
        
        avviso.setScene(scene);
        avviso.initModality(Modality.APPLICATION_MODAL); // non permette l'interazione con altre finestre se non il pop-up
        
        
        avviso.show();
        
    }

    /**
     * @brief Esporta i contatti della Rubrica in un file.
     * 
     * @param e evento che attiva l'esportazione
     */



   
}