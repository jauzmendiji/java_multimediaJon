package com.zubiri.multiteca;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int anioEdicion;
	
	public Obra(Scanner sc) {
		
		System.out.println("Titulo de la obra:");
		this.setTitulo(sc.next());

		do {
			try {
		System.out.println("Año de edicion de la obra:");
		this.setAnioEdicion(sc.nextInt());
			}catch(InputMismatchException exception){
				System.out.println("Eso no es numero");
				sc.nextLine();
			}
		} while (getAnioEdicion() == 0);
		System.out.println("Autor de la obra:");
		this.setAutor(Artista.buscarArtista(sc.next()));
	}
	
	

	public Obra(String titulo, Artista autor, int anioEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.anioEdicion = anioEdicion;
	}
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getAnioEdicion() {
		
		return anioEdicion;
	}

	public void setAnioEdicion(int anioEdicion) {
		
		this.anioEdicion = anioEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	
	public void setTitulo(String tit){
		this.titulo = tit;
	}

	public void mostrarObra() {
		System.out.println("\tTitulo:" + this.getTitulo());
		System.out.println("\tAño de edicion:" + this.getAnioEdicion());
		System.out.println("\tArtista: " + this.getAutor().getNombre());
		System.out.println("\t");
		
	}
	
	public String formattedObra() {
		
		String ObraStr = 
				"TITULO:" + this.titulo + "\n" + 
				"AUTOR:" + this.autor  + "\n" +
				"AÑO EDICION:" + this.anioEdicion  + "\n" ;
				
				return ObraStr;
		
	}
}