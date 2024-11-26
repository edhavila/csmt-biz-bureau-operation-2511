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
 * ConsultaBuroResponseHawkAlertConsulta
 */

@JsonTypeName("ConsultaBuroResponse_HawkAlertConsulta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseHawkAlertConsulta {

  private ConsultaBuroResponseHawkAlertConsultaHawkAlertC hawkAlertC;

  public ConsultaBuroResponseHawkAlertConsulta hawkAlertC(ConsultaBuroResponseHawkAlertConsultaHawkAlertC hawkAlertC) {
    this.hawkAlertC = hawkAlertC;
    return this;
  }

  /**
   * Get hawkAlertC
   * @return hawkAlertC
  */
  @Valid 
  @Schema(name = "HawkAlertC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HawkAlertC")
  public ConsultaBuroResponseHawkAlertConsultaHawkAlertC getHawkAlertC() {
    return hawkAlertC;
  }

  public void setHawkAlertC(ConsultaBuroResponseHawkAlertConsultaHawkAlertC hawkAlertC) {
    this.hawkAlertC = hawkAlertC;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseHawkAlertConsulta consultaBuroResponseHawkAlertConsulta = (ConsultaBuroResponseHawkAlertConsulta) o;
    return Objects.equals(this.hawkAlertC, consultaBuroResponseHawkAlertConsulta.hawkAlertC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hawkAlertC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseHawkAlertConsulta {\n");
    sb.append("    hawkAlertC: ").append(toIndentedString(hawkAlertC)).append("\n");
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
