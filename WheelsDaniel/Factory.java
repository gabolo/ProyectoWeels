package com.example.echo;

import java.util.HashMap;

public class Factory {
	private HashMap<String, IUser> usuarios = new HashMap<String,IUser>();
	public void saveUsuario(IUser usuario) {
		usuarios.put(usuario.getCorreo(), usuario);
	}
	public IUser getUsuario(String correo){
		if((IUser) usuarios.get(correo) != null)
			return (IUser)usuarios.get(correo);
		return null;
	}
}