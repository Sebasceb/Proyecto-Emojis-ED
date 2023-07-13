/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package modelo;

import Clases.Emoji;
import Clases.listasImagenes;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

import javafx.scene.layout.HBox;
/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class EmojiCreadoController  {


   
    @FXML
    private HBox sceneEmoji;
    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        Emoji e= listasImagenes.listaEmoji.get(0);
       sceneEmoji.getChildren().addAll(e.getGroup().getChildren());
    }    
    
}
