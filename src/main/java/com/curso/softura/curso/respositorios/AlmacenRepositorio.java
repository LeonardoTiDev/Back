package com.curso.softura.curso.respositorios;

import com.curso.softura.curso.modelos.Almacen;
import com.curso.softura.curso.modelos.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlmacenRepositorio extends JpaRepository<Almacen, Long> {
    @Query(" select a from Almacen a " +
            "join a.productoAlmacenes pa" +
            " join pa.producto p where p.idProducto=?1 ")
  List<Almacen> ObtenerAlmacenesPorProducto (Long id);
}
