/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesso;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import mystudentlistah.Student;
import mystudentlistah.Student;
import mystudentlistah.Student;

/**
 * FXML Controller class
 *
 * @author matti
 */
public class AccessStudenteController implements Initializable {

    @FXML
    private Button backButt;

    @FXML
    private Scene scene;
    
    public void set(Student s, Scene scene) {
        nameL.setText(s.getName());
        surnameL.setText(s.getSurname());
        codeL.setText(s.getCode());
        this.scene = scene;
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

    @FXML
    private void goBack(ActionEvent event) throws IOException {
        ((Stage) backButt.getScene().getWindow()).close();
        
        Stage main = new Stage();
        
        main.setScene(scene);
        main.initModality(Modality.APPLICATION_MODAL); 
        main.show();
        
    }
    
}
