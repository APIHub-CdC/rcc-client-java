

package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import java.io.IOException;

@javax.annotation.Generated(value = "io.apihub.codegen.languages.JavaClientCodegen", date = "2019-08-01T16:44:21.339Z")
public class Error {
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("mensaje")
  private String mensaje = null;
  public Error codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
   
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public Error mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }
   
  public String getMensaje() {
    return mensaje;
  }
  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.codigo, error.codigo) &&
        Objects.equals(this.mensaje, error.mensaje);
  }
  @Override
  public int hashCode() {
    return Objects.hash(codigo, mensaje);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
