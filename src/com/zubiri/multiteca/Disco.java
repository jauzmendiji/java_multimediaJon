package com.zubiri.multiteca;

public class Disco extends Obra{
	
	private String discografia;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int anioEdicion, String discografia, int nCanciones) {
		super(titulo, autor, anioEdicion);
		this.discografia = discografia;
		this.nCanciones = nCanciones;
	}
	
	public String getDiscografia() {
		
		return discografia;
	}
	
	public void setDiscografia(String discografia) {
		
		this.discografia = discografia;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	public String formattedObra() {
		
	}
}
