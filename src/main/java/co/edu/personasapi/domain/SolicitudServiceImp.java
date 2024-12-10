package co.edu.personasapi.domain;
 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
/**
*
* @author nixod
*/
@Service
public class SolicitudServiceImp implements SolicitudService {
 
    @Autowired
    private final SolicitudRepository solicitudRepository;
    
     public SolicitudServiceImp(SolicitudRepository solicitudRepository) {
        this.solicitudRepository = solicitudRepository;
    }
 
    @Override
    public List<Solicitud> listar() {
        return solicitudRepository.findAll();
    }
 
    @Override
    public Solicitud listarId(int id) {
        return solicitudRepository.findById(id);
    }
 
    @Override
    public Solicitud add(Solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }
 
    @Override
    public Solicitud edit(Solicitud solicitud) {
        return solicitudRepository.save(solicitud);
    }
 
    @Override
    public Solicitud delete(int id) {
        Solicitud solicitud = solicitudRepository.findById(id);
        if (solicitud != null) {
            solicitudRepository.delete(solicitud);
        }
        return solicitud;
    }
    
    @Override
    public List<Solicitud> obtenerTodas() {
        return solicitudRepository.findAll();
    }
    
    @Override
    public int contarPorEstado(String estado) {
        return solicitudRepository.countByEstado(estado);
    }
}
