package com.upn.ecommerce.model;


import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity

@Table(name = "productos")

@NamedQueries({

  @NamedQuery(

    name = "Producto.listarCatalogoPorCategoriaEspecifica", 

    query = "SELECT p FROM Producto p WHERE p.categoria = :categoriaFiltro"

  )

})

public class Producto {

   

  @Id

  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;


  @Column(nullable = false, length = 150)

  private String nombre;


  @Column(nullable = false, length = 100)

  private String categoria;


  @Column(nullable = false, precision = 10, scale = 2)

  private BigDecimal precio;


  @Column(nullable = false)

  private Integer stock;


  @Column(length = 100)

  private String marca;


  @Column(name = "codigo_barras", unique = true, length = 50)

  private String codigoBarras;


  public Integer getId() {
	return id;
  }


  public void setId(Integer id) {
	this.id = id;
  }


  public String getNombre() {
	return nombre;
  }


  public void setNombre(String nombre) {
	this.nombre = nombre;
  }


  public String getCategoria() {
	return categoria;
  }


  public void setCategoria(String categoria) {
	this.categoria = categoria;
  }


  public BigDecimal getPrecio() {
	return precio;
  }


  public void setPrecio(BigDecimal precio) {
	this.precio = precio;
  }


  public Integer getStock() {
	return stock;
  }


  public void setStock(Integer stock) {
	this.stock = stock;
  }


  public String getMarca() {
	return marca;
  }


  public void setMarca(String marca) {
	this.marca = marca;
  }


  public String getCodigoBarras() {
	return codigoBarras;
  }


  public void setCodigoBarras(String codigoBarras) {
	this.codigoBarras = codigoBarras;
  }



}