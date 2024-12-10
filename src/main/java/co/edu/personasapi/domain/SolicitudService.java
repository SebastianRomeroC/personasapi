package co.edu.personasapi.domain;
 
import java.util.List;
 
/**
*
* @author nixod
*/
public interface SolicitudService {
 
    List<Solicitud> listar();
 
    Solicitud listarId(int id);
 
    Solicitud add(Solicitud solicitud);
 
    Solicitud edit(Solicitud solicitud);
 
    Solicitud delete(int id);
    
    List<Solicitud> obtenerTodas();
     
    int contarPorEstado(String estado);
}
