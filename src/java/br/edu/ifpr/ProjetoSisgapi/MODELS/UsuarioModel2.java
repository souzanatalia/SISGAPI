/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.ProjetoSisgapi.MODELS;
import br.edu.ifpr.ProjetoSisgapi.ENTITIES.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
import br.edu.ifpr.ProjetoSisgapi.DAOS.UsuarioDAO;
public class UsuarioModel2 {
    
        if (Usuario.getEmail() == null || usuario.getEmail() == "") {
            return;
        }

        if (Usuario.getSenha() == null || usuario.getPassword() == "") {
            return;
        }
        
        UsuarioDAO dao = new UsuarioDAO();
        dao.adicionar(user);
    }

    public Usuario findByIndex(int index) {
        Usuario user = users.get(index);
        return user;
    }

    public void edit(int index, Usuario userEdited) {
        users.set(index, userEdited);
    }

    public void delete(int index) {
        users.remove(index);
    }
}
