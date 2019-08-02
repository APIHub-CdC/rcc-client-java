

package io.apihub.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.apihub.client.model.CatalogoFrecuenciaPago;
import io.apihub.client.model.CatalogoMoneda;
import io.apihub.client.model.CatalogoPrevencion;
import io.apihub.client.model.CatalogoTipoCredito;
import io.apihub.client.model.CatalogoTipoCuenta;
import io.apihub.client.model.CatalogoTipoResponsabilidad;
import java.io.IOException;

@javax.annotation.Generated(value = "io.apihub.codegen.languages.JavaClientCodegen", date = "2019-08-01T16:44:21.339Z")
public class Credito {
  @SerializedName("fechaActualizacion")
  private String fechaActualizacion = null;
  @SerializedName("registroImpugnado")
  private String registroImpugnado = null;
  @SerializedName("claveOtorgante")
  private String claveOtorgante = null;
  @SerializedName("nombreOtorgante")
  private String nombreOtorgante = null;
  @SerializedName("cuentaActual")
  private String cuentaActual = null;
  @SerializedName("tipoResponsabilidad")
  private CatalogoTipoResponsabilidad tipoResponsabilidad = null;
  @SerializedName("tipoCuenta")
  private CatalogoTipoCuenta tipoCuenta = null;
  @SerializedName("tipoCredito")
  private CatalogoTipoCredito tipoCredito = null;
  @SerializedName("claveUnidadMonetaria")
  private CatalogoMoneda claveUnidadMonetaria = null;
  @SerializedName("valorActivoValuacion")
  private String valorActivoValuacion = null;
  @SerializedName("numeroPagos")
  private String numeroPagos = null;
  @SerializedName("frecuenciaPagos")
  private CatalogoFrecuenciaPago frecuenciaPagos = null;
  @SerializedName("montoPagar")
  private String montoPagar = null;
  @SerializedName("fechaAperturaCuenta")
  private String fechaAperturaCuenta = null;
  @SerializedName("fechaUltimoPago")
  private String fechaUltimoPago = null;
  @SerializedName("fechaUltimaCompra")
  private String fechaUltimaCompra = null;
  @SerializedName("fechaCierreCuenta")
  private String fechaCierreCuenta = null;
  @SerializedName("fechaReporte")
  private String fechaReporte = null;
  @SerializedName("ultimaFechaSaldoCero")
  private String ultimaFechaSaldoCero = null;
  @SerializedName("garantia")
  private String garantia = null;
  @SerializedName("creditoMaximo")
  private String creditoMaximo = null;
  @SerializedName("saldoActual")
  private String saldoActual = null;
  @SerializedName("limiteCredito")
  private String limiteCredito = null;
  @SerializedName("saldoVencido")
  private String saldoVencido = null;
  @SerializedName("numeroPagosVencidos")
  private String numeroPagosVencidos = null;
  @SerializedName("pagoActual")
  private String pagoActual = null;
  @SerializedName("historicoPagos")
  private String historicoPagos = null;
  @SerializedName("fechaRecienteHistoricoPagos")
  private String fechaRecienteHistoricoPagos = null;
  @SerializedName("fechaAntiguaHistoricoPagos")
  private String fechaAntiguaHistoricoPagos = null;
  @SerializedName("clavePrevencion")
  private CatalogoPrevencion clavePrevencion = null;
  @SerializedName("totalPagosReportados")
  private String totalPagosReportados = null;
  @SerializedName("peorAtraso")
  private String peorAtraso = null;
  @SerializedName("fechaPeorAtraso")
  private String fechaPeorAtraso = null;
  @SerializedName("saldoVencidoPeorAtraso")
  private String saldoVencidoPeorAtraso = null;
  @SerializedName("montoUltimoPago")
  private Double montoUltimoPago = null;
  @SerializedName("idDomicilio")
  private String idDomicilio = null;
  @SerializedName("servicios")
  private String servicios = null;
  public Credito fechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
    return this;
  }
   
  public String getFechaActualizacion() {
    return fechaActualizacion;
  }
  public void setFechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
  }
  public Credito registroImpugnado(String registroImpugnado) {
    this.registroImpugnado = registroImpugnado;
    return this;
  }
   
  public String getRegistroImpugnado() {
    return registroImpugnado;
  }
  public void setRegistroImpugnado(String registroImpugnado) {
    this.registroImpugnado = registroImpugnado;
  }
  public Credito claveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
    return this;
  }
   
  public String getClaveOtorgante() {
    return claveOtorgante;
  }
  public void setClaveOtorgante(String claveOtorgante) {
    this.claveOtorgante = claveOtorgante;
  }
  public Credito nombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
    return this;
  }
   
  public String getNombreOtorgante() {
    return nombreOtorgante;
  }
  public void setNombreOtorgante(String nombreOtorgante) {
    this.nombreOtorgante = nombreOtorgante;
  }
  public Credito cuentaActual(String cuentaActual) {
    this.cuentaActual = cuentaActual;
    return this;
  }
   
  public String getCuentaActual() {
    return cuentaActual;
  }
  public void setCuentaActual(String cuentaActual) {
    this.cuentaActual = cuentaActual;
  }
  public Credito tipoResponsabilidad(CatalogoTipoResponsabilidad tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
    return this;
  }
   
  public CatalogoTipoResponsabilidad getTipoResponsabilidad() {
    return tipoResponsabilidad;
  }
  public void setTipoResponsabilidad(CatalogoTipoResponsabilidad tipoResponsabilidad) {
    this.tipoResponsabilidad = tipoResponsabilidad;
  }
  public Credito tipoCuenta(CatalogoTipoCuenta tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
    return this;
  }
   
  public CatalogoTipoCuenta getTipoCuenta() {
    return tipoCuenta;
  }
  public void setTipoCuenta(CatalogoTipoCuenta tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
  }
  public Credito tipoCredito(CatalogoTipoCredito tipoCredito) {
    this.tipoCredito = tipoCredito;
    return this;
  }
   
  public CatalogoTipoCredito getTipoCredito() {
    return tipoCredito;
  }
  public void setTipoCredito(CatalogoTipoCredito tipoCredito) {
    this.tipoCredito = tipoCredito;
  }
  public Credito claveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
    return this;
  }
   
  public CatalogoMoneda getClaveUnidadMonetaria() {
    return claveUnidadMonetaria;
  }
  public void setClaveUnidadMonetaria(CatalogoMoneda claveUnidadMonetaria) {
    this.claveUnidadMonetaria = claveUnidadMonetaria;
  }
  public Credito valorActivoValuacion(String valorActivoValuacion) {
    this.valorActivoValuacion = valorActivoValuacion;
    return this;
  }
   
  public String getValorActivoValuacion() {
    return valorActivoValuacion;
  }
  public void setValorActivoValuacion(String valorActivoValuacion) {
    this.valorActivoValuacion = valorActivoValuacion;
  }
  public Credito numeroPagos(String numeroPagos) {
    this.numeroPagos = numeroPagos;
    return this;
  }
   
  public String getNumeroPagos() {
    return numeroPagos;
  }
  public void setNumeroPagos(String numeroPagos) {
    this.numeroPagos = numeroPagos;
  }
  public Credito frecuenciaPagos(CatalogoFrecuenciaPago frecuenciaPagos) {
    this.frecuenciaPagos = frecuenciaPagos;
    return this;
  }
   
  public CatalogoFrecuenciaPago getFrecuenciaPagos() {
    return frecuenciaPagos;
  }
  public void setFrecuenciaPagos(CatalogoFrecuenciaPago frecuenciaPagos) {
    this.frecuenciaPagos = frecuenciaPagos;
  }
  public Credito montoPagar(String montoPagar) {
    this.montoPagar = montoPagar;
    return this;
  }
   
  public String getMontoPagar() {
    return montoPagar;
  }
  public void setMontoPagar(String montoPagar) {
    this.montoPagar = montoPagar;
  }
  public Credito fechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
    return this;
  }
   
  public String getFechaAperturaCuenta() {
    return fechaAperturaCuenta;
  }
  public void setFechaAperturaCuenta(String fechaAperturaCuenta) {
    this.fechaAperturaCuenta = fechaAperturaCuenta;
  }
  public Credito fechaUltimoPago(String fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
    return this;
  }
   
  public String getFechaUltimoPago() {
    return fechaUltimoPago;
  }
  public void setFechaUltimoPago(String fechaUltimoPago) {
    this.fechaUltimoPago = fechaUltimoPago;
  }
  public Credito fechaUltimaCompra(String fechaUltimaCompra) {
    this.fechaUltimaCompra = fechaUltimaCompra;
    return this;
  }
   
  public String getFechaUltimaCompra() {
    return fechaUltimaCompra;
  }
  public void setFechaUltimaCompra(String fechaUltimaCompra) {
    this.fechaUltimaCompra = fechaUltimaCompra;
  }
  public Credito fechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
    return this;
  }
   
  public String getFechaCierreCuenta() {
    return fechaCierreCuenta;
  }
  public void setFechaCierreCuenta(String fechaCierreCuenta) {
    this.fechaCierreCuenta = fechaCierreCuenta;
  }
  public Credito fechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }
   
  public String getFechaReporte() {
    return fechaReporte;
  }
  public void setFechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
  }
  public Credito ultimaFechaSaldoCero(String ultimaFechaSaldoCero) {
    this.ultimaFechaSaldoCero = ultimaFechaSaldoCero;
    return this;
  }
   
  public String getUltimaFechaSaldoCero() {
    return ultimaFechaSaldoCero;
  }
  public void setUltimaFechaSaldoCero(String ultimaFechaSaldoCero) {
    this.ultimaFechaSaldoCero = ultimaFechaSaldoCero;
  }
  public Credito garantia(String garantia) {
    this.garantia = garantia;
    return this;
  }
   
  public String getGarantia() {
    return garantia;
  }
  public void setGarantia(String garantia) {
    this.garantia = garantia;
  }
  public Credito creditoMaximo(String creditoMaximo) {
    this.creditoMaximo = creditoMaximo;
    return this;
  }
   
  public String getCreditoMaximo() {
    return creditoMaximo;
  }
  public void setCreditoMaximo(String creditoMaximo) {
    this.creditoMaximo = creditoMaximo;
  }
  public Credito saldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
    return this;
  }
   
  public String getSaldoActual() {
    return saldoActual;
  }
  public void setSaldoActual(String saldoActual) {
    this.saldoActual = saldoActual;
  }
  public Credito limiteCredito(String limiteCredito) {
    this.limiteCredito = limiteCredito;
    return this;
  }
   
  public String getLimiteCredito() {
    return limiteCredito;
  }
  public void setLimiteCredito(String limiteCredito) {
    this.limiteCredito = limiteCredito;
  }
  public Credito saldoVencido(String saldoVencido) {
    this.saldoVencido = saldoVencido;
    return this;
  }
   
  public String getSaldoVencido() {
    return saldoVencido;
  }
  public void setSaldoVencido(String saldoVencido) {
    this.saldoVencido = saldoVencido;
  }
  public Credito numeroPagosVencidos(String numeroPagosVencidos) {
    this.numeroPagosVencidos = numeroPagosVencidos;
    return this;
  }
   
  public String getNumeroPagosVencidos() {
    return numeroPagosVencidos;
  }
  public void setNumeroPagosVencidos(String numeroPagosVencidos) {
    this.numeroPagosVencidos = numeroPagosVencidos;
  }
  public Credito pagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
    return this;
  }
   
  public String getPagoActual() {
    return pagoActual;
  }
  public void setPagoActual(String pagoActual) {
    this.pagoActual = pagoActual;
  }
  public Credito historicoPagos(String historicoPagos) {
    this.historicoPagos = historicoPagos;
    return this;
  }
   
  public String getHistoricoPagos() {
    return historicoPagos;
  }
  public void setHistoricoPagos(String historicoPagos) {
    this.historicoPagos = historicoPagos;
  }
  public Credito fechaRecienteHistoricoPagos(String fechaRecienteHistoricoPagos) {
    this.fechaRecienteHistoricoPagos = fechaRecienteHistoricoPagos;
    return this;
  }
   
  public String getFechaRecienteHistoricoPagos() {
    return fechaRecienteHistoricoPagos;
  }
  public void setFechaRecienteHistoricoPagos(String fechaRecienteHistoricoPagos) {
    this.fechaRecienteHistoricoPagos = fechaRecienteHistoricoPagos;
  }
  public Credito fechaAntiguaHistoricoPagos(String fechaAntiguaHistoricoPagos) {
    this.fechaAntiguaHistoricoPagos = fechaAntiguaHistoricoPagos;
    return this;
  }
   
  public String getFechaAntiguaHistoricoPagos() {
    return fechaAntiguaHistoricoPagos;
  }
  public void setFechaAntiguaHistoricoPagos(String fechaAntiguaHistoricoPagos) {
    this.fechaAntiguaHistoricoPagos = fechaAntiguaHistoricoPagos;
  }
  public Credito clavePrevencion(CatalogoPrevencion clavePrevencion) {
    this.clavePrevencion = clavePrevencion;
    return this;
  }
   
  public CatalogoPrevencion getClavePrevencion() {
    return clavePrevencion;
  }
  public void setClavePrevencion(CatalogoPrevencion clavePrevencion) {
    this.clavePrevencion = clavePrevencion;
  }
  public Credito totalPagosReportados(String totalPagosReportados) {
    this.totalPagosReportados = totalPagosReportados;
    return this;
  }
   
  public String getTotalPagosReportados() {
    return totalPagosReportados;
  }
  public void setTotalPagosReportados(String totalPagosReportados) {
    this.totalPagosReportados = totalPagosReportados;
  }
  public Credito peorAtraso(String peorAtraso) {
    this.peorAtraso = peorAtraso;
    return this;
  }
   
  public String getPeorAtraso() {
    return peorAtraso;
  }
  public void setPeorAtraso(String peorAtraso) {
    this.peorAtraso = peorAtraso;
  }
  public Credito fechaPeorAtraso(String fechaPeorAtraso) {
    this.fechaPeorAtraso = fechaPeorAtraso;
    return this;
  }
   
  public String getFechaPeorAtraso() {
    return fechaPeorAtraso;
  }
  public void setFechaPeorAtraso(String fechaPeorAtraso) {
    this.fechaPeorAtraso = fechaPeorAtraso;
  }
  public Credito saldoVencidoPeorAtraso(String saldoVencidoPeorAtraso) {
    this.saldoVencidoPeorAtraso = saldoVencidoPeorAtraso;
    return this;
  }
   
  public String getSaldoVencidoPeorAtraso() {
    return saldoVencidoPeorAtraso;
  }
  public void setSaldoVencidoPeorAtraso(String saldoVencidoPeorAtraso) {
    this.saldoVencidoPeorAtraso = saldoVencidoPeorAtraso;
  }
  public Credito montoUltimoPago(Double montoUltimoPago) {
    this.montoUltimoPago = montoUltimoPago;
    return this;
  }
   
  public Double getMontoUltimoPago() {
    return montoUltimoPago;
  }
  public void setMontoUltimoPago(Double montoUltimoPago) {
    this.montoUltimoPago = montoUltimoPago;
  }
  public Credito idDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
    return this;
  }
   
  public String getIdDomicilio() {
    return idDomicilio;
  }
  public void setIdDomicilio(String idDomicilio) {
    this.idDomicilio = idDomicilio;
  }
  public Credito servicios(String servicios) {
    this.servicios = servicios;
    return this;
  }
   
  public String getServicios() {
    return servicios;
  }
  public void setServicios(String servicios) {
    this.servicios = servicios;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Credito credito = (Credito) o;
    return Objects.equals(this.fechaActualizacion, credito.fechaActualizacion) &&
        Objects.equals(this.registroImpugnado, credito.registroImpugnado) &&
        Objects.equals(this.claveOtorgante, credito.claveOtorgante) &&
        Objects.equals(this.nombreOtorgante, credito.nombreOtorgante) &&
        Objects.equals(this.cuentaActual, credito.cuentaActual) &&
        Objects.equals(this.tipoResponsabilidad, credito.tipoResponsabilidad) &&
        Objects.equals(this.tipoCuenta, credito.tipoCuenta) &&
        Objects.equals(this.tipoCredito, credito.tipoCredito) &&
        Objects.equals(this.claveUnidadMonetaria, credito.claveUnidadMonetaria) &&
        Objects.equals(this.valorActivoValuacion, credito.valorActivoValuacion) &&
        Objects.equals(this.numeroPagos, credito.numeroPagos) &&
        Objects.equals(this.frecuenciaPagos, credito.frecuenciaPagos) &&
        Objects.equals(this.montoPagar, credito.montoPagar) &&
        Objects.equals(this.fechaAperturaCuenta, credito.fechaAperturaCuenta) &&
        Objects.equals(this.fechaUltimoPago, credito.fechaUltimoPago) &&
        Objects.equals(this.fechaUltimaCompra, credito.fechaUltimaCompra) &&
        Objects.equals(this.fechaCierreCuenta, credito.fechaCierreCuenta) &&
        Objects.equals(this.fechaReporte, credito.fechaReporte) &&
        Objects.equals(this.ultimaFechaSaldoCero, credito.ultimaFechaSaldoCero) &&
        Objects.equals(this.garantia, credito.garantia) &&
        Objects.equals(this.creditoMaximo, credito.creditoMaximo) &&
        Objects.equals(this.saldoActual, credito.saldoActual) &&
        Objects.equals(this.limiteCredito, credito.limiteCredito) &&
        Objects.equals(this.saldoVencido, credito.saldoVencido) &&
        Objects.equals(this.numeroPagosVencidos, credito.numeroPagosVencidos) &&
        Objects.equals(this.pagoActual, credito.pagoActual) &&
        Objects.equals(this.historicoPagos, credito.historicoPagos) &&
        Objects.equals(this.fechaRecienteHistoricoPagos, credito.fechaRecienteHistoricoPagos) &&
        Objects.equals(this.fechaAntiguaHistoricoPagos, credito.fechaAntiguaHistoricoPagos) &&
        Objects.equals(this.clavePrevencion, credito.clavePrevencion) &&
        Objects.equals(this.totalPagosReportados, credito.totalPagosReportados) &&
        Objects.equals(this.peorAtraso, credito.peorAtraso) &&
        Objects.equals(this.fechaPeorAtraso, credito.fechaPeorAtraso) &&
        Objects.equals(this.saldoVencidoPeorAtraso, credito.saldoVencidoPeorAtraso) &&
        Objects.equals(this.montoUltimoPago, credito.montoUltimoPago) &&
        Objects.equals(this.idDomicilio, credito.idDomicilio) &&
        Objects.equals(this.servicios, credito.servicios);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaActualizacion, registroImpugnado, claveOtorgante, nombreOtorgante, cuentaActual, tipoResponsabilidad, tipoCuenta, tipoCredito, claveUnidadMonetaria, valorActivoValuacion, numeroPagos, frecuenciaPagos, montoPagar, fechaAperturaCuenta, fechaUltimoPago, fechaUltimaCompra, fechaCierreCuenta, fechaReporte, ultimaFechaSaldoCero, garantia, creditoMaximo, saldoActual, limiteCredito, saldoVencido, numeroPagosVencidos, pagoActual, historicoPagos, fechaRecienteHistoricoPagos, fechaAntiguaHistoricoPagos, clavePrevencion, totalPagosReportados, peorAtraso, fechaPeorAtraso, saldoVencidoPeorAtraso, montoUltimoPago, idDomicilio, servicios);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Credito {\n");
    
    sb.append("    fechaActualizacion: ").append(toIndentedString(fechaActualizacion)).append("\n");
    sb.append("    registroImpugnado: ").append(toIndentedString(registroImpugnado)).append("\n");
    sb.append("    claveOtorgante: ").append(toIndentedString(claveOtorgante)).append("\n");
    sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
    sb.append("    cuentaActual: ").append(toIndentedString(cuentaActual)).append("\n");
    sb.append("    tipoResponsabilidad: ").append(toIndentedString(tipoResponsabilidad)).append("\n");
    sb.append("    tipoCuenta: ").append(toIndentedString(tipoCuenta)).append("\n");
    sb.append("    tipoCredito: ").append(toIndentedString(tipoCredito)).append("\n");
    sb.append("    claveUnidadMonetaria: ").append(toIndentedString(claveUnidadMonetaria)).append("\n");
    sb.append("    valorActivoValuacion: ").append(toIndentedString(valorActivoValuacion)).append("\n");
    sb.append("    numeroPagos: ").append(toIndentedString(numeroPagos)).append("\n");
    sb.append("    frecuenciaPagos: ").append(toIndentedString(frecuenciaPagos)).append("\n");
    sb.append("    montoPagar: ").append(toIndentedString(montoPagar)).append("\n");
    sb.append("    fechaAperturaCuenta: ").append(toIndentedString(fechaAperturaCuenta)).append("\n");
    sb.append("    fechaUltimoPago: ").append(toIndentedString(fechaUltimoPago)).append("\n");
    sb.append("    fechaUltimaCompra: ").append(toIndentedString(fechaUltimaCompra)).append("\n");
    sb.append("    fechaCierreCuenta: ").append(toIndentedString(fechaCierreCuenta)).append("\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
    sb.append("    ultimaFechaSaldoCero: ").append(toIndentedString(ultimaFechaSaldoCero)).append("\n");
    sb.append("    garantia: ").append(toIndentedString(garantia)).append("\n");
    sb.append("    creditoMaximo: ").append(toIndentedString(creditoMaximo)).append("\n");
    sb.append("    saldoActual: ").append(toIndentedString(saldoActual)).append("\n");
    sb.append("    limiteCredito: ").append(toIndentedString(limiteCredito)).append("\n");
    sb.append("    saldoVencido: ").append(toIndentedString(saldoVencido)).append("\n");
    sb.append("    numeroPagosVencidos: ").append(toIndentedString(numeroPagosVencidos)).append("\n");
    sb.append("    pagoActual: ").append(toIndentedString(pagoActual)).append("\n");
    sb.append("    historicoPagos: ").append(toIndentedString(historicoPagos)).append("\n");
    sb.append("    fechaRecienteHistoricoPagos: ").append(toIndentedString(fechaRecienteHistoricoPagos)).append("\n");
    sb.append("    fechaAntiguaHistoricoPagos: ").append(toIndentedString(fechaAntiguaHistoricoPagos)).append("\n");
    sb.append("    clavePrevencion: ").append(toIndentedString(clavePrevencion)).append("\n");
    sb.append("    totalPagosReportados: ").append(toIndentedString(totalPagosReportados)).append("\n");
    sb.append("    peorAtraso: ").append(toIndentedString(peorAtraso)).append("\n");
    sb.append("    fechaPeorAtraso: ").append(toIndentedString(fechaPeorAtraso)).append("\n");
    sb.append("    saldoVencidoPeorAtraso: ").append(toIndentedString(saldoVencidoPeorAtraso)).append("\n");
    sb.append("    montoUltimoPago: ").append(toIndentedString(montoUltimoPago)).append("\n");
    sb.append("    idDomicilio: ").append(toIndentedString(idDomicilio)).append("\n");
    sb.append("    servicios: ").append(toIndentedString(servicios)).append("\n");
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
