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
 * ConsultaBuroResponseScoreBuroCredito
 */

@JsonTypeName("ConsultaBuroResponse_ScoreBuroCredito")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseScoreBuroCredito {

  private ConsultaBuroResponseScoreBuroCreditoScoreBC scoreBC;

  public ConsultaBuroResponseScoreBuroCredito scoreBC(ConsultaBuroResponseScoreBuroCreditoScoreBC scoreBC) {
    this.scoreBC = scoreBC;
    return this;
  }

  /**
   * Get scoreBC
   * @return scoreBC
  */
  @Valid 
  @Schema(name = "ScoreBC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ScoreBC")
  public ConsultaBuroResponseScoreBuroCreditoScoreBC getScoreBC() {
    return scoreBC;
  }

  public void setScoreBC(ConsultaBuroResponseScoreBuroCreditoScoreBC scoreBC) {
    this.scoreBC = scoreBC;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseScoreBuroCredito consultaBuroResponseScoreBuroCredito = (ConsultaBuroResponseScoreBuroCredito) o;
    return Objects.equals(this.scoreBC, consultaBuroResponseScoreBuroCredito.scoreBC);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scoreBC);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseScoreBuroCredito {\n");
    sb.append("    scoreBC: ").append(toIndentedString(scoreBC)).append("\n");
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
