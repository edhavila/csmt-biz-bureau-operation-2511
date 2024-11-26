package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseScoreBuroCreditoScoreBC
 */

@JsonTypeName("ConsultaBuroResponse_ScoreBuroCredito_ScoreBC")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseScoreBuroCreditoScoreBC {

  private String nombreScore;

  private String codigoScore;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate valorScore;

  private String codigoRazon;

  public ConsultaBuroResponseScoreBuroCreditoScoreBC nombreScore(String nombreScore) {
    this.nombreScore = nombreScore;
    return this;
  }

  /**
   * Get nombreScore
   * @return nombreScore
  */
  
  @Schema(name = "nombreScore", example = "BC SCORE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nombreScore")
  public String getNombreScore() {
    return nombreScore;
  }

  public void setNombreScore(String nombreScore) {
    this.nombreScore = nombreScore;
  }

  public ConsultaBuroResponseScoreBuroCreditoScoreBC codigoScore(String codigoScore) {
    this.codigoScore = codigoScore;
    return this;
  }

  /**
   * Get codigoScore
   * @return codigoScore
  */
  
  @Schema(name = "CodigoScore", example = "007", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodigoScore")
  public String getCodigoScore() {
    return codigoScore;
  }

  public void setCodigoScore(String codigoScore) {
    this.codigoScore = codigoScore;
  }

  public ConsultaBuroResponseScoreBuroCreditoScoreBC valorScore(LocalDate valorScore) {
    this.valorScore = valorScore;
    return this;
  }

  /**
   * Get valorScore
   * @return valorScore
  */
  @Valid 
  @Schema(name = "ValorScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ValorScore")
  public LocalDate getValorScore() {
    return valorScore;
  }

  public void setValorScore(LocalDate valorScore) {
    this.valorScore = valorScore;
  }

  public ConsultaBuroResponseScoreBuroCreditoScoreBC codigoRazon(String codigoRazon) {
    this.codigoRazon = codigoRazon;
    return this;
  }

  /**
   * Get codigoRazon
   * @return codigoRazon
  */
  
  @Schema(name = "CodigoRazon", example = "13", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodigoRazon")
  public String getCodigoRazon() {
    return codigoRazon;
  }

  public void setCodigoRazon(String codigoRazon) {
    this.codigoRazon = codigoRazon;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseScoreBuroCreditoScoreBC consultaBuroResponseScoreBuroCreditoScoreBC = (ConsultaBuroResponseScoreBuroCreditoScoreBC) o;
    return Objects.equals(this.nombreScore, consultaBuroResponseScoreBuroCreditoScoreBC.nombreScore) &&
        Objects.equals(this.codigoScore, consultaBuroResponseScoreBuroCreditoScoreBC.codigoScore) &&
        Objects.equals(this.valorScore, consultaBuroResponseScoreBuroCreditoScoreBC.valorScore) &&
        Objects.equals(this.codigoRazon, consultaBuroResponseScoreBuroCreditoScoreBC.codigoRazon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreScore, codigoScore, valorScore, codigoRazon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseScoreBuroCreditoScoreBC {\n");
    sb.append("    nombreScore: ").append(toIndentedString(nombreScore)).append("\n");
    sb.append("    codigoScore: ").append(toIndentedString(codigoScore)).append("\n");
    sb.append("    valorScore: ").append(toIndentedString(valorScore)).append("\n");
    sb.append("    codigoRazon: ").append(toIndentedString(codigoRazon)).append("\n");
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
