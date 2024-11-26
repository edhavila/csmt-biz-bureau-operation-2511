package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada
 */

@JsonTypeName("ConsultaBuroResponse_ConsultasEfectuadas_ConsultaEfectuada")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada {

  private String fechaConsulta;

  private String claveOtorgante;

  private String nombreOtorgante;

  private String tipoContrato;

  private String importeContrato;

  private String indicadorTipoResponsabilidad;

  public ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }

  /**
   * Get fechaConsulta
   * @return fechaConsulta
  */
  
  @Schema(name = "FechaConsulta", example = "05072016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaConsulta")
  public String getFechaConsulta() {
    return fechaConsulta;
  }

  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }

  public ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada claveOtorgante(String claveOtorgante) {
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

  public ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada nombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
    return this;
  }

  /**
   * Get nombreOtorgante
   * @return nombreOtorgante
  */
  
  @Schema(name = "NombreOtorgante", example = "BURO DE CREDITO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NombreOtorgante")
  public String getNombreOtorgante() {
    return nombreOtorgante;
  }

  public void setNombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
  }

  public ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada tipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
    return this;
  }

  /**
   * Get tipoContrato
   * @return tipoContrato
  */
  
  @Schema(name = "TipoContrato", example = "CC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TipoContrato")
  public String getTipoContrato() {
    return tipoContrato;
  }

  public void setTipoContrato(String tipoContrato) {
    this.tipoContrato = tipoContrato;
  }

  public ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada importeContrato(String importeContrato) {
    this.importeContrato = importeContrato;
    return this;
  }

  /**
   * Get importeContrato
   * @return importeContrato
  */
  
  @Schema(name = "ImporteContrato", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImporteContrato")
  public String getImporteContrato() {
    return importeContrato;
  }

  public void setImporteContrato(String importeContrato) {
    this.importeContrato = importeContrato;
  }

  public ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada indicadorTipoResponsabilidad(String indicadorTipoResponsabilidad) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada consultaBuroResponseConsultasEfectuadasConsultaEfectuada = (ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada) o;
    return Objects.equals(this.fechaConsulta, consultaBuroResponseConsultasEfectuadasConsultaEfectuada.fechaConsulta) &&
        Objects.equals(this.claveOtorgante, consultaBuroResponseConsultasEfectuadasConsultaEfectuada.claveOtorgante) &&
        Objects.equals(this.nombreOtorgante, consultaBuroResponseConsultasEfectuadasConsultaEfectuada.nombreOtorgante) &&
        Objects.equals(this.tipoContrato, consultaBuroResponseConsultasEfectuadasConsultaEfectuada.tipoContrato) &&
        Objects.equals(this.importeContrato, consultaBuroResponseConsultasEfectuadasConsultaEfectuada.importeContrato) &&
        Objects.equals(this.indicadorTipoResponsabilidad, consultaBuroResponseConsultasEfectuadasConsultaEfectuada.indicadorTipoResponsabilidad);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaConsulta, claveOtorgante, nombreOtorgante, tipoContrato, importeContrato, indicadorTipoResponsabilidad);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseConsultasEfectuadasConsultaEfectuada {\n");
    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
    sb.append("    tipoContrato: ").append(toIndentedString(tipoContrato)).append("\n");
    sb.append("    importeContrato: ").append(toIndentedString(importeContrato)).append("\n");
    sb.append("    indicadorTipoResponsabilidad: ").append(toIndentedString(indicadorTipoResponsabilidad)).append("\n");
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
