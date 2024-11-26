package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseEncabezado
 */

@JsonTypeName("ConsultaBuroResponse_Encabezado")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseEncabezado {

  private String numeroReferenciaOperador;

  private String clavePais;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate identificadorBuro;

  private String claveOtorgante;

  private String claveRetornoConsumidorPrincipal;

  private String claveRetornoConsumidorSecundario;

  private String numeroControlConsulta;

  public ConsultaBuroResponseEncabezado numeroReferenciaOperador(String numeroReferenciaOperador) {
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

  public ConsultaBuroResponseEncabezado clavePais(String clavePais) {
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

  public ConsultaBuroResponseEncabezado identificadorBuro(LocalDate identificadorBuro) {
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

  public ConsultaBuroResponseEncabezado claveOtorgante(String claveOtorgante) {
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

  public ConsultaBuroResponseEncabezado claveRetornoConsumidorPrincipal(String claveRetornoConsumidorPrincipal) {
    this.claveRetornoConsumidorPrincipal = claveRetornoConsumidorPrincipal;
    return this;
  }

  /**
   * Get claveRetornoConsumidorPrincipal
   * @return claveRetornoConsumidorPrincipal
  */
  
  @Schema(name = "ClaveRetornoConsumidorPrincipal", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveRetornoConsumidorPrincipal")
  public String getClaveRetornoConsumidorPrincipal() {
    return claveRetornoConsumidorPrincipal;
  }

  public void setClaveRetornoConsumidorPrincipal(String claveRetornoConsumidorPrincipal) {
    this.claveRetornoConsumidorPrincipal = claveRetornoConsumidorPrincipal;
  }

  public ConsultaBuroResponseEncabezado claveRetornoConsumidorSecundario(String claveRetornoConsumidorSecundario) {
    this.claveRetornoConsumidorSecundario = claveRetornoConsumidorSecundario;
    return this;
  }

  /**
   * Get claveRetornoConsumidorSecundario
   * @return claveRetornoConsumidorSecundario
  */
  
  @Schema(name = "ClaveRetornoConsumidorSecundario", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveRetornoConsumidorSecundario")
  public String getClaveRetornoConsumidorSecundario() {
    return claveRetornoConsumidorSecundario;
  }

  public void setClaveRetornoConsumidorSecundario(String claveRetornoConsumidorSecundario) {
    this.claveRetornoConsumidorSecundario = claveRetornoConsumidorSecundario;
  }

  public ConsultaBuroResponseEncabezado numeroControlConsulta(String numeroControlConsulta) {
    this.numeroControlConsulta = numeroControlConsulta;
    return this;
  }

  /**
   * Get numeroControlConsulta
   * @return numeroControlConsulta
  */
  
  @Schema(name = "NumeroControlConsulta", example = "1212121212", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroControlConsulta")
  public String getNumeroControlConsulta() {
    return numeroControlConsulta;
  }

  public void setNumeroControlConsulta(String numeroControlConsulta) {
    this.numeroControlConsulta = numeroControlConsulta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseEncabezado consultaBuroResponseEncabezado = (ConsultaBuroResponseEncabezado) o;
    return Objects.equals(this.numeroReferenciaOperador, consultaBuroResponseEncabezado.numeroReferenciaOperador) &&
        Objects.equals(this.clavePais, consultaBuroResponseEncabezado.clavePais) &&
        Objects.equals(this.identificadorBuro, consultaBuroResponseEncabezado.identificadorBuro) &&
        Objects.equals(this.claveOtorgante, consultaBuroResponseEncabezado.claveOtorgante) &&
        Objects.equals(this.claveRetornoConsumidorPrincipal, consultaBuroResponseEncabezado.claveRetornoConsumidorPrincipal) &&
        Objects.equals(this.claveRetornoConsumidorSecundario, consultaBuroResponseEncabezado.claveRetornoConsumidorSecundario) &&
        Objects.equals(this.numeroControlConsulta, consultaBuroResponseEncabezado.numeroControlConsulta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroReferenciaOperador, clavePais, identificadorBuro, claveOtorgante, claveRetornoConsumidorPrincipal, claveRetornoConsumidorSecundario, numeroControlConsulta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseEncabezado {\n");
    sb.append("    numeroReferenciaOperador: ").append(toIndentedString(numeroReferenciaOperador)).append("\n");
    sb.append("    clavePais: ").append(toIndentedString(clavePais)).append("\n");
    sb.append("    identificadorBuro: ").append(toIndentedString(identificadorBuro)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    claveRetornoConsumidorPrincipal: ").append(toIndentedString(claveRetornoConsumidorPrincipal)).append("\n");
    sb.append("    claveRetornoConsumidorSecundario: ").append(toIndentedString(claveRetornoConsumidorSecundario)).append("\n");
    sb.append("    numeroControlConsulta: ").append(toIndentedString(numeroControlConsulta)).append("\n");
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
