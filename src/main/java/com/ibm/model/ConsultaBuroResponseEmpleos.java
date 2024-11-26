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
 * ConsultaBuroResponseEmpleos
 */

@JsonTypeName("ConsultaBuroResponse_Empleos")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseEmpleos {

  private ConsultaBuroResponseEmpleosEmpleo empleo;

  public ConsultaBuroResponseEmpleos empleo(ConsultaBuroResponseEmpleosEmpleo empleo) {
    this.empleo = empleo;
    return this;
  }

  /**
   * Get empleo
   * @return empleo
  */
  @Valid 
  @Schema(name = "Empleo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Empleo")
  public ConsultaBuroResponseEmpleosEmpleo getEmpleo() {
    return empleo;
  }

  public void setEmpleo(ConsultaBuroResponseEmpleosEmpleo empleo) {
    this.empleo = empleo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseEmpleos consultaBuroResponseEmpleos = (ConsultaBuroResponseEmpleos) o;
    return Objects.equals(this.empleo, consultaBuroResponseEmpleos.empleo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empleo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseEmpleos {\n");
    sb.append("    empleo: ").append(toIndentedString(empleo)).append("\n");
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
