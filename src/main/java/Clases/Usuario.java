/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author sebas
 */
public class Usuario implements Serializable {
    private String user;
    private String password;
    private LCDE<Emoji> project;

    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
        this.project= new LCDE<Emoji>();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public LCDE<Emoji> getProject() {
        return project;
    }

    public void setProject(LCDE<Emoji> project) {
        this.project = project;
    }
    
    public void addEmoji(Emoji e){
        this.project.add(e);
    }

    @Override
    public String toString(){
        return "[ "+this.user+ " : "+this.password+" ]";
    }
    
    
    @Override
    public boolean equals(Object o){
        if (this==o){
            return true;
        }
        if (o!= null && o instanceof Usuario) {
            Usuario u= (Usuario) o;
            return this.user.equals(u.getUser()) && this.password.equals(u.getPassword());
        }
        return false;
    }
}
