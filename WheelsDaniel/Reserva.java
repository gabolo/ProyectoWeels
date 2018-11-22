package com.example.echo;


public class Reserva {
	private int idRuta;
	private int asientos;
	private String idPasajero;
		
	public Reserva(int idRuta, int asientos, String idPasajero) {
		super();
		this.idPasajero = idPasajero;
		this.asientos = asientos;
		this.idRuta = idRuta;
	}

	public Reserva() {
		
		
		
	}

	public String getIdPasajero() {
		return idPasajero;
	}

	public void setIdPasajero(String idPasajero) {
		this.idPasajero = idPasajero;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public int getid	Ruta() {
		return idRuta;
	}

	public void setidRuta(int idRuta) {
		this.idRuta = idRuta;
	}

	}