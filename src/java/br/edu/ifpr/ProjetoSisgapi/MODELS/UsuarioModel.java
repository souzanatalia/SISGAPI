package br.edu.ifpr.ProjetoSisgapi.MODELS;

import br.edu.ifpr.ProjetoSisgapi.DAOS.UsuarioDAO;
import br.edu.ifpr.ProjetoSisgapi.ENTITIES.Usuario;
import java.sql.SQLException;
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

    public ArrayList getUsuarios() {
        return usuarios;
    }

    public void create(Usuario u) throws SQLException {

        if (u.getEmail() == null || u.getEmail() == "") {
            return;
        }

        if (u.getSenha() == null || u.getSenha() == "") {
            return;
        }

        UsuarioDAO dao = new UsuarioDAO();
        dao.adicionar(u);
    }

    public Usuario findByIndex(int index) {
        Usuario u = usuarios.get(index);
        return u;
    }

    public void delete(int index) {
        usuarios.remove(index);
    }
}
