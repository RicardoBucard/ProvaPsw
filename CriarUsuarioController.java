/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet("/CriarUsuario")
public class CriarUsuarioController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
      	RequestDispatcher view = req.getRequestDispatcher("cadastro.jsp");
        view.forward(req, res); 	
    }  
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
        String nomeArtistico = req.getParameter("nomeArtistico");
        String banda = req.getParameter("banda");
        String anos = req.getParameter("anosCarreira");
        Integer anosCarreira = Integer.parseInt(anos);
        String estiloMusical = req.getParameter("estiloMusical");
        String msg1 = "";
        String msg2 = "";
        String msg3 = "";
        String msg4 = "";
        if(!(nomeArtistico!= null && nomeArtistico.trim().length()>0 && nomeArtistico.trim().length() < 31)){//sem "!": confirma que está preenchido e que não é por algo que seja espaços em branco
            msg1+= "Digite um nome válido";
        }
       
        if(msg1.equals("")){
            //form válido
            req.getRequestDispatcher("/sucesso.jsp").forward(req, res);
        
        if(banda!= null && banda.trim().length()> 0 && banda.trim().length() < 41){
            req.getRequestDispatcher("/sucesso.jsp").forward(req, res);
        }

        }
             
        if(msg2.equals("")){
            //form válido
            req.getRequestDispatcher("/sucesso.jsp").forward(req, res);

        }
        
        if(!(anosCarreira!= null && anosCarreira > 0 && anosCarreira < 100)){//sem "!": confirma que está preenchido e que não é por algo que seja espaços em branco
            msg3+= "Digite um valor válido.";
        }
        
        if(msg1.equals("")){
            //form válido
            req.getRequestDispatcher("/sucesso.jsp").forward(req, res);

        }
        
        if(!(estiloMusical!= null && estiloMusical.trim().length()>0 && (!(estiloMusical.equals("Selecione um estilo musical"))))){//sem "!": confirma que está preenchido e que não é por algo que seja espaços em branco
            msg4+= "Digite um estilo musical válido.";
        }
        if(msg4.equals("")){
            //form válido
            req.getRequestDispatcher("/sucesso.jsp").forward(req, res);
        }
        else{
            //form inválido
            req.setAttribute("msg1", msg1);
            req.setAttribute("msg2", msg2);
            req.setAttribute("msg3", msg3);
            req.getRequestDispatcher("/cadastro.jsp").forward(req, res);
            
        }
        List<Artista> artistas = (List<Artista>) req.getSession().getAttribute("listaArtistas");
        if(artistas == null){
            artistas = new ArrayList<Artista>();
        }
        artistas.add(new Artista(nomeArtistico, banda, anosCarreira, estiloMusical));
        req.getSession().setAttribute("listaArtistas",artistas);
        req.getRequestDispatcher("/ListagemArtistasServlet").forward(req,res);
        
    }
}
