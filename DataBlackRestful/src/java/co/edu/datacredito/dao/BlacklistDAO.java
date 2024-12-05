package co.edu.datacredito.dao;

import co.edu.datacredito.utils.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BlacklistDAO {
    public boolean estaEnBlacklist(String codigoUnico) {
        String sql = "SELECT * FROM blacklist WHERE codigo_unico = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, codigoUnico);
            ResultSet rs = ps.executeQuery();
            return rs.next(); // Retorna true si el código está en la lista negra
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean agregarABlacklist(String codigoUnico) {
        String sql = "INSERT INTO blacklist (codigo_unico) VALUES (?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, codigoUnico);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}