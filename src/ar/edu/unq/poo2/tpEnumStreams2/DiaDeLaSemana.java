package ar.edu.unq.poo2.tpEnumStreams2;

public enum DiaDeLaSemana {
	LUNES(true),
	MARTES(true),
	MIERCOLES(true),
	JUEVES(false),
	VIERNES(false),
	SABADO(false),
	DOMINGO(false);
	
	boolean diaDeSemanaHabil;

	private DiaDeLaSemana(boolean diaDeSemanaHabil) {
		this.diaDeSemanaHabil = diaDeSemanaHabil;
	}

	public boolean isDiaDeSemanaHabil() {
		return diaDeSemanaHabil;
	}

	public void setDiaDeSemanaHabil(boolean diaDeSemanaHabil) {
		this.diaDeSemanaHabil = diaDeSemanaHabil;
	}
	
	
}
