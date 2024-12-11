/**
 * @file ContattoController.java
 * 
 * @brief Controller per la gestione delle operazioni sui contatti.
 *
 *    Questa classe si occupa della gestione dell'interfaccia utente per interagire
 *        con un oggetto {@link Contatto.java}. Permette di  modificare, confermare, eliminare e
 *        gestire le operazioni sui dati del contatto.
 *        Estende la classe {@link Controller.java} da cui ne eredita i metodi {@code display} e {@code goBack }.
 * 
 * @see GestioneRubrica.Rubrica
 * @see Controller.Controller
 * @see GestioneRubrica.Contatto
 */


package Controller;

import GestioneRubrica.Contatto;
import GestioneRubrica.Rubrica;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javax.swing.JOptionPane;


public class ContattoController extends Controller implements Initializable {


    /**
     * Campo di testo per il nome del contatto.
     */
    @FXML
    private javafx.scene.control.TextField nameField;

    /**
     * Campo di testo per il cognome del contatto.
     */
    @FXML
    private javafx.scene.control.TextField surnameField;

    /**
     * Campo di testo per il primo numero di telefono del contatto.
     */
    @FXML
    private javafx.scene.control.TextField number1Field;

    /**
     * Campo di testo per il secondo numero di telefono del contatto.
     */
    @FXML
    private javafx.scene.control.TextField number2Field;

    /**
     * Campo di testo per il terzo numero di telefono del contatto.
     */
    @FXML
    private javafx.scene.control.TextField number3Field;

    /**
     * Campo di testo per il primo indirizzo email del contatto.
     */
    @FXML
    private javafx.scene.control.TextField email1Field;

    /**
     * Campo di testo per il secondo indirizzo email del contatto.
     */
    @FXML
    private javafx.scene.control.TextField email2Field;

    /**
     * Campo di testo per il terzo indirizzo email del contatto.
     */
    @FXML
    private javafx.scene.control.TextField email3Field;

    /**
     * Bottone per abilitare la modifica del contatto.
     */
    @FXML
    private javafx.scene.control.Button modifyButton;

    /**
     * Bottone per confermare le modifiche al contatto.
     */
    @FXML
    private javafx.scene.control.Button confirmButton;

    /**
     * Bottone per eliminare il contatto.
     */
    @FXML
    private javafx.scene.control.Button removeButton;

    /**
     * Bottone per uscire dalla vista corrente.
     */
    @FXML
    private javafx.scene.control.Button exitButton;

    private Rubrica rubricaPointer;
    
    private Contatto contattoSelezionato;
    
    private boolean typeController;
    
    
    
    /**
    * @brief Inizializza il controller al caricamento della scena.
    * 
    * Questo metodo viene chiamato automaticamente dal framework JavaFX 
    * quando la scena associata a questo controller viene caricata.
    * 
    * @param location La posizione del file FXML associato al controller (può essere null se non fornito).
    * @param resources Le risorse internazionalizzate utilizzate per la scena (può essere null se non presenti).
    * 
    * */
     @Override
    public void initialize(URL location, ResourceBundle resources) {
    
   
    nameField.setText("");
    surnameField.setText("");
    number1Field.setText("");
    number2Field.setText("");
    number3Field.setText("");
    email1Field.setText("");
    email2Field.setText("");
    email3Field.setText("");
    contattoSelezionato = null;
    
    
    
    }
    
    
    /**
     * @brief Imposta il controller con i riferimenti e inizializza i componenti.
     *
     *        Questo metodo permette di configurare il controller e i suoi componenti
     *        per il funzionamento corretto dell'interfaccia utente.
     * 
     *  @param r il riferimento alla rubrica.
     * 
     * @pre r non deve essere null.
     * 
     * @post Il controller conterrà il riferimento alla rubrica su cui lavorare.
     */
    @FXML
    public void setController(Rubrica r) {
        // Da implementare
    
   
    this.rubricaPointer = r;
    typeController = false;
    modifyButton.setVisible(false);
    removeButton.setVisible(false);
    
    
    
    }

