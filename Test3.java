package com.example.echo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProxyTest {

	@Test
	void testIngresarAplicación() {
		
		Proxy_final proxy= Proxy_final.reemplazarConstructura();
		
		Sesion sesion=proxy.ingresarAplicacion("1", "1");

		assertTrue(sesion!=null);
	}
	
	

}