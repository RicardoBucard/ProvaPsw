<%-- 
    Document   : sucesso
    Created on : 25/09/2018, 23:03:00
    Author     : DELL
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <body>
        <c:out value="${ msg }"></c:out>
        <%
		List<Artista> artistas = (ArrayList<Artista>) request.getAttribute("listaArtistas");
        %>
       <table border="1">
            <tr>
                <td>Nome Artístico</td>
                <td>Banda</td>
                <td>Anos de Carreira</td>
                <td>Estilo Musical</td>
                <td>Excluir</td>
            </tr>
            <c:forEach items="${ artistas }" var="artista">
                <tr>
                <td>${ artista.nomeArtistico }</td>
                <td>${ artista.banda }</td>
                <td>${ artista.anosCarreira }</td>
                <td>${ artista.estiloMusical }</td>
                <c:url value="/ExcluirServlet" var="excluirUrl" scope="page">
                    <c:param name="nome" value="${ artista.nomeArtistico }"/>
                    <c:param name="banda" value="${ artista.banda }"/>
                    <c:param name="anosCarreira" value="${ artista.anosCarreira }"/>
                    <c:param name="estiloMusical" value="${ artista.estiloMusical }"/> 
                </c:url>
                    <td><a href="${ excluirUrl }">Excluir</a></td>
                </tr>
        </c:forEach>
       </table>
       <%
            for(Artista a : artistas){
	%>
            <tr>
            <th scope="row"><%= a.getNomeArtistico() %></td>
            <td><%= a.getBanda() %></td>
            <td><%= a.getAnosCarreira() %></td>
            <td><%= a.getEstiloMusical() %></td>
	<%
            }
	%>
   
    </body>
</html>
