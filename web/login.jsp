<%-- 
    Document   : login
    Created on : 25/11/2020, 16:56:54
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Screen</h1>
        <html:form action="login" method="post">
            
            <table border="1">
                
                <tbody>
                    <tr>
                        <td>Usuario:</td>
                        <td><html:text name = "LoginActionForm" property="usuario"/></td>
                    </tr>
                    <tr>
                        <td>Senha:</td>
                        <td><html:text name = "LoginActionForm" property="senha"/></td>

                    </tr>
                    <tr>
                        <td colspan="2"><html:submit value="Entrar"/></td>
                    </tr>
                </tbody>
            </table>

            
        </html:form>
        <html:errors/>
    </body>
</html>
