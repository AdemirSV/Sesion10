package com.ciberfarma.spring_web_ciberfarma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ciberfarma.spring_web_ciberfarma.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	List<Producto> findAllByOrderByIdProductoDesc();
	
	//Filtro por Id Categoria y ordenamiento por Id Producto
	List<Producto> findAllByCategoria_IdCategoriaOrderByIdProducto(Integer idCategoria);
	
	@Query("""
			select p from Producto p
			where 
				(p.categoria.idCategoria = :idCategoria or :idCategoria is null)
				and
				(p.proveedor.idProveedor = :idProveedor or :idProveedor is null)
			order by
				p.idProducto desc
			""")
	List<Producto> findAllByFilters(@Param("idCategoria") Integer idCategoria,
									@Param("idProveedor") Integer idProveedor);
	
}
