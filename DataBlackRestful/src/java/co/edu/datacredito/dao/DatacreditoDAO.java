package co.edu.datacredito.dao;

import co.edu.datacredito.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatacreditoDAO {
    public String obtenerEstadoCrediticio(String codigoUnico) {
        String sql = "SELECT estado_crediticio FROM datacredito WHERE codigo_unico = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, codigoUnico);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("estado_crediticio"); // Retorna el estado (A, AA, AAA)
            } else {
                return null; // Cliente no encontrado
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean agregarEstadoCrediticio(String codigoUnico, String estadoCrediticio) {
        String sql = "INSERT INTO datacredito (codigo_unico, estado_crediticio) VALUES (?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, codigoUnico);
            ps.setString(2, estadoCrediticio);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}