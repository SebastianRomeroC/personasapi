/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.personasapi.infraestructura;

import co.edu.personasapi.domain.Personas;
import co.edu.personasapi.domain.PersonaService;
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
/**
*
* @author nixod
*/

//hola saludos

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/personasrest"})
public class PersonaRest {
 @Autowired
 PersonaService service;

 @Autowired
 TipoPersonaService tpservice;

 @GetMapping("/submit")
 public List<Personas> listar(){
 return service.listar();
 }
@PostMapping("/submit")
 public Personas agregar(@RequestBody Personas p){
 return service.add(p);
    }
 @GetMapping("/submit/{id}")
 public Personas listarId(@PathVariable("id") int id){
 return service.listarId(id);
 }

 /**
  * 
  * @param p
  * @param id
  * @return 
  */
 @PutMapping("/submit/{id}")
 public Personas editar(@RequestBody Personas p, @PathVariable("id") int id){
 p.setId(id);
 return service.edit(p);
 }
 
 @DeleteMapping("/submit/{id}")
 public Personas delete(@PathVariable("id") int id){
 return service.delete(id);
 }

 @GetMapping("/submit/tp")
 public List<TipoPersona> listarTp(){
 return tpservice.listar();
 }
}