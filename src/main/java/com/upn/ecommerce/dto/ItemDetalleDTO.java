package com.upn.ecommerce.dto;


import java.math.BigDecimal;


public class ItemDetalleDTO {

   

  private Integer idProductoComprado;

  private BigDecimal precioFijado;

  private Integer cantidadLlevada;

  public Integer getIdProductoComprado() {
	return idProductoComprado;
  }

  public void setIdProductoComprado(Integer idProductoComprado) {
	this.idProductoComprado = idProductoComprado;
  }

  public BigDecimal getPrecioFijado() {
	return precioFijado;
  }

  public void setPrecioFijado(BigDecimal precioFijado) {
	this.precioFijado = precioFijado;
  }

  public Integer getCantidadLlevada() {
	return cantidadLlevada;
  }

  public void setCantidadLlevada(Integer cantidadLlevada) {
	this.cantidadLlevada = cantidadLlevada;
  }


  // Genera los Getters y Setters

}