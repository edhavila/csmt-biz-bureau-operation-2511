package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseDeclaracionesCliente
 */

@JsonTypeName("ConsultaBuroResponse_DeclaracionesCliente")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseDeclaracionesCliente {

  private String declaracionConsumidor;

  public ConsultaBuroResponseDeclaracionesCliente declaracionConsumidor(String declaracionConsumidor) {
    this.declaracionConsumidor = declaracionConsumidor;
    return this;
  }

  /**
   * Get declaracionConsumidor
   * @return declaracionConsumidor
  */
  
  @Schema(name = "DeclaracionConsumidor", example = "DECLARATIVA GENERAL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeclaracionConsumidor")
  public String getDeclaracionConsumidor() {
    return declaracionConsumidor;
  }

  public void setDeclaracionConsumidor(String declaracionConsumidor) {
    this.declaracionConsumidor = declaracionConsumidor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseDeclaracionesCliente consultaBuroResponseDeclaracionesCliente = (ConsultaBuroResponseDeclaracionesCliente) o;
    return Objects.equals(this.declaracionConsumidor, consultaBuroResponseDeclaracionesCliente.declaracionConsumidor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(declaracionConsumidor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseDeclaracionesCliente {\n");
    sb.append("    declaracionConsumidor: ").append(toIndentedString(declaracionConsumidor)).append("\n");
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
