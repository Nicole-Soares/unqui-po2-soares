package ar.edu.unq.poo2.tpCompositeCultivo;

public class CultivoTrigo extends Cultivo{
	
	private int ganancia;
	
	
	public CultivoTrigo() {
		super();
		this.ganancia = 300;
	}

	

	public int getGanancia() {
		return ganancia;
	}



	public void setGanancia(int ganancia) {
		this.ganancia = ganancia;
	}



	@Override
	public  double gananciaAnualDeSojaParaPorcionPura (){
		
		return 0;
	}
	

}
