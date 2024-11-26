package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseHawkAlertBDHawkAlertBD
 */

@JsonTypeName("ConsultaBuroResponse_HawkAlertBD_HawkAlertBD")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseHawkAlertBDHawkAlertBD {

  private String fechaReporte;

  private String codigoClave;

  private String tipoInstitucion;

  private String mensaje;

  public ConsultaBuroResponseHawkAlertBDHawkAlertBD fechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }

  /**
   * Get fechaReporte
   * @return fechaReporte
  */
  
  @Schema(name = "FechaReporte", example = "13082015", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaReporte")
  public String getFechaReporte() {
    return fechaReporte;
  }

  public void setFechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
  }

  public ConsultaBuroResponseHawkAlertBDHawkAlertBD codigoClave(String codigoClave) {
    this.codigoClave = codigoClave;
    return this;
  }

  /**
   * Get codigoClave
   * @return codigoClave
  */
  
  @Schema(name = "CodigoClave", example = "010", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodigoClave")
  public String getCodigoClave() {
    return codigoClave;
  }

  public void setCodigoClave(String codigoClave) {
    this.codigoClave = codigoClave;
  }

  public ConsultaBuroResponseHawkAlertBDHawkAlertBD tipoInstitucion(String tipoInstitucion) {
    this.tipoInstitucion = tipoInstitucion;
    return this;
  }

  /**
   * Get tipoInstitucion
   * @return tipoInstitucion
  */
  
  @Schema(name = "TipoInstitucion", example = "FINANCIERA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TipoInstitucion")
  public String getTipoInstitucion() {
    return tipoInstitucion;
  }

  public void setTipoInstitucion(String tipoInstitucion) {
    this.tipoInstitucion = tipoInstitucion;
  }

  public ConsultaBuroResponseHawkAlertBDHawkAlertBD mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

  /**
   * Get mensaje
   * @return mensaje
  */
  
  @Schema(name = "Mensaje", example = "DOM. PARTICULAR 3 - COINCIDENCIA POR DOMICILIO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mensaje")
  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseHawkAlertBDHawkAlertBD consultaBuroResponseHawkAlertBDHawkAlertBD = (ConsultaBuroResponseHawkAlertBDHawkAlertBD) o;
    return Objects.equals(this.fechaReporte, consultaBuroResponseHawkAlertBDHawkAlertBD.fechaReporte) &&
        Objects.equals(this.codigoClave, consultaBuroResponseHawkAlertBDHawkAlertBD.codigoClave) &&
        Objects.equals(this.tipoInstitucion, consultaBuroResponseHawkAlertBDHawkAlertBD.tipoInstitucion) &&
        Objects.equals(this.mensaje, consultaBuroResponseHawkAlertBDHawkAlertBD.mensaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaReporte, codigoClave, tipoInstitucion, mensaje);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseHawkAlertBDHawkAlertBD {\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
    sb.append("    codigoClave: ").append(toIndentedString(codigoClave)).append("\n");
    sb.append("    tipoInstitucion: ").append(toIndentedString(tipoInstitucion)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
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
