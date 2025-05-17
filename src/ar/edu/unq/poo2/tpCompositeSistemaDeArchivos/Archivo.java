package ar.edu.unq.poo2.tpCompositeSistemaDeArchivos;

public class Archivo extends FileSystem{

	public Archivo(float size, String nombre) {
		super(size, nombre);
	}

	@Override
	public float totalSize() {
		return this.getSize();
	}
	
	@Override
	public FileSystem oldestElement() {
		
		return(this);
	}
	
	@Override
	public FileSystem lastModified() {
		return(this);
	}
	
	@Override
	public void printStructure() {
	    System.out.println("- " + this.getNombre() + " (Archivo, " + this.getSize() + " KB)");
	}

}
