package co.edu.datacredito.servlets;

import co.edu.datacredito.dao.BlacklistDAO;
import co.edu.datacredito.dao.DatacreditoDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/validarCodigo")
public class ValidarCodigo extends HttpServlet {
    private BlacklistDAO blacklistDAO = new BlacklistDAO();
    private DatacreditoDAO datacreditoDAO = new DatacreditoDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String codigoUnico = req.getParameter("codigoUnico");

        if (codigoUnico == null || codigoUnico.isEmpty()) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            resp.getWriter().write("El código único es obligatorio");
            return;
        }

        // Verificar si el cliente está en la lista negra
        if (blacklistDAO.estaEnBlacklist(codigoUnico)) {
            resp.setStatus(HttpServletResponse.SC_FORBIDDEN);
            resp.getWriter().write("El cliente está en la lista negra. No se permiten trámites.");
            return;
        }

        // Obtener el estado crediticio
        String estadoCrediticio = datacreditoDAO.obtenerEstadoCrediticio(codigoUnico);
        if (estadoCrediticio != null) {
            resp.setStatus(HttpServletResponse.SC_OK);
            resp.getWriter().write("Estado crediticio: " + estadoCrediticio);
        } else {
            resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
            resp.getWriter().write("Cliente no encontrado en Datacrédito.");
        }
    }
}