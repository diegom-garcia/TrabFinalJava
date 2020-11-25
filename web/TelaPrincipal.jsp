<%-- 
    Document   : TelaPrincipal
    Created on : 24/11/2020, 20:16:51
    Author     : DIEGO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <html:form action="inserirEquipamento" method="post">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Equipamento:</td>
                        <td><html:text name="InserirEquipamentoActionForm" property="nomeEquip" /> </td>
                    </tr>
                    <tr>
                        <td>Id_Departamento:</td>
                        <td><html:text name="InserirEquipamentoActionForm" property="idEquip" /></td>
                    </tr>
                    <tr>
                        <td>Qtde:</td>
                        <td><html:text name="InserirEquipamentoActionForm" property="qtdeEquip" /></td>
                    </tr>
                    <tr> 
                        <td colspan="2"><html:submit value="Inserir"/></td>
                    </tr>
                </tbody>
            </table>
        </html:form>
        <html:errors/>
    </body>
</html>
