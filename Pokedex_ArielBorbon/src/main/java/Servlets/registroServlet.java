/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import Pokemon.Tipos_Pokemon;
import Pokemon.pokemonDAO;
import Pokemon.pokemonDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author PC Gamer
 */
@WebServlet(name = "registroServlet", urlPatterns = {"/registro"})
public class registroServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("tipos", Tipos_Pokemon.values());

        request.getRequestDispatcher("/Paginas/añadirPokemon.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String nombre = request.getParameter("nombre");
        String numeroStr = request.getParameter("numero");
        String tipoStr = request.getParameter("tipo");
        String urlImagen = request.getParameter("urlImagen");

        pokemonDAO dao = new pokemonDAO();
        pokemonDTO nuevoPokemon = new pokemonDTO();
        nuevoPokemon.setNombre(nombre);
        nuevoPokemon.setUrlImagen(urlImagen);

        int numero = 0;

        try {
            numero = Integer.parseInt(numeroStr);
            nuevoPokemon.setNumero(numero);
        } catch (Exception e) {
        }

            Tipos_Pokemon tipo = Tipos_Pokemon.valueOf(tipoStr);
            nuevoPokemon.setTipo(tipo);

            
        String errores = dao.añadirPokemon(nuevoPokemon);

        if (errores == null) {

            response.sendRedirect("pokedex");

        } else {

            request.setAttribute("errores", errores);

            request.setAttribute("pokemonIngresado", nuevoPokemon);

            request.setAttribute("tipos", Tipos_Pokemon.values());

            request.getRequestDispatcher("/Paginas/añadirPokemon.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
