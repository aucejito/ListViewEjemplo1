/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Persona;

/**
 * FXML Controller class
 *
 * @author marferp2
 */
public class VentanaAñadirController implements Initializable {

    @FXML
    private Button OkButton;
    @FXML
    private Button CancelButton;
    @FXML
    private TextField nomText;
    @FXML
    private TextField apText;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void okAct(ActionEvent event) {
        if ((!nomText.getText().isEmpty())
        && (nomText.getText().trim().length() != 0)
        && (!apText.getText().isEmpty())
        && (apText.getText().trim().length() != 0)){
            //Persona persAnadir = new Persona(nomText.getText(), apText.getText());
            misdatos.add();
        }
    }

    @FXML
    private void cancelAct(ActionEvent event) {
        Stage stage = (Stage) CancelButton.getScene().getWindow();
        stage.close();
    }
    
}
