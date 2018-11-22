package com.example.echo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Facade.class, ProxyTest.class })
public class IntegrationTest {

	@Test
	void testAutenticar() {
	
		Facade facade = Facade.reemplazarConstructora();
		Factory factory = Factory.reemplazarConstructora();

		IUsuario u = new Pasajero();
		u.adicionar("2", "2", "Juan");
		factory.saveUsuario(u);
		
		IUsuario user= facade.autentica("2", "2");
		
		assertTrue(user != null);
	}


}