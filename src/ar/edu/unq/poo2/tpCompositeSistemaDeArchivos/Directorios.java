package ar.edu.unq.poo2.tpCompositeSistemaDeArchivos;

import java.util.ArrayList;
import java.util.List;

public class Directorios extends FileSystem{

	List<FileSystem> listaDeArchivos;

	public Directorios(float size, String nombre, List<FileSystem> listaDeArchivos) {
		super(size, nombre);
		this.listaDeArchivos = listaDeArchivos;
	}
	
	public Directorios(float size, String nombre) {
		super(size, nombre);
		this.listaDeArchivos = new ArrayList<>();
	}

	public List<FileSystem> getListaDeArchivos() {
		return listaDeArchivos;
	}

	public void agregarArchivo(FileSystem archivo) {
		this.getListaDeArchivos().add(archivo);
	}
	
	@Override
	public float totalSize() {
		
		float total=this.getSize();;
		for(FileSystem archivo : listaDeArchivos) {
			total+=archivo.totalSize();
		}
		return total;
	}
	
	@Override
	public FileSystem oldestElement() {
		
		if(!this.getListaDeArchivos().isEmpty()) {
			FileSystem elementoMasAntiguo=(this.getListaDeArchivos()).get(0);
			for(FileSystem archivo : listaDeArchivos) {
				elementoMasAntiguo= elementoMasAntiguoEntre(elementoMasAntiguo, archivo);
			}
			return elementoMasAntiguo;
		}
		else {
			return null;
		}
	}

	private FileSystem elementoMasAntiguoEntre(FileSystem elementoMasAntiguo, FileSystem archivo) {
		if (archivo.creationDate.before(elementoMasAntiguo.creationDate)) {
	        return archivo;
	    } else if (elementoMasAntiguo.creationDate.before(archivo.creationDate)) {
	        return elementoMasAntiguo;
	    } else {
	        return elementoMasAntiguo; // Fechas iguales, retorna el primero
	    }
	}
	
	@Override
	public FileSystem lastModified() {
		if(!this.getListaDeArchivos().isEmpty()) {
			FileSystem ultimoElementoModificado=(this.getListaDeArchivos()).get(0);
			for(FileSystem archivo : listaDeArchivos) {
				ultimoElementoModificado= ultimoElementoModificadoEntre(ultimoElementoModificado, archivo);
			}
			return ultimoElementoModificado;
		}
		else {
			return null;
		}
	}

	private FileSystem ultimoElementoModificadoEntre(FileSystem ultimoElementoModificado, FileSystem archivo) {
		 if (archivo.lastModified.after(ultimoElementoModificado.lastModified)) {
		        return archivo;
		    } else {
		        return ultimoElementoModificado;
		    }
	}
	
	@Override
	public void printStructure() {
	    System.out.println("+ " + this.getNombre() + " (Directorio)");
	    for (FileSystem elemento : listaDeArchivos) {
	        System.out.print("  "); // Indentación para elementos hijos
	        elemento.printStructure();
	    }
	}
}
