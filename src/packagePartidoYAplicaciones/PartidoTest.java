package packagePartidoYAplicaciones;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidoTest {

	public Partido partidoBocaRiver; //SUT
	
	public AplicacionMovil app;  // DOC 
	public Publisher publisher; //DOC MOCK SPY 
	

	@BeforeEach
	void setUp() throws Exception {
		partidoBocaRiver = new Partido("Boca", "River");

		publisher = mock(Publisher.class);
		app = new AplicacionMovil(publisher);
		
		partidoBocaRiver.suscribir(app);

	}

	@Test
	void testAplicacionMovil() {
		partidoBocaRiver.golLocal();
		assertTrue(partidoBocaRiver.getGolesLocales()== 1);
		verify(publisher, times(1)).imprimirEnPantalla(anyString());
	}

}
