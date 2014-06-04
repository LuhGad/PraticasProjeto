/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.doceslubel.servlet;

import br.com.doceslubel.dao.ReceitasDao;
import br.com.doceslubel.model.Receita;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luciana
 */
public class ListarReceitas extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        try {
            ReceitasDao dao = new ReceitasDao();
            List<Receita> receitas = new ArrayList<Receita>();
            receitas = dao.listarReceitas();
            
            req.getSession().setAttribute("receitas", receitas);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ListarReceitas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
  
}