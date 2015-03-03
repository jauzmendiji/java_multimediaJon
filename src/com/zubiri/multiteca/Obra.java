package com.zubiri.multiteca;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int anioEdicion;
	Artista artista = new Artista();
	
	public Obra(Scanner sc) throws IOException {
		
		System.out.println("Título de la obra:");
		this.setTitulo(sc.next());
		System.out.println("Nombre del autor:");
		artista.setNombre(sc.next());
		System.out.println("Año de nacimiento del autor:");
		artista.setAnioNacimiento(sc.nextInt());
		System.out.println("Año de edición de la obra:");
		this.setAnioEdicion(sc.nextInt());
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