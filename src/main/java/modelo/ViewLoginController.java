/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package modelo;

import Clases.Usuario;
import Clases.Database;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class ViewLoginController implements Initializable {

    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField txtClave;
    @FXML
    private Button btnIngresar;
    @FXML
    private Button btnRegistrar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void eventKey(KeyEvent event) {
    }


    @FXML
    private void ingresar(ActionEvent event) throws IOException {
        Usuario u= new Usuario(txtUser.getText(), txtClave.getText());
        if(Database.getListaUsuarios().contains(u)){
            Usuario user=Database.getListaUsuarios().getCopy(u);
            Database.login(user);
            App.setRoot("ViewBienvenido");
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de Inicio de Sesión");
            alert.setHeaderText(null);
            alert.setContentText("Usuario no registrado");
            alert.showAndWait();
        }
    }

    @FXML
    private void registrar(ActionEvent event) {
        Usuario usr= new Usuario(txtUser.getText(), txtClave.getText());
        if (Database.addUser(usr)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Reistro Exitoso");
            alert.setHeaderText(null);
            alert.setContentText("Usuario registrado exitosamente");
            alert.showAndWait();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error de Registro");
            alert.setHeaderText(null);
            alert.setContentText("Usuario no registrado");
            alert.showAndWait();
        }
    }
    
}
