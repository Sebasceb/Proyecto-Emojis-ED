/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javafx.scene.Group;
import javafx.scene.image.Image;

/**
 *
 * @author Usuario
 */
public class Database {
    public static  LCDE<face> listaFace;
    public static  LCDE<eyes> listaEyes;
    public static  LCDE<eyebrows> listaEyesBrows;
    public static  LCDE<accessories> listaAccesories;
    public static  LCDE<mouth> listaMouth;
    public static LCDE<Emoji> listaEmoji;
    public static LCDE<Usuario> listaUsuarios;
    public static Usuario currentUser;

    public static LCDE<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
     
    public static boolean addUser(Usuario u){
        if(u==null || u.getUser()==null || u.getPassword()==null || listaUsuarios.contains(u))
            return false;
        listaUsuarios.add(u);
        try{
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream( 
            new FileOutputStream("Database/users.ser") );
            escribiendoFichero.writeObject(listaUsuarios);
            escribiendoFichero.close();
        }catch(IOException ex){
            System.out.println( ex.getMessage() );
        }
        return true;
    }
    
    public static void login(Usuario u){
        currentUser=u;
    }
     
     public static boolean addEmoji(Emoji e){
        if(e==null || e.getGroup()==null)
            return false;
        currentUser.addEmoji(e);
        listaUsuarios.remove(currentUser);//Quito la copia sin los proyectos actualizados
        listaUsuarios.add(currentUser);//No se si sea necesario para acutalizar pero que importa
        try{
            ObjectOutputStream escribiendoFichero = new ObjectOutputStream( 
            new FileOutputStream("Database/users.ser") );
            escribiendoFichero.writeObject(listaUsuarios);
            escribiendoFichero.close();
        }catch(IOException ex){
            System.out.println( ex.getMessage() );
        }        
//        listaEmoji.add(e);
//        try{
//            ObjectOutputStream escribiendoFichero = new ObjectOutputStream( 
//            new FileOutputStream("Database/emojis.ser") );
//            escribiendoFichero.writeObject(listaEmoji);
//            escribiendoFichero.close();
//        }catch(IOException ex){
//            System.out.println( ex.getMessage() );
//        }
        return true;
    }
     
     
     
    public  static void  llenarLCDEface(){
       listaFace= new LCDE<face>();
      
        File folder = new File("src\\main\\resources\\images\\faces");
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                   String nom= file.getName();
                    FileInputStream archi;
                    Image im;
                    face f;
                    try {
                        archi = new FileInputStream("src\\main\\resources\\images\\faces\\"+nom);
                        im= new Image(archi);
                        f = new face(nom, im);
                        listaFace.add(f);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                        
                }
            }
        }
    }
  
  
    public  static void  llenarLCDEEyes(){
       listaEyes= new LCDE<eyes>();
      
        File folder = new File("src\\main\\resources\\images\\eyes");
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                   String nom= file.getName();
                    FileInputStream archi;
                    Image im;
                    eyes e;
                    try {
                        archi = new FileInputStream("src\\main\\resources\\images\\eyes\\"+nom);
                        im= new Image(archi);
                        e = new eyes(nom, im);
                        listaEyes.add(e);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                        
                }
            }
        }
    }
    
    public  static void  llenarLCDEEyesBrows(){
       listaEyesBrows= new LCDE<eyebrows>();
      
        File folder = new File("src\\main\\resources\\images\\eyebrows");
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                   String nom= file.getName();
                    FileInputStream archi;
                    Image im;
                    eyebrows e;
                    try {
                        archi = new FileInputStream("src\\main\\resources\\images\\eyebrows\\"+nom);
                        im= new Image(archi);
                        e = new eyebrows(nom, im);
                        listaEyesBrows.add(e);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                        
                }
            }
        }
    }
    
    public  static void  llenarLCDEAccessories(){
       listaAccesories= new LCDE<accessories>();
      
        File folder = new File("src\\main\\resources\\images\\accessories");
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                   String nom= file.getName();
                    FileInputStream archi;
                    Image im;
                    accessories e;
                    try {
                        archi = new FileInputStream("src\\main\\resources\\images\\accessories\\"+nom);
                        im= new Image(archi);
                        e = new accessories(nom, im);
                        listaAccesories.add(e);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                        
                }
            }
        }
    }
    
    public  static void  llenarLCDEMouth(){
       listaMouth= new LCDE<mouth>();
      
        File folder = new File("src\\main\\resources\\images\\mouth");
        File[] files = folder.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".png")) {
                   String nom= file.getName();
                    FileInputStream archi;
                    Image im;
                    mouth e;
                    try {
                        archi = new FileInputStream("src\\main\\resources\\images\\mouth\\"+nom);
                        im= new Image(archi);
                        e = new mouth(nom, im);
                        listaMouth.add(e);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                        
                }
            }
        }
    }
     
    public static void llenarLCDEUsuarios(){
        listaUsuarios= new LCDE<>();
        try {
            ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("Database/users.ser"));
            listaUsuarios = (LCDE<Usuario>) leyendoFichero.readObject();
            leyendoFichero.close();
        }catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void llenarLCDEEmoji(){
        listaEmoji= new LCDE<>();
        try {
            ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("Database/emojis.ser"));
            listaEmoji = (LCDE<Emoji>) leyendoFichero.readObject();
            leyendoFichero.close();
        }catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
     
    public static void CargarListas(){
        llenarLCDEface();
        llenarLCDEEyes();
        llenarLCDEEyesBrows();
        llenarLCDEAccessories();
        llenarLCDEMouth();
        llenarLCDEUsuarios();
        llenarLCDEEmoji();
    }
}
