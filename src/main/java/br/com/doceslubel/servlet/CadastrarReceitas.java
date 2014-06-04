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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Luciana
 */
public class CadastrarReceitas extends HttpServlet {

   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String nome = req.getParameter("nome");
            String ingredientes = req.getParameter("ingredientes");
            String preparo = req.getParameter("preparo");
            String tempo = req.getParameter("tempo");
            String rendimento = req.getParameter("rendimento");
            
            Receita receita = new Receita();
            receita.setNome(nome);
            receita.setIngrediente(ingredientes);
            receita.setPreparo(preparo);
            receita.setTempo(tempo);
            receita.setRendimento(rendimento);
            
            
            ReceitasDao receitaDao;
            receitaDao = new ReceitasDao();
            receitaDao.addRceita(receita);
            
             req.getSession().setAttribute("Receita Cadastrada", receita);
             resp.sendRedirect("index.jsp");
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarReceitas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

