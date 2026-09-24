package com.upn.ecommerce.model;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity

@Table(name = "detalle_pedido")

public class DetallePedido {


  @Id

  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;


  @ManyToOne

  @JoinColumn(name = "pedido", nullable = false)

  private Pedido pedidoAsociado;


  @ManyToOne

  @JoinColumn(name = "producto_id", nullable = false)

  private Producto productoComprado;


  @Column(name = "precio_unitario", nullable = false, precision = 10, scale = 2)

  private BigDecimal precioUnitario;


  @Column(nullable = false, precision = 10, scale = 2)

  private BigDecimal subtotal;


  public Integer getId() {
	return id;
  }


  public void setId(Integer id) {
	this.id = id;
  }


  public Pedido getPedidoAsociado() {
	return pedidoAsociado;
  }


  public void setPedidoAsociado(Pedido pedidoAsociado) {
	this.pedidoAsociado = pedidoAsociado;
  }


  public Producto getProductoComprado() {
	return productoComprado;
  }


  public void setProductoComprado(Producto productoComprado) {
	this.productoComprado = productoComprado;
  }


  public BigDecimal getPrecioUnitario() {
	return precioUnitario;
  }


  public void setPrecioUnitario(BigDecimal precioUnitario) {
	this.precioUnitario = precioUnitario;
  }


  public BigDecimal getSubtotal() {
	return subtotal;
  }


  public void setSubtotal(BigDecimal subtotal) {
	this.subtotal = subtotal;
  }


}