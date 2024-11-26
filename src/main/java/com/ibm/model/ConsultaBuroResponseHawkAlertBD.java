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
 * ConsultaBuroResponseHawkAlertBD
 */

@JsonTypeName("ConsultaBuroResponse_HawkAlertBD")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseHawkAlertBD {

  private ConsultaBuroResponseHawkAlertBDHawkAlertBD hawkAlertBD;

  public ConsultaBuroResponseHawkAlertBD hawkAlertBD(ConsultaBuroResponseHawkAlertBDHawkAlertBD hawkAlertBD) {
    this.hawkAlertBD = hawkAlertBD;
    return this;
  }

  /**
   * Get hawkAlertBD
   * @return hawkAlertBD
  */
  @Valid 
  @Schema(name = "HawkAlertBD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HawkAlertBD")
  public ConsultaBuroResponseHawkAlertBDHawkAlertBD getHawkAlertBD() {
    return hawkAlertBD;
  }

  public void setHawkAlertBD(ConsultaBuroResponseHawkAlertBDHawkAlertBD hawkAlertBD) {
    this.hawkAlertBD = hawkAlertBD;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseHawkAlertBD consultaBuroResponseHawkAlertBD = (ConsultaBuroResponseHawkAlertBD) o;
    return Objects.equals(this.hawkAlertBD, consultaBuroResponseHawkAlertBD.hawkAlertBD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hawkAlertBD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseHawkAlertBD {\n");
    sb.append("    hawkAlertBD: ").append(toIndentedString(hawkAlertBD)).append("\n");
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
