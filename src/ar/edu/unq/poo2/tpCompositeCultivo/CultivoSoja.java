package ar.edu.unq.poo2.tpCompositeCultivo;

public class CultivoSoja extends Cultivo {

	
	private int ganancia;
	
	
	public CultivoSoja() {
		super();
		this.ganancia = 500;
	}

	
	
	public int getGanancia() {
		return ganancia;
	}



	public void setGanancia(int ganancia) {
		this.ganancia = ganancia;
	}



	@Override
	public  double gananciaAnualDeSojaParaPorcionPura (){
		
		return this.getGanancia();
	}
	
	
}
