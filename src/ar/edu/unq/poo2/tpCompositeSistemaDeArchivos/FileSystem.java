package ar.edu.unq.poo2.tpCompositeSistemaDeArchivos;

import java.util.Date;

public abstract class FileSystem {

	float size;
	String nombre;
	Date creationDate;
	Date lastModified;
	
	
	public FileSystem(float size, String nombre) {
		super();
		this.size = size;
		this.nombre = nombre;
		this.creationDate = new Date();
		this.lastModified = new Date();
	}
	
	
	
	public float getSize() {
		return size;
	}



	public void setSize(float size) {
		this.size = size;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Date getCreationDate() {
		return creationDate;
	}



	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



	public Date getLastModified() {
		return lastModified;
	}



	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}



	public abstract float totalSize();
	public abstract FileSystem oldestElement();
	public abstract FileSystem lastModified();
	public abstract void printStructure();
}
