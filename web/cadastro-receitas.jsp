<%-- 
    Document   : CadastroReceitas
    Created on : 03/06/2014, 20:08:57
    Author     : Luciana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/cssCadastros.css">
        <title> Cadastro Receitas </title>
    </head>
    <body>
        <section>


            <form id ="cadastro" action ="cadastrarReceitas" method = "post" >
                <fieldset>
                    <legend> Cadastro do Produto</legend>


                    <h1> Nome: </h1>
                    <input name="nome" placeholder="Informe o Nome"  type="text" autofocus NAME = "nome" required class="caixa">  
                    <h1> Ingredientes:</h1>
                    <textarea rows="20" name="ingredientes"  placeholder="Informe os ingredientes"  type="text" autofocus  required class="caixa"></textarea>
                    <h1> Preparo:</h1>
                    <textarea rows="20" name="preparo"  placeholder="Forma de Preparo"  type="text" autofocus  required class="caixa"></textarea>
                    <h1> Tempo: </h1>
                    <input name="tempo" placeholder="Tempo de preparo"  type="text" autofocus  required class="caixa">  
                    <h1> Rendimento: </h1>
                    <input name="rendimento" placeholder="Rendimento "  type="text" autofocus  required class="caixa">  

                    <input type="submit" value="Cadastrar" class="botao">
                    

                   
                </fieldset>
            </form>

 </section>


                </body>
                </html>
