/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.doceslubel.dao;

import br.com.doceslubel.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.ConnectionFactory;

/**
 *
 * @author Luciana
 */
public class UsuarioDao {
private Connection conn;
	
	public UsuarioDao() throws SQLException{
		conn = new ConnectionFactory().getConnection();
	}
	
	public void addUsuario(Usuario novo) throws SQLException{
		String sql = "INSERT INTO usuario(nome,tipo, login, senha) VALUES (?,?,?,?)";
		
		        PreparedStatement pst = conn.prepareStatement(sql); 
                        pst.setString(1,novo.getNome());
                        pst.setString(2,novo.getTipo());
                        pst.setString(3,novo.getLogin());
                        pst.setString(4,novo.getSenha());
                        
                        
                        pst.execute();
                    
				
	}
	
	public void removeUsuario(int id){
		String sql = "DELETE FROM USUARIO WHERE (id = ?)";
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.execute();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void updateUsuario(Usuario usuario){
		String sql = "UPDATE USUARIO SET nome=?, login=?, senha=?, tipo=?  where id=?";
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, usuario.getNome());
			pst.setString(2, usuario.getLogin());
			pst.setString(3, usuario.getSenha());
			pst.setString(4, usuario.getTipo());
			pst.setInt(5, usuario.getId());
			
			pst.execute();	
		    
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public Usuario resourceUsuario(int id) throws SQLException {
        
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM USUARIO WHERE ID = ?");
        pst.setInt(1, id);
        pst.execute();
        
        Usuario usuario = null;
        
        while(pst.getResultSet().next()) {
        	usuario = new Usuario();
        	usuario.setNome(pst.getResultSet().getString("nome"));
        	usuario.setLogin(pst.getResultSet().getString("login"));
        	usuario.setSenha(pst.getResultSet().getString("senha"));        	
        	usuario.setId(pst.getResultSet().getInt("id"));
        	usuario.setTipo(pst.getResultSet().getString("tipo"));
        	
        }
        
		return usuario;
	
	}
	
	public Usuario recuperaUsuario(String login, String senha) {

		Usuario usuario = null;

		PreparedStatement pst;
		try {

			pst = conn.prepareStatement("SELECT * FROM USUARIO WHERE LOGIN = ? AND SENHA = ?");
			pst.setString(1, login);
			pst.setString(2, senha);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNome(rs.getString("nome"));
				usuario.setLogin(rs.getString("login"));
				usuario.setSenha(rs.getString("senha"));
				usuario.setTipo(rs.getString("tipo"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;

	}   
    
    
}
