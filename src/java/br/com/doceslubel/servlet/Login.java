/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.doceslubel.servlet;

import br.com.doceslubel.Controller.LoginService;
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
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();

	}

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp); //To change body of generated methods, choose Tools | Templates.
    }

        
        
        @Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
            try {
                String login = request.getParameter("login");
                String senha = request.getParameter("senha");
                
                Usuario usuario = LoginService.login(login, senha);
                
                
                if(usuario != null){
                    System.out.println("Setando usuario na sessao");
                    request.getSession().setAttribute("usuario", usuario);
                    //response.sendRedirect("logado.jsp");
        
                    if (usuario.getTipo().equals("comum")) {
                        response.sendRedirect("comum.jsp");
                    
                    }
                    else {
                        response.sendRedirect("adm.jsp");
                    }
                    
                }
                else {
                response.sendRedirect("index.jsp");
                
                
            } 
                
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
         
            
            
}
}
        
