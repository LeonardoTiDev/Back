package com.curso.softura.curso.productos.dto;

public class TipoProductoDto {
    private Integer idTipoProducto;
    private String nombre;
//1
    public TipoProductoDto() {
        super();
    }
//2
    public TipoProductoDto(Integer idTipoProducto, String nombre) {
        this.idTipoProducto = idTipoProducto;
        this.nombre = nombre;
    }
//3
    public Integer getIdTipoProducto() {
        return idTipoProducto;
    }
//4
    public TipoProductoDto setIdTipoProducto(Integer idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
        return this;
    }
//5
    public String getNombre() {
        return nombre;
    }
//6
    public TipoProductoDto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }
}
