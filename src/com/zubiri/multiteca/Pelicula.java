package com.zubiri.multiteca;

import java.util.ArrayList;

public class Pelicula extends Obra{

	private String productora;
	private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista autor, int anioEdicion, String productora, ArrayList<Artista> interpretes) {
		super(titulo, autor, anioEdicion);
		this.productora = productora;
		this.interpretes = interpretes;
	}
		
	public String getProductora() {
		
		return productora;
	}
	
	public void setProductora(String productora) {
		
		this.productora = productora;
	}
	
	public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}
	
	public String formattedObra() {
		
	}

}
