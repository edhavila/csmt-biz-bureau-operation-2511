package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroRequestEmpleosEmpleo
 */

@JsonTypeName("ConsultaBuroRequest_Empleos_Empleo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroRequestEmpleosEmpleo {

  private String nombreEmpresa;

  private String direccion1;

  private String direccion2;

  private String coloniaPoblacion;

  private String delegacionMunicipio;

  private String ciudad;

  private String estado;

  private String CP;

  private String numeroTelefono;

  private String extension;

  private String fax;

  private String cargo;

  private String fechaContratacion;

  private String claveMonedaSalario;

  private String salario;

  private String baseSalarial;

  private String numeroEmpleado;

  private String fechaUltimoDiaEmpleo;

  private String codPais;

  public ConsultaBuroRequestEmpleosEmpleo nombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
    return this;
  }

  /**
   * Get nombreEmpresa
   * @return nombreEmpresa
  */
  
  @Schema(name = "NombreEmpresa", example = "DELEGACION BENITO JUAREZ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NombreEmpresa")
  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public ConsultaBuroRequestEmpleosEmpleo direccion1(String direccion1) {
    this.direccion1 = direccion1;
    return this;
  }

  /**
   * Get direccion1
   * @return direccion1
  */
  
  @Schema(name = "Direccion1", example = "AVENIDA DIVISION DEL NORTE 1611", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Direccion1")
  public String getDireccion1() {
    return direccion1;
  }

  public void setDireccion1(String direccion1) {
    this.direccion1 = direccion1;
  }

  public ConsultaBuroRequestEmpleosEmpleo direccion2(String direccion2) {
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

  public ConsultaBuroRequestEmpleosEmpleo coloniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
    return this;
  }

  /**
   * Get coloniaPoblacion
   * @return coloniaPoblacion
  */
  
  @Schema(name = "ColoniaPoblacion", example = "SANTA CRUZ ATOYAC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ColoniaPoblacion")
  public String getColoniaPoblacion() {
    return coloniaPoblacion;
  }

  public void setColoniaPoblacion(String coloniaPoblacion) {
    this.coloniaPoblacion = coloniaPoblacion;
  }

  public ConsultaBuroRequestEmpleosEmpleo delegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
    return this;
  }

  /**
   * Get delegacionMunicipio
   * @return delegacionMunicipio
  */
  
  @Schema(name = "DelegacionMunicipio", example = "BENITO JUAREZ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DelegacionMunicipio")
  public String getDelegacionMunicipio() {
    return delegacionMunicipio;
  }

  public void setDelegacionMunicipio(String delegacionMunicipio) {
    this.delegacionMunicipio = delegacionMunicipio;
  }

  public ConsultaBuroRequestEmpleosEmpleo ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }

  /**
   * Get ciudad
   * @return ciudad
  */
  
  @Schema(name = "Ciudad", example = "CIUDAD DE MEXICO", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Ciudad")
  public String getCiudad() {
    return ciudad;
  }

  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }

  public ConsultaBuroRequestEmpleosEmpleo estado(String estado) {
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

  public ConsultaBuroRequestEmpleosEmpleo CP(String CP) {
    this.CP = CP;
    return this;
  }

  /**
   * Get CP
   * @return CP
  */
  
  @Schema(name = "CP", example = "03100", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CP")
  public String getCP() {
    return CP;
  }

  public void setCP(String CP) {
    this.CP = CP;
  }

  public ConsultaBuroRequestEmpleosEmpleo numeroTelefono(String numeroTelefono) {
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

  public ConsultaBuroRequestEmpleosEmpleo extension(String extension) {
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

  public ConsultaBuroRequestEmpleosEmpleo fax(String fax) {
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

  public ConsultaBuroRequestEmpleosEmpleo cargo(String cargo) {
    this.cargo = cargo;
    return this;
  }

  /**
   * Get cargo
   * @return cargo
  */
  
  @Schema(name = "Cargo", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cargo")
  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public ConsultaBuroRequestEmpleosEmpleo fechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
    return this;
  }

  /**
   * Get fechaContratacion
   * @return fechaContratacion
  */
  
  @Schema(name = "FechaContratacion", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaContratacion")
  public String getFechaContratacion() {
    return fechaContratacion;
  }

  public void setFechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
  }

  public ConsultaBuroRequestEmpleosEmpleo claveMonedaSalario(String claveMonedaSalario) {
    this.claveMonedaSalario = claveMonedaSalario;
    return this;
  }

  /**
   * Get claveMonedaSalario
   * @return claveMonedaSalario
  */
  
  @Schema(name = "ClaveMonedaSalario", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ClaveMonedaSalario")
  public String getClaveMonedaSalario() {
    return claveMonedaSalario;
  }

  public void setClaveMonedaSalario(String claveMonedaSalario) {
    this.claveMonedaSalario = claveMonedaSalario;
  }

  public ConsultaBuroRequestEmpleosEmpleo salario(String salario) {
    this.salario = salario;
    return this;
  }

  /**
   * Get salario
   * @return salario
  */
  
  @Schema(name = "Salario", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Salario")
  public String getSalario() {
    return salario;
  }

  public void setSalario(String salario) {
    this.salario = salario;
  }

  public ConsultaBuroRequestEmpleosEmpleo baseSalarial(String baseSalarial) {
    this.baseSalarial = baseSalarial;
    return this;
  }

  /**
   * Get baseSalarial
   * @return baseSalarial
  */
  
  @Schema(name = "BaseSalarial", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BaseSalarial")
  public String getBaseSalarial() {
    return baseSalarial;
  }

  public void setBaseSalarial(String baseSalarial) {
    this.baseSalarial = baseSalarial;
  }

  public ConsultaBuroRequestEmpleosEmpleo numeroEmpleado(String numeroEmpleado) {
    this.numeroEmpleado = numeroEmpleado;
    return this;
  }

  /**
   * Get numeroEmpleado
   * @return numeroEmpleado
  */
  
  @Schema(name = "NumeroEmpleado", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumeroEmpleado")
  public String getNumeroEmpleado() {
    return numeroEmpleado;
  }

  public void setNumeroEmpleado(String numeroEmpleado) {
    this.numeroEmpleado = numeroEmpleado;
  }

  public ConsultaBuroRequestEmpleosEmpleo fechaUltimoDiaEmpleo(String fechaUltimoDiaEmpleo) {
    this.fechaUltimoDiaEmpleo = fechaUltimoDiaEmpleo;
    return this;
  }

  /**
   * Get fechaUltimoDiaEmpleo
   * @return fechaUltimoDiaEmpleo
  */
  
  @Schema(name = "FechaUltimoDiaEmpleo", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FechaUltimoDiaEmpleo")
  public String getFechaUltimoDiaEmpleo() {
    return fechaUltimoDiaEmpleo;
  }

  public void setFechaUltimoDiaEmpleo(String fechaUltimoDiaEmpleo) {
    this.fechaUltimoDiaEmpleo = fechaUltimoDiaEmpleo;
  }

  public ConsultaBuroRequestEmpleosEmpleo codPais(String codPais) {
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
    ConsultaBuroRequestEmpleosEmpleo consultaBuroRequestEmpleosEmpleo = (ConsultaBuroRequestEmpleosEmpleo) o;
    return Objects.equals(this.nombreEmpresa, consultaBuroRequestEmpleosEmpleo.nombreEmpresa) &&
        Objects.equals(this.direccion1, consultaBuroRequestEmpleosEmpleo.direccion1) &&
        Objects.equals(this.direccion2, consultaBuroRequestEmpleosEmpleo.direccion2) &&
        Objects.equals(this.coloniaPoblacion, consultaBuroRequestEmpleosEmpleo.coloniaPoblacion) &&
        Objects.equals(this.delegacionMunicipio, consultaBuroRequestEmpleosEmpleo.delegacionMunicipio) &&
        Objects.equals(this.ciudad, consultaBuroRequestEmpleosEmpleo.ciudad) &&
        Objects.equals(this.estado, consultaBuroRequestEmpleosEmpleo.estado) &&
        Objects.equals(this.CP, consultaBuroRequestEmpleosEmpleo.CP) &&
        Objects.equals(this.numeroTelefono, consultaBuroRequestEmpleosEmpleo.numeroTelefono) &&
        Objects.equals(this.extension, consultaBuroRequestEmpleosEmpleo.extension) &&
        Objects.equals(this.fax, consultaBuroRequestEmpleosEmpleo.fax) &&
        Objects.equals(this.cargo, consultaBuroRequestEmpleosEmpleo.cargo) &&
        Objects.equals(this.fechaContratacion, consultaBuroRequestEmpleosEmpleo.fechaContratacion) &&
        Objects.equals(this.claveMonedaSalario, consultaBuroRequestEmpleosEmpleo.claveMonedaSalario) &&
        Objects.equals(this.salario, consultaBuroRequestEmpleosEmpleo.salario) &&
        Objects.equals(this.baseSalarial, consultaBuroRequestEmpleosEmpleo.baseSalarial) &&
        Objects.equals(this.numeroEmpleado, consultaBuroRequestEmpleosEmpleo.numeroEmpleado) &&
        Objects.equals(this.fechaUltimoDiaEmpleo, consultaBuroRequestEmpleosEmpleo.fechaUltimoDiaEmpleo) &&
        Objects.equals(this.codPais, consultaBuroRequestEmpleosEmpleo.codPais);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreEmpresa, direccion1, direccion2, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, numeroTelefono, extension, fax, cargo, fechaContratacion, claveMonedaSalario, salario, baseSalarial, numeroEmpleado, fechaUltimoDiaEmpleo, codPais);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroRequestEmpleosEmpleo {\n");
    sb.append("    nombreEmpresa: ").append(toIndentedString(nombreEmpresa)).append("\n");
    sb.append("    direccion1: ").append(toIndentedString(direccion1)).append("\n");
    sb.append("    direccion2: ").append(toIndentedString(direccion2)).append("\n");
    sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
    sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    cargo: ").append(toIndentedString(cargo)).append("\n");
    sb.append("    fechaContratacion: ").append(toIndentedString(fechaContratacion)).append("\n");
    sb.append("    claveMonedaSalario: ").append(toIndentedString(claveMonedaSalario)).append("\n");
    sb.append("    salario: ").append(toIndentedString(salario)).append("\n");
    sb.append("    baseSalarial: ").append(toIndentedString(baseSalarial)).append("\n");
    sb.append("    numeroEmpleado: ").append(toIndentedString(numeroEmpleado)).append("\n");
    sb.append("    fechaUltimoDiaEmpleo: ").append(toIndentedString(fechaUltimoDiaEmpleo)).append("\n");
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
