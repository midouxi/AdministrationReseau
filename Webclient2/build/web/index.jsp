<%@page import="java.net.InetAddress"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Ping Page </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Ping Client/Serveur </h1>
        <form action="action.jsp"/>
            <% String ip = (String) InetAddress.getLocalHost().getHostAddress(); %>
            Votre Adresse IP est : <% out.println(ip); %><br /><br />
            <input type="hidden" name = "ip" value="<% out.println(ip); %>"/>
            <input type="submit" value="Valider"/>
        </form>
    </body>
</html>
