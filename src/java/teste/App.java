/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import br.com.doceslubel.dao.ReceitasDao;
import br.com.doceslubel.dao.UsuarioDao;
import br.com.doceslubel.model.Receita;
import br.com.doceslubel.model.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luciana
 */
public class App {
    public static void main(String[] args) throws SQLException {
        
//    
//    
//        Usuario usuario1 = new Usuario();
//        usuario1.setNome("Lu");
//        usuario1.setTipo("Comum");
//        usuario1.setLogin("Bel");
//        usuario1.setSenha("123");
//
//        UsuarioDao usuarioDao = new UsuarioDao();
//        usuarioDao.addUsuario(usuario1);
//
//        
//        
//        Receita receita1 = new Receita();
//        receita1.setNome("1");
//        receita1.setIngrediente("aqui");
//        receita1.setPreparo("aqui");
//        receita1.setRendimento("2");
//        receita1.setTempo("4");
//        
//        ReceitasDao receitaDao = new ReceitasDao();
//        receitaDao.addRceita(receita1);
//        
//        System.out.println(receita1);
//        
//        
        
        ReceitasDao receitaDao = new ReceitasDao();
        List<Receita> receitas = new ArrayList<Receita>();
        receitas = receitaDao.listarReceitas();
        
        for(Receita r : receitas){
            System.out.println(r.toString());
        }
        
//        Produto produto1 = new Produto();
//        produto1.setNome("Bolo de Chocolate");
//        produto1.setDescricao("Uma delicia");
//
//        Produto produto2 = new Produto();
//        produto2.setNome("Bolo de Chocolate");
//        produto2.setDescricao("Uma delicia");
//
//        ProdutoDao produtoDao = new ProdutoDao();
//        produtoDao.addProduto(produto1);
//        produtoDao.addProduto(produto2);
//
//        List<Produto> produtos = new ArrayList<>();
//        produtos = produtoDao.listarProdutos();
//
//        for (Produto p : produtos) {
//            System.out.println(p.toString());
//
//     
}
}
