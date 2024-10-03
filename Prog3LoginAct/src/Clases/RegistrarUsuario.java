/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import java.util.HashMap;

/**
 *
 * @author Dairo
 */
public class RegistrarUsuario {
    private HashMap<String, Usuario> usuarios; // Almacena usuarios

    public RegistrarUsuario() {
        usuarios = new HashMap<>();
    }

    public void registrarUsuario(String nombre, String email, String username, String clave) {
        Usuario nuevoUsuario = new Usuario(nombre, email, username, clave);
        usuarios.put(username, nuevoUsuario);
        System.out.println("Usuario registrado: " + nuevoUsuario);
    }

    public void mostrarUsuarios() {
        System.out.println("Usuarios registrados:");
        for (Usuario usuario : usuarios.values()) {
            System.out.println(usuario);
        }
    }
}


