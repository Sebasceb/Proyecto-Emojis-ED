/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Objects;
import javafx.scene.image.Image;

/**
 *
 * @author Usuario
 */
public class eyes implements Comparable<eyes>{
    
    public static String url="src\\main\\resources\\images\\eyes\\";
    private String nombre;
    private Image imagenEyes;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public eyes(String nombre, Image imagenFace) {
        this.nombre = nombre;
        this.imagenEyes = imagenFace;
    }

  
    public String getUbicacion() {
        return url;
    }

   
    public Image getImagenEyes() {
        return imagenEyes;
    }

    public void setImagenEyes(Image imagenEyes) {
        this.imagenEyes = imagenEyes;
    }
    
    @Override
    public int compareTo(eyes o) {
       return o.getNombre().compareTo(this.getNombre());
    }

    @Override
    public String toString() {
        return "eyes{" + "nombre=" + nombre + ", imagenEyes=" + imagenEyes + '}';
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
        final eyes other = (eyes) obj;
        return Objects.equals(this.imagenEyes, other.imagenEyes);
    }

   
   
}
