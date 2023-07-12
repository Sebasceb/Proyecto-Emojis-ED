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
public class eyebrows implements Comparable<eyebrows>{
    
    public static String url="src\\main\\resources\\images\\eyebrows\\";
    private String nombre;
    private Image imagenEyesBrows;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public eyebrows(String nombre, Image imagenFace) {
        this.nombre = nombre;
        this.imagenEyesBrows = imagenFace;
    }

  
    public String getUbicacion() {
        return url;
    }

   
    public Image getImagenEyesBrows() {
        return imagenEyesBrows;
    }

    public void setImagenEyesBrows(Image imagenEyesBrows) {
        this.imagenEyesBrows = imagenEyesBrows;
    }
    
    @Override
    public int compareTo(eyebrows o) {
       return o.getNombre().compareTo(this.getNombre());
    }

    @Override
    public String toString() {
        return "eyebrows{" + "nombre=" + nombre + ", imagenEyesBrows=" + imagenEyesBrows + '}';
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
        final eyebrows other = (eyebrows) obj;
        return Objects.equals(this.imagenEyesBrows, other.imagenEyesBrows);
    }

    
    
}
