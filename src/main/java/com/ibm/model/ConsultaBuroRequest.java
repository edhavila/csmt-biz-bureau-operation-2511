package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroRequest {

  private ConsultaBuroRequestEncabezado encabezado;

  private ConsultaBuroRequestNombre nombre;

  private ConsultaBuroRequestDomicilios domicilios;

  private ConsultaBuroRequestEmpleos empleos;

  public ConsultaBuroRequest encabezado(ConsultaBuroRequestEncabezado encabezado) {
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
  public ConsultaBuroRequestEncabezado getEncabezado() {
    return encabezado;
  }

  public void setEncabezado(ConsultaBuroRequestEncabezado encabezado) {
    this.encabezado = encabezado;
  }

  public ConsultaBuroRequest nombre(ConsultaBuroRequestNombre nombre) {
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
  public ConsultaBuroRequestNombre getNombre() {
    return nombre;
  }

  public void setNombre(ConsultaBuroRequestNombre nombre) {
    this.nombre = nombre;
  }

  public ConsultaBuroRequest domicilios(ConsultaBuroRequestDomicilios domicilios) {
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
  public ConsultaBuroRequestDomicilios getDomicilios() {
    return domicilios;
  }

  public void setDomicilios(ConsultaBuroRequestDomicilios domicilios) {
    this.domicilios = domicilios;
  }

  public ConsultaBuroRequest empleos(ConsultaBuroRequestEmpleos empleos) {
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
  public ConsultaBuroRequestEmpleos getEmpleos() {
    return empleos;
  }

  public void setEmpleos(ConsultaBuroRequestEmpleos empleos) {
    this.empleos = empleos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroRequest consultaBuroRequest = (ConsultaBuroRequest) o;
    return Objects.equals(this.encabezado, consultaBuroRequest.encabezado) &&
        Objects.equals(this.nombre, consultaBuroRequest.nombre) &&
        Objects.equals(this.domicilios, consultaBuroRequest.domicilios) &&
        Objects.equals(this.empleos, consultaBuroRequest.empleos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encabezado, nombre, domicilios, empleos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroRequest {\n");
    sb.append("    encabezado: ").append(toIndentedString(encabezado)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    domicilios: ").append(toIndentedString(domicilios)).append("\n");
    sb.append("    empleos: ").append(toIndentedString(empleos)).append("\n");
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
