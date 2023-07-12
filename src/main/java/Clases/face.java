/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import javafx.scene.image.Image;

/**
 *
 * @author Usuario
 */
public class face implements Comparable<face>{
    
    public static String url="src\\main\\resources\\images\\faces\\";
    private String nombre;
    private Image imagenFace;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public face(String nombre, Image imagenFace) {
        this.nombre = nombre;
        this.imagenFace = imagenFace;
    }

  
    public String getUbicacion() {
        return url;
    }

   
    public Image getImagenFace() {
        return imagenFace;
    }

    public void setImagenFace(Image imagenFace) {
        this.imagenFace = imagenFace;
    }
   
   
   
//   public  static void  llenarLCDEface(){
//       listaFace= new LCDE<face>();
//      
//        File folder = new File("src\\main\\resources\\images\\faces");
//        File[] files = folder.listFiles();
//        
//        if (files != null) {
//            for (File file : files) {
//                if (file.isFile() && file.getName().endsWith(".png")) {
//                   String nom= file.getName();
//                    FileInputStream archi;
//                    Image im;
//                    face f;
//                    try {
//                        archi = new FileInputStream("src\\main\\resources\\images\\faces\\"+nom);
//                        im= new Image(archi);
//                        f = new face(nom, im);
//                        listaFace.add(f);
//                    } catch (FileNotFoundException ex) {
//                        ex.printStackTrace();
//                    }
//                        
//            }
//        }
//    }
//}
       
   //metodo para leer folders y obtener su contenido
   
//public static void leer(){
//        File folder = new File("src\\main\\resources\\images\\faces");
//        File[] files = folder.listFiles();
//        
//        if (files != null) {
//            for (File file : files) {
//                if (file.isFile() && file.getName().endsWith(".png")) {
//                   
//                  
//                    System.out.println(file.getName());
//                        
//            }
//        }
//    }
//}

    @Override
    public int compareTo(face o) {
       return o.getNombre().compareTo(this.getNombre());
    }

    @Override
    public String toString() {
        return "face{" + "nombre=" + nombre + ", imagenFace=" + imagenFace + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final face other = (face) obj;
        return Objects.equals(this.imagenFace, other.imagenFace);
    }

    

    
   
            
  
    
    
}
