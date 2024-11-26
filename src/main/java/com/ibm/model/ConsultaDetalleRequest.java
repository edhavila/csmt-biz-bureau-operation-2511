package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaDetalleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaDetalleRequest {

  private ConfiguracionBuroRequest configuracionBuro;

  private ConsultaBuroRequest consultaBuroRequest;

  public ConsultaDetalleRequest configuracionBuro(ConfiguracionBuroRequest configuracionBuro) {
    this.configuracionBuro = configuracionBuro;
    return this;
  }

  /**
   * Get configuracionBuro
   * @return configuracionBuro
  */
  @Valid 
  @Schema(name = "configuracionBuro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuracionBuro")
  public ConfiguracionBuroRequest getConfiguracionBuro() {
    return configuracionBuro;
  }

  public void setConfiguracionBuro(ConfiguracionBuroRequest configuracionBuro) {
    this.configuracionBuro = configuracionBuro;
  }

  public ConsultaDetalleRequest consultaBuroRequest(ConsultaBuroRequest consultaBuroRequest) {
    this.consultaBuroRequest = consultaBuroRequest;
    return this;
  }

  /**
   * Get consultaBuroRequest
   * @return consultaBuroRequest
  */
  @Valid 
  @Schema(name = "consultaBuroRequest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consultaBuroRequest")
  public ConsultaBuroRequest getConsultaBuroRequest() {
    return consultaBuroRequest;
  }

  public void setConsultaBuroRequest(ConsultaBuroRequest consultaBuroRequest) {
    this.consultaBuroRequest = consultaBuroRequest;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaDetalleRequest consultaDetalleRequest = (ConsultaDetalleRequest) o;
    return Objects.equals(this.configuracionBuro, consultaDetalleRequest.configuracionBuro) &&
        Objects.equals(this.consultaBuroRequest, consultaDetalleRequest.consultaBuroRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configuracionBuro, consultaBuroRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalleRequest {\n");
    sb.append("    configuracionBuro: ").append(toIndentedString(configuracionBuro)).append("\n");
    sb.append("    consultaBuroRequest: ").append(toIndentedString(consultaBuroRequest)).append("\n");
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
