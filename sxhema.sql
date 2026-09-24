CREATE DATABASE IF NOT EXISTS db_ecommerce_apellidonombre;

USE db_ecommerce_apellidonombre;

CREATE TABLE productos (

  id INT AUTO_INCREMENT PRIMARY KEY,

  nombre VARCHAR(150) NOT NULL,

  categoria VARCHAR(100) NOT NULL,

  precio DECIMAL(10,2) NOT NULL,

  stock INT NOT NULL,

  marca VARCHAR(100),

  codigo_barras VARCHAR(50) UNIQUE

);

CREATE TABLE pedidos (

  id INT AUTO_INCREMENT PRIMARY KEY,

  cliente VARCHAR(150) NOT NULL,

  fecha_compra DATETIME DEFAULT CURRENT_TIMESTAMP,

  monto_total DECIMAL(10,2) NOT NULL,

  estado_pedido VARCHAR(50) NOT NULL,

  metodo_pago VARCHAR(50) NOT NULL

);

CREATE TABLE detalle_pedido (

  id INT AUTO_INCREMENT PRIMARY KEY,

  pedido INT NOT NULL,

  producto_id INT NOT NULL,

  precio_unitario DECIMAL(10,2) NOT NULL,

  subtotal DECIMAL(10,2) NOT NULL,

  CONSTRAINT fk_detalle_pedido FOREIGN KEY (pedido) REFERENCES pedidos(id) ON DELETE CASCADE,

  CONSTRAINT fk_detalle_producto FOREIGN KEY (producto_id) REFERENCES productos(id) ON DELETE RESTRICT

);
