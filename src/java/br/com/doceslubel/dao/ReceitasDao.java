/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.doceslubel.dao;

import br.com.doceslubel.model.Receita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.ConnectionFactory;

/**
 *
 * @author Luciana
 */
public class ReceitasDao {
  private Connection conn;
	
	public ReceitasDao() throws SQLException{
		conn = new ConnectionFactory().getConnection();
	}
	
	public void addRceita(Receita nova){
		String sql = "INSERT INTO receitas (ingredientes, preparo, tempo, rendimento, nome) VALUES (?,?,?,?,?)";
		
		try{
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, nova.getIngrediente());
			pst.setString(2, nova.getPreparo());
			pst.setString(3, nova.getTempo());			
			pst.setString(4, nova.getRendimento());	
                        pst.setString(5, nova.getNome());
			
			pst.execute();			
			pst.close();
			System.out.println("Teste");
		}catch (SQLException e){
			e.printStackTrace();
		}		
	}
	
	public void removeReceita(int id){
		String sql = "DELETE FROM RECEITA WHERE (id = ?)";
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.execute();
			
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void updateReceita(Receita receita){
		String sql = "UPDATE RECEITA SET ingredientes=?, preparo=?, tempo=?, rendimento=?, nome=?  where id=?";
		
		try {
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, receita.getIngrediente());
			pst.setString(2, receita.getPreparo());
			pst.setString(3, receita.getTempo());
			pst.setString(4, receita.getRendimento());
			pst.setString(5, receita.getNome());
                        pst.setInt(6, receita.getId());
			
			pst.execute();	
		    
		} catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public Receita resourceReceita (int id) throws SQLException {
        
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM RECEITA WHERE ID = ?");
        pst.setInt(1, id);
        pst.execute();
        
        Receita receita = null;
        
        while(pst.getResultSet().next()) {
        	receita = new Receita();
        	receita.setNome(pst.getResultSet().getString("nome"));
        	receita.setIngrediente(pst.getResultSet().getString("ingredientes"));
        	receita.setPreparo(pst.getResultSet().getString("preparo"));        	
        	receita.setTempo(pst.getResultSet().getString("tempo"));
        	receita.setRendimento(pst.getResultSet().getString("rendimento"));
        	
        }
        
		return receita;
	
	}
	
	public Receita recuperaReceita(int id, String nome) {

		Receita receita = null;

		PreparedStatement pst;
		try {

			pst = conn.prepareStatement("SELECT * FROM RECEITA WHERE ID = ? AND NOME = ?");
			pst.setInt(1, id);
			pst.setString(2, nome);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				receita = new Receita();
				receita.setId(rs.getInt("id"));
				receita.setNome(rs.getString("nome"));
				receita.setIngrediente(rs.getString("ingredientes"));
				receita.setPreparo(rs.getString("preparo"));
				receita.setRendimento(rs.getString("redimento"));
                                receita.setTempo(rs.getString("tempo"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return receita;

	}   
       public List<Receita> listarProdutos() throws SQLException {

        ArrayList<Receita> produto = new ArrayList<Receita>();
        String sql = "SELECT * FROM receitas ";

        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            Receita receita = new Receita();
            receita.setId(rs.getInt("id"));
            receita.setNome(rs.getString("nome"));
            receita.setIngrediente(rs.getString("ingredientes"));
            receita.setPreparo(rs.getString("preparo"));
            receita.setRendimento(rs.getString("rendimento"));
            receita.setTempo(rs.getString("tempo"));
            produto.add(receita);
        }

        return produto;

    }
}
