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
 * ConsultaBuroResponseResumenReporteResumenReporte
 */

@JsonTypeName("ConsultaBuroResponse_ResumenReporte_ResumenReporte")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseResumenReporteResumenReporte {

  private String fechaIngresoBD;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP7;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP6;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP5;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP4;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP3;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP2;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP1;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP0;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOPUR;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate numeroCuentas;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate cuentasPagosFijosHipotecas;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate cuentasRevolventesAbiertas;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate cuentasCerradas;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate cuentasNegativasActuales;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate cuentasClavesHistoriaNegativa;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime cuentasDisputa;

  private String numeroSolicitudesUltimos6Meses;

  private String nuevaDireccionReportadaUltimos60Dias;

  private String mensajesAlerta;

  private String existenciaDeclaracionesConsumidor;

  private String tipoMoneda;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime totalLimitesCreditoRevolventes;

  private String totalSaldosActualesRevolventes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate totalSaldosVencidosRevolventes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate totalPagosRevolventes;

  private String pctLimiteCreditoUtilizadoRevolventes;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime totalCreditosMaximosPagosFijos;

  private String totalSaldosActualesPagosFijos;

  private String totalSaldosVencidosPagosFijos;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate totalPagosPagosFijos;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP96;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP97;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroMOP99;

  private String fechaAperturaCuentaMasAntigua;

  private String fechaAperturaCuentaMasReciente;

  private String totalSolicitudesReporte;

  private String fechaSolicitudReporteMasReciente;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroTotalCuentasDespachoCobranza;

  private String fechaAperturaCuentaMasRecienteDespachoCobranza;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime numeroTotalSolicitudesDespachosCobranza;

  private String fechaSolicitudMasRecienteDespachoCobranza;

  public ConsultaBuroResponseResumenReporteResumenReporte fechaIngresoBD(String fechaIngresoBD) {
    this.fechaIngresoBD = fechaIngresoBD;
    return this;
  }

  /**
   * Get fechaIngresoBD
   * @return fechaIngresoBD
  */
  
  @Schema(name = "FechaIngresoBD", example = "23052013", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaIngresoBD")
  public String getFechaIngresoBD() {
    return fechaIngresoBD;
  }

  public void setFechaIngresoBD(String fechaIngresoBD) {
    this.fechaIngresoBD = fechaIngresoBD;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP7(DateTime numeroMOP7) {
    this.numeroMOP7 = numeroMOP7;
    return this;
  }

  /**
   * Get numeroMOP7
   * @return numeroMOP7
  */
  @Valid 
  @Schema(name = "NumeroMOP7", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP7")
  public DateTime getNumeroMOP7() {
    return numeroMOP7;
  }

  public void setNumeroMOP7(DateTime numeroMOP7) {
    this.numeroMOP7 = numeroMOP7;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP6(DateTime numeroMOP6) {
    this.numeroMOP6 = numeroMOP6;
    return this;
  }

  /**
   * Get numeroMOP6
   * @return numeroMOP6
  */
  @Valid 
  @Schema(name = "NumeroMOP6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP6")
  public DateTime getNumeroMOP6() {
    return numeroMOP6;
  }

  public void setNumeroMOP6(DateTime numeroMOP6) {
    this.numeroMOP6 = numeroMOP6;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP5(DateTime numeroMOP5) {
    this.numeroMOP5 = numeroMOP5;
    return this;
  }

  /**
   * Get numeroMOP5
   * @return numeroMOP5
  */
  @Valid 
  @Schema(name = "NumeroMOP5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP5")
  public DateTime getNumeroMOP5() {
    return numeroMOP5;
  }

  public void setNumeroMOP5(DateTime numeroMOP5) {
    this.numeroMOP5 = numeroMOP5;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP4(DateTime numeroMOP4) {
    this.numeroMOP4 = numeroMOP4;
    return this;
  }

  /**
   * Get numeroMOP4
   * @return numeroMOP4
  */
  @Valid 
  @Schema(name = "NumeroMOP4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP4")
  public DateTime getNumeroMOP4() {
    return numeroMOP4;
  }

  public void setNumeroMOP4(DateTime numeroMOP4) {
    this.numeroMOP4 = numeroMOP4;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP3(DateTime numeroMOP3) {
    this.numeroMOP3 = numeroMOP3;
    return this;
  }

  /**
   * Get numeroMOP3
   * @return numeroMOP3
  */
  @Valid 
  @Schema(name = "NumeroMOP3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP3")
  public DateTime getNumeroMOP3() {
    return numeroMOP3;
  }

  public void setNumeroMOP3(DateTime numeroMOP3) {
    this.numeroMOP3 = numeroMOP3;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP2(DateTime numeroMOP2) {
    this.numeroMOP2 = numeroMOP2;
    return this;
  }

  /**
   * Get numeroMOP2
   * @return numeroMOP2
  */
  @Valid 
  @Schema(name = "NumeroMOP2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP2")
  public DateTime getNumeroMOP2() {
    return numeroMOP2;
  }

  public void setNumeroMOP2(DateTime numeroMOP2) {
    this.numeroMOP2 = numeroMOP2;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP1(DateTime numeroMOP1) {
    this.numeroMOP1 = numeroMOP1;
    return this;
  }

  /**
   * Get numeroMOP1
   * @return numeroMOP1
  */
  @Valid 
  @Schema(name = "NumeroMOP1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP1")
  public DateTime getNumeroMOP1() {
    return numeroMOP1;
  }

  public void setNumeroMOP1(DateTime numeroMOP1) {
    this.numeroMOP1 = numeroMOP1;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP0(DateTime numeroMOP0) {
    this.numeroMOP0 = numeroMOP0;
    return this;
  }

  /**
   * Get numeroMOP0
   * @return numeroMOP0
  */
  @Valid 
  @Schema(name = "NumeroMOP0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP0")
  public DateTime getNumeroMOP0() {
    return numeroMOP0;
  }

  public void setNumeroMOP0(DateTime numeroMOP0) {
    this.numeroMOP0 = numeroMOP0;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOPUR(DateTime numeroMOPUR) {
    this.numeroMOPUR = numeroMOPUR;
    return this;
  }

  /**
   * Get numeroMOPUR
   * @return numeroMOPUR
  */
  @Valid 
  @Schema(name = "NumeroMOPUR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOPUR")
  public DateTime getNumeroMOPUR() {
    return numeroMOPUR;
  }

  public void setNumeroMOPUR(DateTime numeroMOPUR) {
    this.numeroMOPUR = numeroMOPUR;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroCuentas(LocalDate numeroCuentas) {
    this.numeroCuentas = numeroCuentas;
    return this;
  }

  /**
   * Get numeroCuentas
   * @return numeroCuentas
  */
  @Valid 
  @Schema(name = "NumeroCuentas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroCuentas")
  public LocalDate getNumeroCuentas() {
    return numeroCuentas;
  }

  public void setNumeroCuentas(LocalDate numeroCuentas) {
    this.numeroCuentas = numeroCuentas;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte cuentasPagosFijosHipotecas(LocalDate cuentasPagosFijosHipotecas) {
    this.cuentasPagosFijosHipotecas = cuentasPagosFijosHipotecas;
    return this;
  }

  /**
   * Get cuentasPagosFijosHipotecas
   * @return cuentasPagosFijosHipotecas
  */
  @Valid 
  @Schema(name = "CuentasPagosFijosHipotecas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CuentasPagosFijosHipotecas")
  public LocalDate getCuentasPagosFijosHipotecas() {
    return cuentasPagosFijosHipotecas;
  }

  public void setCuentasPagosFijosHipotecas(LocalDate cuentasPagosFijosHipotecas) {
    this.cuentasPagosFijosHipotecas = cuentasPagosFijosHipotecas;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte cuentasRevolventesAbiertas(LocalDate cuentasRevolventesAbiertas) {
    this.cuentasRevolventesAbiertas = cuentasRevolventesAbiertas;
    return this;
  }

  /**
   * Get cuentasRevolventesAbiertas
   * @return cuentasRevolventesAbiertas
  */
  @Valid 
  @Schema(name = "CuentasRevolventesAbiertas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CuentasRevolventesAbiertas")
  public LocalDate getCuentasRevolventesAbiertas() {
    return cuentasRevolventesAbiertas;
  }

  public void setCuentasRevolventesAbiertas(LocalDate cuentasRevolventesAbiertas) {
    this.cuentasRevolventesAbiertas = cuentasRevolventesAbiertas;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte cuentasCerradas(LocalDate cuentasCerradas) {
    this.cuentasCerradas = cuentasCerradas;
    return this;
  }

  /**
   * Get cuentasCerradas
   * @return cuentasCerradas
  */
  @Valid 
  @Schema(name = "CuentasCerradas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CuentasCerradas")
  public LocalDate getCuentasCerradas() {
    return cuentasCerradas;
  }

  public void setCuentasCerradas(LocalDate cuentasCerradas) {
    this.cuentasCerradas = cuentasCerradas;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte cuentasNegativasActuales(LocalDate cuentasNegativasActuales) {
    this.cuentasNegativasActuales = cuentasNegativasActuales;
    return this;
  }

  /**
   * Get cuentasNegativasActuales
   * @return cuentasNegativasActuales
  */
  @Valid 
  @Schema(name = "CuentasNegativasActuales", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CuentasNegativasActuales")
  public LocalDate getCuentasNegativasActuales() {
    return cuentasNegativasActuales;
  }

  public void setCuentasNegativasActuales(LocalDate cuentasNegativasActuales) {
    this.cuentasNegativasActuales = cuentasNegativasActuales;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte cuentasClavesHistoriaNegativa(LocalDate cuentasClavesHistoriaNegativa) {
    this.cuentasClavesHistoriaNegativa = cuentasClavesHistoriaNegativa;
    return this;
  }

  /**
   * Get cuentasClavesHistoriaNegativa
   * @return cuentasClavesHistoriaNegativa
  */
  @Valid 
  @Schema(name = "CuentasClavesHistoriaNegativa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CuentasClavesHistoriaNegativa")
  public LocalDate getCuentasClavesHistoriaNegativa() {
    return cuentasClavesHistoriaNegativa;
  }

  public void setCuentasClavesHistoriaNegativa(LocalDate cuentasClavesHistoriaNegativa) {
    this.cuentasClavesHistoriaNegativa = cuentasClavesHistoriaNegativa;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte cuentasDisputa(DateTime cuentasDisputa) {
    this.cuentasDisputa = cuentasDisputa;
    return this;
  }

  /**
   * Get cuentasDisputa
   * @return cuentasDisputa
  */
  @Valid 
  @Schema(name = "CuentasDisputa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CuentasDisputa")
  public DateTime getCuentasDisputa() {
    return cuentasDisputa;
  }

  public void setCuentasDisputa(DateTime cuentasDisputa) {
    this.cuentasDisputa = cuentasDisputa;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroSolicitudesUltimos6Meses(String numeroSolicitudesUltimos6Meses) {
    this.numeroSolicitudesUltimos6Meses = numeroSolicitudesUltimos6Meses;
    return this;
  }

  /**
   * Get numeroSolicitudesUltimos6Meses
   * @return numeroSolicitudesUltimos6Meses
  */
  
  @Schema(name = "NumeroSolicitudesUltimos6Meses", example = "99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroSolicitudesUltimos6Meses")
  public String getNumeroSolicitudesUltimos6Meses() {
    return numeroSolicitudesUltimos6Meses;
  }

  public void setNumeroSolicitudesUltimos6Meses(String numeroSolicitudesUltimos6Meses) {
    this.numeroSolicitudesUltimos6Meses = numeroSolicitudesUltimos6Meses;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte nuevaDireccionReportadaUltimos60Dias(String nuevaDireccionReportadaUltimos60Dias) {
    this.nuevaDireccionReportadaUltimos60Dias = nuevaDireccionReportadaUltimos60Dias;
    return this;
  }

  /**
   * Get nuevaDireccionReportadaUltimos60Dias
   * @return nuevaDireccionReportadaUltimos60Dias
  */
  
  @Schema(name = "NuevaDireccionReportadaUltimos60Dias", example = "N", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NuevaDireccionReportadaUltimos60Dias")
  public String getNuevaDireccionReportadaUltimos60Dias() {
    return nuevaDireccionReportadaUltimos60Dias;
  }

  public void setNuevaDireccionReportadaUltimos60Dias(String nuevaDireccionReportadaUltimos60Dias) {
    this.nuevaDireccionReportadaUltimos60Dias = nuevaDireccionReportadaUltimos60Dias;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte mensajesAlerta(String mensajesAlerta) {
    this.mensajesAlerta = mensajesAlerta;
    return this;
  }

  /**
   * Get mensajesAlerta
   * @return mensajesAlerta
  */
  
  @Schema(name = "MensajesAlerta", example = "NNNYN", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MensajesAlerta")
  public String getMensajesAlerta() {
    return mensajesAlerta;
  }

  public void setMensajesAlerta(String mensajesAlerta) {
    this.mensajesAlerta = mensajesAlerta;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte existenciaDeclaracionesConsumidor(String existenciaDeclaracionesConsumidor) {
    this.existenciaDeclaracionesConsumidor = existenciaDeclaracionesConsumidor;
    return this;
  }

  /**
   * Get existenciaDeclaracionesConsumidor
   * @return existenciaDeclaracionesConsumidor
  */
  
  @Schema(name = "ExistenciaDeclaracionesConsumidor", example = "N", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExistenciaDeclaracionesConsumidor")
  public String getExistenciaDeclaracionesConsumidor() {
    return existenciaDeclaracionesConsumidor;
  }

  public void setExistenciaDeclaracionesConsumidor(String existenciaDeclaracionesConsumidor) {
    this.existenciaDeclaracionesConsumidor = existenciaDeclaracionesConsumidor;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte tipoMoneda(String tipoMoneda) {
    this.tipoMoneda = tipoMoneda;
    return this;
  }

  /**
   * Get tipoMoneda
   * @return tipoMoneda
  */
  
  @Schema(name = "TipoMoneda", example = "MX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TipoMoneda")
  public String getTipoMoneda() {
    return tipoMoneda;
  }

  public void setTipoMoneda(String tipoMoneda) {
    this.tipoMoneda = tipoMoneda;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalLimitesCreditoRevolventes(DateTime totalLimitesCreditoRevolventes) {
    this.totalLimitesCreditoRevolventes = totalLimitesCreditoRevolventes;
    return this;
  }

  /**
   * Get totalLimitesCreditoRevolventes
   * @return totalLimitesCreditoRevolventes
  */
  @Valid 
  @Schema(name = "TotalLimitesCreditoRevolventes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalLimitesCreditoRevolventes")
  public DateTime getTotalLimitesCreditoRevolventes() {
    return totalLimitesCreditoRevolventes;
  }

  public void setTotalLimitesCreditoRevolventes(DateTime totalLimitesCreditoRevolventes) {
    this.totalLimitesCreditoRevolventes = totalLimitesCreditoRevolventes;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalSaldosActualesRevolventes(String totalSaldosActualesRevolventes) {
    this.totalSaldosActualesRevolventes = totalSaldosActualesRevolventes;
    return this;
  }

  /**
   * Get totalSaldosActualesRevolventes
   * @return totalSaldosActualesRevolventes
  */
  
  @Schema(name = "TotalSaldosActualesRevolventes", example = "4270+", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalSaldosActualesRevolventes")
  public String getTotalSaldosActualesRevolventes() {
    return totalSaldosActualesRevolventes;
  }

  public void setTotalSaldosActualesRevolventes(String totalSaldosActualesRevolventes) {
    this.totalSaldosActualesRevolventes = totalSaldosActualesRevolventes;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalSaldosVencidosRevolventes(LocalDate totalSaldosVencidosRevolventes) {
    this.totalSaldosVencidosRevolventes = totalSaldosVencidosRevolventes;
    return this;
  }

  /**
   * Get totalSaldosVencidosRevolventes
   * @return totalSaldosVencidosRevolventes
  */
  @Valid 
  @Schema(name = "TotalSaldosVencidosRevolventes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalSaldosVencidosRevolventes")
  public LocalDate getTotalSaldosVencidosRevolventes() {
    return totalSaldosVencidosRevolventes;
  }

  public void setTotalSaldosVencidosRevolventes(LocalDate totalSaldosVencidosRevolventes) {
    this.totalSaldosVencidosRevolventes = totalSaldosVencidosRevolventes;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalPagosRevolventes(LocalDate totalPagosRevolventes) {
    this.totalPagosRevolventes = totalPagosRevolventes;
    return this;
  }

  /**
   * Get totalPagosRevolventes
   * @return totalPagosRevolventes
  */
  @Valid 
  @Schema(name = "TotalPagosRevolventes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalPagosRevolventes")
  public LocalDate getTotalPagosRevolventes() {
    return totalPagosRevolventes;
  }

  public void setTotalPagosRevolventes(LocalDate totalPagosRevolventes) {
    this.totalPagosRevolventes = totalPagosRevolventes;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte pctLimiteCreditoUtilizadoRevolventes(String pctLimiteCreditoUtilizadoRevolventes) {
    this.pctLimiteCreditoUtilizadoRevolventes = pctLimiteCreditoUtilizadoRevolventes;
    return this;
  }

  /**
   * Get pctLimiteCreditoUtilizadoRevolventes
   * @return pctLimiteCreditoUtilizadoRevolventes
  */
  
  @Schema(name = "PctLimiteCreditoUtilizadoRevolventes", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PctLimiteCreditoUtilizadoRevolventes")
  public String getPctLimiteCreditoUtilizadoRevolventes() {
    return pctLimiteCreditoUtilizadoRevolventes;
  }

  public void setPctLimiteCreditoUtilizadoRevolventes(String pctLimiteCreditoUtilizadoRevolventes) {
    this.pctLimiteCreditoUtilizadoRevolventes = pctLimiteCreditoUtilizadoRevolventes;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalCreditosMaximosPagosFijos(DateTime totalCreditosMaximosPagosFijos) {
    this.totalCreditosMaximosPagosFijos = totalCreditosMaximosPagosFijos;
    return this;
  }

  /**
   * Get totalCreditosMaximosPagosFijos
   * @return totalCreditosMaximosPagosFijos
  */
  @Valid 
  @Schema(name = "TotalCreditosMaximosPagosFijos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalCreditosMaximosPagosFijos")
  public DateTime getTotalCreditosMaximosPagosFijos() {
    return totalCreditosMaximosPagosFijos;
  }

  public void setTotalCreditosMaximosPagosFijos(DateTime totalCreditosMaximosPagosFijos) {
    this.totalCreditosMaximosPagosFijos = totalCreditosMaximosPagosFijos;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalSaldosActualesPagosFijos(String totalSaldosActualesPagosFijos) {
    this.totalSaldosActualesPagosFijos = totalSaldosActualesPagosFijos;
    return this;
  }

  /**
   * Get totalSaldosActualesPagosFijos
   * @return totalSaldosActualesPagosFijos
  */
  
  @Schema(name = "TotalSaldosActualesPagosFijos", example = "19469+", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalSaldosActualesPagosFijos")
  public String getTotalSaldosActualesPagosFijos() {
    return totalSaldosActualesPagosFijos;
  }

  public void setTotalSaldosActualesPagosFijos(String totalSaldosActualesPagosFijos) {
    this.totalSaldosActualesPagosFijos = totalSaldosActualesPagosFijos;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalSaldosVencidosPagosFijos(String totalSaldosVencidosPagosFijos) {
    this.totalSaldosVencidosPagosFijos = totalSaldosVencidosPagosFijos;
    return this;
  }

  /**
   * Get totalSaldosVencidosPagosFijos
   * @return totalSaldosVencidosPagosFijos
  */
  
  @Schema(name = "TotalSaldosVencidosPagosFijos", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalSaldosVencidosPagosFijos")
  public String getTotalSaldosVencidosPagosFijos() {
    return totalSaldosVencidosPagosFijos;
  }

  public void setTotalSaldosVencidosPagosFijos(String totalSaldosVencidosPagosFijos) {
    this.totalSaldosVencidosPagosFijos = totalSaldosVencidosPagosFijos;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalPagosPagosFijos(LocalDate totalPagosPagosFijos) {
    this.totalPagosPagosFijos = totalPagosPagosFijos;
    return this;
  }

  /**
   * Get totalPagosPagosFijos
   * @return totalPagosPagosFijos
  */
  @Valid 
  @Schema(name = "TotalPagosPagosFijos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalPagosPagosFijos")
  public LocalDate getTotalPagosPagosFijos() {
    return totalPagosPagosFijos;
  }

  public void setTotalPagosPagosFijos(LocalDate totalPagosPagosFijos) {
    this.totalPagosPagosFijos = totalPagosPagosFijos;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP96(DateTime numeroMOP96) {
    this.numeroMOP96 = numeroMOP96;
    return this;
  }

  /**
   * Get numeroMOP96
   * @return numeroMOP96
  */
  @Valid 
  @Schema(name = "NumeroMOP96", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP96")
  public DateTime getNumeroMOP96() {
    return numeroMOP96;
  }

  public void setNumeroMOP96(DateTime numeroMOP96) {
    this.numeroMOP96 = numeroMOP96;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP97(DateTime numeroMOP97) {
    this.numeroMOP97 = numeroMOP97;
    return this;
  }

  /**
   * Get numeroMOP97
   * @return numeroMOP97
  */
  @Valid 
  @Schema(name = "NumeroMOP97", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP97")
  public DateTime getNumeroMOP97() {
    return numeroMOP97;
  }

  public void setNumeroMOP97(DateTime numeroMOP97) {
    this.numeroMOP97 = numeroMOP97;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroMOP99(DateTime numeroMOP99) {
    this.numeroMOP99 = numeroMOP99;
    return this;
  }

  /**
   * Get numeroMOP99
   * @return numeroMOP99
  */
  @Valid 
  @Schema(name = "NumeroMOP99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroMOP99")
  public DateTime getNumeroMOP99() {
    return numeroMOP99;
  }

  public void setNumeroMOP99(DateTime numeroMOP99) {
    this.numeroMOP99 = numeroMOP99;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte fechaAperturaCuentaMasAntigua(String fechaAperturaCuentaMasAntigua) {
    this.fechaAperturaCuentaMasAntigua = fechaAperturaCuentaMasAntigua;
    return this;
  }

  /**
   * Get fechaAperturaCuentaMasAntigua
   * @return fechaAperturaCuentaMasAntigua
  */
  
  @Schema(name = "FechaAperturaCuentaMasAntigua", example = "01012010", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaAperturaCuentaMasAntigua")
  public String getFechaAperturaCuentaMasAntigua() {
    return fechaAperturaCuentaMasAntigua;
  }

  public void setFechaAperturaCuentaMasAntigua(String fechaAperturaCuentaMasAntigua) {
    this.fechaAperturaCuentaMasAntigua = fechaAperturaCuentaMasAntigua;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte fechaAperturaCuentaMasReciente(String fechaAperturaCuentaMasReciente) {
    this.fechaAperturaCuentaMasReciente = fechaAperturaCuentaMasReciente;
    return this;
  }

  /**
   * Get fechaAperturaCuentaMasReciente
   * @return fechaAperturaCuentaMasReciente
  */
  
  @Schema(name = "FechaAperturaCuentaMasReciente", example = "01012016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaAperturaCuentaMasReciente")
  public String getFechaAperturaCuentaMasReciente() {
    return fechaAperturaCuentaMasReciente;
  }

  public void setFechaAperturaCuentaMasReciente(String fechaAperturaCuentaMasReciente) {
    this.fechaAperturaCuentaMasReciente = fechaAperturaCuentaMasReciente;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte totalSolicitudesReporte(String totalSolicitudesReporte) {
    this.totalSolicitudesReporte = totalSolicitudesReporte;
    return this;
  }

  /**
   * Get totalSolicitudesReporte
   * @return totalSolicitudesReporte
  */
  
  @Schema(name = "TotalSolicitudesReporte", example = "99", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalSolicitudesReporte")
  public String getTotalSolicitudesReporte() {
    return totalSolicitudesReporte;
  }

  public void setTotalSolicitudesReporte(String totalSolicitudesReporte) {
    this.totalSolicitudesReporte = totalSolicitudesReporte;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte fechaSolicitudReporteMasReciente(String fechaSolicitudReporteMasReciente) {
    this.fechaSolicitudReporteMasReciente = fechaSolicitudReporteMasReciente;
    return this;
  }

  /**
   * Get fechaSolicitudReporteMasReciente
   * @return fechaSolicitudReporteMasReciente
  */
  
  @Schema(name = "FechaSolicitudReporteMasReciente", example = "05072016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaSolicitudReporteMasReciente")
  public String getFechaSolicitudReporteMasReciente() {
    return fechaSolicitudReporteMasReciente;
  }

  public void setFechaSolicitudReporteMasReciente(String fechaSolicitudReporteMasReciente) {
    this.fechaSolicitudReporteMasReciente = fechaSolicitudReporteMasReciente;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroTotalCuentasDespachoCobranza(DateTime numeroTotalCuentasDespachoCobranza) {
    this.numeroTotalCuentasDespachoCobranza = numeroTotalCuentasDespachoCobranza;
    return this;
  }

  /**
   * Get numeroTotalCuentasDespachoCobranza
   * @return numeroTotalCuentasDespachoCobranza
  */
  @Valid 
  @Schema(name = "NumeroTotalCuentasDespachoCobranza", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroTotalCuentasDespachoCobranza")
  public DateTime getNumeroTotalCuentasDespachoCobranza() {
    return numeroTotalCuentasDespachoCobranza;
  }

  public void setNumeroTotalCuentasDespachoCobranza(DateTime numeroTotalCuentasDespachoCobranza) {
    this.numeroTotalCuentasDespachoCobranza = numeroTotalCuentasDespachoCobranza;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte fechaAperturaCuentaMasRecienteDespachoCobranza(String fechaAperturaCuentaMasRecienteDespachoCobranza) {
    this.fechaAperturaCuentaMasRecienteDespachoCobranza = fechaAperturaCuentaMasRecienteDespachoCobranza;
    return this;
  }

  /**
   * Get fechaAperturaCuentaMasRecienteDespachoCobranza
   * @return fechaAperturaCuentaMasRecienteDespachoCobranza
  */
  
  @Schema(name = "FechaAperturaCuentaMasRecienteDespachoCobranza", example = "00000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaAperturaCuentaMasRecienteDespachoCobranza")
  public String getFechaAperturaCuentaMasRecienteDespachoCobranza() {
    return fechaAperturaCuentaMasRecienteDespachoCobranza;
  }

  public void setFechaAperturaCuentaMasRecienteDespachoCobranza(String fechaAperturaCuentaMasRecienteDespachoCobranza) {
    this.fechaAperturaCuentaMasRecienteDespachoCobranza = fechaAperturaCuentaMasRecienteDespachoCobranza;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte numeroTotalSolicitudesDespachosCobranza(DateTime numeroTotalSolicitudesDespachosCobranza) {
    this.numeroTotalSolicitudesDespachosCobranza = numeroTotalSolicitudesDespachosCobranza;
    return this;
  }

  /**
   * Get numeroTotalSolicitudesDespachosCobranza
   * @return numeroTotalSolicitudesDespachosCobranza
  */
  @Valid 
  @Schema(name = "NumeroTotalSolicitudesDespachosCobranza", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroTotalSolicitudesDespachosCobranza")
  public DateTime getNumeroTotalSolicitudesDespachosCobranza() {
    return numeroTotalSolicitudesDespachosCobranza;
  }

  public void setNumeroTotalSolicitudesDespachosCobranza(DateTime numeroTotalSolicitudesDespachosCobranza) {
    this.numeroTotalSolicitudesDespachosCobranza = numeroTotalSolicitudesDespachosCobranza;
  }

  public ConsultaBuroResponseResumenReporteResumenReporte fechaSolicitudMasRecienteDespachoCobranza(String fechaSolicitudMasRecienteDespachoCobranza) {
    this.fechaSolicitudMasRecienteDespachoCobranza = fechaSolicitudMasRecienteDespachoCobranza;
    return this;
  }

  /**
   * Get fechaSolicitudMasRecienteDespachoCobranza
   * @return fechaSolicitudMasRecienteDespachoCobranza
  */
  
  @Schema(name = "FechaSolicitudMasRecienteDespachoCobranza", example = "00000000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaSolicitudMasRecienteDespachoCobranza")
  public String getFechaSolicitudMasRecienteDespachoCobranza() {
    return fechaSolicitudMasRecienteDespachoCobranza;
  }

  public void setFechaSolicitudMasRecienteDespachoCobranza(String fechaSolicitudMasRecienteDespachoCobranza) {
    this.fechaSolicitudMasRecienteDespachoCobranza = fechaSolicitudMasRecienteDespachoCobranza;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseResumenReporteResumenReporte consultaBuroResponseResumenReporteResumenReporte = (ConsultaBuroResponseResumenReporteResumenReporte) o;
    return Objects.equals(this.fechaIngresoBD, consultaBuroResponseResumenReporteResumenReporte.fechaIngresoBD) &&
        Objects.equals(this.numeroMOP7, consultaBuroResponseResumenReporteResumenReporte.numeroMOP7) &&
        Objects.equals(this.numeroMOP6, consultaBuroResponseResumenReporteResumenReporte.numeroMOP6) &&
        Objects.equals(this.numeroMOP5, consultaBuroResponseResumenReporteResumenReporte.numeroMOP5) &&
        Objects.equals(this.numeroMOP4, consultaBuroResponseResumenReporteResumenReporte.numeroMOP4) &&
        Objects.equals(this.numeroMOP3, consultaBuroResponseResumenReporteResumenReporte.numeroMOP3) &&
        Objects.equals(this.numeroMOP2, consultaBuroResponseResumenReporteResumenReporte.numeroMOP2) &&
        Objects.equals(this.numeroMOP1, consultaBuroResponseResumenReporteResumenReporte.numeroMOP1) &&
        Objects.equals(this.numeroMOP0, consultaBuroResponseResumenReporteResumenReporte.numeroMOP0) &&
        Objects.equals(this.numeroMOPUR, consultaBuroResponseResumenReporteResumenReporte.numeroMOPUR) &&
        Objects.equals(this.numeroCuentas, consultaBuroResponseResumenReporteResumenReporte.numeroCuentas) &&
        Objects.equals(this.cuentasPagosFijosHipotecas, consultaBuroResponseResumenReporteResumenReporte.cuentasPagosFijosHipotecas) &&
        Objects.equals(this.cuentasRevolventesAbiertas, consultaBuroResponseResumenReporteResumenReporte.cuentasRevolventesAbiertas) &&
        Objects.equals(this.cuentasCerradas, consultaBuroResponseResumenReporteResumenReporte.cuentasCerradas) &&
        Objects.equals(this.cuentasNegativasActuales, consultaBuroResponseResumenReporteResumenReporte.cuentasNegativasActuales) &&
        Objects.equals(this.cuentasClavesHistoriaNegativa, consultaBuroResponseResumenReporteResumenReporte.cuentasClavesHistoriaNegativa) &&
        Objects.equals(this.cuentasDisputa, consultaBuroResponseResumenReporteResumenReporte.cuentasDisputa) &&
        Objects.equals(this.numeroSolicitudesUltimos6Meses, consultaBuroResponseResumenReporteResumenReporte.numeroSolicitudesUltimos6Meses) &&
        Objects.equals(this.nuevaDireccionReportadaUltimos60Dias, consultaBuroResponseResumenReporteResumenReporte.nuevaDireccionReportadaUltimos60Dias) &&
        Objects.equals(this.mensajesAlerta, consultaBuroResponseResumenReporteResumenReporte.mensajesAlerta) &&
        Objects.equals(this.existenciaDeclaracionesConsumidor, consultaBuroResponseResumenReporteResumenReporte.existenciaDeclaracionesConsumidor) &&
        Objects.equals(this.tipoMoneda, consultaBuroResponseResumenReporteResumenReporte.tipoMoneda) &&
        Objects.equals(this.totalLimitesCreditoRevolventes, consultaBuroResponseResumenReporteResumenReporte.totalLimitesCreditoRevolventes) &&
        Objects.equals(this.totalSaldosActualesRevolventes, consultaBuroResponseResumenReporteResumenReporte.totalSaldosActualesRevolventes) &&
        Objects.equals(this.totalSaldosVencidosRevolventes, consultaBuroResponseResumenReporteResumenReporte.totalSaldosVencidosRevolventes) &&
        Objects.equals(this.totalPagosRevolventes, consultaBuroResponseResumenReporteResumenReporte.totalPagosRevolventes) &&
        Objects.equals(this.pctLimiteCreditoUtilizadoRevolventes, consultaBuroResponseResumenReporteResumenReporte.pctLimiteCreditoUtilizadoRevolventes) &&
        Objects.equals(this.totalCreditosMaximosPagosFijos, consultaBuroResponseResumenReporteResumenReporte.totalCreditosMaximosPagosFijos) &&
        Objects.equals(this.totalSaldosActualesPagosFijos, consultaBuroResponseResumenReporteResumenReporte.totalSaldosActualesPagosFijos) &&
        Objects.equals(this.totalSaldosVencidosPagosFijos, consultaBuroResponseResumenReporteResumenReporte.totalSaldosVencidosPagosFijos) &&
        Objects.equals(this.totalPagosPagosFijos, consultaBuroResponseResumenReporteResumenReporte.totalPagosPagosFijos) &&
        Objects.equals(this.numeroMOP96, consultaBuroResponseResumenReporteResumenReporte.numeroMOP96) &&
        Objects.equals(this.numeroMOP97, consultaBuroResponseResumenReporteResumenReporte.numeroMOP97) &&
        Objects.equals(this.numeroMOP99, consultaBuroResponseResumenReporteResumenReporte.numeroMOP99) &&
        Objects.equals(this.fechaAperturaCuentaMasAntigua, consultaBuroResponseResumenReporteResumenReporte.fechaAperturaCuentaMasAntigua) &&
        Objects.equals(this.fechaAperturaCuentaMasReciente, consultaBuroResponseResumenReporteResumenReporte.fechaAperturaCuentaMasReciente) &&
        Objects.equals(this.totalSolicitudesReporte, consultaBuroResponseResumenReporteResumenReporte.totalSolicitudesReporte) &&
        Objects.equals(this.fechaSolicitudReporteMasReciente, consultaBuroResponseResumenReporteResumenReporte.fechaSolicitudReporteMasReciente) &&
        Objects.equals(this.numeroTotalCuentasDespachoCobranza, consultaBuroResponseResumenReporteResumenReporte.numeroTotalCuentasDespachoCobranza) &&
        Objects.equals(this.fechaAperturaCuentaMasRecienteDespachoCobranza, consultaBuroResponseResumenReporteResumenReporte.fechaAperturaCuentaMasRecienteDespachoCobranza) &&
        Objects.equals(this.numeroTotalSolicitudesDespachosCobranza, consultaBuroResponseResumenReporteResumenReporte.numeroTotalSolicitudesDespachosCobranza) &&
        Objects.equals(this.fechaSolicitudMasRecienteDespachoCobranza, consultaBuroResponseResumenReporteResumenReporte.fechaSolicitudMasRecienteDespachoCobranza);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaIngresoBD, numeroMOP7, numeroMOP6, numeroMOP5, numeroMOP4, numeroMOP3, numeroMOP2, numeroMOP1, numeroMOP0, numeroMOPUR, numeroCuentas, cuentasPagosFijosHipotecas, cuentasRevolventesAbiertas, cuentasCerradas, cuentasNegativasActuales, cuentasClavesHistoriaNegativa, cuentasDisputa, numeroSolicitudesUltimos6Meses, nuevaDireccionReportadaUltimos60Dias, mensajesAlerta, existenciaDeclaracionesConsumidor, tipoMoneda, totalLimitesCreditoRevolventes, totalSaldosActualesRevolventes, totalSaldosVencidosRevolventes, totalPagosRevolventes, pctLimiteCreditoUtilizadoRevolventes, totalCreditosMaximosPagosFijos, totalSaldosActualesPagosFijos, totalSaldosVencidosPagosFijos, totalPagosPagosFijos, numeroMOP96, numeroMOP97, numeroMOP99, fechaAperturaCuentaMasAntigua, fechaAperturaCuentaMasReciente, totalSolicitudesReporte, fechaSolicitudReporteMasReciente, numeroTotalCuentasDespachoCobranza, fechaAperturaCuentaMasRecienteDespachoCobranza, numeroTotalSolicitudesDespachosCobranza, fechaSolicitudMasRecienteDespachoCobranza);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseResumenReporteResumenReporte {\n");
    sb.append("    fechaIngresoBD: ").append(toIndentedString(fechaIngresoBD)).append("\n");
    sb.append("    numeroMOP7: ").append(toIndentedString(numeroMOP7)).append("\n");
    sb.append("    numeroMOP6: ").append(toIndentedString(numeroMOP6)).append("\n");
    sb.append("    numeroMOP5: ").append(toIndentedString(numeroMOP5)).append("\n");
    sb.append("    numeroMOP4: ").append(toIndentedString(numeroMOP4)).append("\n");
    sb.append("    numeroMOP3: ").append(toIndentedString(numeroMOP3)).append("\n");
    sb.append("    numeroMOP2: ").append(toIndentedString(numeroMOP2)).append("\n");
    sb.append("    numeroMOP1: ").append(toIndentedString(numeroMOP1)).append("\n");
    sb.append("    numeroMOP0: ").append(toIndentedString(numeroMOP0)).append("\n");
    sb.append("    numeroMOPUR: ").append(toIndentedString(numeroMOPUR)).append("\n");
    sb.append("    numeroCuentas: ").append(toIndentedString(numeroCuentas)).append("\n");
    sb.append("    cuentasPagosFijosHipotecas: ").append(toIndentedString(cuentasPagosFijosHipotecas)).append("\n");
    sb.append("    cuentasRevolventesAbiertas: ").append(toIndentedString(cuentasRevolventesAbiertas)).append("\n");
    sb.append("    cuentasCerradas: ").append(toIndentedString(cuentasCerradas)).append("\n");
    sb.append("    cuentasNegativasActuales: ").append(toIndentedString(cuentasNegativasActuales)).append("\n");
    sb.append("    cuentasClavesHistoriaNegativa: ").append(toIndentedString(cuentasClavesHistoriaNegativa)).append("\n");
    sb.append("    cuentasDisputa: ").append(toIndentedString(cuentasDisputa)).append("\n");
    sb.append("    numeroSolicitudesUltimos6Meses: ").append(toIndentedString(numeroSolicitudesUltimos6Meses)).append("\n");
    sb.append("    nuevaDireccionReportadaUltimos60Dias: ").append(toIndentedString(nuevaDireccionReportadaUltimos60Dias)).append("\n");
    sb.append("    mensajesAlerta: ").append(toIndentedString(mensajesAlerta)).append("\n");
    sb.append("    existenciaDeclaracionesConsumidor: ").append(toIndentedString(existenciaDeclaracionesConsumidor)).append("\n");
    sb.append("    tipoMoneda: ").append(toIndentedString(tipoMoneda)).append("\n");
    sb.append("    totalLimitesCreditoRevolventes: ").append(toIndentedString(totalLimitesCreditoRevolventes)).append("\n");
    sb.append("    totalSaldosActualesRevolventes: ").append(toIndentedString(totalSaldosActualesRevolventes)).append("\n");
    sb.append("    totalSaldosVencidosRevolventes: ").append(toIndentedString(totalSaldosVencidosRevolventes)).append("\n");
    sb.append("    totalPagosRevolventes: ").append(toIndentedString(totalPagosRevolventes)).append("\n");
    sb.append("    pctLimiteCreditoUtilizadoRevolventes: ").append(toIndentedString(pctLimiteCreditoUtilizadoRevolventes)).append("\n");
    sb.append("    totalCreditosMaximosPagosFijos: ").append(toIndentedString(totalCreditosMaximosPagosFijos)).append("\n");
    sb.append("    totalSaldosActualesPagosFijos: ").append(toIndentedString(totalSaldosActualesPagosFijos)).append("\n");
    sb.append("    totalSaldosVencidosPagosFijos: ").append(toIndentedString(totalSaldosVencidosPagosFijos)).append("\n");
    sb.append("    totalPagosPagosFijos: ").append(toIndentedString(totalPagosPagosFijos)).append("\n");
    sb.append("    numeroMOP96: ").append(toIndentedString(numeroMOP96)).append("\n");
    sb.append("    numeroMOP97: ").append(toIndentedString(numeroMOP97)).append("\n");
    sb.append("    numeroMOP99: ").append(toIndentedString(numeroMOP99)).append("\n");
    sb.append("    fechaAperturaCuentaMasAntigua: ").append(toIndentedString(fechaAperturaCuentaMasAntigua)).append("\n");
    sb.append("    fechaAperturaCuentaMasReciente: ").append(toIndentedString(fechaAperturaCuentaMasReciente)).append("\n");
    sb.append("    totalSolicitudesReporte: ").append(toIndentedString(totalSolicitudesReporte)).append("\n");
    sb.append("    fechaSolicitudReporteMasReciente: ").append(toIndentedString(fechaSolicitudReporteMasReciente)).append("\n");
    sb.append("    numeroTotalCuentasDespachoCobranza: ").append(toIndentedString(numeroTotalCuentasDespachoCobranza)).append("\n");
    sb.append("    fechaAperturaCuentaMasRecienteDespachoCobranza: ").append(toIndentedString(fechaAperturaCuentaMasRecienteDespachoCobranza)).append("\n");
    sb.append("    numeroTotalSolicitudesDespachosCobranza: ").append(toIndentedString(numeroTotalSolicitudesDespachosCobranza)).append("\n");
    sb.append("    fechaSolicitudMasRecienteDespachoCobranza: ").append(toIndentedString(fechaSolicitudMasRecienteDespachoCobranza)).append("\n");
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
