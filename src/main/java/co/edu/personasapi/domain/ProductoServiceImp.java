package co.edu.personasapi.domain;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nixod
 */
@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    @Override
    public Producto listarId(int id) {
        return productoRepository.findById(id);
    }

    @Override
    public Producto add(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto edit(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto delete(int id) {
        Producto producto = productoRepository.findById(id);
        if (producto != null) {
            productoRepository.delete(producto);
        }
        return producto;
    }
}
