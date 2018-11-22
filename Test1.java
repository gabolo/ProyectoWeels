/**
 * 
 */
package com.example.echo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * @author Santiago
 *
 */
class FacadeTest {
	@Test
	void testCrear() {
	
		Facade facade = Facade.reemplazarConstructora();
		
		Reserva r = facade.crearReserva(1, 1, "idprueba");
	
		Reserva reserva = facade.buscarReserva(r.getIdPasajero(), r.getidRuta(), r.getAsientos());
		
		assertEquals(reserva.getIdPasajero(),"idprueba");
	}

	@Test
	void testEliminar() {
		
		Facade facade = Facade.reemplazarConstructora();
	
		Reserva r = facade.crearReserva(2, 2, "id2prueba");
		
		facade.eliminarReserva("correo2prueba", 2);
		
		Reserva reserva = facade.buscarReserva(r.getIdPasajero(), r.getidRuta(), r.getAsientos());
	
		assertTrue(reserva == null);
	}

	@Test
	void testModificar() {
	
		Facade facade = Facade.reemplazarConstructora();
		
		Reserva r = facade.crearReserva(3, 3, "id3prueba");
		
		facade.modificarReserva("id3prueba", 3, 4);
	
		Reserva reserva = facade.buscarReserva("id3prueba", 3, 4);
		
		assertEquals(reserva.getAsientos(), 4);
	}
	@Test
	void testListar() {
		
		Facade facade = Facade.reemplazarConstructora();
		
		ArrayList<Reserva> res= new ArrayList<Reserva>();
	
		Reserva r1 = facade.crearReserva(4, 4, "id4prueba");
		Reserva r2 = facade.crearReserva(5, 4, "id4prueba");
		Reserva r3 = facade.crearReserva(6, 3, "id4prueba");
		Reserva r4 = facade.crearReserva(7, 2, "id4prueba");
		res=facade.listarReservasHechas("id4prueba");
		assertTrue(!res.isEmpty());
	}
	@Test
	void testBuscar() {
	
		Facade facade = Facade.reemplazarConstructora();
		
		Reserva r1 = facade.crearReserva(4, 4, "id5prueba");
		
		Reserva reserva= facade.buscarReserva("id5prueba", 4, 4);
	
		assertEquals(reserva.getCorreoPasajero(),"id5prueba");
	}

}