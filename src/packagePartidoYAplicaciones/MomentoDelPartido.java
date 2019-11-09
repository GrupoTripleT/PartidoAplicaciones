package packagePartidoYAplicaciones;

public abstract class MomentoDelPartido {
	
	public void golLocal(Partido partido) {
		partido.setEstado(new Erroneo());
	}

	public void golVisitante(Partido partido) {
		partido.setEstado(new Erroneo());
	}
	
	public String getResultado(Partido partido) {
		return this.getFrase() + this.resultado(partido);
	}
	
	private String resultado(Partido partido) {
		return  partido.getGolesLocales() + "-" + partido.getGolesVisitantes() ;
	}

	protected abstract String getFrase();
	
	public void finalizar(Partido partido) {
		partido.setEstado(new Finalizado());
	}
	
	// Extencion
	public Boolean esFinalizado() {
		return false;
	}
}
