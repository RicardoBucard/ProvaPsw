<%-- 
    Document   : cadastro
    Created on : 25/09/2018, 13:18:16
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h2>${ msg }</h2>
        <h2>Cadastre novo artista</h2>
        <form action="./CriarUsuario" method="POST">
            Nome: <input type="text" name="nomeArtistico" value=""${ param.nomeArtistico }" /><br>
            Banda: <input type="text" name="banda" value=""${ param.banda }" /><br>
            Anos de Carreira <input type="text" name="anosCarreira" value=""${ param.anosCarreira }" /><br>
            <select name="Estilo Musical">             
                <option>Selecione um estilo musical</option>
                <option>Rock</option>
                <option>Pop</option>
                <option>Outros</option>
            </select>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html> 
