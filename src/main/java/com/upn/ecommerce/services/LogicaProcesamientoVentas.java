package com.upn.ecommerce.services;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.upn.ecommerce.model.*;

import com.upn.ecommerce.dto.*;

import com.upn.ecommerce.repository.PedidoRepository;

import com.upn.ecommerce.repository.ProductoRepository;

import java.util.ArrayList;

import java.util.List;

import java.math.BigDecimal;

import java.util.Optional;


@Service

public class LogicaProcesamientoVentas {


  @Autowired

  private PedidoRepository repositorioCompras;


  @Autowired

  private ProductoRepository repositorioArticulos;


  public Pedido registrarNuevaVentaConDetalles(RegistroPedidoDTO datosCompra) {

    Pedido nuevaOrden = new Pedido();

    nuevaOrden.setCliente(datosCompra.getNombreCliente());

    nuevaOrden.setMontoTotal(datosCompra.getTotalCalculado());

    nuevaOrden.setMetodoPago(datosCompra.getMetodoDePago());

    nuevaOrden.setEstadoPedido("GENERADO");


    List<DetallePedido> detallesArmados = new ArrayList<>();


    for (int i = 0; i < datosCompra.getListaArticulos().size(); i++) {

      ItemDetalleDTO itemActual = datosCompra.getListaArticulos().get(i);

      Optional<Producto> articuloBuscado = repositorioArticulos.findById(itemActual.getIdProductoComprado());


      if (articuloBuscado.isPresent()) {

        DetallePedido porcionDetalle = new DetallePedido();

        porcionDetalle.setPedidoAsociado(nuevaOrden);

        porcionDetalle.setProductoComprado(articuloBuscado.get());

        porcionDetalle.setPrecioUnitario(itemActual.getPrecioFijado());


        BigDecimal valorCantidad = new BigDecimal(itemActual.getCantidadLlevada());

        BigDecimal subtotalOperacion = itemActual.getPrecioFijado().multiply(valorCantidad);

        porcionDetalle.setSubtotal(subtotalOperacion);


        detallesArmados.add(porcionDetalle);

      }

    }


    nuevaOrden.setListaDetallesCompra(detallesArmados);

    return repositorioCompras.save(nuevaOrden);

  }

}