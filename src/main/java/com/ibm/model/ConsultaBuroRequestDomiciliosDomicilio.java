package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroRequestDomiciliosDomicilio
 */

@JsonTypeName("ConsultaBuroRequest_Domicilios_Domicilio")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroRequestDomiciliosDomicilio {

  private String direccion1;

  private String direccion2;

  private String coloniaPoblacion;

  private String delegacionMunicipio;

  private String ciudad;

  private String estado;

  private String CP;

  private String fechaResidencia;

  private String numeroTelefono;

  private String extension;

  private String fax;

  private String tipoDomicilio;

  private String indicadorEspecialDomicilio;

  private String codPais;

  public ConsultaBuroRequestDomiciliosDomicilio direccion1(String direccion1) {
    this.direccion1 = direccion1;
    return this;
  }

  /**
   * Get direccion1
   * @return direccion1
  */
  
  @Schema(name = "Direccion1", example = "JAIME BALMES 8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Direccion1")
  public String getDireccion1() {
    return direccion1;
  }

  public void setDireccion1(String direccion1) {
    this.direccion1 = direccion1;
  }

  public ConsultaBuroRequestDomiciliosDomicilio direccion2(String direccion2) {
    this.direccion2 = direccion2;
    return this;
  }

  /**
   * Get direccion2
   * @return direccion2
  */
  
  @Schema(name = "Direccion2", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Direccion2")
  public String getDireccion2() {
    return direccion2;
  }

  public void setDireccion2(String direccion2) {
    this.direccion2 = direccion2;
  }

  public ConsultaBuroRequestDomiciliosDomicilio coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }

  /**
   * Get coloniaPoblacion
   * @return coloniaPoblacion
  */
  
  @Schema(name = "ColoniaPoblacion", example = "LOS MORALES POLANCO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ColoniaPoblacion")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }

  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }

  public ConsultaBuroRequestDomiciliosDomicilio delegacionMunicipio(String delegacionMunicipio) {
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

  public ConsultaBuroRequestDomiciliosDomicilio ciudad(String ciudad) {
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

  public ConsultaBuroRequestDomiciliosDomicilio estado(String estado) {
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

  public ConsultaBuroRequestDomiciliosDomicilio CP(String CP) {
    this.CP = CP;
    return this;
  }

  /**
   * Get CP
   * @return CP
  */
  
  @Schema(name = "CP", example = "11510", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CP")
  public String getCP() {
    return CP;
  }

  public void setCP(String CP) {
    this.CP = CP;
  }

  public ConsultaBuroRequestDomiciliosDomicilio fechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
    return this;
  }

  /**
   * Get fechaResidencia
   * @return fechaResidencia
  */
  
  @Schema(name = "FechaResidencia", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaResidencia")
  public String getFechaResidencia() {
    return fechaResidencia;
  }

  public void setFechaResidencia(String fechaResidencia) {
    this.fechaResidencia = fechaResidencia;
  }

  public ConsultaBuroRequestDomiciliosDomicilio numeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
    return this;
  }

  /**
   * Get numeroTelefono
   * @return numeroTelefono
  */
  
  @Schema(name = "NumeroTelefono", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroTelefono")
  public String getNumeroTelefono() {
    return numeroTelefono;
  }

  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }

  public ConsultaBuroRequestDomiciliosDomicilio extension(String extension) {
    this.extension = extension;
    return this;
  }

  /**
   * Get extension
   * @return extension
  */
  
  @Schema(name = "Extension", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public ConsultaBuroRequestDomiciliosDomicilio fax(String fax) {
    this.fax = fax;
    return this;
  }

  /**
   * Get fax
   * @return fax
  */
  
  @Schema(name = "Fax", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Fax")
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public ConsultaBuroRequestDomiciliosDomicilio tipoDomicilio(String tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
    return this;
  }

  /**
   * Get tipoDomicilio
   * @return tipoDomicilio
  */
  
  @Schema(name = "TipoDomicilio", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TipoDomicilio")
  public String getTipoDomicilio() {
    return tipoDomicilio;
  }

  public void setTipoDomicilio(String tipoDomicilio) {
    this.tipoDomicilio = tipoDomicilio;
  }

  public ConsultaBuroRequestDomiciliosDomicilio indicadorEspecialDomicilio(String indicadorEspecialDomicilio) {
    this.indicadorEspecialDomicilio = indicadorEspecialDomicilio;
    return this;
  }

  /**
   * Get indicadorEspecialDomicilio
   * @return indicadorEspecialDomicilio
  */
  
  @Schema(name = "IndicadorEspecialDomicilio", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndicadorEspecialDomicilio")
  public String getIndicadorEspecialDomicilio() {
    return indicadorEspecialDomicilio;
  }

  public void setIndicadorEspecialDomicilio(String indicadorEspecialDomicilio) {
    this.indicadorEspecialDomicilio = indicadorEspecialDomicilio;
  }

  public ConsultaBuroRequestDomiciliosDomicilio codPais(String codPais) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroRequestDomiciliosDomicilio consultaBuroRequestDomiciliosDomicilio = (ConsultaBuroRequestDomiciliosDomicilio) o;
    return Objects.equals(this.direccion1, consultaBuroRequestDomiciliosDomicilio.direccion1) &&
        Objects.equals(this.direccion2, consultaBuroRequestDomiciliosDomicilio.direccion2) &&
        Objects.equals(this.coloniaPoblacion, consultaBuroRequestDomiciliosDomicilio.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, consultaBuroRequestDomiciliosDomicilio.delegacionMunicipio) &&
        Objects.equals(this.ciudad, consultaBuroRequestDomiciliosDomicilio.ciudad) &&
        Objects.equals(this.estado, consultaBuroRequestDomiciliosDomicilio.estado) &&
        Objects.equals(this.CP, consultaBuroRequestDomiciliosDomicilio.CP) &&
        Objects.equals(this.fechaResidencia, consultaBuroRequestDomiciliosDomicilio.fechaResidencia) &&
        Objects.equals(this.numeroTelefono, consultaBuroRequestDomiciliosDomicilio.numeroTelefono) &&
        Objects.equals(this.extension, consultaBuroRequestDomiciliosDomicilio.extension) &&
        Objects.equals(this.fax, consultaBuroRequestDomiciliosDomicilio.fax) &&
        Objects.equals(this.tipoDomicilio, consultaBuroRequestDomiciliosDomicilio.tipoDomicilio) &&
        Objects.equals(this.indicadorEspecialDomicilio, consultaBuroRequestDomiciliosDomicilio.indicadorEspecialDomicilio) &&
        Objects.equals(this.codPais, consultaBuroRequestDomiciliosDomicilio.codPais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direccion1, direccion2, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, fechaResidencia, numeroTelefono, extension, fax, tipoDomicilio, indicadorEspecialDomicilio, codPais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroRequestDomiciliosDomicilio {\n");
    sb.append("    direccion1: ").append(toIndentedString(direccion1)).append("\n");
    sb.append("    direccion2: ").append(toIndentedString(direccion2)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    fechaResidencia: ").append(toIndentedString(fechaResidencia)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    tipoDomicilio: ").append(toIndentedString(tipoDomicilio)).append("\n");
    sb.append("    indicadorEspecialDomicilio: ").append(toIndentedString(indicadorEspecialDomicilio)).append("\n");
    sb.append("    codPais: ").append(toIndentedString(codPais)).append("\n");
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
