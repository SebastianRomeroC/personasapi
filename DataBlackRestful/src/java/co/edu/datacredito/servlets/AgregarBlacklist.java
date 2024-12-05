package co.edu.datacredito.servlets;

import co.edu.datacredito.dao.BlacklistDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/agregarBlacklist")
public class AgregarBlacklist extends HttpServlet {
    private BlacklistDAO blacklistDAO = new BlacklistDAO();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String codigoUnico = req.getParameter("codigoUnico");

        if (codigoUnico == null || codigoUnico.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("El código único es obligatorio");
            return;
        }

        if (blacklistDAO.agregarABlacklist(codigoUnico)) {
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write("El cliente ha sido agregado a la lista negra.");
        } else {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            resp.getWriter().write("Error al agregar el cliente a la lista negra.");
        }
    }
}