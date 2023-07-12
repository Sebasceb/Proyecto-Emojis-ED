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
public class mouth implements Comparable<mouth>{
    
    public static String url="src\\main\\resources\\images\\mouth\\";
    private String nombre;
    private Image imagenMouth;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public mouth(String nombre, Image imagenFace) {
        this.nombre = nombre;
        this.imagenMouth = imagenFace;
    }

  
    public String getUbicacion() {
        return url;
    }

   
    public Image getImagenMouth() {
        return imagenMouth;
    }

    public void setImagenMouth(Image imagenMouth) {
        this.imagenMouth = imagenMouth;
    }
    
    @Override
    public int compareTo(mouth o) {
       return o.getNombre().compareTo(this.getNombre());
    }

    @Override
    public String toString() {
        return "mouth{" + "nombre=" + nombre + ", imagenMouth=" + imagenMouth + '}';
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
        final mouth other = (mouth) obj;
        return Objects.equals(this.imagenMouth, other.imagenMouth);
    }

   
}
