package com.example.echo;

public class Ruta {
	private String nombreruta;
	private String idConductor;
	private String puntoDePartida;
	private String puntoDeLlegada;
	public Ruta(String nombreruta, String idConductor, String puntoDePartida, String puntoDeLlegada) {
		this.nombreruta = nombreruta;
		this.idConductor = idConductor;
		this.puntoDePartida = puntoDePartida;
		this.puntoDeLlegada = puntoDeLlegada;
	}
	public String getNombreruta() {
		return nombreruta;
	}
	public String getIdConductor() {
		return idConductor;
	}
	public String getPuntoDePartida() {
		return puntoDePartida;
	}
	public String getPuntoDeLlegada() {
		return puntoDeLlegada;
	}
	public String getRuta(){
		return this.nombreruta+"@"+this.idConductor+"@"+this.puntoDePartida+"@"+this.puntoDeLlegada;
	}
	public void setIdConductor(String idConductor) {
		this.idConductor = idConductor;
	}
	public void setPuntoDePartida(String puntoDePartida) {
		this.puntoDePartida = puntoDePartida;
	}
	public void setPuntoDeLlegada(String puntoDeLlegada) {
		this.puntoDeLlegada = puntoDeLlegada;
	}