package crud;

import market.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

import java.util.List;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

 //@Query (Value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true);
 List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
 Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}

