package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaDetalleResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaDetalleResponse {

  private ConsultaBuroResponse consultaBuroResponse;

  public ConsultaDetalleResponse consultaBuroResponse(ConsultaBuroResponse consultaBuroResponse) {
    this.consultaBuroResponse = consultaBuroResponse;
    return this;
  }

  /**
   * Get consultaBuroResponse
   * @return consultaBuroResponse
  */
  @Valid 
  @Schema(name = "consultaBuroResponse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("consultaBuroResponse")
  public ConsultaBuroResponse getConsultaBuroResponse() {
    return consultaBuroResponse;
  }

  public void setConsultaBuroResponse(ConsultaBuroResponse consultaBuroResponse) {
    this.consultaBuroResponse = consultaBuroResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaDetalleResponse consultaDetalleResponse = (ConsultaDetalleResponse) o;
    return Objects.equals(this.consultaBuroResponse, consultaDetalleResponse.consultaBuroResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consultaBuroResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaDetalleResponse {\n");
    sb.append("    consultaBuroResponse: ").append(toIndentedString(consultaBuroResponse)).append("\n");
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
