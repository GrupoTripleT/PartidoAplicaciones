package packagePartidoYAplicaciones;

public class Finalizado extends MomentoDelPartido {

	protected String getFrase() {
		return "Final: ";
	}

	// Extencion
	public Boolean esFinalizado() {
		return true;
	}
}
