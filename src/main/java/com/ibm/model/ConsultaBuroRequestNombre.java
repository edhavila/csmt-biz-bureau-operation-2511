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
 * ConsultaBuroRequestNombre
 */

@JsonTypeName("ConsultaBuroRequest_Nombre")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroRequestNombre {

  private String apellidoPaterno;

  private String apellidoMaterno;

  private String apellidoAdicional;

  private byte[] primerNombre;

  private String segundoNombre;

  private String fechaNacimiento;

  private String RFC;

  private String prefijo;

  private String sufijo;

  private String nacionalidad;

  private String residencia;

  private String numeroLicenciaConducir;

  private String estadoCivil;

  private String sexo;

  private String numeroCedulaProfesional;

  private String numeroRegistroElectoral;

  private String claveImpuestosOtroPais;

  private String claveOtroPais;

  private String numeroDependientes;

  private String edadesDependientes;

  public ConsultaBuroRequestNombre apellidoPaterno(String apellidoPaterno) {
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

  public ConsultaBuroRequestNombre apellidoMaterno(String apellidoMaterno) {
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

  public ConsultaBuroRequestNombre apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }

  /**
   * Get apellidoAdicional
   * @return apellidoAdicional
  */
  
  @Schema(name = "ApellidoAdicional", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ApellidoAdicional")
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }

  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }

  public ConsultaBuroRequestNombre primerNombre(byte[] primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }

  /**
   * Get primerNombre
   * @return primerNombre
  */
  
  @Schema(name = "PrimerNombre", example = "[B@37dd91f6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimerNombre")
  public byte[] getPrimerNombre() {
    return primerNombre;
  }

  public void setPrimerNombre(byte[] primerNombre) {
    this.primerNombre = primerNombre;
  }

  public ConsultaBuroRequestNombre segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }

  /**
   * Get segundoNombre
   * @return segundoNombre
  */
  
  @Schema(name = "SegundoNombre", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SegundoNombre")
  public String getSegundoNombre() {
    return segundoNombre;
  }

  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }

  public ConsultaBuroRequestNombre fechaNacimiento(String fechaNacimiento) {
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

  public ConsultaBuroRequestNombre RFC(String RFC) {
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

  public ConsultaBuroRequestNombre prefijo(String prefijo) {
    this.prefijo = prefijo;
    return this;
  }

  /**
   * Get prefijo
   * @return prefijo
  */
  
  @Schema(name = "Prefijo", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Prefijo")
  public String getPrefijo() {
    return prefijo;
  }

  public void setPrefijo(String prefijo) {
    this.prefijo = prefijo;
  }

  public ConsultaBuroRequestNombre sufijo(String sufijo) {
    this.sufijo = sufijo;
    return this;
  }

  /**
   * Get sufijo
   * @return sufijo
  */
  
  @Schema(name = "Sufijo", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Sufijo")
  public String getSufijo() {
    return sufijo;
  }

  public void setSufijo(String sufijo) {
    this.sufijo = sufijo;
  }

  public ConsultaBuroRequestNombre nacionalidad(String nacionalidad) {
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

  public ConsultaBuroRequestNombre residencia(String residencia) {
    this.residencia = residencia;
    return this;
  }

  /**
   * Get residencia
   * @return residencia
  */
  
  @Schema(name = "Residencia", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Residencia")
  public String getResidencia() {
    return residencia;
  }

  public void setResidencia(String residencia) {
    this.residencia = residencia;
  }

  public ConsultaBuroRequestNombre numeroLicenciaConducir(String numeroLicenciaConducir) {
    this.numeroLicenciaConducir = numeroLicenciaConducir;
    return this;
  }

  /**
   * Get numeroLicenciaConducir
   * @return numeroLicenciaConducir
  */
  
  @Schema(name = "NumeroLicenciaConducir", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroLicenciaConducir")
  public String getNumeroLicenciaConducir() {
    return numeroLicenciaConducir;
  }

  public void setNumeroLicenciaConducir(String numeroLicenciaConducir) {
    this.numeroLicenciaConducir = numeroLicenciaConducir;
  }

  public ConsultaBuroRequestNombre estadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }

  /**
   * Get estadoCivil
   * @return estadoCivil
  */
  
  @Schema(name = "EstadoCivil", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EstadoCivil")
  public String getEstadoCivil() {
    return estadoCivil;
  }

  public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
  }

  public ConsultaBuroRequestNombre sexo(String sexo) {
    this.sexo = sexo;
    return this;
  }

  /**
   * Get sexo
   * @return sexo
  */
  
  @Schema(name = "Sexo", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Sexo")
  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public ConsultaBuroRequestNombre numeroCedulaProfesional(String numeroCedulaProfesional) {
    this.numeroCedulaProfesional = numeroCedulaProfesional;
    return this;
  }

  /**
   * Get numeroCedulaProfesional
   * @return numeroCedulaProfesional
  */
  
  @Schema(name = "NumeroCedulaProfesional", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroCedulaProfesional")
  public String getNumeroCedulaProfesional() {
    return numeroCedulaProfesional;
  }

  public void setNumeroCedulaProfesional(String numeroCedulaProfesional) {
    this.numeroCedulaProfesional = numeroCedulaProfesional;
  }

  public ConsultaBuroRequestNombre numeroRegistroElectoral(String numeroRegistroElectoral) {
    this.numeroRegistroElectoral = numeroRegistroElectoral;
    return this;
  }

  /**
   * Get numeroRegistroElectoral
   * @return numeroRegistroElectoral
  */
  
  @Schema(name = "NumeroRegistroElectoral", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroRegistroElectoral")
  public String getNumeroRegistroElectoral() {
    return numeroRegistroElectoral;
  }

  public void setNumeroRegistroElectoral(String numeroRegistroElectoral) {
    this.numeroRegistroElectoral = numeroRegistroElectoral;
  }

  public ConsultaBuroRequestNombre claveImpuestosOtroPais(String claveImpuestosOtroPais) {
    this.claveImpuestosOtroPais = claveImpuestosOtroPais;
    return this;
  }

  /**
   * Get claveImpuestosOtroPais
   * @return claveImpuestosOtroPais
  */
  
  @Schema(name = "ClaveImpuestosOtroPais", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveImpuestosOtroPais")
  public String getClaveImpuestosOtroPais() {
    return claveImpuestosOtroPais;
  }

  public void setClaveImpuestosOtroPais(String claveImpuestosOtroPais) {
    this.claveImpuestosOtroPais = claveImpuestosOtroPais;
  }

  public ConsultaBuroRequestNombre claveOtroPais(String claveOtroPais) {
    this.claveOtroPais = claveOtroPais;
    return this;
  }

  /**
   * Get claveOtroPais
   * @return claveOtroPais
  */
  
  @Schema(name = "ClaveOtroPais", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveOtroPais")
  public String getClaveOtroPais() {
    return claveOtroPais;
  }

  public void setClaveOtroPais(String claveOtroPais) {
    this.claveOtroPais = claveOtroPais;
  }

  public ConsultaBuroRequestNombre numeroDependientes(String numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }

  /**
   * Get numeroDependientes
   * @return numeroDependientes
  */
  
  @Schema(name = "NumeroDependientes", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroDependientes")
  public String getNumeroDependientes() {
    return numeroDependientes;
  }

  public void setNumeroDependientes(String numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }

  public ConsultaBuroRequestNombre edadesDependientes(String edadesDependientes) {
    this.edadesDependientes = edadesDependientes;
    return this;
  }

  /**
   * Get edadesDependientes
   * @return edadesDependientes
  */
  
  @Schema(name = "EdadesDependientes", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EdadesDependientes")
  public String getEdadesDependientes() {
    return edadesDependientes;
  }

  public void setEdadesDependientes(String edadesDependientes) {
    this.edadesDependientes = edadesDependientes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroRequestNombre consultaBuroRequestNombre = (ConsultaBuroRequestNombre) o;
    return Objects.equals(this.apellidoPaterno, consultaBuroRequestNombre.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, consultaBuroRequestNombre.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, consultaBuroRequestNombre.apellidoAdicional) &&
        Arrays.equals(this.primerNombre, consultaBuroRequestNombre.primerNombre) &&
        Objects.equals(this.segundoNombre, consultaBuroRequestNombre.segundoNombre) &&
        Objects.equals(this.fechaNacimiento, consultaBuroRequestNombre.fechaNacimiento) &&
        Objects.equals(this.RFC, consultaBuroRequestNombre.RFC) &&
        Objects.equals(this.prefijo, consultaBuroRequestNombre.prefijo) &&
        Objects.equals(this.sufijo, consultaBuroRequestNombre.sufijo) &&
        Objects.equals(this.nacionalidad, consultaBuroRequestNombre.nacionalidad) &&
        Objects.equals(this.residencia, consultaBuroRequestNombre.residencia) &&
        Objects.equals(this.numeroLicenciaConducir, consultaBuroRequestNombre.numeroLicenciaConducir) &&
        Objects.equals(this.estadoCivil, consultaBuroRequestNombre.estadoCivil) &&
        Objects.equals(this.sexo, consultaBuroRequestNombre.sexo) &&
        Objects.equals(this.numeroCedulaProfesional, consultaBuroRequestNombre.numeroCedulaProfesional) &&
        Objects.equals(this.numeroRegistroElectoral, consultaBuroRequestNombre.numeroRegistroElectoral) &&
        Objects.equals(this.claveImpuestosOtroPais, consultaBuroRequestNombre.claveImpuestosOtroPais) &&
        Objects.equals(this.claveOtroPais, consultaBuroRequestNombre.claveOtroPais) &&
        Objects.equals(this.numeroDependientes, consultaBuroRequestNombre.numeroDependientes) &&
        Objects.equals(this.edadesDependientes, consultaBuroRequestNombre.edadesDependientes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apellidoPaterno, apellidoMaterno, apellidoAdicional, Arrays.hashCode(primerNombre), segundoNombre, fechaNacimiento, RFC, prefijo, sufijo, nacionalidad, residencia, numeroLicenciaConducir, estadoCivil, sexo, numeroCedulaProfesional, numeroRegistroElectoral, claveImpuestosOtroPais, claveOtroPais, numeroDependientes, edadesDependientes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroRequestNombre {\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
    sb.append("    prefijo: ").append(toIndentedString(prefijo)).append("\n");
    sb.append("    sufijo: ").append(toIndentedString(sufijo)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    numeroLicenciaConducir: ").append(toIndentedString(numeroLicenciaConducir)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    numeroCedulaProfesional: ").append(toIndentedString(numeroCedulaProfesional)).append("\n");
    sb.append("    numeroRegistroElectoral: ").append(toIndentedString(numeroRegistroElectoral)).append("\n");
    sb.append("    claveImpuestosOtroPais: ").append(toIndentedString(claveImpuestosOtroPais)).append("\n");
    sb.append("    claveOtroPais: ").append(toIndentedString(claveOtroPais)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    edadesDependientes: ").append(toIndentedString(edadesDependientes)).append("\n");
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
