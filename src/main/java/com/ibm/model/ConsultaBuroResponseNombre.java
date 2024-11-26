package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseNombre
 */

@JsonTypeName("ConsultaBuroResponse_Nombre")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseNombre {

  private String apellidoPaterno;

  private String apellidoMaterno;

  private byte[] primerNombre;

  private String fechaNacimiento;

  private String RFC;

  private String prefijo;

  private String nacionalidad;

  private String residencia;

  private String estadoCivil;

  private String sexo;

  public ConsultaBuroResponseNombre apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }

  /**
   * Get apellidoPaterno
   * @return apellidoPaterno
  */
  
  @Schema(name = "ApellidoPaterno", example = "PRUEBA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ApellidoPaterno")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }

  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }

  public ConsultaBuroResponseNombre apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }

  /**
   * Get apellidoMaterno
   * @return apellidoMaterno
  */
  
  @Schema(name = "ApellidoMaterno", example = "UNO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ApellidoMaterno")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }

  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }

  public ConsultaBuroResponseNombre primerNombre(byte[] primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }

  /**
   * Get primerNombre
   * @return primerNombre
  */
  
  @Schema(name = "PrimerNombre", example = "[B@6dbbb03c", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimerNombre")
  public byte[] getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(byte[] primerNombre) {
    this.primerNombre = primerNombre;
  }

  public ConsultaBuroResponseNombre fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }

  /**
   * Get fechaNacimiento
   * @return fechaNacimiento
  */
  
  @Schema(name = "FechaNacimiento", example = "01011980", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaNacimiento")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }

  public ConsultaBuroResponseNombre RFC(String RFC) {
    this.RFC = RFC;
    return this;
  }

  /**
   * Get RFC
   * @return RFC
  */
  
  @Schema(name = "RFC", example = "NOPJ800101", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RFC")
  public String getRFC() {
    return RFC;
  }

  public void setRFC(String RFC) {
    this.RFC = RFC;
  }

  public ConsultaBuroResponseNombre prefijo(String prefijo) {
    this.prefijo = prefijo;
    return this;
  }

  /**
   * Get prefijo
   * @return prefijo
  */
  
  @Schema(name = "Prefijo", example = "SR", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Prefijo")
  public String getPrefijo() {
    return prefijo;
  }

  public void setPrefijo(String prefijo) {
    this.prefijo = prefijo;
  }

  public ConsultaBuroResponseNombre nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }

  /**
   * Get nacionalidad
   * @return nacionalidad
  */
  
  @Schema(name = "Nacionalidad", example = "MX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Nacionalidad")
  public String getNacionalidad() {
    return nacionalidad;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  public ConsultaBuroResponseNombre residencia(String residencia) {
    this.residencia = residencia;
    return this;
  }

  /**
   * Get residencia
   * @return residencia
  */
  
  @Schema(name = "Residencia", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Residencia")
  public String getResidencia() {
    return residencia;
  }

  public void setResidencia(String residencia) {
    this.residencia = residencia;
  }

  public ConsultaBuroResponseNombre estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }

  /**
   * Get estadoCivil
   * @return estadoCivil
  */
  
  @Schema(name = "EstadoCivil", example = "M", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EstadoCivil")
  public String getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public ConsultaBuroResponseNombre sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

  /**
   * Get sexo
   * @return sexo
  */
  
  @Schema(name = "Sexo", example = "M", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Sexo")
  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseNombre consultaBuroResponseNombre = (ConsultaBuroResponseNombre) o;
    return Objects.equals(this.apellidoPaterno, consultaBuroResponseNombre.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, consultaBuroResponseNombre.apellidoMaterno) &&
        Arrays.equals(this.primerNombre, consultaBuroResponseNombre.primerNombre) &&
        Objects.equals(this.fechaNacimiento, consultaBuroResponseNombre.fechaNacimiento) &&
        Objects.equals(this.RFC, consultaBuroResponseNombre.RFC) &&
        Objects.equals(this.prefijo, consultaBuroResponseNombre.prefijo) &&
        Objects.equals(this.nacionalidad, consultaBuroResponseNombre.nacionalidad) &&
        Objects.equals(this.residencia, consultaBuroResponseNombre.residencia) &&
        Objects.equals(this.estadoCivil, consultaBuroResponseNombre.estadoCivil) &&
        Objects.equals(this.sexo, consultaBuroResponseNombre.sexo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, Arrays.hashCode(primerNombre), fechaNacimiento, RFC, prefijo, nacionalidad, residencia, estadoCivil, sexo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseNombre {\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    prefijo: ").append(toIndentedString(prefijo)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
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
