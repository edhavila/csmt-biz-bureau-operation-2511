package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseConsultasEfectuadas
 */

@JsonTypeName("ConsultaBuroResponse_ConsultasEfectuadas")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseConsultasEfectuadas {

  private ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada consultaEfectuada;

  public ConsultaBuroResponseConsultasEfectuadas consultaEfectuada(ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada consultaEfectuada) {
    this.consultaEfectuada = consultaEfectuada;
    return this;
  }

  /**
   * Get consultaEfectuada
   * @return consultaEfectuada
  */
  @Valid 
  @Schema(name = "ConsultaEfectuada", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ConsultaEfectuada")
  public ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada getConsultaEfectuada() {
    return consultaEfectuada;
  }

  public void setConsultaEfectuada(ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada consultaEfectuada) {
    this.consultaEfectuada = consultaEfectuada;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseConsultasEfectuadas consultaBuroResponseConsultasEfectuadas = (ConsultaBuroResponseConsultasEfectuadas) o;
    return Objects.equals(this.consultaEfectuada, consultaBuroResponseConsultasEfectuadas.consultaEfectuada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultaEfectuada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseConsultasEfectuadas {\n");
    sb.append("    consultaEfectuada: ").append(toIndentedString(consultaEfectuada)).append("\n");
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
