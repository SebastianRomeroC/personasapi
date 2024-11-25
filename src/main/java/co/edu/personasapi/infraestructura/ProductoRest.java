package co.edu.personasapi.infraestructura;
 
import co.edu.personasapi.domain.Producto;
import co.edu.personasapi.domain.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 
import java.util.List;
 //dbwajbd
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/productosrest")
public class ProductoRest {
 
    @Autowired
    private ProductoService productoService;
 
    // Listar todos los productos
    @GetMapping("/submit")
    public List<Producto> listar() {
        return productoService.listar();
    }
 
    // Crear un nuevo producto
    @PostMapping("/submit")
    public Producto agregar(@RequestBody Producto producto) {
        return productoService.add(producto);
    }
 
    // Obtener un producto por ID
    @GetMapping("/submit/{id}")
    public Producto listarId(@PathVariable("id") int id) {
        return productoService.listarId(id);
    }
 
    // Editar un producto existente
    @PutMapping("/submit/{id}")
    public Producto editar(@RequestBody Producto producto, @PathVariable("id") int id) {
        producto.setId_producto(id);  // Asegura que el ID que se pasa es el correcto
        return productoService.edit(producto);
    }
 
    // Eliminar un producto por ID
    @DeleteMapping("/submit/{id}")
    public Producto eliminar(@PathVariable("id") int id) {
        return productoService.delete(id);
    }
}
