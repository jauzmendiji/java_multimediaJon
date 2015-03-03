package com.zubiri.multiteca;

import java.io.IOException;
import java.util.Scanner;

public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;
	
	public Libro(String titulo, Artista autor, int anioEdicion, String editorial, int numPaginas) {
		super(titulo, autor, anioEdicion);
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}
	
	public Libro (Scanner sc) throws IOException{
		
		super(sc);
		System.out.println("Escribe la editorial del libro");
		this.setEditorial(sc.next());
		System.out.println("Escribe el numero de paginas");
		this.setNumPaginas(sc.nextInt());
	}
	
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	
	public void mostrarObra(){
		
		System.out.println("Libro:");
		super.mostrarObra();
		System.out.println("\tEditorial: " + this.editorial);
		System.out.println("\tNumero de paginas del libro: " + this.numPaginas);
	}
	
	public String formattedObra() {
		
		String LibroStr = 
				"EDITORIAL:" + this.editorial + "\n" + 
				"NUMERO DE PAGINAS:" + this.numPaginas  + "\n" ;
				
				return LibroStr;
	}

}