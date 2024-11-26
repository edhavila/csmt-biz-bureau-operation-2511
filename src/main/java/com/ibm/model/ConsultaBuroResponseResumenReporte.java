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
 * ConsultaBuroResponseResumenReporte
 */

@JsonTypeName("ConsultaBuroResponse_ResumenReporte")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseResumenReporte {

  private ConsultaBuroResponseResumenReporteResumenReporte resumenReporte;

  public ConsultaBuroResponseResumenReporte resumenReporte(ConsultaBuroResponseResumenReporteResumenReporte resumenReporte) {
    this.resumenReporte = resumenReporte;
    return this;
  }

  /**
   * Get resumenReporte
   * @return resumenReporte
  */
  @Valid 
  @Schema(name = "ResumenReporte", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResumenReporte")
  public ConsultaBuroResponseResumenReporteResumenReporte getResumenReporte() {
    return resumenReporte;
  }

  public void setResumenReporte(ConsultaBuroResponseResumenReporteResumenReporte resumenReporte) {
    this.resumenReporte = resumenReporte;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseResumenReporte consultaBuroResponseResumenReporte = (ConsultaBuroResponseResumenReporte) o;
    return Objects.equals(this.resumenReporte, consultaBuroResponseResumenReporte.resumenReporte);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resumenReporte);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseResumenReporte {\n");
    sb.append("    resumenReporte: ").append(toIndentedString(resumenReporte)).append("\n");
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
