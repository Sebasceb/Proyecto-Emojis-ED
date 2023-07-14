package modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */


import Clases.Emoji;
import Clases.LCDE;
import Clases.accessories;
import Clases.eyebrows;
import Clases.eyes;
import Clases.face;
import Clases.Database;
import Clases.mouth;
import Clases.opciones_Emoji;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class ViewBienvenidoController implements Initializable {

    @FXML
    private ImageView nodo1;
    @FXML
    private ImageView nodo2;
    @FXML
    private ImageView nodo3;   
    @FXML
    private ImageView nodo4;
    
    public static LCDE<ImageView> listaNodos= new LCDE<>();
    @FXML
    private ImageView faceboceto;
    @FXML
    private BorderPane borderPane;
    @FXML
    private VBox vbox;

    private opciones_Emoji opcion= opciones_Emoji.face;
    @FXML
   
    private ImageView eyesboceto;
    @FXML
    private ImageView mouthboceto;
    @FXML
    private ImageView eyebrowsboceto;
    @FXML
    private ImageView accesorriesboceto;
    @FXML
    private Button btnEyes;
    @FXML
    private Button btnFace;
    @FXML
    private Button btnEyesBrows;
    @FXML
    private Button btnAccesorios;
    @FXML
    private Button btnMouth;
  
 
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    
       AggnodoyAciones();
       
       ImagenesComienzo();
        //aggFondo_Emoji();
        
       
        
    }

