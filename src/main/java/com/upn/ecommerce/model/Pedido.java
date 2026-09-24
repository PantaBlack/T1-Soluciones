package com.upn.ecommerce.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import java.util.List;


@Entity

@Table(name = "pedidos")

public class Pedido {


  @Id

  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;


  @Column(nullable = false, length = 150)

  private String cliente;


  @Column(name = "fecha_compra", insertable = false, updatable = false)

  private LocalDateTime fechaCompra;


  @Column(name = "monto_total", nullable = false, precision = 10, scale = 2)

  private BigDecimal montoTotal;


  @Column(name = "estado_pedido", nullable = false, length = 50)

  private String estadoPedido;


  @Column(name = "metodo_pago", nullable = false, length = 50)

  private String metodoPago;


  @OneToMany(mappedBy = "pedidoAsociado", cascade = CascadeType.ALL)

  private List<DetallePedido> listaDetallesCompra;


  public Integer getId() {
	return id;
  }


  public void setId(Integer id) {
	this.id = id;
  }


  public String getCliente() {
	return cliente;
  }


  public void setCliente(String cliente) {
	this.cliente = cliente;
  }


  public LocalDateTime getFechaCompra() {
	return fechaCompra;
  }


  public void setFechaCompra(LocalDateTime fechaCompra) {
	this.fechaCompra = fechaCompra;
  }


  public BigDecimal getMontoTotal() {
	return montoTotal;
  }


  public void setMontoTotal(BigDecimal montoTotal) {
	this.montoTotal = montoTotal;
  }


  public String getEstadoPedido() {
	return estadoPedido;
  }


  public void setEstadoPedido(String estadoPedido) {
	this.estadoPedido = estadoPedido;
  }


  public String getMetodoPago() {
	return metodoPago;
  }


  public void setMetodoPago(String metodoPago) {
	this.metodoPago = metodoPago;
  }


  public List<DetallePedido> getListaDetallesCompra() {
	return listaDetallesCompra;
  }


  public void setListaDetallesCompra(List<DetallePedido> listaDetallesCompra) {
	this.listaDetallesCompra = listaDetallesCompra;
  }


  // Genera los Getters y Setters (Clic derecho -> Source -> Generate Getters and Setters)

}