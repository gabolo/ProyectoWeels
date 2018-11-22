package com.example.echo;
import java.util.ArrayList;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.auth.EspAuthenticator;
import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.ApiIssuerAudience;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.UnauthorizedException;
@Api(
	    name = "facade",
	    version = "v1",
	    namespace =
	    @ApiNamespace(
	        ownerDomain = "echo.example.com",
	        ownerName = "echo.example.com",
	        packagePath = ""
	    )
	)

public class Facade {
	private ArrayList<Reserva> res = new ArrayList<Reserva>();
	private ArrayList<String> entrycodes = new ArrayList<>();
	private static Facade unicaInstancia = null;
	private static Factory factory= new Factory();
	
	static{
		IUser u =  new Pasajero();
		u.adicionar("Gabriel", "esgay", "Daniel");
		factory.saveUsuario(u);
	}
	
	public Facade() {
	}
	public IUser autenticar(@Named("user") String user,@Named("contrasena") String contrasena){
		
		IUser usuario = factory.getUsuario(user);
		if (usuario != null) {
			if (usuario.getContrasena().equals(contrasena)) {
				return usuario;
			}
		}
		return null;
	}

	public static Facade remplazarConstructora() {
		if (unicaInstancia == null) {
			unicaInstancia = new Facade()
;		}
		return unicaInstancia;
	}
	public void addIdentidad(@Named("ide") String ide) {
		this.entrycodes.add(ide);
	}
	
@ApiMethod(name = "crearReserva")
  public Reserva crearReserva(@Named("idRuta") int idRuta, @Named("asientos") int asientos,
  @Named("idPasajero") String idPasajero) {
      
    Reserva resp = new Reserva();
    resp.setIdPasajero(idPasajero);
    resp.setAsientos(asientos);
    resp.setidRuta(idRuta);
    res.add(resp);
    return resp;
  }
  @ApiMethod(name = "buscarReserva")
  	public ArrayList<Reserva> listarReservasHechas(@Named("idPasajero") String idPasajero) {
  		ArrayList<Reserva> reservasUser = new ArrayList<Reserva>();
		for (Reserva r : res) {
			if (r.getIdPasajero().equals(idPasajero)) {
				reservasUser.add(r);
				
			}
		}
		return reservasUser;
		
	
	}
	 @ApiMethod(name = "eliminarReserva")
public void eliminarReserva(@Named("idPasajero") String idPasajero,@Named("idRuta") int idRuta) {
		for(Reserva r : res){
			if(r.getIdPasajero().equals(idPasajero)&& r.getidRuta()==idRuta){
				res.remove(r);
			} 
		}
	}
		 @ApiMethod(name = "modificarReserva")
public void modificarReserva(@Named("idPasajero") String idPasajero,@Named("idRuta") int idRuta,@Named("asientos") int asientos) {
		eliminarReserva(idPasajero,idRuta);
		crearReserva(idRuta,asientos,idPasajero);
	}

}