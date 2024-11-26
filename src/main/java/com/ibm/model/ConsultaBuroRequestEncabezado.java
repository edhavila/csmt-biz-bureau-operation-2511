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
 * ConsultaBuroRequestEncabezado
 */

@JsonTypeName("ConsultaBuroRequest_Encabezado")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroRequestEncabezado {

  private String version;

  private String numeroReferenciaOperador;

  private String productoRequerido;

  private String clavePais;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate identificadorBuro;

  private String claveUsuario;

  private String password;

  private String tipoConsulta;

  private String tipoContrato;

  private String claveUnidadMonetaria;

  private String idioma;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime tipoSalida;

  public ConsultaBuroRequestEncabezado version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "Version", example = "13", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ConsultaBuroRequestEncabezado numeroReferenciaOperador(String numeroReferenciaOperador) {
    this.numeroReferenciaOperador = numeroReferenciaOperador;
    return this;
  }

  /**
   * Get numeroReferenciaOperador
   * @return numeroReferenciaOperador
  */
  
  @Schema(name = "NumeroReferenciaOperador", example = "122000854270 1 7086142637", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroReferenciaOperador")
  public String getNumeroReferenciaOperador() {
    return numeroReferenciaOperador;
  }

  public void setNumeroReferenciaOperador(String numeroReferenciaOperador) {
    this.numeroReferenciaOperador = numeroReferenciaOperador;
  }

  public ConsultaBuroRequestEncabezado productoRequerido(String productoRequerido) {
    this.productoRequerido = productoRequerido;
    return this;
  }

  /**
   * Get productoRequerido
   * @return productoRequerido
  */
  
  @Schema(name = "ProductoRequerido", example = "007", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductoRequerido")
  public String getProductoRequerido() {
    return productoRequerido;
  }

  public void setProductoRequerido(String productoRequerido) {
    this.productoRequerido = productoRequerido;
  }

  public ConsultaBuroRequestEncabezado clavePais(String clavePais) {
    this.clavePais = clavePais;
    return this;
  }

  /**
   * Get clavePais
   * @return clavePais
  */
  
  @Schema(name = "ClavePais", example = "MX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClavePais")
  public String getClavePais() {
    return clavePais;
  }

  public void setClavePais(String clavePais) {
    this.clavePais = clavePais;
  }

  public ConsultaBuroRequestEncabezado identificadorBuro(LocalDate identificadorBuro) {
    this.identificadorBuro = identificadorBuro;
    return this;
  }

  /**
   * Get identificadorBuro
   * @return identificadorBuro
  */
  @Valid 
  @Schema(name = "IdentificadorBuro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IdentificadorBuro")
  public LocalDate getIdentificadorBuro() {
    return identificadorBuro;
  }

  public void setIdentificadorBuro(LocalDate identificadorBuro) {
    this.identificadorBuro = identificadorBuro;
  }

  public ConsultaBuroRequestEncabezado claveUsuario(String claveUsuario) {
    this.claveUsuario = claveUsuario;
    return this;
  }

  /**
   * Get claveUsuario
   * @return claveUsuario
  */
  
  @Schema(name = "ClaveUsuario", example = "XX99999999", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveUsuario")
  public String getClaveUsuario() {
    return claveUsuario;
  }

  public void setClaveUsuario(String claveUsuario) {
    this.claveUsuario = claveUsuario;
  }

  public ConsultaBuroRequestEncabezado password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "Password", example = "1ABCDefg", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ConsultaBuroRequestEncabezado tipoConsulta(String tipoConsulta) {
    this.tipoConsulta = tipoConsulta;
    return this;
  }

  /**
   * Get tipoConsulta
   * @return tipoConsulta
  */
  
  @Schema(name = "TipoConsulta", example = "I", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TipoConsulta")
  public String getTipoConsulta() {
    return tipoConsulta;
  }

  public void setTipoConsulta(String tipoConsulta) {
    this.tipoConsulta = tipoConsulta;
  }

  public ConsultaBuroRequestEncabezado tipoContrato(String tipoContrato) {
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

  public ConsultaBuroRequestEncabezado claveUnidadMonetaria(String claveUnidadMonetaria) {
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

  public ConsultaBuroRequestEncabezado idioma(String idioma) {
    this.idioma = idioma;
    return this;
  }

  /**
   * Get idioma
   * @return idioma
  */
  
  @Schema(name = "Idioma", example = "ES", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Idioma")
  public String getIdioma() {
    return idioma;
  }

  public void setIdioma(String idioma) {
    this.idioma = idioma;
  }

  public ConsultaBuroRequestEncabezado tipoSalida(DateTime tipoSalida) {
    this.tipoSalida = tipoSalida;
    return this;
  }

  /**
   * Get tipoSalida
   * @return tipoSalida
  */
  @Valid 
  @Schema(name = "TipoSalida", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TipoSalida")
  public DateTime getTipoSalida() {
    return tipoSalida;
  }

  public void setTipoSalida(DateTime tipoSalida) {
    this.tipoSalida = tipoSalida;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroRequestEncabezado consultaBuroRequestEncabezado = (ConsultaBuroRequestEncabezado) o;
    return Objects.equals(this.version, consultaBuroRequestEncabezado.version) &&
        Objects.equals(this.numeroReferenciaOperador, consultaBuroRequestEncabezado.numeroReferenciaOperador) &&
        Objects.equals(this.productoRequerido, consultaBuroRequestEncabezado.productoRequerido) &&
        Objects.equals(this.clavePais, consultaBuroRequestEncabezado.clavePais) &&
        Objects.equals(this.identificadorBuro, consultaBuroRequestEncabezado.identificadorBuro) &&
        Objects.equals(this.claveUsuario, consultaBuroRequestEncabezado.claveUsuario) &&
        Objects.equals(this.password, consultaBuroRequestEncabezado.password) &&
        Objects.equals(this.tipoConsulta, consultaBuroRequestEncabezado.tipoConsulta) &&
        Objects.equals(this.tipoContrato, consultaBuroRequestEncabezado.tipoContrato) &&
        Objects.equals(this.claveUnidadMonetaria, consultaBuroRequestEncabezado.claveUnidadMonetaria) &&
        Objects.equals(this.idioma, consultaBuroRequestEncabezado.idioma) &&
        Objects.equals(this.tipoSalida, consultaBuroRequestEncabezado.tipoSalida);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, numeroReferenciaOperador, productoRequerido, clavePais, identificadorBuro, claveUsuario, password, tipoConsulta, tipoContrato, claveUnidadMonetaria, idioma, tipoSalida);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroRequestEncabezado {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    numeroReferenciaOperador: ").append(toIndentedString(numeroReferenciaOperador)).append("\n");
    sb.append("    productoRequerido: ").append(toIndentedString(productoRequerido)).append("\n");
    sb.append("    clavePais: ").append(toIndentedString(clavePais)).append("\n");
    sb.append("    identificadorBuro: ").append(toIndentedString(identificadorBuro)).append("\n");
    sb.append("    claveUsuario: ").append(toIndentedString(claveUsuario)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tipoConsulta: ").append(toIndentedString(tipoConsulta)).append("\n");
    sb.append("    tipoContrato: ").append(toIndentedString(tipoContrato)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    idioma: ").append(toIndentedString(idioma)).append("\n");
    sb.append("    tipoSalida: ").append(toIndentedString(tipoSalida)).append("\n");
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
