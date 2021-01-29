package com.curso.softura.curso.modelos;

import javax.persistence.*;

@Entity
@Table(name = "r_producto_almacen")
public class ProductoAlmacen {

    private static final long serialVersionUID = -7475526049448108474L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long idProductoAlmacen;

    public Long getIdProductoAlmacen() {
        return idProductoAlmacen;
    }

    public void setIdProductoAlmacen(Long idProductoAlmacen) {
        this.idProductoAlmacen = idProductoAlmacen;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Almacen getAlmacen() {
        return almacen;
    }

    public void setAlmacen(Almacen almacen) {
        this.almacen = almacen;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto")
    private Producto producto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_almacen")
    private Almacen almacen;





}
