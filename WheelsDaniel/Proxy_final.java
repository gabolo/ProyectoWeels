package com.example.echo;

import java.util.ArrayList;
import com.google.api.server.spi.auth.EspAuthenticator;
import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiIssuerAudience;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.UnauthorizedException;
//[START echo_api_annotation]
@Api(
    name = "proxy",
    version = "v1",
    namespace =
    @ApiNamespace(
        ownerDomain = "echo.example.com",
        ownerName = "echo.example.com",
        packagePath = ""
    )
)

//[END echo_api_annotation]
public class Proxy_final implements Ifolder {
	/**
	 * Create an instance of the Facade unique object
	 */
	private Facade facade = Facade.remplazarConstructora();
	/**
	 * This methods create an unique instance of the Proxy
	 */
	private static Proxy_final unicaInstancia = null;
	
	public Proxy_final() {
	}
	
	public static Proxy_final reemplazarConstructura() {
		if(unicaInstancia == null) {
			unicaInstancia =  new Proxy_final();
		}
		return unicaInstancia;
	}
	
	/**
	 * this method grants access to the facade instance, 
	 * @return an identity of the user in the server instance
	 */
	@ApiMethod(name = "ingresarAplicacion")
	@Override
	public ArrayList<String> login(@Named("su")String su, @Named("pass")String pass){
			IUser usuario = facade.autenticar(su, pass);
			if (usuario != null) {
				ArrayList<String> entrycode = new ArrayList<>();
				String clave = "identificado";
				entrycode.add(clave);
				facade.addIdentidad(clave);
				return entrycode;
			}
			return null;
	}
}