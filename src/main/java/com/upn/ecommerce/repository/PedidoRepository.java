package com.upn.ecommerce.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.upn.ecommerce.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}