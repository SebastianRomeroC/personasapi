package co.edu.personasapi.domain;
 
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
/**
*
* @author nixod
*/
@Entity
@Table(name = "solicitudes")
public class Solicitud {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_solicitud;
 
    @Column
    private String descripcion;
 
    @Column
    private String estado;
 
    @Column
    private String fechaSolicitud;
 
    // Getters y setters
    public int getId_solicitud() {
        return id_solicitud;
    }
 
    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    public String getEstado() {
        return estado;
    }
 
    public void setEstado(String estado) {
        this.estado = estado;
    }
 
    public String getFechaSolicitud() {
        return fechaSolicitud;
    }
 
    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
}