package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author nixod
 */
public interface ProductoRepository extends Repository<Producto, Integer> {

    List<Producto> findAll();

    Producto findById(int id);

    Producto save(Producto producto);

    void delete(Producto producto);
}

