package ar.edu.unq.poo2.tpCompositeCultivo;

public class PorcionPura extends Porcion {

	 Cultivo cultivo ;
	 
	public PorcionPura(Cultivo cultivo) {
		super(); 
		this.cultivo = cultivo;
	}
	
	
	public Cultivo getCultivo() {
		return cultivo;
	}


	public void setCultivo(Cultivo cultivo) {
		this.cultivo = cultivo;
	}


	@Override
	public double gananciaAnualesDeSoja() {
		 return (this.getCultivo().gananciaAnualDeSojaParaPorcionPura());
	}

	
	

}
