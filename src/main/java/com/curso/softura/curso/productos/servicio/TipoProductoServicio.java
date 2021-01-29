package com.curso.softura.curso.productos.servicio;


import com.curso.softura.curso.modelos.Producto;
import com.curso.softura.curso.modelos.TipoProducto;
import com.curso.softura.curso.productos.dto.ProductoDTO;
import com.curso.softura.curso.productos.dto.TipoProductoDto;
import com.curso.softura.curso.respositorios.ProductoRepositorio;
import com.curso.softura.curso.respositorios.TipoProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
public class TipoProductoServicio {

    @Autowired
    private transient ProductoRepositorio productoRepositorio;

    @Autowired
    private transient TipoProductoRepositorio tipoProductoRepositorio;




    public List<TipoProductoDto> obtenerTipoProductos(){


        List<TipoProducto> lista2 = tipoProductoRepositorio.findAll();

             return lista2.stream().map(tipoProducto ->
              new TipoProductoDto(tipoProducto.getIdTipoProducto(),

              tipoProducto.getTipoProducto())).collect(Collectors.toList());



    //    List<Producto> lista = productoRepositorio.findAll();

  //      return lista.stream().map(tipoproducto ->
 //               new ProductoDTO(producto.getIdProducto(),producto.getNombre(),producto.getRegistroActivo())
 //       ).collect(Collectors.toList());


        //forcomment
//        List<ProductoDTO> respuesta = new ArrayList<>();
//
//        for (Producto producto: lista) {
//            respuesta.add( new ProductoDTO(producto.getIdProducto(),producto.getNombre()));
//        }
//
//        return respuesta;

    }



}
