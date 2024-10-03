/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Dairo
 */
public class Usuario {
    private String nombre;
    private String email;
    private String username;
    private String clave;
    private Map<String,String> User = new HashMap();
    

    public Usuario(String nombre, String email, String username, String clave) {
        this.nombre = nombre;
        this.email = email;
        this.username = username;
        this.clave = clave;
    }
    public Usuario(){
        
        User.put("nombre","Dairo");
        User.put("email","Dairo@gmail.com");
        User.put("username","DairoBR");
        User.put("clave","Dairo123");
        
    }
    public boolean ValidarUsuario(String pUsername, String pClave){
        
        boolean logueado = false;
        
        if(getUser().get("username").equals(pUsername)&& getUser().get("clave").equals(pClave)){
            
            logueado = true;
            
            return logueado;
        }
        return logueado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Map<String, String> getUser() {
        return User;
    }

    public void setUser(Map<String, String> User) {
        this.User = User;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}