    /**
     * @brief Imposta il controller associando un contatto specifico.
     *
     * @param c il contatto da associare al controller.
     * 
     * @param r il riferimento alla rubrica a cui il contatto appartiene.
     * 
     * @pre c ed r non devono essere null.
     * 
     * @post il controller conterrà le informazioni di c.
     */
    @FXML
    public void setController(Contatto c, Rubrica r) {
         
        rubricaPointer=r;
        typeController = true;
        
        // Memorizza il contatto passato al controller
        this.contattoSelezionato = c;

        // Popola i campi della GUI con i dati del contatto
        nameField.setText(c.getNome());
        surnameField.setText(c.getCognome());

        // Gestisci l'array di numeri
        String[] numeri = c.getNumeri();
        number1Field.setText(numeri[0]);
        number2Field.setText(numeri[1]);
        number3Field.setText(numeri[2]);

        // Gestisci l'array di email
        String[] emails = c.getEmails();
        email1Field.setText(emails[0]);
        email2Field.setText(emails[1]);
        email3Field.setText(emails[2]);
        
        confirmButton.setVisible(false);
        exitButton.setVisible(false);
        
        
        
    }

    /**
     * @brief Disabilita l'interazione con i campi di testo
     *
     * Il metodo disabilita l'interazione con i campi di testo in modo che essi siano 
     * accedibili dall'utente in modalità di sola lettura
     *        
     */
    @FXML
    public void disableModify() {
       
        this.nameField.setEditable(false);
        this.surnameField.setEditable(false);
        this.number1Field.setEditable(false);
        this.number2Field.setEditable(false);
        this.number3Field.setEditable(false);
        this.email1Field.setEditable(false);
        this.email2Field.setEditable(false);
        this.email3Field.setEditable(false);

    }

    /**
     * @brief Conferma le modifiche al contatto.
     *
     *        Questo metodo viene invocato quando l'utente preme il bottone di conferma.
     *        Le modifiche ai dati del contatto vengono validate e salvate.
     *
     * @param c l'evento che ha generato l'azione di conferma.
     */
    @FXML
    private void modify(javafx.event.ActionEvent event) {
           // Controlla se il contatto è stato selezionato
        
           if (contattoSelezionato == null) {
            System.out.println("Nessun contatto selezionato.");
            return;
        }    


        //Salvo i numeri e le mail salvate nei rispettivi array 
        String[] numeri = {number1Field.getText(),number2Field.getText(),number3Field.getText()};

        String[] emails = {email1Field.getText(),email2Field.getText(),email3Field.getText()};

        // Rimuovi elementi vuoti da numeri ed email
        //numeri = java.util.Arrays.stream(numeri).filter(n -> !n.isEmpty()).toArray(String[]::new);
        //emails = java.util.Arrays.stream(emails).filter(e -> !e.isEmpty()).toArray(String[]::new);

        // Modifico i campi del contatto selezionato, richiamando i metodi impiegati per i campi della GUI
        contattoSelezionato.setNome(nameField.getText());
        contattoSelezionato.setCognome(surnameField.getText());
        contattoSelezionato.setEmail1(email1Field.getText());
        contattoSelezionato.setEmail2(email2Field.getText());
        contattoSelezionato.setEmail3(email3Field.getText());
        contattoSelezionato.setNumero1(number1Field.getText());
        contattoSelezionato.setNumero2(number2Field.getText());
        contattoSelezionato.setNumero3(number3Field.getText());

        // Opzionale: salva il contatto nella rubrica, se necessario
        // rubrica.salvaContatto(contattoSelezionato);

        // Notifica che le modifiche sono state salvate
        System.out.println("Modifiche salvate per: " + contattoSelezionato.getNome() + " " + contattoSelezionato.getCognome());

        // Disabilita i campi di modifica dopo aver salvato le modifiche
        disableModify();   

    }

    /**
     * @brief Abilita la modifica dei dati del contatto.
     *
     *        Questo metodo viene invocato quando l'utente preme il bottone di modifica.
     *        I campi di input diventano modificabili per permettere all'utente di,eventualmente,
     *        modificare i dati.
     *
     * @param c l'evento che ha generato l'azione di modifica.
     */
    @FXML
    private void delete(javafx.event.ActionEvent event) {
       
        ObservableList<Contatto> list;
        list = FXCollections.observableArrayList();
        list.add(contattoSelezionato);
        rubricaPointer.rimuoviContatto(list);

    }

