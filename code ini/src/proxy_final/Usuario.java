/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_final;

/**
 *
 * @author ASUS PC
 */
public class Usuario {
    String usuario;
    String contrase�a;
    
    public Usuario(String usuario, String contrase�a)
    {
        this.usuario=usuario;
        this.contrase�a=contrase�a;
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

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", contrase�a=" + contrase�a + '}';
    }




}
