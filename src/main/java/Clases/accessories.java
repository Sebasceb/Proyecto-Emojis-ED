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
public class accessories implements Comparable<accessories>{
    public static String url="src\\main\\resources\\images\\accessories\\";
    private String nombre;
    private Image imagenAccesories;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public accessories(String nombre, Image imagenFace) {
        this.nombre = nombre;
        this.imagenAccesories = imagenFace;
    }

  
    public String getUbicacion() {
        return url;
    }

   
    public Image getImagenAccesories() {
        return imagenAccesories;
    }

    public void setImagenAccesories(Image imagenAccesories) {
        this.imagenAccesories = imagenAccesories;
    }
    
    @Override
    public int compareTo(accessories o) {
       return o.getNombre().compareTo(this.getNombre());
    }

    @Override
    public String toString() {
        return "accessories{" + "nombre=" + nombre + ", imagenAccesories=" + imagenAccesories + '}';
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
        final accessories other = (accessories) obj;
        return Objects.equals(this.imagenAccesories, other.imagenAccesories);
    }

    

}
