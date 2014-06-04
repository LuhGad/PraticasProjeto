/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.doceslubel.servlet;

import br.com.doceslubel.dao.UsuarioDao;
import br.com.doceslubel.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
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
public class CadastrarUsuario extends HttpServlet {


        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            doPost(req, resp);

        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            try {
                String nome = req.getParameter("nome");
                String login = req.getParameter("login");
                String senha = req.getParameter("senha");
                String tipo = req.getParameter("tipo");

                Usuario usuario = new Usuario();
                usuario.setNome(nome);
                usuario.setLogin(login);
                usuario.setSenha(senha);
                usuario.setTipo(tipo);
                UsuarioDao dao;
                dao = new UsuarioDao();
                dao.addUsuario(usuario);
              
                req.getSession().setAttribute("Usuario Salvo", usuario);
                resp.sendRedirect("index.jsp");
            } catch (SQLException ex) {
                Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

        


        }

}