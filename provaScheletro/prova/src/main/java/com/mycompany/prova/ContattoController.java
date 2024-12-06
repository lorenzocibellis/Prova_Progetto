package com.mycompany.prova;

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
    
    //metodi
    public void setController();
    
    public void setController(Contatto);
    
    public void disableModify();
    
    private void confirm(ActionEvent);
    
    private void modify(ActionEvent);
    
    private void delete(ActionEvent);
}