<%-- 
    Document   : cadastro-usuario
    Created on : 03/06/2014, 21:00:40
    Author     : Luciana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="CSS/cssCadastros.css">

        <title>Cadastro de Usuario</title>
    </head>
    <body>

        <section>


            <form id ="cadastro" action ="cadastrarUsuario" method = "post" >
                <fieldset>
                    <legend> Cadastro de Usuário</legend>
                    <input name="nome" placeholder="Informe seu Nome"  type="text" autofocus  required class="caixa">  
                    <input name="login" placeholder="Informe seu Login"  type="text" autofocus  required class="caixa"> 
                    <input name="senha" placeholder="Informe sua Senha"  type="password" autofocus  required class="caixa"> 

                    <input type="submit" value="Cadastrar" class="botao">
                </fieldset>
            </form>

        </section>
    </body>
</html>
