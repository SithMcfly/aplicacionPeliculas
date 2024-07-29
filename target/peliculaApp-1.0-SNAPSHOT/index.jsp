<%-- 
    Document   : index
    Created on : 24 jul 2024, 11:43:07
    Author     : Sith_Mcfly
--%>
<%--
<%@page import="java.util.List"%>
<%@page import="com.mycompany.peliculaapp.Pelicula"%>
<%@page import="com.mycompany.peliculaapp.ControladoraPersistencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AppPeliculas</title>
    </head>
    <body>
        <h1>Hola desde JSP</h1>
        <%
        ControladoraPersistencia crud = new ControladoraPersistencia();
        List<Pelicula> peliculas= crud.listarPeliculas();
        
        for  (Pelicula pelicula: peliculas){
        %>
        
        <h5>< %= pelicula.getId()% ></h5>
        <h5><%=pelicula.getTitulo()%></h5>
        <h5><%=pelicula.getEspectador()%></h5>
        <h5><%=pelicula.getLugar()%></h5>
        <h5><%=pelicula.getFecha()%></h5>
        <%}%>
    </body>
</html>
%>
<%-- 
    Document   : index
    Created on : 24 jul 2024, 11:43:07
    Author     : Sith_Mcfly
--%>

<%@page import="java.util.*"%>
<%@page import="com.mycompany.peliculaapp.Pelicula"%>
<%@page import="com.mycompany.peliculaapp.ControladoraPersistencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AppPeliculas</title>
    </head>
    <body>
        <h1>Lista de Películas</h1>
        <%
        ControladoraPersistencia crud = new ControladoraPersistencia();
        List<Pelicula> peliculas = crud.listarPeliculas();  // Inicializar la lista de películas con el resultado del método listarPeliculas
        
            for (Pelicula pelicula : peliculas) {
        %>
                <h5>ID: <%=pelicula.getId()%></h5>
                <h5>Titulo: <%=pelicula.getTitulo()%></h5>
                <h5>Vista por: <%=pelicula.getEspectador()%></h5>
                <h5>En: <%=pelicula.getLugar()%></h5>
                <h5>Fecha: <%=pelicula.getFecha()%></h5>
       
        <%
        }
        %>
    </body>
</html>