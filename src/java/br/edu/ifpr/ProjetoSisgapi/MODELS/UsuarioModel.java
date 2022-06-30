package br.edu.ifpr.ProjetoSisgapi.MODELS;


import br.edu.ifpr.ProjetoSisgapi.ENTITIES.Usuario;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class UsuarioModel {
     static ArrayList<Usuario> usuarios = new ArrayList();
     
     public void add (Usuario u){
     usuarios.add(u);
     }
     
      public ArrayList getUsuarios(){
        return usuarios;
    }
      public Usuario getUsuario(int i){
        return usuarios.get(i);
    }
       public void remove(int index){
        usuarios.remove(index);
    }
}
