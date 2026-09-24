package com.upn.ecommerce.dto;


import java.math.BigDecimal;

import java.util.List;


public class RegistroPedidoDTO {

   

  private String nombreCliente;

  private BigDecimal totalCalculado;

  private String metodoDePago;

  private List<ItemDetalleDTO> listaArticulos;

  public String getNombreCliente() {
	return nombreCliente;
  }

  public void setNombreCliente(String nombreCliente) {
	this.nombreCliente = nombreCliente;
  }

  public BigDecimal getTotalCalculado() {
	return totalCalculado;
  }

  public void setTotalCalculado(BigDecimal totalCalculado) {
	this.totalCalculado = totalCalculado;
  }

  public String getMetodoDePago() {
	return metodoDePago;
  }

  public void setMetodoDePago(String metodoDePago) {
	this.metodoDePago = metodoDePago;
  }

  public List<ItemDetalleDTO> getListaArticulos() {
	return listaArticulos;
  }

  public void setListaArticulos(List<ItemDetalleDTO> listaArticulos) {
	this.listaArticulos = listaArticulos;
  }


  // Genera los Getters y Setters

}