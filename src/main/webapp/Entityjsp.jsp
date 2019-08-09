<%-- 
    Document   : Entityjsp
    Created on : 8 août 2019, 12:07:10
    Author     : Administrateur
--%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Vector"%>
<%@page import="entitytest.Media"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" crossorigin="anonymous">
        <title>Entité</title>
    </head>
    <body class="container">
        <br>
        <h1>MediaShare</h1>
        <br>
        <table class="table table-striped table-dark table-bordered" style="width:60%;">
             <thead class="thead-dark">
               <tr>
                 <th scope="col">N°</th>
                 <th scope="col">Titre</th>
                 <th scope="col">Auteur</th>
                 <th scope="col">Infos</th>
               </tr>
             </thead>
             <tbody>
                <% Vector <Media> displiste = (Vector) request.getAttribute("media");
                if(displiste == null){
                    %><tr><td><%= 0 %></td><td><% out.println("raté"); %></td><td> table vide </td><td><%= 0 %></td></tr><%
                }else{
                int cpt = 1;
                for (Media x : displiste){
                    %><tr><td><%= cpt++ %></td><td><%= x.getTitre() %></td><td><%= x.getAuteur() %></td><td><%= x.getNbpage() %></td></tr><%
                }}
                %>
             </tbody>
         </table>
        
        
    </body>
</html>
