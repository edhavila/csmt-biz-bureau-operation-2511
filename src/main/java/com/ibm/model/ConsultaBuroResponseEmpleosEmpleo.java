package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseEmpleosEmpleo
 */

@JsonTypeName("ConsultaBuroResponse_Empleos_Empleo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseEmpleosEmpleo {

  private String nombreEmpresa;

  private String direccion1;

  private String codPais;

  private String fechaReportoEmpleo;

  private String fechaVerificacion;

  private String modoVerificacion;

  public ConsultaBuroResponseEmpleosEmpleo nombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
    return this;
  }

  /**
   * Get nombreEmpresa
   * @return nombreEmpresa
  */
  
  @Schema(name = "NombreEmpresa", example = "JUBILADO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NombreEmpresa")
  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public ConsultaBuroResponseEmpleosEmpleo direccion1(String direccion1) {
    this.direccion1 = direccion1;
    return this;
  }

  /**
   * Get direccion1
   * @return direccion1
  */
  
  @Schema(name = "Direccion1", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Direccion1")
  public String getDireccion1() {
    return direccion1;
  }

  public void setDireccion1(String direccion1) {
    this.direccion1 = direccion1;
  }

  public ConsultaBuroResponseEmpleosEmpleo codPais(String codPais) {
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

  public ConsultaBuroResponseEmpleosEmpleo fechaReportoEmpleo(String fechaReportoEmpleo) {
    this.fechaReportoEmpleo = fechaReportoEmpleo;
    return this;
  }

  /**
   * Get fechaReportoEmpleo
   * @return fechaReportoEmpleo
  */
  
  @Schema(name = "FechaReportoEmpleo", example = "14032016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaReportoEmpleo")
  public String getFechaReportoEmpleo() {
    return fechaReportoEmpleo;
  }

  public void setFechaReportoEmpleo(String fechaReportoEmpleo) {
    this.fechaReportoEmpleo = fechaReportoEmpleo;
  }

  public ConsultaBuroResponseEmpleosEmpleo fechaVerificacion(String fechaVerificacion) {
    this.fechaVerificacion = fechaVerificacion;
    return this;
  }

  /**
   * Get fechaVerificacion
   * @return fechaVerificacion
  */
  
  @Schema(name = "FechaVerificacion", example = "14032016", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaVerificacion")
  public String getFechaVerificacion() {
    return fechaVerificacion;
  }

  public void setFechaVerificacion(String fechaVerificacion) {
    this.fechaVerificacion = fechaVerificacion;
  }

  public ConsultaBuroResponseEmpleosEmpleo modoVerificacion(String modoVerificacion) {
    this.modoVerificacion = modoVerificacion;
    return this;
  }

  /**
   * Get modoVerificacion
   * @return modoVerificacion
  */
  
  @Schema(name = "ModoVerificacion", example = "M", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ModoVerificacion")
  public String getModoVerificacion() {
    return modoVerificacion;
  }

  public void setModoVerificacion(String modoVerificacion) {
    this.modoVerificacion = modoVerificacion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseEmpleosEmpleo consultaBuroResponseEmpleosEmpleo = (ConsultaBuroResponseEmpleosEmpleo) o;
    return Objects.equals(this.nombreEmpresa, consultaBuroResponseEmpleosEmpleo.nombreEmpresa) &&
        Objects.equals(this.direccion1, consultaBuroResponseEmpleosEmpleo.direccion1) &&
        Objects.equals(this.codPais, consultaBuroResponseEmpleosEmpleo.codPais) &&
        Objects.equals(this.fechaReportoEmpleo, consultaBuroResponseEmpleosEmpleo.fechaReportoEmpleo) &&
        Objects.equals(this.fechaVerificacion, consultaBuroResponseEmpleosEmpleo.fechaVerificacion) &&
        Objects.equals(this.modoVerificacion, consultaBuroResponseEmpleosEmpleo.modoVerificacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreEmpresa, direccion1, codPais, fechaReportoEmpleo, fechaVerificacion, modoVerificacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseEmpleosEmpleo {\n");
    sb.append("    nombreEmpresa: ").append(toIndentedString(nombreEmpresa)).append("\n");
    sb.append("    direccion1: ").append(toIndentedString(direccion1)).append("\n");
    sb.append("    codPais: ").append(toIndentedString(codPais)).append("\n");
    sb.append("    fechaReportoEmpleo: ").append(toIndentedString(fechaReportoEmpleo)).append("\n");
    sb.append("    fechaVerificacion: ").append(toIndentedString(fechaVerificacion)).append("\n");
    sb.append("    modoVerificacion: ").append(toIndentedString(modoVerificacion)).append("\n");
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
