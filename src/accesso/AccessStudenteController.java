/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesso;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import mystudentlistah.Student;
import mystudentlistah.Student;
import mystudentlistah.Student;

/**
 * FXML Controller class
 *
 * @author matti
 */
public class AccessStudenteController implements Initializable {

    public void set(Student s) {
        nameL.setText(s.getName());
        surnameL.setText(s.getSurname());
        codeL.setText(s.getCode());
    }

    @FXML
    private Label nameL;
    @FXML
    private  Label surnameL;
    @FXML
    private Label codeL;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
