/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import GestioneRubrica.Rubrica;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class RubricaController extends Controller{

    //attributi
    private Rubrica rubricaPointer;
    private TableView rubricaList;
    private Button removeButton;
    private Button addButton;
    private TextField researchField;
    private Button importButton;
    private Button exportButton;
    private Button exitButton;

    public RubricaController(Rubrica rubricaPointer, TableView rubricaList, Button removeButton, Button addButton, TextField researchField, Button importButton, Button exportButton, Button exitButton) {
        this.rubricaPointer = rubricaPointer;
        this.rubricaList = rubricaList;
        this.removeButton = removeButton;
        this.addButton = addButton;
        this.researchField = researchField;
        this.importButton = importButton;
        this.exportButton = exportButton;
        this.exitButton = exitButton;
    }
    
    //metodi
    private void setRubricaList(Rubrica r){}
    
    private void add(ActionEvent e){}
    
    private void research(ActionEvent e){}
    
    private void delete(ActionEvent e){}
    
    private void openContact(ActionEvent e){}
    
    private void exportRubrica(ActionEvent e){}
    
    private void importRubrica(ActionEvent e){}
    
    
}