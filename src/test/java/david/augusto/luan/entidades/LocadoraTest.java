package david.augusto.luan.entidades;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class LocadoraTest {

	@Test
	public void adicionarCarro() {
		Carro c = new Carro("Toyota","Hillux", 2020, 5000.00);
		assertTrue(c.isAlugado());
	}
	
	@Test
	public void listarCarros() {
		
	}
}
