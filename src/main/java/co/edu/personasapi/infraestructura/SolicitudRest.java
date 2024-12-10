package co.edu.personasapi.infraestructura;
 
import co.edu.personasapi.domain.Solicitud;
import co.edu.personasapi.domain.SolicitudService;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import java.util.List;
import java.util.Map;
 
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/solicitudesrest")
public class SolicitudRest {
 
    @Autowired
    private SolicitudService solicitudService;
 
    // Listar todas las solicitudes
    @GetMapping("/submit")
    public List<Solicitud> listar() {
        return solicitudService.listar();
    }
 
    // Crear una nueva solicitud
    @PostMapping("/submit")
    public Solicitud agregar(@RequestBody Solicitud solicitud) {
        return solicitudService.add(solicitud);
    }
 
    // Obtener una solicitud por ID
    @GetMapping("/submit/{id}")
    public Solicitud listarId(@PathVariable("id") int id) {
        return solicitudService.listarId(id);
    }
 
    // Editar una solicitud existente
    @PutMapping("/submit/{id}")
    public Solicitud editar(@RequestBody Solicitud solicitud, @PathVariable("id") int id) {
        solicitud.setId_solicitud(id);  // Asegura que el ID que se pasa es el correcto
        return solicitudService.edit(solicitud);
    }
 
    // Eliminar una solicitud por ID
    @DeleteMapping("/submit/{id}")
    public Solicitud eliminar(@PathVariable("id") int id) {
        return solicitudService.delete(id);
    }
    
    @GetMapping("/submit/total")
    public Map<String, Object> obtenerEstadisticas() {
        Map<String, Object> response = new HashMap<>();

        int totalSolicitudes = solicitudService.obtenerTodas().size();
        int aceptadas = solicitudService.contarPorEstado("aceptada");
        int rechazadas = solicitudService.contarPorEstado("rechazada");
        int pendientes = solicitudService.contarPorEstado("pendiente");

        response.put("totalSolicitudes", totalSolicitudes);
        response.put("aceptadas", aceptadas);
        response.put("rechazadas", rechazadas);
        response.put("pendientes", pendientes);

        return response;
    }
}