package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VistaListaControlador implements Initializable {

    @FXML
    private ListView<Persona> vistadeListafxID;

    @FXML
    private Button BAddfxID;
    @FXML
    private Button BBorrarfxID;
    @FXML
    private Button BModificarfxID1;

    @FXML
    void addAccion(ActionEvent event) throws IOException{
        // añade a la colección si los campos no son vacíos y no contienen únicamente blancos
        /*if ((!textFieldfxID.getText().isEmpty())
        && (textFieldfxID.getText().trim().length() != 0)
        && (!textFieldApellidofxID.getText().isEmpty())
        && (textFieldApellidofxID.getText().trim().length() != 0)) {
        datos.add(new Persona(textFieldfxID.getText(), textFieldApellidofxID.getText()));
        textFieldfxID.clear();
        textFieldApellidofxID.clear();
        textFieldfxID.requestFocus();  //cambio del foco al textfield.

        }*/
        
        FXMLLoader miCargador = new FXMLLoader(getClass().getResource("/vista/VentanaAnadir.fxml"));
        AnchorPane root = (AnchorPane) miCargador.load();
        
        VentanaAñadirController contPers = miCargador.<VentanaAñadirController>getController();
        contPers.initPersona();
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Nueva Persona");
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.showAndWait();
        
        
    }

    @FXML
    void borrarAccion(ActionEvent event) {
        int i = vistadeListafxID.getSelectionModel().getSelectedIndex();
        if (i >= 0) {
            datos.remove(i);
        }
    }

    private ObservableList<Persona> datos = null; // Colecci�n vinculada a la vista.

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        ArrayList<Persona> misdatos = new ArrayList<Persona>();
        misdatos.add(new Persona("Pepe", "García"));
        misdatos.add(new Persona("María", "Pérez"));
        datos = FXCollections.observableArrayList(misdatos);
        vistadeListafxID.setItems(datos); // vinculaci�n entre la vista y el modelo

        
        
        
        

        
    }

    @FXML
    private void modificarAccion(ActionEvent event) {
    }

}
