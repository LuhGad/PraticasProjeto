<%-- 
    Document   : index
    Created on : 04/06/2014, 02:53:29
    Author     : Bell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charsetset=UTF-8">
     
        <link rel = "stylesheet" type = "text/css" href="css/estilomenu.css">
        <title>Index</title>
    </head>
    
    <body>        
        <%@ include file="menu.html"%>
        
        <section>

            <form action="login" method = "post" >
                <input name="login" placeholder="Informe seu Login"  type="text" autofocus  required class="caixa"> 
                <input name="senha" placeholder="Informe sua Senha"  type="password" autofocus  required class="caixa"> 
                <input type="submit" value="Cadastrar" class="botao">
            </form>
<!--
        </section>
        
        <section>
            <section>
                <img src="imagens/0.jpg" width="1355px">
            </section>

            <section>                    
                <img src="imagens/000.jpg" width="1355px">        
            </section>

            <section>
                <img src="imagens/0000.jpg" width="1355px">
            </section>
        </section>
        -->
    </body>
</html>

