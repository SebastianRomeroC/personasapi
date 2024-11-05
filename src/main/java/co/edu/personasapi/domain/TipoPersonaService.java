package co.edu.personasapi.domain;
import java.util.List;
/**
*
* @author nixod
*/
public interface TipoPersonaService {
 List<TipoPersona> listar();
 
 TipoPersona listarId(int id);

 TipoPersona add(TipoPersona tp);

 TipoPersona edit(TipoPersona tp);

 TipoPersona delete(int id);
}
