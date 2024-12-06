/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Acer
 */

import GestioneRubrica.Contatto;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javafx.fxml.FXML;

public class ContattoController extends Controller{

    //attributi
    private Contatto contactPointer;
    private TextField nameField;
    private TextField surnameField;
    private TextField number1Field;
    private TextField number2Field;
    private TextField number3Field;
    private TextField email1Field;
    private TextField email2Field;
    private TextField email3Field;
    private Button modifyButton;
    private Button confirmButton;
    private Button removeButton;
    private Button exitButton;

    public ContattoController(Contatto contactPointer, TextField nameField, TextField surnameField, TextField number1Field, TextField number2Field, TextField number3Field, TextField email1Field, TextField email2Field, TextField email3Field, Button modifyButton, Button confirmButton, Button removeButton, Button exitButton) {
        this.contactPointer = contactPointer;
        this.nameField = nameField;
        this.surnameField = surnameField;
        this.number1Field = number1Field;
        this.number2Field = number2Field;
        this.number3Field = number3Field;
        this.email1Field = email1Field;
        this.email2Field = email2Field;
        this.email3Field = email3Field;
        this.modifyButton = modifyButton;
        this.confirmButton = confirmButton;
        this.removeButton = removeButton;
        this.exitButton = exitButton;
    }
    
    //metodi
    public void setController(){}
    
    public void setController(Contatto c){}
    
    public void disableModify(){}
    
    private void confirm(ActionEvent c){}
    
    private void modify(ActionEvent c){}
    
    private void delete(ActionEvent c){}
}