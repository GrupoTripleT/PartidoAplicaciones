package packagePartidoYAplicaciones;

import java.util.ArrayList;
import java.util.List;

public class Partido {
	
	private String equipoLocal;
	private String  equipoVisitante;
	private Integer golesLocales;
	private Integer golesVistantes;
	private MomentoDelPartido momento;
	
	private List<IObservers> observadores;// Extencion
	
	public Partido(String equipoLocal, String equipoVistante) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVistante;
		this.golesLocales = 0;
		this.golesVistantes = 0;
		this.momento = new Inicializado();
		this.observadores = new ArrayList<IObservers>(); // Extencion
	}

	// Extencion
	public void suscribir(IObservers observer) {
		this.observadores.add(observer);
	}
	public void golLocal() {
		this.momento.golLocal(this);
	}
	
	public void golVisitante() {
		this.momento.golVisitante(this);
	}
	
	public void finalizar() {
		this.momento.finalizar(this);
	}
	
	public String resultado() {
		return this.momento.getResultado(this);
	}
	
	void sumarGolLocal() {
		this.golesLocales += 1;
	}
	
	void sumarGolVisitante() {
		this.golesVistantes += 1;
	}
	
	String getEquipoLocal() {
		return this.equipoLocal;
	}
	
	String getEquipoVisitante() {
		return this.equipoVisitante;
	}
	
	Integer getGolesLocales() {
		return this.golesLocales;
	}
	
	Integer getGolesVisitantes() {
		return this.golesVistantes;
	}
	
	void setEstado(MomentoDelPartido estado) {
		this.momento = estado;
	}
	
	// Extencion
	public Boolean elPartidoEstaFinalizado() {
		return this.momento.esFinalizado();
	}
	
	// Extencion
	public void notificar() {
		for( IObservers observer : this.observadores) {
			observer.publicar(this,this.resultado());
		}
	}
	
}
