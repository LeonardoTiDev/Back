package com.curso.softura.curso.modelos;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "m_almacen")
public class Almacen {


    private static final long serialVersionUID = -7475526049448108474L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idAlmacen;

    @Column
    private String nombreAlmacen;

    @OneToMany(mappedBy = "almacen" , fetch = FetchType.LAZY)
    private Set<ProductoAlmacen> productoAlmacenes;

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

    public Set<ProductoAlmacen> getProductoAlmacenes() {
        return productoAlmacenes;
    }

    public void setProductoAlmacenes(Set<ProductoAlmacen> productoAlmacenes) {
        this.productoAlmacenes = productoAlmacenes;
    }
}
