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
 * ConsultaBuroRequestEmpleos
 */

@JsonTypeName("ConsultaBuroRequest_Empleos")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroRequestEmpleos {

  private ConsultaBuroRequestEmpleosEmpleo empleo;

  public ConsultaBuroRequestEmpleos empleo(ConsultaBuroRequestEmpleosEmpleo empleo) {
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
  public ConsultaBuroRequestEmpleosEmpleo getEmpleo() {
    return empleo;
  }

  public void setEmpleo(ConsultaBuroRequestEmpleosEmpleo empleo) {
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
    ConsultaBuroRequestEmpleos consultaBuroRequestEmpleos = (ConsultaBuroRequestEmpleos) o;
    return Objects.equals(this.empleo, consultaBuroRequestEmpleos.empleo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empleo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroRequestEmpleos {\n");
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
