package com.curso.softura.curso.respositorios;

import com.curso.softura.curso.modelos.Producto;
import com.curso.softura.curso.modelos.ProductoAlmacen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoAlmacenRepositorio extends JpaRepository<ProductoAlmacen, Long> {
}
