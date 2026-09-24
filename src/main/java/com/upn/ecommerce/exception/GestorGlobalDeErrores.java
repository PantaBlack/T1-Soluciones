package com.upn.ecommerce.exception;


import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.http.converter.HttpMessageNotReadableException;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice

public class GestorGlobalDeErrores {


  // Controla el error 404 cuando no existe el registro

  @ExceptionHandler(ArticuloNoEncontradoExcepcion.class)

  public ResponseEntity<RespuestaErrorEstructurada> manejarFalloNoEncontrado(ArticuloNoEncontradoExcepcion excepcionLanzada) {

    RespuestaErrorEstructurada formatoError = new RespuestaErrorEstructurada(excepcionLanzada.getMessage(), HttpStatus.NOT_FOUND.value());

    return new ResponseEntity<>(formatoError, HttpStatus.NOT_FOUND);

  }


  // Controla el error 400 cuando se envía un JSON malformado o incompleto en POSTMAN

  @ExceptionHandler(HttpMessageNotReadableException.class)

  public ResponseEntity<RespuestaErrorEstructurada> manejarFalloPeticionIncorrecta(HttpMessageNotReadableException excepcionLanzada) {

    RespuestaErrorEstructurada formatoError = new RespuestaErrorEstructurada("La estructura de los datos enviados es invalida o esta incompleta", HttpStatus.BAD_REQUEST.value());

    return new ResponseEntity<>(formatoError, HttpStatus.BAD_REQUEST);

  }

}