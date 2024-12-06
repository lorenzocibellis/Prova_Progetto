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

   // non è necessario un costruttore
    //metodi
    public void setController(){
    
    }
    
    public void setController(Contatto c){
    
    }
    
    public void disableModify(){
    
    }
    
    private void confirm(ActionEvent c){
    
    }
    
    private void modify(ActionEvent c){
    
    }
    
    private void delete(ActionEvent c){
    
    }
}