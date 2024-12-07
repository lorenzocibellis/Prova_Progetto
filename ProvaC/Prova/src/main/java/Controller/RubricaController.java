
package Controller;

import GestioneRubrica.Rubrica;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
/**
 * @file RubricaController.java
 * 
 * @brief Classe Controller per la gestione dell'interfaccia dell'applicazione "Rubrica".
 * Questa classe gestisce le interazioni con l'utente e le azioni sulla Rubrica.
 *
 * @see GestioneRubrica.Rubrica
 * @see Controller.Controller
 */
public class RubricaController extends Controller {

    /**
     *  Puntatore all'istanza di Rubrica gestita.
     */
    private Rubrica rubricaPointer;

    /**
     *  Tabella per visualizzare la lista dei contatti nella Rubrica.
     */
    private TableView rubricaList;

    /**
     *  Pulsante per rimuovere un contatto selezionato dalla Rubrica.
     */
    private Button removeButton;

    /**
     * Pulsante per aggiungere un nuovo contatto alla Rubrica.
     */
    private Button addButton;

    /**
     * Campo di testo per cercare contatti nella Rubrica.
     */
    private TextField researchField;

    /**
     *  Pulsante per importare contatti nella Rubrica.
     */
    private Button importButton;

    /**
     *  Pulsante per esportare contatti dalla Rubrica.
     */
    private Button exportButton;

    /**
     * @brief Pulsante per uscire dall'applicazione.
     */
    private Button exitButton;

    /**
     * @brief Imposta la tabella con una nuova istanza di Rubrica.
     * 
     * @param r la nuova Rubrica da visualizzare nella tabella
     */
    private void setRubricaList(Rubrica r) {
    
    }

    /**
     * @brief Aggiunge un nuovo contatto alla Rubrica.
     * 
     * @param e evento che attiva l'aggiunta del contatto
     */
    private void add(ActionEvent e) {
    
    }

    /**
     * @brief Effettua una ricerca di contatti nella Rubrica.
     * 
     * @param e evento che attiva la ricerca
     */
    private void research(ActionEvent e) {
    
    }

    /**
     * @brief Elimina un contatto selezionato dalla Rubrica.
     * 
     * @param e evento che attiva l'eliminazione
     */
    private void delete(ActionEvent e) {
    
    }

    /**
     * @brief Apre i dettagli di un contatto selezionato.
     * 
     * @param e evento che attiva l'apertura del contatto
     */
    private void openContact(ActionEvent e) {
    
    }

    /**
     * @brief Esporta i contatti della Rubrica in un file.
     * 
     * @param e evento che attiva l'esportazione
     */
    private void exportRubrica(ActionEvent e) {
    
    }

    /**
     * @brief Importa contatti nella Rubrica da un file.
     * 
     * @param e evento che attiva l'importazione
     */
    private void importRubrica(ActionEvent e) {
    
    }
}