/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.ProjetoSisgapi.DAOS;

import br.edu.ifpr.ProjetoSisgapi.ENTITIES.Usuario;
import br.edu.ifpr.ProjetoSisgapi.FACTORIES.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author usuario
 */
public class UsuarioDAO {
    
    public void adicionar(Usuario u) throws SQLException {
        String sql = "INSERT INTO Usuarios (id, nome, curso, matricula, tipo email,"
                + "senha, projeto) VALUES (?,?,?,?,?,?,?,?)";
        
        Connection connection = new ConnectionFactory().getConnection();
        
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, u.getId());
        stmt.setString(2, u.getNome());
        stmt.setInt(3, u.getCurso());
        stmt.setInt(4, u.getMatricula());
        stmt.setString(5, u.getTipo());
        stmt.setString(6, u.getEmail());
        stmt.setString(7, u.getSenha());
        stmt.setInt(8, u.getProjeto());
        
        stmt.execute();
        
        stmt.close();
        connection.close();
    }
}
