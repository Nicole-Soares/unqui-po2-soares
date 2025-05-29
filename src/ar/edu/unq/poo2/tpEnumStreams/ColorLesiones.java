package ar.edu.unq.poo2.tpEnumStreams;

public enum ColorLesiones {
	

	ROJO("Alto", "Te estas por morir"){
		@Override
		public ColorLesiones siguienteColor() {
			return GRIS;
		}
	}, GRIS("Alto", "Te estas por morir"){
			@Override
			public ColorLesiones siguienteColor() {
				return AMARILLO;
			}	 
		}, AMARILLO("Alto", "Te estas por morir"){
				@Override
				public ColorLesiones siguienteColor() {
					return MIEL;
				}
		}, MIEL("Alto", "Te estas por morir"){
				@Override
				public ColorLesiones siguienteColor() {
					return GRIS;
		
				}
		};
		
	public abstract ColorLesiones siguienteColor();
	
	
	
	
	String nivelDeRiesgo;
	String descripcion;
	
	ColorLesiones(String nivel, String des) {
		nivelDeRiesgo = nivel;
		descripcion = des;
	}

	public String getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}

	public void setNivelDeRiesgo(String nivelDeRiesgo) {
		this.nivelDeRiesgo = nivelDeRiesgo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
