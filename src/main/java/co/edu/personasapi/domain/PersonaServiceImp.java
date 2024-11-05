/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.personasapi.domain;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
*
* @author nixod
*/
@Service
public class PersonaServiceImp implements PersonaService{
 @Autowired
 private PersonaRepository repositorio;

 @Override
 public List<Personas> listar() {
 return repositorio.findAll();
 }
 @Override
 public Personas listarId(int id) {
 return repositorio.findById(id);
 }
 @Override
 public Personas add(Personas p) {
 return repositorio.save(p);
 }
 @Override
 public Personas edit(Personas p) {
 return repositorio.save(p);
 }
 @Override
 public Personas delete(int id) {
     Personas p = repositorio.findById(id);
     if (p !=null)
         repositorio.delete(p);
     return p;
 }

}