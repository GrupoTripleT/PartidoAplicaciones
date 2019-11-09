package packagePartidoYAplicaciones;

public class Inicializado extends MomentoDelPartido {

	public void golLocal(Partido partido) {
		partido.sumarGolLocal();
		partido.notificar(); // Extencion
	}
	
	public void golVisitante(Partido partido) {
		partido.sumarGolVisitante();
		partido.notificar();// Extencion
	}
	
	public void finalizar(Partido partido) {
		partido.setEstado(new Finalizado());
		partido.notificar();// Extencion
	}
	
	@Override
	protected String getFrase() {
		// TODO Auto-generated method stub
		return "Resultado Parcial: ";
	}

}
