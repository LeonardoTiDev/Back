package com.curso.softura.curso.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "c_tipo_producto")
public class TipoProducto extends BitacoraModelo implements Serializable {

    private static final long serialVersionUID = -8221436353130121090L;
    @Id
    @Column
    private Integer idTipoProducto;

    @Column
    private String tipoProducto;


    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }

    public TipoProducto setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
        return this;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public TipoProducto setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
        return this;
    }
}
