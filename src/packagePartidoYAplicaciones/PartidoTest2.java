package packagePartidoYAplicaciones;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidoTest2 {

public Partido partidoBocaRiver; //SUT
	
	public AplicacionMovil app;  // DOC 
	

	@BeforeEach
	void setUp() throws Exception {
		partidoBocaRiver = new Partido("Boca", "River");
		app = mock(AplicacionMovil.class);		
		partidoBocaRiver.suscribir(app);

	}

	@Test
	void testAplicacionMovil() {
		partidoBocaRiver.golLocal();
		//assertTrue(partidoBocaRiver.getGolesLocales()== 1);
		verify(app, times(1)).publicar(partidoBocaRiver, "Resultado Parcial: 1-0");
	}

}
