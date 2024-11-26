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
 * ConsultaBuroResponseDomicilios
 */

@JsonTypeName("ConsultaBuroResponse_Domicilios")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseDomicilios {

  private ConsultaBuroResponseDomiciliosDomicilio domicilio;

  public ConsultaBuroResponseDomicilios domicilio(ConsultaBuroResponseDomiciliosDomicilio domicilio) {
    this.domicilio = domicilio;
    return this;
  }

  /**
   * Get domicilio
   * @return domicilio
  */
  @Valid 
  @Schema(name = "Domicilio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Domicilio")
  public ConsultaBuroResponseDomiciliosDomicilio getDomicilio() {
    return domicilio;
  }

  public void setDomicilio(ConsultaBuroResponseDomiciliosDomicilio domicilio) {
    this.domicilio = domicilio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseDomicilios consultaBuroResponseDomicilios = (ConsultaBuroResponseDomicilios) o;
    return Objects.equals(this.domicilio, consultaBuroResponseDomicilios.domicilio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domicilio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseDomicilios {\n");
    sb.append("    domicilio: ").append(toIndentedString(domicilio)).append("\n");
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
