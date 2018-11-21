/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.echo;

/**
 *
 * @author ASUS PC
 */
public class Usuario {
    String usuario;
    String contrasena;
    
    public Usuario(String usuario, String contrasena)
    {
        this.usuario=usuario;
        this.contrasena=contrasena;
    }

    public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }




}
