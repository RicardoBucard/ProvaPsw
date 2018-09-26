/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class ListagemArtistasServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        HashSet<Artista> artistas = new HashSet<>();
        artistas = (HashSet<Artista>) req.getSession();
        req.getRequestDispatcher("/sucesso.jsp").forward(req, res);
        
        }

}
