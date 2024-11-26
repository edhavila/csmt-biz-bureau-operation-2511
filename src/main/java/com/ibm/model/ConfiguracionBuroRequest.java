package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConfiguracionBuroRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConfiguracionBuroRequest {

  private Boolean forzarConsulta;

  private BigDecimal vigenciaMaxima;

  public ConfiguracionBuroRequest forzarConsulta(Boolean forzarConsulta) {
    this.forzarConsulta = forzarConsulta;
    return this;
  }

  /**
   * Forzar consulta a buró aunque exista una previa vigente
   * @return forzarConsulta
  */
  
  @Schema(name = "forzarConsulta", example = "true", description = "Forzar consulta a buró aunque exista una previa vigente", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forzarConsulta")
  public Boolean getForzarConsulta() {
    return forzarConsulta;
  }

  public void setForzarConsulta(Boolean forzarConsulta) {
    this.forzarConsulta = forzarConsulta;
  }

  public ConfiguracionBuroRequest vigenciaMaxima(BigDecimal vigenciaMaxima) {
    this.vigenciaMaxima = vigenciaMaxima;
    return this;
  }

  /**
   * Vigencia máxima en días
   * @return vigenciaMaxima
  */
  @Valid 
  @Schema(name = "vigenciaMaxima", example = "60", description = "Vigencia máxima en días", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vigenciaMaxima")
  public BigDecimal getVigenciaMaxima() {
    return vigenciaMaxima;
  }

  public void setVigenciaMaxima(BigDecimal vigenciaMaxima) {
    this.vigenciaMaxima = vigenciaMaxima;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfiguracionBuroRequest configuracionBuroRequest = (ConfiguracionBuroRequest) o;
    return Objects.equals(this.forzarConsulta, configuracionBuroRequest.forzarConsulta) &&
        Objects.equals(this.vigenciaMaxima, configuracionBuroRequest.vigenciaMaxima);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forzarConsulta, vigenciaMaxima);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfiguracionBuroRequest {\n");
    sb.append("    forzarConsulta: ").append(toIndentedString(forzarConsulta)).append("\n");
    sb.append("    vigenciaMaxima: ").append(toIndentedString(vigenciaMaxima)).append("\n");
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
