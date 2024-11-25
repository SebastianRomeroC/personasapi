package co.edu.personasapi.infraestructura;

import co.edu.personasapi.domain.TipoPersona;
import co.edu.personasapi.domain.TipoPersonaService;
import java.util.List;
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

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/tipopersonas"})
public class TipoPersonaRest {

    @Autowired
    TipoPersonaService tpservice;

    @GetMapping("/submit")
    public List<TipoPersona> listar(){
        return tpservice.listar();
    }

    @PostMapping("/submit")
    public TipoPersona agregar(@RequestBody TipoPersona tp){
        return tpservice.add(tp);
    }

    @GetMapping("/submit/{id}")
    public TipoPersona listarId(@PathVariable("id") int id){
        return tpservice.listarId(id);
    }

    @PutMapping("/submit/{id}")
    public TipoPersona editar(@RequestBody TipoPersona tp, @PathVariable("id") int id){
        tp.setId(id);
        return tpservice.edit(tp);
    }

    @DeleteMapping("/submit/{id}")
    public TipoPersona delete(@PathVariable("id") int id){
        return tpservice.delete(id);
    }

    @GetMapping("/submit/tp")
    public List<TipoPersona> listarTp(){
        return tpservice.listar();
    }
}