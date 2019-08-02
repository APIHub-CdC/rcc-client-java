

package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.apihub.client.model.Domicilio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.apihub.codegen.languages.JavaClientCodegen", date = "2019-08-01T16:44:21.339Z")
public class Domicilios {
  @SerializedName("domicilios")
  private List<Domicilio> domicilios = null;
  public Domicilios domicilios(List<Domicilio> domicilios) {
    this.domicilios = domicilios;
    return this;
  }
  public Domicilios addDomiciliosItem(Domicilio domiciliosItem) {
    if (this.domicilios == null) {
      this.domicilios = new ArrayList<Domicilio>();
    }
    this.domicilios.add(domiciliosItem);
    return this;
  }
   
  public List<Domicilio> getDomicilios() {
    return domicilios;
  }
  public void setDomicilios(List<Domicilio> domicilios) {
    this.domicilios = domicilios;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Domicilios domicilios = (Domicilios) o;
    return Objects.equals(this.domicilios, domicilios.domicilios);
  }
  @Override
  public int hashCode() {
    return Objects.hash(domicilios);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Domicilios {\n");
    
    sb.append("    domicilios: ").append(toIndentedString(domicilios)).append("\n");
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
