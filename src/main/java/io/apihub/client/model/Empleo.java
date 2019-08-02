

package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.apihub.client.model.CatalogoEstados;
import io.apihub.client.model.CatalogoMoneda;
import java.io.IOException;

@javax.annotation.Generated(value = "io.apihub.codegen.languages.JavaClientCodegen", date = "2019-08-01T16:44:21.339Z")
public class Empleo {
  @SerializedName("nombreEmpresa")
  private String nombreEmpresa = null;
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("colonia")
  private String colonia = null;
  @SerializedName("municipio")
  private String municipio = null;
  @SerializedName("ciudad")
  private String ciudad = null;
  @SerializedName("estado")
  private CatalogoEstados estado = null;
  @SerializedName("codigoPostal")
  private String codigoPostal = null;
  @SerializedName("numeroTelefono")
  private String numeroTelefono = null;
  @SerializedName("extension")
  private String extension = null;
  @SerializedName("fax")
  private String fax = null;
  @SerializedName("puesto")
  private String puesto = null;
  @SerializedName("fechaContratacion")
  private String fechaContratacion = null;
  @SerializedName("claveMoneda")
  private CatalogoMoneda claveMoneda = null;
  @SerializedName("salarioMensual")
  private String salarioMensual = null;
  @SerializedName("fechaUltimoDiaEmpleo")
  private String fechaUltimoDiaEmpleo = null;
  @SerializedName("fechaVerificacionEmpleo")
  private String fechaVerificacionEmpleo = null;
  public Empleo nombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
    return this;
  }
   
  public String getNombreEmpresa() {
    return nombreEmpresa;
  }
  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }
  public Empleo direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public Empleo colonia(String colonia) {
    this.colonia = colonia;
    return this;
  }
   
  public String getColonia() {
    return colonia;
  }
  public void setColonia(String colonia) {
    this.colonia = colonia;
  }
  public Empleo municipio(String municipio) {
    this.municipio = municipio;
    return this;
  }
   
  public String getMunicipio() {
    return municipio;
  }
  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }
  public Empleo ciudad(String ciudad) {
    this.ciudad = ciudad;
    return this;
  }
   
  public String getCiudad() {
    return ciudad;
  }
  public void setCiudad(String ciudad) {
    this.ciudad = ciudad;
  }
  public Empleo estado(CatalogoEstados estado) {
    this.estado = estado;
    return this;
  }
   
  public CatalogoEstados getEstado() {
    return estado;
  }
  public void setEstado(CatalogoEstados estado) {
    this.estado = estado;
  }
  public Empleo codigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
    return this;
  }
   
  public String getCodigoPostal() {
    return codigoPostal;
  }
  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }
  public Empleo numeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
    return this;
  }
   
  public String getNumeroTelefono() {
    return numeroTelefono;
  }
  public void setNumeroTelefono(String numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
  }
  public Empleo extension(String extension) {
    this.extension = extension;
    return this;
  }
   
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }
  public Empleo fax(String fax) {
    this.fax = fax;
    return this;
  }
   
  public String getFax() {
    return fax;
  }
  public void setFax(String fax) {
    this.fax = fax;
  }
  public Empleo puesto(String puesto) {
    this.puesto = puesto;
    return this;
  }
   
  public String getPuesto() {
    return puesto;
  }
  public void setPuesto(String puesto) {
    this.puesto = puesto;
  }
  public Empleo fechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
    return this;
  }
   
  public String getFechaContratacion() {
    return fechaContratacion;
  }
  public void setFechaContratacion(String fechaContratacion) {
    this.fechaContratacion = fechaContratacion;
  }
  public Empleo claveMoneda(CatalogoMoneda claveMoneda) {
    this.claveMoneda = claveMoneda;
    return this;
  }
   
  public CatalogoMoneda getClaveMoneda() {
    return claveMoneda;
  }
  public void setClaveMoneda(CatalogoMoneda claveMoneda) {
    this.claveMoneda = claveMoneda;
  }
  public Empleo salarioMensual(String salarioMensual) {
    this.salarioMensual = salarioMensual;
    return this;
  }
   
  public String getSalarioMensual() {
    return salarioMensual;
  }
  public void setSalarioMensual(String salarioMensual) {
    this.salarioMensual = salarioMensual;
  }
  public Empleo fechaUltimoDiaEmpleo(String fechaUltimoDiaEmpleo) {
    this.fechaUltimoDiaEmpleo = fechaUltimoDiaEmpleo;
    return this;
  }
   
  public String getFechaUltimoDiaEmpleo() {
    return fechaUltimoDiaEmpleo;
  }
  public void setFechaUltimoDiaEmpleo(String fechaUltimoDiaEmpleo) {
    this.fechaUltimoDiaEmpleo = fechaUltimoDiaEmpleo;
  }
  public Empleo fechaVerificacionEmpleo(String fechaVerificacionEmpleo) {
    this.fechaVerificacionEmpleo = fechaVerificacionEmpleo;
    return this;
  }
   
  public String getFechaVerificacionEmpleo() {
    return fechaVerificacionEmpleo;
  }
  public void setFechaVerificacionEmpleo(String fechaVerificacionEmpleo) {
    this.fechaVerificacionEmpleo = fechaVerificacionEmpleo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Empleo empleo = (Empleo) o;
    return Objects.equals(this.nombreEmpresa, empleo.nombreEmpresa) &&
        Objects.equals(this.direccion, empleo.direccion) &&
        Objects.equals(this.colonia, empleo.colonia) &&
        Objects.equals(this.municipio, empleo.municipio) &&
        Objects.equals(this.ciudad, empleo.ciudad) &&
        Objects.equals(this.estado, empleo.estado) &&
        Objects.equals(this.codigoPostal, empleo.codigoPostal) &&
        Objects.equals(this.numeroTelefono, empleo.numeroTelefono) &&
        Objects.equals(this.extension, empleo.extension) &&
        Objects.equals(this.fax, empleo.fax) &&
        Objects.equals(this.puesto, empleo.puesto) &&
        Objects.equals(this.fechaContratacion, empleo.fechaContratacion) &&
        Objects.equals(this.claveMoneda, empleo.claveMoneda) &&
        Objects.equals(this.salarioMensual, empleo.salarioMensual) &&
        Objects.equals(this.fechaUltimoDiaEmpleo, empleo.fechaUltimoDiaEmpleo) &&
        Objects.equals(this.fechaVerificacionEmpleo, empleo.fechaVerificacionEmpleo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreEmpresa, direccion, colonia, municipio, ciudad, estado, codigoPostal, numeroTelefono, extension, fax, puesto, fechaContratacion, claveMoneda, salarioMensual, fechaUltimoDiaEmpleo, fechaVerificacionEmpleo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Empleo {\n");
    
    sb.append("    nombreEmpresa: ").append(toIndentedString(nombreEmpresa)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    colonia: ").append(toIndentedString(colonia)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
    sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
    sb.append("    numeroTelefono: ").append(toIndentedString(numeroTelefono)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    puesto: ").append(toIndentedString(puesto)).append("\n");
    sb.append("    fechaContratacion: ").append(toIndentedString(fechaContratacion)).append("\n");
    sb.append("    claveMoneda: ").append(toIndentedString(claveMoneda)).append("\n");
    sb.append("    salarioMensual: ").append(toIndentedString(salarioMensual)).append("\n");
    sb.append("    fechaUltimoDiaEmpleo: ").append(toIndentedString(fechaUltimoDiaEmpleo)).append("\n");
    sb.append("    fechaVerificacionEmpleo: ").append(toIndentedString(fechaVerificacionEmpleo)).append("\n");
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
