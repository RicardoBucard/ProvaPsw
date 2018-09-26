/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class ExcluirServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        String nomeArtistico = req.getParameter("nomeArtistico");
        String banda = req.getParameter("banda");
        String estiloMusical = req.getParameter("estiloMusical");
        String anos = req.getParameter("anosCarreira");
        Integer anosCarreira = Integer.parseInt(anos);
        List<Artista> artistas = (ArrayList)req.getServletContext().getAttribute("listaArtistas");
        if (artistas!= null){
            boolean excluiu = artistas.remove(new Artista(nomeArtistico, banda, anosCarreira, estiloMusical));
            if (excluiu == true){
                req.setAttribute("msg","Artista excluído com sucesso");
            }
            else{
                req.setAttribute("msg","Artista não encontrado");
            }
        }
        else{
            req.setAttribute("msg","Lista de Artistas inexistente");
        }
        
        req.getRequestDispatcher("/sucesso.jsp").forward(req,res);
    }
}