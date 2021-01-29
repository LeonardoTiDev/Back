package com.curso.softura.curso.productos.controlador;




import com.curso.softura.curso.general.RespuestaServicio;
import com.curso.softura.curso.productos.dto.ProductoDTO;
import com.curso.softura.curso.productos.dto.TipoProductoDto;
import com.curso.softura.curso.productos.servicio.ProductoServicio;
import com.curso.softura.curso.productos.servicio.TipoProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.Serializable;
import java.util.List;


@RestController
@RequestMapping("api/typeproducto")
public class TipoProductoController {

    private static final long serialVersionUID = 8366742694834006767L;

    private transient Logger log = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private transient ProductoServicio productoServicio;


    @Autowired
    private transient TipoProductoServicio tipoproductoServicio;


    @GetMapping("/obtener")
    public ResponseEntity<RespuestaServicio<List<TipoProductoDto>>> obtenerTipoProductosActivos() {
        final RespuestaServicio<List<TipoProductoDto>> respuesta = new RespuestaServicio<>();

        try {
            List<TipoProductoDto> lista = tipoproductoServicio.obtenerTipoProductos();
            return respuesta.obtenerRespuesta(lista, "Datos obtenidos correctamente");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return respuesta.obtenerRespuestaError("Ocurrio un error al obtener los datos amldita sea");
        }
    }


}
