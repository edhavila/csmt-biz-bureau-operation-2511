package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaResumenResponseInner
 */

@JsonTypeName("ConsultaResumenResponse_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaResumenResponseInner {

  private ConsultaResumenResponseInnerReporte reporte;

  @Valid
  private List<@Valid ConsultaResumenResponseInnerDetalleInner> detalle;

  public ConsultaResumenResponseInner reporte(ConsultaResumenResponseInnerReporte reporte) {
    this.reporte = reporte;
    return this;
  }

  /**
   * Get reporte
   * @return reporte
  */
  @Valid 
  @Schema(name = "Reporte", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reporte")
  public ConsultaResumenResponseInnerReporte getReporte() {
    return reporte;
  }

  public void setReporte(ConsultaResumenResponseInnerReporte reporte) {
    this.reporte = reporte;
  }

  public ConsultaResumenResponseInner detalle(List<@Valid ConsultaResumenResponseInnerDetalleInner> detalle) {
    this.detalle = detalle;
    return this;
  }

  public ConsultaResumenResponseInner addDetalleItem(ConsultaResumenResponseInnerDetalleInner detalleItem) {
    if (this.detalle == null) {
      this.detalle = new ArrayList<>();
    }
    this.detalle.add(detalleItem);
    return this;
  }

  /**
   * Detalle de cada consulta que conforma el reporte
   * @return detalle
  */
  @Valid 
  @Schema(name = "Detalle", description = "Detalle de cada consulta que conforma el reporte", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Detalle")
  public List<@Valid ConsultaResumenResponseInnerDetalleInner> getDetalle() {
    return detalle;
  }

  public void setDetalle(List<@Valid ConsultaResumenResponseInnerDetalleInner> detalle) {
    this.detalle = detalle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaResumenResponseInner consultaResumenResponseInner = (ConsultaResumenResponseInner) o;
    return Objects.equals(this.reporte, consultaResumenResponseInner.reporte) &&
        Objects.equals(this.detalle, consultaResumenResponseInner.detalle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reporte, detalle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaResumenResponseInner {\n");
    sb.append("    reporte: ").append(toIndentedString(reporte)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
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
