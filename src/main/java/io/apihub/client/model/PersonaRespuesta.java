

package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


import io.apihub.client.model.CatalogoEstadoCivil;
import io.apihub.client.model.CatalogoResidencia;
import io.apihub.client.model.CatalogoSexo;
import java.io.IOException;

@javax.annotation.Generated(value = "io.apihub.codegen.languages.JavaClientCodegen", date = "2019-08-01T16:44:21.339Z")
public class PersonaRespuesta {
  @SerializedName("nombres")
  private String nombres = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoAdicional")
  private String apellidoAdicional = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("rfc")
  private String rfc = null;
  @SerializedName("curp")
  private String curp = null;
  @SerializedName("numeroSeguridadSocial")
  private String numeroSeguridadSocial = null;
  @SerializedName("nacionalidad")
  private String nacionalidad = null;
  @SerializedName("residencia")
  private CatalogoResidencia residencia = null;
  @SerializedName("estadoCivil")
  private CatalogoEstadoCivil estadoCivil = null;
  @SerializedName("sexo")
  private CatalogoSexo sexo = null;
  @SerializedName("claveElector")
  private String claveElector = null;
  @SerializedName("numeroDependientes")
  private String numeroDependientes = null;
  @SerializedName("fechaDefuncion")
  private String fechaDefuncion = null;
  public PersonaRespuesta nombres(String nombres) {
    this.nombres = nombres;
    return this;
  }
   
  public String getNombres() {
    return nombres;
  }
  public void setNombres(String nombres) {
    this.nombres = nombres;
  }
  public PersonaRespuesta apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public PersonaRespuesta apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public PersonaRespuesta apellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
    return this;
  }
   
  public String getApellidoAdicional() {
    return apellidoAdicional;
  }
  public void setApellidoAdicional(String apellidoAdicional) {
    this.apellidoAdicional = apellidoAdicional;
  }
  public PersonaRespuesta fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public PersonaRespuesta rfc(String rfc) {
    this.rfc = rfc;
    return this;
  }
   
  public String getRfc() {
    return rfc;
  }
  public void setRfc(String rfc) {
    this.rfc = rfc;
  }
  public PersonaRespuesta curp(String curp) {
    this.curp = curp;
    return this;
  }
   
  public String getCurp() {
    return curp;
  }
  public void setCurp(String curp) {
    this.curp = curp;
  }
  public PersonaRespuesta numeroSeguridadSocial(String numeroSeguridadSocial) {
    this.numeroSeguridadSocial = numeroSeguridadSocial;
    return this;
  }
   
  public String getNumeroSeguridadSocial() {
    return numeroSeguridadSocial;
  }
  public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
    this.numeroSeguridadSocial = numeroSeguridadSocial;
  }
  public PersonaRespuesta nacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
    return this;
  }
   
  public String getNacionalidad() {
    return nacionalidad;
  }
  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }
  public PersonaRespuesta residencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
    return this;
  }
   
  public CatalogoResidencia getResidencia() {
    return residencia;
  }
  public void setResidencia(CatalogoResidencia residencia) {
    this.residencia = residencia;
  }
  public PersonaRespuesta estadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
    return this;
  }
   
  public CatalogoEstadoCivil getEstadoCivil() {
    return estadoCivil;
  }
  public void setEstadoCivil(CatalogoEstadoCivil estadoCivil) {
    this.estadoCivil = estadoCivil;
  }
  public PersonaRespuesta sexo(CatalogoSexo sexo) {
    this.sexo = sexo;
    return this;
  }
   
  public CatalogoSexo getSexo() {
    return sexo;
  }
  public void setSexo(CatalogoSexo sexo) {
    this.sexo = sexo;
  }
  public PersonaRespuesta claveElector(String claveElector) {
    this.claveElector = claveElector;
    return this;
  }
   
  public String getClaveElector() {
    return claveElector;
  }
  public void setClaveElector(String claveElector) {
    this.claveElector = claveElector;
  }
  public PersonaRespuesta numeroDependientes(String numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
    return this;
  }
   
  public String getNumeroDependientes() {
    return numeroDependientes;
  }
  public void setNumeroDependientes(String numeroDependientes) {
    this.numeroDependientes = numeroDependientes;
  }
  public PersonaRespuesta fechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
    return this;
  }
   
  public String getFechaDefuncion() {
    return fechaDefuncion;
  }
  public void setFechaDefuncion(String fechaDefuncion) {
    this.fechaDefuncion = fechaDefuncion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonaRespuesta personaRespuesta = (PersonaRespuesta) o;
    return Objects.equals(this.nombres, personaRespuesta.nombres) &&
        Objects.equals(this.apellidoPaterno, personaRespuesta.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, personaRespuesta.apellidoMaterno) &&
        Objects.equals(this.apellidoAdicional, personaRespuesta.apellidoAdicional) &&
        Objects.equals(this.fechaNacimiento, personaRespuesta.fechaNacimiento) &&
        Objects.equals(this.rfc, personaRespuesta.rfc) &&
        Objects.equals(this.curp, personaRespuesta.curp) &&
        Objects.equals(this.numeroSeguridadSocial, personaRespuesta.numeroSeguridadSocial) &&
        Objects.equals(this.nacionalidad, personaRespuesta.nacionalidad) &&
        Objects.equals(this.residencia, personaRespuesta.residencia) &&
        Objects.equals(this.estadoCivil, personaRespuesta.estadoCivil) &&
        Objects.equals(this.sexo, personaRespuesta.sexo) &&
        Objects.equals(this.claveElector, personaRespuesta.claveElector) &&
        Objects.equals(this.numeroDependientes, personaRespuesta.numeroDependientes) &&
        Objects.equals(this.fechaDefuncion, personaRespuesta.fechaDefuncion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombres, apellidoPaterno, apellidoMaterno, apellidoAdicional, fechaNacimiento, rfc, curp, numeroSeguridadSocial, nacionalidad, residencia, estadoCivil, sexo, claveElector, numeroDependientes, fechaDefuncion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonaRespuesta {\n");
    
    sb.append("    nombres: ").append(toIndentedString(nombres)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoAdicional: ").append(toIndentedString(apellidoAdicional)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    rfc: ").append(toIndentedString(rfc)).append("\n");
    sb.append("    curp: ").append(toIndentedString(curp)).append("\n");
    sb.append("    numeroSeguridadSocial: ").append(toIndentedString(numeroSeguridadSocial)).append("\n");
    sb.append("    nacionalidad: ").append(toIndentedString(nacionalidad)).append("\n");
    sb.append("    residencia: ").append(toIndentedString(residencia)).append("\n");
    sb.append("    estadoCivil: ").append(toIndentedString(estadoCivil)).append("\n");
    sb.append("    sexo: ").append(toIndentedString(sexo)).append("\n");
    sb.append("    claveElector: ").append(toIndentedString(claveElector)).append("\n");
    sb.append("    numeroDependientes: ").append(toIndentedString(numeroDependientes)).append("\n");
    sb.append("    fechaDefuncion: ").append(toIndentedString(fechaDefuncion)).append("\n");
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