    /**
     * @brief Elimina il contatto corrente.
     *
     *        Questo metodo viene invocato quando l'utente preme il bottone per eliminare uno o più contatti.
     *        Il contatto o i contatti selezionati vengono rimossi dalla lista dei contatti gestita dall'applicazione.
     *
     * @param c l'evento che ha generato l'azione di eliminazione.
     */
    @FXML
    private void goBack(javafx.event.ActionEvent event) {
        // Da implementare
    
      javafx.stage.Stage stage = (javafx.stage.Stage) exitButton.getScene().getWindow();
        
      super.goBack(stage);
    
    }

    @FXML
    private void confirm(javafx.event.ActionEvent event) {
    boolean flag;
    if(typeController == false){
        
        flag = nominativeControl(nameField.getText(), surnameField.getText());
        
        if(!flag){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Errore");
            alert.setHeaderText(null); // Se non vuoi nessun header, puoi impostarlo a null
            alert.setContentText("Nominativi inseriti erroneamente");
            alert.showAndWait();
        }
        
        flag &= numberControl(number1Field.getText());
        flag &= numberControl(number2Field.getText());
        flag &= numberControl(number3Field.getText());
        flag &= mailControl(email1Field.getText());
        flag &= mailControl(email2Field.getText());
        flag = mailControl(email3Field.getText());
        if(!flag){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Errore");
            alert.setHeaderText(null); // Se non vuoi nessun header, puoi impostarlo a null
            alert.setContentText("Recapiti inseriti erroneamente");
            alert.showAndWait();
        }
        else{

   
        contattoSelezionato = new Contatto();
        contattoSelezionato.setNome(nameField.getText());
        contattoSelezionato.setCognome(surnameField.getText());
        contattoSelezionato.setEmail1(email1Field.getText());
        contattoSelezionato.setEmail2(email2Field.getText());
        contattoSelezionato.setEmail3(email3Field.getText());
        contattoSelezionato.setNumero1(number1Field.getText());
        contattoSelezionato.setNumero2(number2Field.getText());
        contattoSelezionato.setNumero3(number3Field.getText());
        this.rubricaPointer.aggiungiContatto(contattoSelezionato);
        
        javafx.stage.Stage stage = (javafx.stage.Stage) exitButton.getScene().getWindow();
        super.goBack(stage);
        }
    }
        
    else{
        contattoSelezionato.setNome(nameField.getText());
        contattoSelezionato.setCognome(surnameField.getText());
        contattoSelezionato.setEmail1(email1Field.getText());
        contattoSelezionato.setEmail2(email2Field.getText());
        contattoSelezionato.setEmail3(email3Field.getText());
        contattoSelezionato.setNumero1(number1Field.getText());
        contattoSelezionato.setNumero2(number2Field.getText());
        contattoSelezionato.setNumero3(number3Field.getText());   
        javafx.stage.Stage stage = (javafx.stage.Stage) exitButton.getScene().getWindow();
        
        super.goBack(stage);
        }
    
    
    }
    
    private boolean numberControl(String number){
        if(number.isEmpty())
            return true;
        if(number.length() != 10)
            return false;
        for(int i = 0 ; i < 10 ; i++){
            if(!Character.isDigit(number.charAt(i)))
                return false;
        }
        return true;
    }
    
    private boolean mailControl(String mail){
        if (mail.isEmpty())
            return true;
        String emailRegex = "^[a-zA-Z-.0-9]+@[a-z]+[.]+[a-zA-Z]{2,}$";
       
        Pattern pattern = Pattern.compile(emailRegex);
      
        return pattern.matcher(mail).matches();
    }
    
    private boolean nominativeControl(String name, String surname){
        boolean flag = true;
        if(surnameField.getText().isEmpty())
            flag = false;
        else if(flag && !Character.isLetter(surnameField.getText().charAt(0)))
            flag = false;
        
        if(flag && nameField.getText().isEmpty())
            flag = false;
        else if(flag && !Character.isLetter(nameField.getText().charAt(0)))
                flag = false;
        return flag;
    }
    
    
}
