package com.curso.softura.curso.productos.servicio;




import com.curso.softura.curso.modelos.Almacen;
import com.curso.softura.curso.modelos.Producto;
import com.curso.softura.curso.modelos.TipoProducto;
import com.curso.softura.curso.productos.dto.AlmacenDTO;
import com.curso.softura.curso.productos.dto.ProductoDTO;
import com.curso.softura.curso.productos.dto.TipoProductoDto;
import com.curso.softura.curso.respositorios.AlmacenRepositorio;
import com.curso.softura.curso.respositorios.ProductoRepositorio;
import com.curso.softura.curso.respositorios.TipoProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
public class AlmacenServicio {

    @Autowired
    private transient ProductoRepositorio productoRepositorio;

    @Autowired
    private transient TipoProductoRepositorio tipoProductoRepositorio;
    @Autowired
    private transient AlmacenRepositorio almacenRepositorio;

    @PersistenceContext
    private EntityManager em;




    @Transactional
    public List<AlmacenDTO> listarAlmacenes(Long id) {

        List<Almacen> lista = almacenRepositorio.ObtenerAlmacenesPorProducto(id);

       return lista.stream().map ( almacen -> new AlmacenDTO(almacen.getIdAlmacen(), almacen.getNombreAlmacen())).collect(Collectors.toList());




    }


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
