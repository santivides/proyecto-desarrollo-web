package com.canchas_admin.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "canchas")
public class Canchas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "establecimiento")
    private String establecimiento;

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public Long getPrecio_referencia() {
        return precio_referencia;
    }

    public void setPrecio_referencia(Long precio_referencia) {
        this.precio_referencia = precio_referencia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

   

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name="precio_referencia")
    private Long precio_referencia;

    @Column(name="ciudad")
    private String ciudad;{

    }

    public void cancha(Long id, String nombre, String descripcion, String imageUrl, Long precio_referencia, String ciudad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imageUrl = imageUrl;
        this.precio_referencia = precio_referencia;
        this.ciudad = ciudad;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setValores(String nombre, String descripcion, String imageUrl){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imageUrl = imageUrl;

    }


}

