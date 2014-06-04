<%-- 
    Document   : login
    Created on : 03/06/2014, 21:08:46
    Author     : Luciana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <section>

            <form action="login" method = "post" >

                <input name="login" placeholder="Informe seu Login"  type="text" autofocus  required class="caixa"> 
                <input name="senha" placeholder="Informe sua Senha"  type="password" autofocus  required class="caixa"> 

                <input type="submit" value="Cadastrar" class="botao">
            </form>

        </section>


    </body>
</html>
