package com.curso.softura.curso.productos.dto;

import java.io.Serializable;

public class AlmacenDTO implements Serializable {

    private static final long serialVersionUID = 5618541332556323433L;

    private Integer idAlmacen;
    private String nombreAlmacen;



    public AlmacenDTO() {
        super();
    }

    public Integer getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(Integer idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    //2
    public AlmacenDTO(Integer idAlmacen, String nombreAlmacen ) {

        this.idAlmacen=idAlmacen;
        this.nombreAlmacen= nombreAlmacen;

    }

}
