/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author uestudiantes
 */
public interface TipoPersonaRepository extends Repository<TipoPersona, Integer> {

    List<TipoPersona> findAll();
    
    TipoPersona findById(int id);
    
    TipoPersona save(TipoPersona tp);

    void delete(TipoPersona tp);
}
