package com.upn.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.upn.ecommerce.services.LogicaOperacionesProducto;

import com.upn.ecommerce.model.Producto;

import java.util.List;


@RestController

@RequestMapping("/api/inventario")

public class ControladorInventarioWeb {


  @Autowired

  private LogicaOperacionesProducto servicioArticulos;


  @PostMapping("/ingresar")

  public Producto ejecutarIngresoNuevoArticulo(@RequestBody Producto datosEntrantes) {

    return servicioArticulos.agregarNuevoArticuloCatalogo(datosEntrantes);

  }


  @GetMapping("/catalogo")

  public List<Producto> ejecutarRecuperacionCatalogo() {

    return servicioArticulos.recuperarTodosLosArticulos();

  }


  @PutMapping("/actualizar/{identificador}")

  public Producto ejecutarModificacionArticulo(@PathVariable Integer identificador, @RequestBody Producto datosNuevos) {

    return servicioArticulos.modificarDatosDelArticulo(identificador, datosNuevos);

  }


  @DeleteMapping("/remover/{identificador}")

  public void ejecutarRemocionArticulo(@PathVariable Integer identificador) {

    servicioArticulos.eliminarArticuloDelSistema(identificador);

  }

}