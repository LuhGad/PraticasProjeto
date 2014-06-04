/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.doceslubel.Controller;

import br.com.doceslubel.dao.UsuarioDao;
import br.com.doceslubel.model.Usuario;
import java.sql.SQLException;

/**
 *
 * @author Luciana
 */
public class LoginService {

    
 
    public static Usuario login(String login, String senha) throws SQLException{
        UsuarioDao udao = new UsuarioDao();
        return udao.recuperaUsuario(login, senha);
    }
    
}
