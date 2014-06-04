/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.com.doceslubel.dao.ReceitasDao;
import br.com.doceslubel.dao.UsuarioDao;
import br.com.doceslubel.model.Receita;
import br.com.doceslubel.model.Usuario;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bell
 */
public class Testes {

    public Testes() {
    }
    
    @Test
    public void testIdNull() throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setNome("Izabel");
        usuario.setLogin("adsizabel");
        usuario.setSenha("123");
        
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.addUsuario(usuario);

        int id = usuario.getId();
        Assert.assertNotNull(id);
    }
    
    @Test
    public void testRecuperaUsuario() throws SQLException{
	Usuario usuario = new Usuario();
        usuario.setNome("Izabel");
        usuario.setLogin("adsizabel");
        usuario.setSenha("123");
        
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.addUsuario(usuario);
        
        Usuario resourceUsuario = usuarioDao.resourceUsuario(1);
        

        Assert.assertEquals("Izabel", usuario.getNome());
        Assert.assertEquals("adsizabel", usuario.getLogin());
        Assert.assertEquals("123", usuario.getSenha()); 
    }
    
    @Test
    public void cadastraReceita() throws SQLException{
        Receita receita = new Receita();
        receita.setIngrediente("Ovos");
        receita.setPreparo("Bata os ovos");
        receita.setTempo("12 min");
        receita.setRendimento("5 porções");
        receita.setNome("Ovos batidos");
                
        ReceitasDao receitasDao = new ReceitasDao();
        receitasDao.addRceita(receita);
        
        Assert.assertEquals("Ovos", receita.getIngrediente());
        Assert.assertEquals("Bata os ovos", receita.getPreparo());
        Assert.assertEquals("12 min", receita.getTempo());
        Assert.assertEquals("5 porções", receita.getRendimento());
        Assert.assertEquals("Ovos batidos", receita.getNome());
        
        
    }
    
    @Test
    public void recuperaReceita() throws SQLException{
        Receita receita = new Receita();
        receita.setIngrediente("Ovos");
        receita.setPreparo("Bata os ovos");
        receita.setTempo("12 min");
        receita.setRendimento("5 porções");
        receita.setNome("Ovos batidos");
                
        ReceitasDao receitasDao = new ReceitasDao();
        receitasDao.addRceita(receita);
        
        
        Receita recuperaReceita = receitasDao.recuperaReceita("Ovos batidos");
    
        Assert.assertNotSame("5 porções", receita.getRendimento()); 
        
    }
    
    
    public void testaAddUsuarioNulo() throws SQLException{
    Usuario usuario = new Usuario();
        usuario.setNome("Izabel");
        usuario.setLogin("adsizabel");
        usuario.setSenha("123");
        
        UsuarioDao usuarioDao = new UsuarioDao();
        usuarioDao.addUsuario(usuario);
    
        Assert.assertNull(usuario);
        
    }}