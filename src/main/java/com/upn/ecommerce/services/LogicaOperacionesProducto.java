package com.upn.ecommerce.services;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.upn.ecommerce.model.Producto;

import com.upn.ecommerce.repository.ProductoRepository;

import com.upn.ecommerce.exception.ArticuloNoEncontradoExcepcion;

import java.util.List;

import java.util.Optional;


@Service

public class LogicaOperacionesProducto {


  @Autowired

  private ProductoRepository repositorioArticulos;


  public Producto agregarNuevoArticuloCatalogo(Producto articuloEntrante) {

    return repositorioArticulos.save(articuloEntrante);

  }


  public List<Producto> recuperarTodosLosArticulos() {

    return repositorioArticulos.findAll();

  }


  public Producto modificarDatosDelArticulo(Integer identificador, Producto datosNuevos) {

	    Optional<Producto> articuloExistente = repositorioArticulos.findById(identificador);

	    if (articuloExistente.isPresent()) {

	      Producto articuloModificado = articuloExistente.get();

	      articuloModificado.setNombre(datosNuevos.getNombre());

	      articuloModificado.setCategoria(datosNuevos.getCategoria());

	      articuloModificado.setPrecio(datosNuevos.getPrecio());

	      articuloModificado.setStock(datosNuevos.getStock());

	      articuloModificado.setMarca(datosNuevos.getMarca());

	      articuloModificado.setCodigoBarras(datosNuevos.getCodigoBarras());

	      return repositorioArticulos.save(articuloModificado);

	    } else {

	      // Aquí forzamos el error 404

	      throw new ArticuloNoEncontradoExcepcion("No se localizo ningun articulo con el identificador proporcionado: " + identificador);

	    }

	  }


  public void eliminarArticuloDelSistema(Integer identificador) {

    repositorioArticulos.deleteById(identificador);

  }

}