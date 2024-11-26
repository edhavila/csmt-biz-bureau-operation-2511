package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaResumenRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaResumenRequest {

  private String fechaInicio;

  private String fechaFin;

  public ConsultaResumenRequest fechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }

  /**
   * Fecha inicial de la consulta
   * @return fechaInicio
  */
  
  @Schema(name = "FechaInicio", example = "yyyy/mm/dd", description = "Fecha inicial de la consulta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaInicio")
  public String getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public ConsultaResumenRequest fechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
    return this;
  }

  /**
   * Fecha inicial de la consulta
   * @return fechaFin
  */
  
  @Schema(name = "FechaFin", example = "yyyy/mm/dd", description = "Fecha inicial de la consulta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaFin")
  public String getFechaFin() {
    return fechaFin;
  }

  public void setFechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaResumenRequest consultaResumenRequest = (ConsultaResumenRequest) o;
    return Objects.equals(this.fechaInicio, consultaResumenRequest.fechaInicio) &&
        Objects.equals(this.fechaFin, consultaResumenRequest.fechaFin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaInicio, fechaFin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaResumenRequest {\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    fechaFin: ").append(toIndentedString(fechaFin)).append("\n");
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
