package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaScoreResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaScoreResponse {

  private Boolean aprobado;

  private BigDecimal score;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private DateTime fechaConsulta;

  public ConsultaScoreResponse aprobado(Boolean aprobado) {
    this.aprobado = aprobado;
    return this;
  }

  /**
   * Estatus de la consulta al score
   * @return aprobado
  */
  
  @Schema(name = "aprobado", example = "true", description = "Estatus de la consulta al score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aprobado")
  public Boolean getAprobado() {
    return aprobado;
  }

  public void setAprobado(Boolean aprobado) {
    this.aprobado = aprobado;
  }

  public ConsultaScoreResponse score(BigDecimal score) {
    this.score = score;
    return this;
  }

  /**
   * Score obtendio del buró
   * @return score
  */
  @Valid 
  @Schema(name = "score", example = "600", description = "Score obtendio del buró", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public ConsultaScoreResponse fechaConsulta(DateTime fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }

  /**
   * Fecha de la consulta al score
   * @return fechaConsulta
  */
  @Valid 
  @Schema(name = "fechaConsulta", example = "2012-04-23T18:25:43.511Z", description = "Fecha de la consulta al score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fechaConsulta")
  public DateTime getFechaConsulta() {
    return fechaConsulta;
  }

  public void setFechaConsulta(DateTime fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaScoreResponse consultaScoreResponse = (ConsultaScoreResponse) o;
    return Objects.equals(this.aprobado, consultaScoreResponse.aprobado) &&
        Objects.equals(this.score, consultaScoreResponse.score) &&
        Objects.equals(this.fechaConsulta, consultaScoreResponse.fechaConsulta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aprobado, score, fechaConsulta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaScoreResponse {\n");
    sb.append("    aprobado: ").append(toIndentedString(aprobado)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
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
