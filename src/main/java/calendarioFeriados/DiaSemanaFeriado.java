package calendarioFeriados;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiaSemanaFeriado {

	// ATRIBUTOS //
	
	private DayOfWeek dia;
	private LocalDate desde;
	private LocalDate hasta;
			
	// GETTERS SETTERS //
	
	public DayOfWeek getDia() {
		return dia;
	}
	
	public void setDia(DayOfWeek dia) {
		this.dia = dia;
	}
	
	public LocalDate getDesde() {
		return desde;
	}
	
	public void setDesde(LocalDate desde) {
		this.desde = desde;
	}
	
	public LocalDate getHasta() {
		return hasta;
	}
	
	public void setHasta(LocalDate hasta) {
		this.hasta = hasta;
	}
	
	public void setDiaSemanaFeriado(DayOfWeek dia,LocalDate desde,LocalDate hasta){
		this.setDia(dia);
		this.setDesde(desde);
		this.setHasta(hasta);
	}
	
	// METODOS //
	
}