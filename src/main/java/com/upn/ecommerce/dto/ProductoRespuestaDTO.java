package com.upn.ecommerce.dto;


import java.math.BigDecimal;


public class ProductoRespuestaDTO {

   

  private Integer identificador;

  private String denominacion;

  private String clasificacion;

  private BigDecimal precioVenta;

  private Integer unidadesDisponibles;

  public Integer getIdentificador() {
	return identificador;
  }

  public void setIdentificador(Integer identificador) {
	this.identificador = identificador;
  }

  public String getDenominacion() {
	return denominacion;
  }

  public void setDenominacion(String denominacion) {
	this.denominacion = denominacion;
  }

  public String getClasificacion() {
	return clasificacion;
  }

  public void setClasificacion(String clasificacion) {
	this.clasificacion = clasificacion;
  }

  public BigDecimal getPrecioVenta() {
	return precioVenta;
  }

  public void setPrecioVenta(BigDecimal precioVenta) {
	this.precioVenta = precioVenta;
  }

  public Integer getUnidadesDisponibles() {
	return unidadesDisponibles;
  }

  public void setUnidadesDisponibles(Integer unidadesDisponibles) {
	this.unidadesDisponibles = unidadesDisponibles;
  }


  // Genera los Getters y Setters

}