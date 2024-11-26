package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Reporte de consultas a buro agrupado por ProductoRequerido, ClaveUsuario
 */

@Schema(name = "ConsultaResumenResponse_inner_Reporte", description = "Reporte de consultas a buro agrupado por ProductoRequerido, ClaveUsuario")
@JsonTypeName("ConsultaResumenResponse_inner_Reporte")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaResumenResponseInnerReporte {

  private String fechaInicio;

  private String fechaFin;

  private String producto;

  private String claveUsuario;

  private String totalConsultas;

  public ConsultaResumenResponseInnerReporte fechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
    return this;
  }

  /**
   * Fecha inicial de la consulta
   * @return fechaInicio
  */
  
  @Schema(name = "FechaInicio", example = "yyyy/mm/dd", description = "Fecha inicial de la consulta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaInicio")
  public String getFechaInicio() {
    return fechaInicio;
  }

  public void setFechaInicio(String fechaInicio) {
    this.fechaInicio = fechaInicio;
  }

  public ConsultaResumenResponseInnerReporte fechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
    return this;
  }

  /**
   * Fecha inicial de la consulta
   * @return fechaFin
  */
  
  @Schema(name = "FechaFin", example = "yyyy/mm/dd", description = "Fecha inicial de la consulta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaFin")
  public String getFechaFin() {
    return fechaFin;
  }

  public void setFechaFin(String fechaFin) {
    this.fechaFin = fechaFin;
  }

  public ConsultaResumenResponseInnerReporte producto(String producto) {
    this.producto = producto;
    return this;
  }

  /**
   * Get producto
   * @return producto
  */
  @Size(max = 3) 
  @Schema(name = "Producto", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Producto")
  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public ConsultaResumenResponseInnerReporte claveUsuario(String claveUsuario) {
    this.claveUsuario = claveUsuario;
    return this;
  }

  /**
   * Get claveUsuario
   * @return claveUsuario
  */
  @Size(max = 3) 
  @Schema(name = "ClaveUsuario", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveUsuario")
  public String getClaveUsuario() {
    return claveUsuario;
  }

  public void setClaveUsuario(String claveUsuario) {
    this.claveUsuario = claveUsuario;
  }

  public ConsultaResumenResponseInnerReporte totalConsultas(String totalConsultas) {
    this.totalConsultas = totalConsultas;
    return this;
  }

  /**
   * Get totalConsultas
   * @return totalConsultas
  */
  @Size(max = 3) 
  @Schema(name = "TotalConsultas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalConsultas")
  public String getTotalConsultas() {
    return totalConsultas;
  }

  public void setTotalConsultas(String totalConsultas) {
    this.totalConsultas = totalConsultas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaResumenResponseInnerReporte consultaResumenResponseInnerReporte = (ConsultaResumenResponseInnerReporte) o;
    return Objects.equals(this.fechaInicio, consultaResumenResponseInnerReporte.fechaInicio) &&
        Objects.equals(this.fechaFin, consultaResumenResponseInnerReporte.fechaFin) &&
        Objects.equals(this.producto, consultaResumenResponseInnerReporte.producto) &&
        Objects.equals(this.claveUsuario, consultaResumenResponseInnerReporte.claveUsuario) &&
        Objects.equals(this.totalConsultas, consultaResumenResponseInnerReporte.totalConsultas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaInicio, fechaFin, producto, claveUsuario, totalConsultas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaResumenResponseInnerReporte {\n");
    sb.append("    fechaInicio: ").append(toIndentedString(fechaInicio)).append("\n");
    sb.append("    fechaFin: ").append(toIndentedString(fechaFin)).append("\n");
    sb.append("    producto: ").append(toIndentedString(producto)).append("\n");
    sb.append("    claveUsuario: ").append(toIndentedString(claveUsuario)).append("\n");
    sb.append("    totalConsultas: ").append(toIndentedString(totalConsultas)).append("\n");
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
