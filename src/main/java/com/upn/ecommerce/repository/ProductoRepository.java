package com.upn.ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;

import java.util.List;

import com.upn.ecommerce.model.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Integer> {

   
  List<Producto> listarCatalogoPorCategoriaEspecifica(@Param("categoriaFiltro") String categoriaFiltro);

}