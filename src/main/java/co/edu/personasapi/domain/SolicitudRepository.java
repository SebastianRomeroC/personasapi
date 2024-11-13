package co.edu.personasapi.domain;
 
import java.util.List;
import org.springframework.data.repository.Repository;
 
/**
*
* @author nixod
*/
public interface SolicitudRepository extends Repository<Solicitud, Integer> {
 
    List<Solicitud> findAll();
 
    Solicitud findById(int id);
 
    Solicitud save(Solicitud solicitud);
 
    void delete(Solicitud solicitud);
}