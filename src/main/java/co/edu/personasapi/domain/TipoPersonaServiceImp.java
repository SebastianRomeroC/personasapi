/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TipoPersonaServiceImp implements TipoPersonaService {

    @Autowired
    private TipoPersonaRepository tp_repositorio;

    @Override
    public List<TipoPersona> listar() {
        return tp_repositorio.findAll();
    }

    @Override
    public TipoPersona listarId(int id) {
        return tp_repositorio.findById(id);
    }
    
    @Override
    public TipoPersona add(TipoPersona tp) {
        return tp_repositorio.save(tp);
    }

    @Override
    public TipoPersona edit(TipoPersona tp) {
        return tp_repositorio.save(tp);
    }

    @Override
    public TipoPersona delete(int id) {
        TipoPersona tp = tp_repositorio.findById(id);
        if (tp != null) {
            tp_repositorio.delete(tp);
        }
        return tp;
    }

}
