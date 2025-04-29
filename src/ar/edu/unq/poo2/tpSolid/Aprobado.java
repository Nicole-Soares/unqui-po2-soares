package ar.edu.unq.poo2.tpSolid;

public class Aprobado extends Estado {

	@Override
	public double montoOtorgado(Credito credito) {
		return credito.getMontoSolicitado();
	}
}
