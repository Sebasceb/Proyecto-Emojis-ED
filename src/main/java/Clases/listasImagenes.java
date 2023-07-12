/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.Image;

/**
 *
 * @author Usuario
 */
public class listasImagenes {
     public static  LCDE<face> listaFace;
     public static  LCDE<eyes> listaEyes;
     public static  LCDE<eyebrows> listaEyesBrows;
     public static  LCDE<accessories> listaAccesories;
     public static  LCDE<mouth> listaMouth;
     
     
     
     
     
     
     
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
     
     public static void CargarListas(){
         llenarLCDEface();
         llenarLCDEEyes();
         llenarLCDEEyesBrows();
         llenarLCDEAccessories();
         llenarLCDEMouth();
         
     }
}
