package co.edu.personasapi.domain;

import java.util.List;

/**
 *
 * @author nixod
 */
public interface ProductoService {

    List<Producto> listar();

    Producto listarId(int id);

    Producto add(Producto producto);

    Producto edit(Producto producto);

    Producto delete(int id);
}
