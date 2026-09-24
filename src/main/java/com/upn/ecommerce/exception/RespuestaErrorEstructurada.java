package com.upn.ecommerce.exception;


public class RespuestaErrorEstructurada {

  private String descripcionFallo;

  private int codigoEstadoHttp;


  public RespuestaErrorEstructurada(String descripcionFallo, int codigoEstadoHttp) {

    this.descripcionFallo = descripcionFallo;

    this.codigoEstadoHttp = codigoEstadoHttp;

  }


  public String getDescripcionFallo() {

    return descripcionFallo;

  }


  public void setDescripcionFallo(String descripcionFallo) {

    this.descripcionFallo = descripcionFallo;

  }


  public int getCodigoEstadoHttp() {

    return codigoEstadoHttp;

  }


  public void setCodigoEstadoHttp(int codigoEstadoHttp) {

    this.codigoEstadoHttp = codigoEstadoHttp;

  }

}