/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.personasapi.domain;

import java.util.List;

/**
 *
 * @author nixod
 */
public interface PersonaService {

    List<Personas> listar();

    Personas listarId(int id);

    Personas add(Personas p);

    Personas edit(Personas p);

    Personas delete(int id);
}
