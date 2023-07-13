/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;
import javafx.scene.Group;

/**
 *
 * @author Usuario
 */
public class Emoji implements Serializable{
    Group group;

    public Emoji(Group emoji) {
        this.group = emoji;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
    
    
  
}
