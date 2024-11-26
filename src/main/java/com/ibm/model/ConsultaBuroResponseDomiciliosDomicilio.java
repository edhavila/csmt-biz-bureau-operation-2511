package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseDomiciliosDomicilio
 */

@JsonTypeName("ConsultaBuroResponse_Domicilios_Domicilio")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseDomiciliosDomicilio {

  private String direccion1;

  private String delegacionMunicipio;

  private String ciudad;

  private String estado;

  private String CP;

  private String codPais;

  private String fechaReporteDireccion;

  public ConsultaBuroResponseDomiciliosDomicilio direccion1(String direccion1) {
    this.direccion1 = direccion1;
    return this;
  }

  /**
   * Get direccion1
   * @return direccion1
  */
  
  @Schema(name = "Direccion1", example = "INSUR SUR 1007", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Direccion1")
  public String getDireccion1() {
    return direccion1;
  }

  public void setDireccion1(String direccion1) {
    this.direccion1 = direccion1;
  }

  public ConsultaBuroResponseDomiciliosDomicilio delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }

  /**
   * Get delegacionMunicipio
   * @return delegacionMunicipio
  */
  
  @Schema(name = "DelegacionMunicipio", example = "MIGUEL HIDALGO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DelegacionMunicipio")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }

  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }

  public ConsultaBuroResponseDomiciliosDomicilio ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

  /**
   * Get ciudad
   * @return ciudad
  */
  
  @Schema(name = "Ciudad", example = "CD DE MEXICO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ciudad")
  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public ConsultaBuroResponseDomiciliosDomicilio estado(String estado) {
    this.estado = estado;
    return this;
  }

  /**
   * Get estado
   * @return estado
  */
  
  @Schema(name = "Estado", example = "DF", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Estado")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public ConsultaBuroResponseDomiciliosDomicilio CP(String CP) {
    this.CP = CP;
    return this;
  }

  /**
   * Get CP
   * @return CP
  */
  
  @Schema(name = "CP", example = "11230", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CP")
  public String getCP() {
    return CP;
  }

  public void setCP(String CP) {
    this.CP = CP;
  }

  public ConsultaBuroResponseDomiciliosDomicilio codPais(String codPais) {
    this.codPais = codPais;
    return this;
  }

  /**
   * Get codPais
   * @return codPais
  */
  
  @Schema(name = "CodPais", example = "MX", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodPais")
  public String getCodPais() {
    return codPais;
  }

  public void setCodPais(String codPais) {
    this.codPais = codPais;
  }

  public ConsultaBuroResponseDomiciliosDomicilio fechaReporteDireccion(String fechaReporteDireccion) {
    this.fechaReporteDireccion = fechaReporteDireccion;
    return this;
  }

  /**
   * Get fechaReporteDireccion
   * @return fechaReporteDireccion
  */
  
  @Schema(name = "FechaReporteDireccion", example = "04032016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaReporteDireccion")
  public String getFechaReporteDireccion() {
    return fechaReporteDireccion;
  }

  public void setFechaReporteDireccion(String fechaReporteDireccion) {
    this.fechaReporteDireccion = fechaReporteDireccion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseDomiciliosDomicilio consultaBuroResponseDomiciliosDomicilio = (ConsultaBuroResponseDomiciliosDomicilio) o;
    return Objects.equals(this.direccion1, consultaBuroResponseDomiciliosDomicilio.direccion1) &&
        Objects.equals(this.delegacionMunicipio, consultaBuroResponseDomiciliosDomicilio.delegacionMunicipio) &&
        Objects.equals(this.ciudad, consultaBuroResponseDomiciliosDomicilio.ciudad) &&
        Objects.equals(this.estado, consultaBuroResponseDomiciliosDomicilio.estado) &&
        Objects.equals(this.CP, consultaBuroResponseDomiciliosDomicilio.CP) &&
        Objects.equals(this.codPais, consultaBuroResponseDomiciliosDomicilio.codPais) &&
        Objects.equals(this.fechaReporteDireccion, consultaBuroResponseDomiciliosDomicilio.fechaReporteDireccion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direccion1, delegacionMunicipio, ciudad, estado, CP, codPais, fechaReporteDireccion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseDomiciliosDomicilio {\n");
    sb.append("    direccion1: ").append(toIndentedString(direccion1)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    codPais: ").append(toIndentedString(codPais)).append("\n");
    sb.append("    fechaReporteDireccion: ").append(toIndentedString(fechaReporteDireccion)).append("\n");
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
