package com.example.echo;


public class Reserva {
	private String idUsuario;
	private int asientos;
	private String nombreRuta;
		
	public Reserva(String idUsuario, int asientos, String nombreRuta) {
		super();
		this.idUsuario = idUsuario;
		this.asientos = asientos;
		this.nombreRuta = nombreRuta;
	}

	public Reserva() {
		
		
		
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public String getNombreRuta() {
		return nombreRuta;
	}

	public void setNombreRuta(String nombreRuta) {
		this.nombreRuta = nombreRuta;
	}

	}
