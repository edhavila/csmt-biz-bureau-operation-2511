package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseCuentasCuenta
 */

@JsonTypeName("ConsultaBuroResponse_Cuentas_Cuenta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseCuentasCuenta {

  private String fechaActualizacion;

  private String claveOtorgante;

  private String nombreOtorgante;

  private String numeroCuentaActual;

  private String indicadorTipoResponsabilidad;

  private String tipoCuenta;

  private String tipoContrato;

  private String claveUnidadMonetaria;

  private String numeroPagos;

  private String frecuenciaPagos;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate montoPagar;

  private String fechaAperturaCuenta;

  private String fechaUltimoPago;

  private String fechaUltimaCompra;

  private String fechaReporte;

  private String modoReportar;

  private String creditoMaximo;

  private String saldoActual;

  private String limiteCredito;

  private String saldoVencido;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime formaPagoActual;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate montoUltimoPago;

  private String identificadorCredito;

  private String identificadorCAN;

  private String fechaAperturaCAN;

  private String fechaCancelacionCAN;

  private String historicoCAN;

  private String fechaMasRecienteHistoricoCAN;

  private String fechaMasAntiguaHistoricoCAN;

  public ConsultaBuroResponseCuentasCuenta fechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
    return this;
  }

  /**
   * Get fechaActualizacion
   * @return fechaActualizacion
  */
  
  @Schema(name = "FechaActualizacion", example = "20062016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaActualizacion")
  public String getFechaActualizacion() {
    return fechaActualizacion;
  }

  public void setFechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
  }

  public ConsultaBuroResponseCuentasCuenta claveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
    return this;
  }

  /**
   * Get claveOtorgante
   * @return claveOtorgante
  */
  
  @Schema(name = "ClaveOtorgante", example = "XX99999999", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveOtorgante")
  public String getClaveOtorgante() {
    return claveOtorgante;
  }

  public void setClaveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
  }

  public ConsultaBuroResponseCuentasCuenta nombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
    return this;
  }

  /**
   * Get nombreOtorgante
   * @return nombreOtorgante
  */
  
  @Schema(name = "NombreOtorgante", example = "BC 1TN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NombreOtorgante")
  public String getNombreOtorgante() {
    return nombreOtorgante;
  }

  public void setNombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
  }

  public ConsultaBuroResponseCuentasCuenta numeroCuentaActual(String numeroCuentaActual) {
    this.numeroCuentaActual = numeroCuentaActual;
    return this;
  }

  /**
   * Get numeroCuentaActual
   * @return numeroCuentaActual
  */
  
  @Schema(name = "NumeroCuentaActual", example = "989898121212", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroCuentaActual")
  public String getNumeroCuentaActual() {
    return numeroCuentaActual;
  }

  public void setNumeroCuentaActual(String numeroCuentaActual) {
    this.numeroCuentaActual = numeroCuentaActual;
  }

  public ConsultaBuroResponseCuentasCuenta indicadorTipoResponsabilidad(String indicadorTipoResponsabilidad) {
    this.indicadorTipoResponsabilidad = indicadorTipoResponsabilidad;
    return this;
  }

  /**
   * Get indicadorTipoResponsabilidad
   * @return indicadorTipoResponsabilidad
  */
  
  @Schema(name = "IndicadorTipoResponsabilidad", example = "I", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndicadorTipoResponsabilidad")
  public String getIndicadorTipoResponsabilidad() {
    return indicadorTipoResponsabilidad;
  }

  public void setIndicadorTipoResponsabilidad(String indicadorTipoResponsabilidad) {
    this.indicadorTipoResponsabilidad = indicadorTipoResponsabilidad;
  }

  public ConsultaBuroResponseCuentasCuenta tipoCuenta(String tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
    return this;
  }

  /**
   * Get tipoCuenta
   * @return tipoCuenta
  */
  
  @Schema(name = "TipoCuenta", example = "I", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TipoCuenta")
  public String getTipoCuenta() {
    return tipoCuenta;
  }

  public void setTipoCuenta(String tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
  }

  public ConsultaBuroResponseCuentasCuenta tipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
    return this;
  }

  /**
   * Get tipoContrato
   * @return tipoContrato
  */
  
  @Schema(name = "TipoContrato", example = "AU", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TipoContrato")
  public String getTipoContrato() {
    return tipoContrato;
  }

  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public ConsultaBuroResponseCuentasCuenta claveUnidadMonetaria(String claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
    return this;
  }

  /**
   * Get claveUnidadMonetaria
   * @return claveUnidadMonetaria
  */
  
  @Schema(name = "ClaveUnidadMonetaria", example = "MX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveUnidadMonetaria")
  public String getClaveUnidadMonetaria() {
    return claveUnidadMonetaria;
  }

  public void setClaveUnidadMonetaria(String claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
  }

  public ConsultaBuroResponseCuentasCuenta numeroPagos(String numeroPagos) {
    this.numeroPagos = numeroPagos;
    return this;
  }

  /**
   * Get numeroPagos
   * @return numeroPagos
  */
  
  @Schema(name = "NumeroPagos", example = "48", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroPagos")
  public String getNumeroPagos() {
    return numeroPagos;
  }

  public void setNumeroPagos(String numeroPagos) {
    this.numeroPagos = numeroPagos;
  }

  public ConsultaBuroResponseCuentasCuenta frecuenciaPagos(String frecuenciaPagos) {
    this.frecuenciaPagos = frecuenciaPagos;
    return this;
  }

  /**
   * Get frecuenciaPagos
   * @return frecuenciaPagos
  */
  
  @Schema(name = "FrecuenciaPagos", example = "M", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FrecuenciaPagos")
  public String getFrecuenciaPagos() {
    return frecuenciaPagos;
  }

  public void setFrecuenciaPagos(String frecuenciaPagos) {
    this.frecuenciaPagos = frecuenciaPagos;
  }

  public ConsultaBuroResponseCuentasCuenta montoPagar(LocalDate montoPagar) {
    this.montoPagar = montoPagar;
    return this;
  }

  /**
   * Get montoPagar
   * @return montoPagar
  */
  @Valid 
  @Schema(name = "MontoPagar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MontoPagar")
  public LocalDate getMontoPagar() {
    return montoPagar;
  }

  public void setMontoPagar(LocalDate montoPagar) {
    this.montoPagar = montoPagar;
  }

  public ConsultaBuroResponseCuentasCuenta fechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
    return this;
  }

  /**
   * Get fechaAperturaCuenta
   * @return fechaAperturaCuenta
  */
  
  @Schema(name = "FechaAperturaCuenta", example = "01012016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaAperturaCuenta")
  public String getFechaAperturaCuenta() {
    return fechaAperturaCuenta;
  }

  public void setFechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
  }

  public ConsultaBuroResponseCuentasCuenta fechaUltimoPago(String fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
    return this;
  }

  /**
   * Get fechaUltimoPago
   * @return fechaUltimoPago
  */
  
  @Schema(name = "FechaUltimoPago", example = "01012016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaUltimoPago")
  public String getFechaUltimoPago() {
    return fechaUltimoPago;
  }

  public void setFechaUltimoPago(String fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
  }

  public ConsultaBuroResponseCuentasCuenta fechaUltimaCompra(String fechaUltimaCompra) {
    this.fechaUltimaCompra = fechaUltimaCompra;
    return this;
  }

  /**
   * Get fechaUltimaCompra
   * @return fechaUltimaCompra
  */
  
  @Schema(name = "FechaUltimaCompra", example = "01012016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaUltimaCompra")
  public String getFechaUltimaCompra() {
    return fechaUltimaCompra;
  }

  public void setFechaUltimaCompra(String fechaUltimaCompra) {
    this.fechaUltimaCompra = fechaUltimaCompra;
  }

  public ConsultaBuroResponseCuentasCuenta fechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }

  /**
   * Get fechaReporte
   * @return fechaReporte
  */
  
  @Schema(name = "FechaReporte", example = "09052016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaReporte")
  public String getFechaReporte() {
    return fechaReporte;
  }

  public void setFechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
  }

  public ConsultaBuroResponseCuentasCuenta modoReportar(String modoReportar) {
    this.modoReportar = modoReportar;
    return this;
  }

  /**
   * Get modoReportar
   * @return modoReportar
  */
  
  @Schema(name = "ModoReportar", example = "M", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModoReportar")
  public String getModoReportar() {
    return modoReportar;
  }

  public void setModoReportar(String modoReportar) {
    this.modoReportar = modoReportar;
  }

  public ConsultaBuroResponseCuentasCuenta creditoMaximo(String creditoMaximo) {
    this.creditoMaximo = creditoMaximo;
    return this;
  }

  /**
   * Get creditoMaximo
   * @return creditoMaximo
  */
  
  @Schema(name = "CreditoMaximo", example = "50000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CreditoMaximo")
  public String getCreditoMaximo() {
    return creditoMaximo;
  }

  public void setCreditoMaximo(String creditoMaximo) {
    this.creditoMaximo = creditoMaximo;
  }

  public ConsultaBuroResponseCuentasCuenta saldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }

  /**
   * Get saldoActual
   * @return saldoActual
  */
  
  @Schema(name = "SaldoActual", example = "10000+", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SaldoActual")
  public String getSaldoActual() {
    return saldoActual;
  }

  public void setSaldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
  }

  public ConsultaBuroResponseCuentasCuenta limiteCredito(String limiteCredito) {
    this.limiteCredito = limiteCredito;
    return this;
  }

  /**
   * Get limiteCredito
   * @return limiteCredito
  */
  
  @Schema(name = "LimiteCredito", example = "50000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LimiteCredito")
  public String getLimiteCredito() {
    return limiteCredito;
  }

  public void setLimiteCredito(String limiteCredito) {
    this.limiteCredito = limiteCredito;
  }

  public ConsultaBuroResponseCuentasCuenta saldoVencido(String saldoVencido) {
    this.saldoVencido = saldoVencido;
    return this;
  }

  /**
   * Get saldoVencido
   * @return saldoVencido
  */
  
  @Schema(name = "SaldoVencido", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SaldoVencido")
  public String getSaldoVencido() {
    return saldoVencido;
  }

  public void setSaldoVencido(String saldoVencido) {
    this.saldoVencido = saldoVencido;
  }

  public ConsultaBuroResponseCuentasCuenta formaPagoActual(DateTime formaPagoActual) {
    this.formaPagoActual = formaPagoActual;
    return this;
  }

  /**
   * Get formaPagoActual
   * @return formaPagoActual
  */
  @Valid 
  @Schema(name = "FormaPagoActual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FormaPagoActual")
  public DateTime getFormaPagoActual() {
    return formaPagoActual;
  }

  public void setFormaPagoActual(DateTime formaPagoActual) {
    this.formaPagoActual = formaPagoActual;
  }

  public ConsultaBuroResponseCuentasCuenta montoUltimoPago(LocalDate montoUltimoPago) {
    this.montoUltimoPago = montoUltimoPago;
    return this;
  }

  /**
   * Get montoUltimoPago
   * @return montoUltimoPago
  */
  @Valid 
  @Schema(name = "MontoUltimoPago", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MontoUltimoPago")
  public LocalDate getMontoUltimoPago() {
    return montoUltimoPago;
  }

  public void setMontoUltimoPago(LocalDate montoUltimoPago) {
    this.montoUltimoPago = montoUltimoPago;
  }

  public ConsultaBuroResponseCuentasCuenta identificadorCredito(String identificadorCredito) {
    this.identificadorCredito = identificadorCredito;
    return this;
  }

  /**
   * Get identificadorCredito
   * @return identificadorCredito
  */
  
  @Schema(name = "IdentificadorCredito", example = "Y", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IdentificadorCredito")
  public String getIdentificadorCredito() {
    return identificadorCredito;
  }

  public void setIdentificadorCredito(String identificadorCredito) {
    this.identificadorCredito = identificadorCredito;
  }

  public ConsultaBuroResponseCuentasCuenta identificadorCAN(String identificadorCAN) {
    this.identificadorCAN = identificadorCAN;
    return this;
  }

  /**
   * Get identificadorCAN
   * @return identificadorCAN
  */
  
  @Schema(name = "IdentificadorCAN", example = "02010100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IdentificadorCAN")
  public String getIdentificadorCAN() {
    return identificadorCAN;
  }

  public void setIdentificadorCAN(String identificadorCAN) {
    this.identificadorCAN = identificadorCAN;
  }

  public ConsultaBuroResponseCuentasCuenta fechaAperturaCAN(String fechaAperturaCAN) {
    this.fechaAperturaCAN = fechaAperturaCAN;
    return this;
  }

  /**
   * Get fechaAperturaCAN
   * @return fechaAperturaCAN
  */
  
  @Schema(name = "FechaAperturaCAN", example = "01012019", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaAperturaCAN")
  public String getFechaAperturaCAN() {
    return fechaAperturaCAN;
  }

  public void setFechaAperturaCAN(String fechaAperturaCAN) {
    this.fechaAperturaCAN = fechaAperturaCAN;
  }

  public ConsultaBuroResponseCuentasCuenta fechaCancelacionCAN(String fechaCancelacionCAN) {
    this.fechaCancelacionCAN = fechaCancelacionCAN;
    return this;
  }

  /**
   * Get fechaCancelacionCAN
   * @return fechaCancelacionCAN
  */
  
  @Schema(name = "FechaCancelacionCAN", example = "01012020", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaCancelacionCAN")
  public String getFechaCancelacionCAN() {
    return fechaCancelacionCAN;
  }

  public void setFechaCancelacionCAN(String fechaCancelacionCAN) {
    this.fechaCancelacionCAN = fechaCancelacionCAN;
  }

  public ConsultaBuroResponseCuentasCuenta historicoCAN(String historicoCAN) {
    this.historicoCAN = historicoCAN;
    return this;
  }

  /**
   * Get historicoCAN
   * @return historicoCAN
  */
  
  @Schema(name = "HistoricoCAN", example = "11-2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HistoricoCAN")
  public String getHistoricoCAN() {
    return historicoCAN;
  }

  public void setHistoricoCAN(String historicoCAN) {
    this.historicoCAN = historicoCAN;
  }

  public ConsultaBuroResponseCuentasCuenta fechaMasRecienteHistoricoCAN(String fechaMasRecienteHistoricoCAN) {
    this.fechaMasRecienteHistoricoCAN = fechaMasRecienteHistoricoCAN;
    return this;
  }

  /**
   * Get fechaMasRecienteHistoricoCAN
   * @return fechaMasRecienteHistoricoCAN
  */
  
  @Schema(name = "FechaMasRecienteHistoricoCAN", example = "04122019", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaMasRecienteHistoricoCAN")
  public String getFechaMasRecienteHistoricoCAN() {
    return fechaMasRecienteHistoricoCAN;
  }

  public void setFechaMasRecienteHistoricoCAN(String fechaMasRecienteHistoricoCAN) {
    this.fechaMasRecienteHistoricoCAN = fechaMasRecienteHistoricoCAN;
  }

  public ConsultaBuroResponseCuentasCuenta fechaMasAntiguaHistoricoCAN(String fechaMasAntiguaHistoricoCAN) {
    this.fechaMasAntiguaHistoricoCAN = fechaMasAntiguaHistoricoCAN;
    return this;
  }

  /**
   * Get fechaMasAntiguaHistoricoCAN
   * @return fechaMasAntiguaHistoricoCAN
  */
  
  @Schema(name = "FechaMasAntiguaHistoricoCAN", example = "04092019", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaMasAntiguaHistoricoCAN")
  public String getFechaMasAntiguaHistoricoCAN() {
    return fechaMasAntiguaHistoricoCAN;
  }

  public void setFechaMasAntiguaHistoricoCAN(String fechaMasAntiguaHistoricoCAN) {
    this.fechaMasAntiguaHistoricoCAN = fechaMasAntiguaHistoricoCAN;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseCuentasCuenta consultaBuroResponseCuentasCuenta = (ConsultaBuroResponseCuentasCuenta) o;
    return Objects.equals(this.fechaActualizacion, consultaBuroResponseCuentasCuenta.fechaActualizacion) &&
        Objects.equals(this.claveOtorgante, consultaBuroResponseCuentasCuenta.claveOtorgante) &&
        Objects.equals(this.nombreOtorgante, consultaBuroResponseCuentasCuenta.nombreOtorgante) &&
        Objects.equals(this.numeroCuentaActual, consultaBuroResponseCuentasCuenta.numeroCuentaActual) &&
        Objects.equals(this.indicadorTipoResponsabilidad, consultaBuroResponseCuentasCuenta.indicadorTipoResponsabilidad) &&
        Objects.equals(this.tipoCuenta, consultaBuroResponseCuentasCuenta.tipoCuenta) &&
        Objects.equals(this.tipoContrato, consultaBuroResponseCuentasCuenta.tipoContrato) &&
        Objects.equals(this.claveUnidadMonetaria, consultaBuroResponseCuentasCuenta.claveUnidadMonetaria) &&
        Objects.equals(this.numeroPagos, consultaBuroResponseCuentasCuenta.numeroPagos) &&
        Objects.equals(this.frecuenciaPagos, consultaBuroResponseCuentasCuenta.frecuenciaPagos) &&
        Objects.equals(this.montoPagar, consultaBuroResponseCuentasCuenta.montoPagar) &&
        Objects.equals(this.fechaAperturaCuenta, consultaBuroResponseCuentasCuenta.fechaAperturaCuenta) &&
        Objects.equals(this.fechaUltimoPago, consultaBuroResponseCuentasCuenta.fechaUltimoPago) &&
        Objects.equals(this.fechaUltimaCompra, consultaBuroResponseCuentasCuenta.fechaUltimaCompra) &&
        Objects.equals(this.fechaReporte, consultaBuroResponseCuentasCuenta.fechaReporte) &&
        Objects.equals(this.modoReportar, consultaBuroResponseCuentasCuenta.modoReportar) &&
        Objects.equals(this.creditoMaximo, consultaBuroResponseCuentasCuenta.creditoMaximo) &&
        Objects.equals(this.saldoActual, consultaBuroResponseCuentasCuenta.saldoActual) &&
        Objects.equals(this.limiteCredito, consultaBuroResponseCuentasCuenta.limiteCredito) &&
        Objects.equals(this.saldoVencido, consultaBuroResponseCuentasCuenta.saldoVencido) &&
        Objects.equals(this.formaPagoActual, consultaBuroResponseCuentasCuenta.formaPagoActual) &&
        Objects.equals(this.montoUltimoPago, consultaBuroResponseCuentasCuenta.montoUltimoPago) &&
        Objects.equals(this.identificadorCredito, consultaBuroResponseCuentasCuenta.identificadorCredito) &&
        Objects.equals(this.identificadorCAN, consultaBuroResponseCuentasCuenta.identificadorCAN) &&
        Objects.equals(this.fechaAperturaCAN, consultaBuroResponseCuentasCuenta.fechaAperturaCAN) &&
        Objects.equals(this.fechaCancelacionCAN, consultaBuroResponseCuentasCuenta.fechaCancelacionCAN) &&
        Objects.equals(this.historicoCAN, consultaBuroResponseCuentasCuenta.historicoCAN) &&
        Objects.equals(this.fechaMasRecienteHistoricoCAN, consultaBuroResponseCuentasCuenta.fechaMasRecienteHistoricoCAN) &&
        Objects.equals(this.fechaMasAntiguaHistoricoCAN, consultaBuroResponseCuentasCuenta.fechaMasAntiguaHistoricoCAN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaActualizacion, claveOtorgante, nombreOtorgante, numeroCuentaActual, indicadorTipoResponsabilidad, tipoCuenta, tipoContrato, claveUnidadMonetaria, numeroPagos, frecuenciaPagos, montoPagar, fechaAperturaCuenta, fechaUltimoPago, fechaUltimaCompra, fechaReporte, modoReportar, creditoMaximo, saldoActual, limiteCredito, saldoVencido, formaPagoActual, montoUltimoPago, identificadorCredito, identificadorCAN, fechaAperturaCAN, fechaCancelacionCAN, historicoCAN, fechaMasRecienteHistoricoCAN, fechaMasAntiguaHistoricoCAN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseCuentasCuenta {\n");
    sb.append("    fechaActualizacion: ").append(toIndentedString(fechaActualizacion)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
    sb.append("    numeroCuentaActual: ").append(toIndentedString(numeroCuentaActual)).append("\n");
    sb.append("    indicadorTipoResponsabilidad: ").append(toIndentedString(indicadorTipoResponsabilidad)).append("\n");
    sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
    sb.append("    tipoContrato: ").append(toIndentedString(tipoContrato)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    numeroPagos: ").append(toIndentedString(numeroPagos)).append("\n");
    sb.append("    frecuenciaPagos: ").append(toIndentedString(frecuenciaPagos)).append("\n");
    sb.append("    montoPagar: ").append(toIndentedString(montoPagar)).append("\n");
    sb.append("    fechaAperturaCuenta: ").append(toIndentedString(fechaAperturaCuenta)).append("\n");
    sb.append("    fechaUltimoPago: ").append(toIndentedString(fechaUltimoPago)).append("\n");
    sb.append("    fechaUltimaCompra: ").append(toIndentedString(fechaUltimaCompra)).append("\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
    sb.append("    modoReportar: ").append(toIndentedString(modoReportar)).append("\n");
    sb.append("    creditoMaximo: ").append(toIndentedString(creditoMaximo)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
    sb.append("    limiteCredito: ").append(toIndentedString(limiteCredito)).append("\n");
    sb.append("    saldoVencido: ").append(toIndentedString(saldoVencido)).append("\n");
    sb.append("    formaPagoActual: ").append(toIndentedString(formaPagoActual)).append("\n");
    sb.append("    montoUltimoPago: ").append(toIndentedString(montoUltimoPago)).append("\n");
    sb.append("    identificadorCredito: ").append(toIndentedString(identificadorCredito)).append("\n");
    sb.append("    identificadorCAN: ").append(toIndentedString(identificadorCAN)).append("\n");
    sb.append("    fechaAperturaCAN: ").append(toIndentedString(fechaAperturaCAN)).append("\n");
    sb.append("    fechaCancelacionCAN: ").append(toIndentedString(fechaCancelacionCAN)).append("\n");
    sb.append("    historicoCAN: ").append(toIndentedString(historicoCAN)).append("\n");
    sb.append("    fechaMasRecienteHistoricoCAN: ").append(toIndentedString(fechaMasRecienteHistoricoCAN)).append("\n");
    sb.append("    fechaMasAntiguaHistoricoCAN: ").append(toIndentedString(fechaMasAntiguaHistoricoCAN)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
