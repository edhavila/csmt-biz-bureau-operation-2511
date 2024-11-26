package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponse {

  private ConsultaBuroResponseEncabezado encabezado;

  private ConsultaBuroResponseNombre nombre;

  private ConsultaBuroResponseDomicilios domicilios;

  private ConsultaBuroResponseEmpleos empleos;

  private ConsultaBuroResponseCuentas cuentas;

  private ConsultaBuroResponseConsultasEfectuadas consultasEfectuadas;

  private ConsultaBuroResponseResumenReporte resumenReporte;

  private ConsultaBuroResponseHawkAlertConsulta hawkAlertConsulta;

  private ConsultaBuroResponseHawkAlertBD hawkAlertBD;

  private ConsultaBuroResponseDeclaracionesCliente declaracionesCliente;

  private ConsultaBuroResponseScoreBuroCredito scoreBuroCredito;

  public ConsultaBuroResponse encabezado(ConsultaBuroResponseEncabezado encabezado) {
    this.encabezado = encabezado;
    return this;
  }

  /**
   * Get encabezado
   * @return encabezado
  */
  @Valid 
  @Schema(name = "Encabezado", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Encabezado")
  public ConsultaBuroResponseEncabezado getEncabezado() {
    return encabezado;
  }

  public void setEncabezado(ConsultaBuroResponseEncabezado encabezado) {
    this.encabezado = encabezado;
  }

  public ConsultaBuroResponse nombre(ConsultaBuroResponseNombre nombre) {
    this.nombre = nombre;
    return this;
  }

  /**
   * Get nombre
   * @return nombre
  */
  @Valid 
  @Schema(name = "Nombre", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Nombre")
  public ConsultaBuroResponseNombre getNombre() {
    return nombre;
  }

  public void setNombre(ConsultaBuroResponseNombre nombre) {
    this.nombre = nombre;
  }

  public ConsultaBuroResponse domicilios(ConsultaBuroResponseDomicilios domicilios) {
    this.domicilios = domicilios;
    return this;
  }

  /**
   * Get domicilios
   * @return domicilios
  */
  @Valid 
  @Schema(name = "Domicilios", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Domicilios")
  public ConsultaBuroResponseDomicilios getDomicilios() {
    return domicilios;
  }

  public void setDomicilios(ConsultaBuroResponseDomicilios domicilios) {
    this.domicilios = domicilios;
  }

  public ConsultaBuroResponse empleos(ConsultaBuroResponseEmpleos empleos) {
    this.empleos = empleos;
    return this;
  }

  /**
   * Get empleos
   * @return empleos
  */
  @Valid 
  @Schema(name = "Empleos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Empleos")
  public ConsultaBuroResponseEmpleos getEmpleos() {
    return empleos;
  }

  public void setEmpleos(ConsultaBuroResponseEmpleos empleos) {
    this.empleos = empleos;
  }

  public ConsultaBuroResponse cuentas(ConsultaBuroResponseCuentas cuentas) {
    this.cuentas = cuentas;
    return this;
  }

  /**
   * Get cuentas
   * @return cuentas
  */
  @Valid 
  @Schema(name = "Cuentas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cuentas")
  public ConsultaBuroResponseCuentas getCuentas() {
    return cuentas;
  }

  public void setCuentas(ConsultaBuroResponseCuentas cuentas) {
    this.cuentas = cuentas;
  }

  public ConsultaBuroResponse consultasEfectuadas(ConsultaBuroResponseConsultasEfectuadas consultasEfectuadas) {
    this.consultasEfectuadas = consultasEfectuadas;
    return this;
  }

  /**
   * Get consultasEfectuadas
   * @return consultasEfectuadas
  */
  @Valid 
  @Schema(name = "ConsultasEfectuadas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConsultasEfectuadas")
  public ConsultaBuroResponseConsultasEfectuadas getConsultasEfectuadas() {
    return consultasEfectuadas;
  }

  public void setConsultasEfectuadas(ConsultaBuroResponseConsultasEfectuadas consultasEfectuadas) {
    this.consultasEfectuadas = consultasEfectuadas;
  }

  public ConsultaBuroResponse resumenReporte(ConsultaBuroResponseResumenReporte resumenReporte) {
    this.resumenReporte = resumenReporte;
    return this;
  }

  /**
   * Get resumenReporte
   * @return resumenReporte
  */
  @Valid 
  @Schema(name = "ResumenReporte", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResumenReporte")
  public ConsultaBuroResponseResumenReporte getResumenReporte() {
    return resumenReporte;
  }

  public void setResumenReporte(ConsultaBuroResponseResumenReporte resumenReporte) {
    this.resumenReporte = resumenReporte;
  }

  public ConsultaBuroResponse hawkAlertConsulta(ConsultaBuroResponseHawkAlertConsulta hawkAlertConsulta) {
    this.hawkAlertConsulta = hawkAlertConsulta;
    return this;
  }

  /**
   * Get hawkAlertConsulta
   * @return hawkAlertConsulta
  */
  @Valid 
  @Schema(name = "HawkAlertConsulta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HawkAlertConsulta")
  public ConsultaBuroResponseHawkAlertConsulta getHawkAlertConsulta() {
    return hawkAlertConsulta;
  }

  public void setHawkAlertConsulta(ConsultaBuroResponseHawkAlertConsulta hawkAlertConsulta) {
    this.hawkAlertConsulta = hawkAlertConsulta;
  }

  public ConsultaBuroResponse hawkAlertBD(ConsultaBuroResponseHawkAlertBD hawkAlertBD) {
    this.hawkAlertBD = hawkAlertBD;
    return this;
  }

  /**
   * Get hawkAlertBD
   * @return hawkAlertBD
  */
  @Valid 
  @Schema(name = "HawkAlertBD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HawkAlertBD")
  public ConsultaBuroResponseHawkAlertBD getHawkAlertBD() {
    return hawkAlertBD;
  }

  public void setHawkAlertBD(ConsultaBuroResponseHawkAlertBD hawkAlertBD) {
    this.hawkAlertBD = hawkAlertBD;
  }

  public ConsultaBuroResponse declaracionesCliente(ConsultaBuroResponseDeclaracionesCliente declaracionesCliente) {
    this.declaracionesCliente = declaracionesCliente;
    return this;
  }

  /**
   * Get declaracionesCliente
   * @return declaracionesCliente
  */
  @Valid 
  @Schema(name = "DeclaracionesCliente", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeclaracionesCliente")
  public ConsultaBuroResponseDeclaracionesCliente getDeclaracionesCliente() {
    return declaracionesCliente;
  }

  public void setDeclaracionesCliente(ConsultaBuroResponseDeclaracionesCliente declaracionesCliente) {
    this.declaracionesCliente = declaracionesCliente;
  }

  public ConsultaBuroResponse scoreBuroCredito(ConsultaBuroResponseScoreBuroCredito scoreBuroCredito) {
    this.scoreBuroCredito = scoreBuroCredito;
    return this;
  }

  /**
   * Get scoreBuroCredito
   * @return scoreBuroCredito
  */
  @Valid 
  @Schema(name = "ScoreBuroCredito", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ScoreBuroCredito")
  public ConsultaBuroResponseScoreBuroCredito getScoreBuroCredito() {
    return scoreBuroCredito;
  }

  public void setScoreBuroCredito(ConsultaBuroResponseScoreBuroCredito scoreBuroCredito) {
    this.scoreBuroCredito = scoreBuroCredito;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponse consultaBuroResponse = (ConsultaBuroResponse) o;
    return Objects.equals(this.encabezado, consultaBuroResponse.encabezado) &&
        Objects.equals(this.nombre, consultaBuroResponse.nombre) &&
        Objects.equals(this.domicilios, consultaBuroResponse.domicilios) &&
        Objects.equals(this.empleos, consultaBuroResponse.empleos) &&
        Objects.equals(this.cuentas, consultaBuroResponse.cuentas) &&
        Objects.equals(this.consultasEfectuadas, consultaBuroResponse.consultasEfectuadas) &&
        Objects.equals(this.resumenReporte, consultaBuroResponse.resumenReporte) &&
        Objects.equals(this.hawkAlertConsulta, consultaBuroResponse.hawkAlertConsulta) &&
        Objects.equals(this.hawkAlertBD, consultaBuroResponse.hawkAlertBD) &&
        Objects.equals(this.declaracionesCliente, consultaBuroResponse.declaracionesCliente) &&
        Objects.equals(this.scoreBuroCredito, consultaBuroResponse.scoreBuroCredito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encabezado, nombre, domicilios, empleos, cuentas, consultasEfectuadas, resumenReporte, hawkAlertConsulta, hawkAlertBD, declaracionesCliente, scoreBuroCredito);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponse {\n");
    sb.append("    encabezado: ").append(toIndentedString(encabezado)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    domicilios: ").append(toIndentedString(domicilios)).append("\n");
    sb.append("    empleos: ").append(toIndentedString(empleos)).append("\n");
    sb.append("    cuentas: ").append(toIndentedString(cuentas)).append("\n");
    sb.append("    consultasEfectuadas: ").append(toIndentedString(consultasEfectuadas)).append("\n");
    sb.append("    resumenReporte: ").append(toIndentedString(resumenReporte)).append("\n");
    sb.append("    hawkAlertConsulta: ").append(toIndentedString(hawkAlertConsulta)).append("\n");
    sb.append("    hawkAlertBD: ").append(toIndentedString(hawkAlertBD)).append("\n");
    sb.append("    declaracionesCliente: ").append(toIndentedString(declaracionesCliente)).append("\n");
    sb.append("    scoreBuroCredito: ").append(toIndentedString(scoreBuroCredito)).append("\n");
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
