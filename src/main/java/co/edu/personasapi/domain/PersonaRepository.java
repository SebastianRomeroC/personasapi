/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author nixod
 */
public interface PersonaRepository extends Repository<Personas, Integer> {

    List<Personas> findAll();

    Personas findById(int id);

    Personas save(Personas p);

    void delete(Personas p);

}
