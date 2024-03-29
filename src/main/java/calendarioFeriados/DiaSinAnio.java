package calendarioFeriados;

public class DiaSinAnio {

	// ATRIBUTOS //
	
	public int dia;
	public int mes;
	
	// GETTERS SETTERS //
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia, int mes) {

		if (dia >= 1 && dia <= diasDelMes(mes)) {
			this.dia = dia;
		} else {
			throw new java.lang.IllegalArgumentException(
					"El numero de dia ingresado para ese mes es invalido");
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
	
	// METODOS //
	
	public DiaSinAnio(int dia, int mes) {
		this.setMes(mes);
		this.setDia(dia, mes);
	}
	
	private int diasDelMes(int mes) {
		switch (mes) {
		case 1: // Enero
		case 3: // Marzo
		case 5: // Mayo
		case 7: // Julio
		case 8: // Agosto
		case 10: // Octubre
		case 12: // Diciembre
			return 31;
		case 4: // Abril
		case 6: // Junio
		case 9: // Septiembre
		case 11: // Noviembre
			return 30;
		case 2: // Febrero
			return 29;
		default:
			throw new java.lang.IllegalArgumentException(
					"El mes debe estar entre 1 y 12");
		}
	}
	
}
