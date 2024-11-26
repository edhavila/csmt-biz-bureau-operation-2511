package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaResumenResponseInnerDetalleInner
 */

@JsonTypeName("ConsultaResumenResponse_inner_Detalle_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaResumenResponseInnerDetalleInner {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate fecha;

  private String producto;

  private String claveUsuario;

  private String folioBuro;

  private String identificadorBuro;

  @Valid
  private List<@Valid ConsultaResumenResponseInnerDetalleInnerScoreBuroCreditoInner> scoreBuroCredito;

  public ConsultaResumenResponseInnerDetalleInner fecha(LocalDate fecha) {
    this.fecha = fecha;
    return this;
  }

  /**
   * Get fecha
   * @return fecha
  */
  @Valid 
  @Schema(name = "Fecha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Fecha")
  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public ConsultaResumenResponseInnerDetalleInner producto(String producto) {
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

  public ConsultaResumenResponseInnerDetalleInner claveUsuario(String claveUsuario) {
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

  public ConsultaResumenResponseInnerDetalleInner folioBuro(String folioBuro) {
    this.folioBuro = folioBuro;
    return this;
  }

  /**
   * Get folioBuro
   * @return folioBuro
  */
  @Size(max = 10) 
  @Schema(name = "FolioBuro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FolioBuro")
  public String getFolioBuro() {
    return folioBuro;
  }

  public void setFolioBuro(String folioBuro) {
    this.folioBuro = folioBuro;
  }

  public ConsultaResumenResponseInnerDetalleInner identificadorBuro(String identificadorBuro) {
    this.identificadorBuro = identificadorBuro;
    return this;
  }

  /**
   * Get identificadorBuro
   * @return identificadorBuro
  */
  @Size(max = 99) 
  @Schema(name = "IdentificadorBuro", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IdentificadorBuro")
  public String getIdentificadorBuro() {
    return identificadorBuro;
  }

  public void setIdentificadorBuro(String identificadorBuro) {
    this.identificadorBuro = identificadorBuro;
  }

  public ConsultaResumenResponseInnerDetalleInner scoreBuroCredito(List<@Valid ConsultaResumenResponseInnerDetalleInnerScoreBuroCreditoInner> scoreBuroCredito) {
    this.scoreBuroCredito = scoreBuroCredito;
    return this;
  }

  public ConsultaResumenResponseInnerDetalleInner addScoreBuroCreditoItem(ConsultaResumenResponseInnerDetalleInnerScoreBuroCreditoInner scoreBuroCreditoItem) {
    if (this.scoreBuroCredito == null) {
      this.scoreBuroCredito = new ArrayList<>();
    }
    this.scoreBuroCredito.add(scoreBuroCreditoItem);
    return this;
  }

  /**
   * Detalle Score
   * @return scoreBuroCredito
  */
  @Valid 
  @Schema(name = "ScoreBuroCredito", description = "Detalle Score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ScoreBuroCredito")
  public List<@Valid ConsultaResumenResponseInnerDetalleInnerScoreBuroCreditoInner> getScoreBuroCredito() {
    return scoreBuroCredito;
  }

  public void setScoreBuroCredito(List<@Valid ConsultaResumenResponseInnerDetalleInnerScoreBuroCreditoInner> scoreBuroCredito) {
    this.scoreBuroCredito = scoreBuroCredito;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaResumenResponseInnerDetalleInner consultaResumenResponseInnerDetalleInner = (ConsultaResumenResponseInnerDetalleInner) o;
    return Objects.equals(this.fecha, consultaResumenResponseInnerDetalleInner.fecha) &&
        Objects.equals(this.producto, consultaResumenResponseInnerDetalleInner.producto) &&
        Objects.equals(this.claveUsuario, consultaResumenResponseInnerDetalleInner.claveUsuario) &&
        Objects.equals(this.folioBuro, consultaResumenResponseInnerDetalleInner.folioBuro) &&
        Objects.equals(this.identificadorBuro, consultaResumenResponseInnerDetalleInner.identificadorBuro) &&
        Objects.equals(this.scoreBuroCredito, consultaResumenResponseInnerDetalleInner.scoreBuroCredito);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fecha, producto, claveUsuario, folioBuro, identificadorBuro, scoreBuroCredito);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaResumenResponseInnerDetalleInner {\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    producto: ").append(toIndentedString(producto)).append("\n");
    sb.append("    claveUsuario: ").append(toIndentedString(claveUsuario)).append("\n");
    sb.append("    folioBuro: ").append(toIndentedString(folioBuro)).append("\n");
    sb.append("    identificadorBuro: ").append(toIndentedString(identificadorBuro)).append("\n");
    sb.append("    scoreBuroCredito: ").append(toIndentedString(scoreBuroCredito)).append("\n");
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
