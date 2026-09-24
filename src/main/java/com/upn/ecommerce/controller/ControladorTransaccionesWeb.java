package com.upn.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.upn.ecommerce.services.LogicaProcesamientoVentas;

import com.upn.ecommerce.dto.RegistroPedidoDTO;

import com.upn.ecommerce.model.Pedido;


@RestController

@RequestMapping("/api/ventas")

public class ControladorTransaccionesWeb {


  @Autowired

  private LogicaProcesamientoVentas servicioVentas;


  @PostMapping("/procesar-orden")

  public Pedido ejecutarProcesamientoDeOrden(@RequestBody RegistroPedidoDTO paqueteDatos) {

    return servicioVentas.registrarNuevaVentaConDetalles(paqueteDatos);

  }

}