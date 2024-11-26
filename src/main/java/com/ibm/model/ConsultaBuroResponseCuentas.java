package com.ibm.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConsultaBuroResponseCuentas
 */

@JsonTypeName("ConsultaBuroResponse_Cuentas")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-26T00:31:52.010088835Z[GMT]")
public class ConsultaBuroResponseCuentas {

  private ConsultaBuroResponseCuentasCuenta cuenta;

  public ConsultaBuroResponseCuentas cuenta(ConsultaBuroResponseCuentasCuenta cuenta) {
    this.cuenta = cuenta;
    return this;
  }

  /**
   * Get cuenta
   * @return cuenta
  */
  @Valid 
  @Schema(name = "Cuenta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cuenta")
  public ConsultaBuroResponseCuentasCuenta getCuenta() {
    return cuenta;
  }

  public void setCuenta(ConsultaBuroResponseCuentasCuenta cuenta) {
    this.cuenta = cuenta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaBuroResponseCuentas consultaBuroResponseCuentas = (ConsultaBuroResponseCuentas) o;
    return Objects.equals(this.cuenta, consultaBuroResponseCuentas.cuenta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cuenta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaBuroResponseCuentas {\n");
    sb.append("    cuenta: ").append(toIndentedString(cuenta)).append("\n");
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
