package packagePartidoYAplicaciones;

//Extencion
public class AplicacionMovil implements IObservers {

	public Publisher publisher;
	
	public  AplicacionMovil(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public void publicar(Partido partido, String text) {
		publisher.imprimirEnPantalla(text);
	}
	

}
