package com.zubiri.multiteca;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int anioEdicion;
	
	public Obra() {
		
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
}