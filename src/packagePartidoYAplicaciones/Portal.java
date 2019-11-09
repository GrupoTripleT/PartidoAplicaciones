package packagePartidoYAplicaciones;

import java.util.Observable;
import java.util.Observer;

//Extencion
public class Portal implements IObservers {
	
	public Publisher publisher;


	public Portal( Publisher publisher) {
		this.publisher = publisher;
	}


	@Override
	public void publicar(Partido partido, String text) {
		if(partido.elPartidoEstaFinalizado()) {
			publisher.imprimirEnPantalla(text);
		}
	}
	
	

}