//public void aggFondo_Emoji(){
//    
//    String s= "src\\main\\resources\\Mas\\gifFondo.gif";
//    
//        try {
//            FileInputStream fil = new FileInputStream(s);
//            Image i= new Image(fil);
//            fondo.setImage(i);
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
//  
//}  

    public void asignarEmojis_AlaLista(){
        int contador=1;
        switch (opcion) {
            case face:
                List<face> listacaras= Database.listaFace;

                for (ImageView im:listaNodos ){
                    im.setImage(listacaras.get(contador).getImagenFace());
                    contador++;
                }
                 break;
            case eyes:
                List<eyes> listaeyes= Database.listaEyes;

                for (ImageView im:listaNodos ){
                    im.setImage(listaeyes.get(contador).getImagenEyes());
                    contador++;
                }
                break;
            case eyebrows:
                List<eyebrows> listaeyesbrows= Database.listaEyesBrows;

                for (ImageView im:listaNodos ){
                    im.setImage(listaeyesbrows.get(contador).getImagenEyesBrows());
                    contador++;
                }
                break;
            case accessories:
                List<accessories> listaAccessories= Database.listaAccesories;

                for (ImageView im:listaNodos ){
                    im.setImage(listaAccessories.get(contador).getImagenAccesories());
                    contador++;
                }
                break;
            case mouth: 
                List<mouth> listaMout= Database.listaMouth;

                for (ImageView im:listaNodos ){
                    im.setImage(listaMout.get(contador).getImagenMouth());
                    contador++;
                }
                break;

            default:
                System.out.println("Errooooooorr");;
    }
    
//        List<face> listacaras= listasImagenes.listaFace;
//       
//        
//        Image imagen1= listacaras.get(1).getImagenFace();
//        nodo1.setImage(imagen1);
//        Image imagen2= listacaras.get(2).getImagenFace();
//        nodo2.setImage(imagen2);
//        Image imagen3= listacaras.get(3).getImagenFace();
//        nodo3.setImage(imagen3);
//        Image imagen4= listacaras.get(4).getImagenFace();
//        nodo4.setImage(imagen4);
//        aggFondo_Emoji();
        
        
}

    @FXML
    private void next_Imagen(ActionEvent event) {
        Image ima;
        String nom=" ";
        //eyes f;
//       for(ImageView imageView:listaNodos){
//           im= imageView.getImage();
//           f= new eyes(nom, im);
//           imageView.setImage(listasImagenes.listaEyes.obtenerSiguiente(f).getImagenEyes());
//       }
       
        switch (opcion) {
            case face:

                face f;
                for (ImageView im:listaNodos ){
                    ima=im.getImage();
                    f= new face(nom, ima);
                    im.setImage(Database.listaFace.obtenerSiguiente(f).getImagenFace());
                   // faceboceto.setImage(ima);
                }
                 break;
            case eyes:
                eyes e;
                for (ImageView im:listaNodos ){
                    ima=im.getImage();
                    e= new eyes(nom, ima);
                    im.setImage(Database.listaEyes.obtenerSiguiente(e).getImagenEyes());
                }
                break;
            case eyebrows:
                eyebrows ey;
                for (ImageView im:listaNodos ){
                    ima=im.getImage();
                    ey= new eyebrows(nom, ima);
                    im.setImage(Database.listaEyesBrows.obtenerSiguiente(ey).getImagenEyesBrows());
                }
                break;
            case accessories:
                accessories a;
                for (ImageView im:listaNodos ){
                    ima=im.getImage();
                    a= new accessories(nom, ima);
                    im.setImage(Database.listaAccesories.obtenerSiguiente(a).getImagenAccesories());
                }
                break;
            case mouth: 
               mouth m;
                for (ImageView im:listaNodos ){
                    ima=im.getImage();
                    m= new mouth(nom, ima);
                    im.setImage(Database.listaMouth.obtenerSiguiente(m).getImagenMouth());
                }
                break;

            default:
                System.out.println("Errooooooorr");;
        }
        
               
    }

    
    
    @FXML
    private void previous_Imagen(ActionEvent event) {
       Image ima;
       String nom=" ";
       ImageView in;
       switch (opcion) {
        case face:
                face f;
                
            for(int i=listaNodos.size();i>0;i--){
                    in= listaNodos.get(i);
                    ima= in.getImage();
                    f= new face(nom, ima);
                    in.setImage(Database.listaFace.obtenerPrevio(f).getImagenFace());
       }
   
             break;
        case eyes:
            eyes e;
            for(int i=listaNodos.size();i>0;i--){
                    in= listaNodos.get(i);
                    ima= in.getImage();
                    e= new eyes(nom, ima);
                    in.setImage(Database.listaEyes.obtenerPrevio(e).getImagenEyes());
       }
            break;
        case eyebrows:
            eyebrows ey;
            for(int i=listaNodos.size();i>0;i--){
                    in= listaNodos.get(i);
                    ima= in.getImage();
                    ey= new eyebrows(nom, ima);
                    in.setImage(Database.listaEyesBrows.obtenerPrevio(ey).getImagenEyesBrows());
       }
            break;
        case accessories:
            accessories a;
            for(int i=listaNodos.size();i>0;i--){
                    in= listaNodos.get(i);
                    ima= in.getImage();
                    a= new accessories(nom, ima);
                    in.setImage(Database.listaAccesories.obtenerPrevio(a).getImagenAccesories());
       }
            break;
        case mouth: 
           mouth m;
           for(int i=listaNodos.size();i>0;i--){
                    in= listaNodos.get(i);
                    ima= in.getImage();
                    m= new mouth(nom, ima);
                    in.setImage(Database.listaMouth.obtenerPrevio(m).getImagenMouth());
       }
            break;
            
        default:
            System.out.println("Errooooooorr");;
    }
           
    }


    public void AggnodoyAciones(){
        listaNodos.add(nodo1);
        listaNodos.add(nodo2);
        listaNodos.add(nodo3);
        listaNodos.add(nodo4);
        
        for(ImageView i: listaNodos){
           i.setOnMouseClicked((MouseEvent event) -> {
            
               switch (opcion) {
                   case face:
                       faceboceto.setImage(i.getImage());
                       break;
                   case eyes:
                       eyesboceto.setImage(i.getImage());
                       break;
                   case eyebrows:
                       eyebrowsboceto.setImage(i.getImage());
                       break;
                   case accessories:
                       accesorriesboceto.setImage(i.getImage());
                       break;
                   case mouth:
                       mouthboceto.setImage(i.getImage());
                       break;
                   default:
                       System.out.println("Erroooooor");
               }
   
           
        });
        }
    }




    @FXML
    private void mtdEyes(ActionEvent event) {
        opcion=opciones_Emoji.eyes;
        asignarEmojis_AlaLista();
    }

    @FXML
    private void mtdFace(ActionEvent event) {
        opcion=opciones_Emoji.face;
        asignarEmojis_AlaLista();
    }

    @FXML
    private void mtdEyesBrows(ActionEvent event) {
        opcion=opciones_Emoji.eyebrows;
        asignarEmojis_AlaLista();
    }

    @FXML
    private void mtdAccesories(ActionEvent event) {
        opcion=opciones_Emoji.accessories;
        asignarEmojis_AlaLista();
    }

    @FXML
    private void mtdMouth(ActionEvent event) {
        opcion=opciones_Emoji.mouth;
        asignarEmojis_AlaLista();
    }
    
    
    public void ImagenesComienzo(){
        
        List<face> listacaras= Database.listaFace;
        
        Image imagen1= listacaras.get(1).getImagenFace();
        nodo1.setImage(imagen1);
        Image imagen2= listacaras.get(2).getImagenFace();
        nodo2.setImage(imagen2);
        Image imagen3= listacaras.get(3).getImagenFace();
        nodo3.setImage(imagen3);
        Image imagen4= listacaras.get(4).getImagenFace();
        nodo4.setImage(imagen4);
    }

   

    @FXML
    private void saveEmoji(ActionEvent event) throws IOException {


    }


    @FXML
    private void clear(ActionEvent event) throws IOException {
        App.setRoot("ViewBienvenido");
    }

    @FXML
    private void deleteSelection(ActionEvent event) {
        switch (opcion) {
            case face:
                faceboceto.setImage(null);
                break;
            case eyes:
                eyesboceto.setImage(null);
                break;
            case eyebrows:
                eyebrowsboceto.setImage(null);
                break;
            case accessories:
                accesorriesboceto.setImage(null);
                break;
            case mouth:
                mouthboceto.setImage(null);
                break;
            default:
                System.out.println("Erroooooor");
        }
    }

    @FXML
    private void guardarPredeterminado(ActionEvent event) throws IOException {
        Group group = new Group();
        group.getChildren().addAll(faceboceto, eyebrowsboceto, eyesboceto,accesorriesboceto,mouthboceto);
        Emoji emoji= new Emoji(group);
        Database.listaEmoji.add(emoji);
        try{
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream( 
            new FileOutputStream("Database/emojis.ser") );
            escribiendoFichero.writeObject(Database.listaEmoji);
            escribiendoFichero.close();
        }catch(IOException ex){
            System.out.println( ex.getMessage() );
        }
        App.setRoot("ViewBienvenido");
    }

    @FXML
    private void cargarImagen(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cargar Imagen");
        alert.setHeaderText(null);
        alert.setContentText("Va a subir una imagen de tipo: " + opcion.name());
        alert.showAndWait();
        String carpeta="";
        switch (opcion) {
            case face:
                carpeta="faces";
                break;
            case eyes:
                carpeta="eyes";
                break;
            case eyebrows:
                carpeta="eyebrows";
                break;
            case accessories:
                carpeta="accessories";
                break;
            case mouth:
                carpeta="mouth";
                break;
            default:
                System.out.println("Erroooooor");
        }
        
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Cargar Imagen");

        File initialDirectory = new File(System.getProperty("user.home"));
        fileChooser.setInitialDirectory(initialDirectory);
        
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.jpeg");
        fileChooser.getExtensionFilters().add(imageFilter);
        
        Stage stage = new Stage();
        File selectedFile = fileChooser.showOpenDialog(stage);
        
        if (selectedFile != null) {
            try {
                String destinationPath = "src/main/resources/images/"+carpeta+"/" + selectedFile.getName();
                Path source = selectedFile.toPath();
                Path destination = Path.of(destinationPath);
                Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

                System.out.println("Photo uploaded successfully.");
            } catch (IOException e) {
                System.out.println("Error uploading photo: " + e.getMessage());
            }
        }
        
        Database.CargarListas();
        App.setRoot("ViewBienvenido");
    }
    
       
    
}

