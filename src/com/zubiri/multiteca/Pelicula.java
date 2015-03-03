package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula extends Obra{

	private String productora;
	private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista autor, int anioEdicion, String productora, ArrayList<Artista> interpretes) {
		super(titulo, autor, anioEdicion);
		this.productora = productora;
		this.interpretes = interpretes;
	}
	
	public Pelicula (Scanner sc){
		
		super(sc);
		System.out.println("Escribe la discografia del disco");
		this.setProductora(sc.next());
		System.out.println("Escribe el numero de canciones");
		this.setInterpretes(interpretes);
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
	
public void mostrarPeli(){
		
		System.out.println("Pelicula:");
		super.mostrarObra();
		System.out.println("\tProductora: " + this.productora);
		System.out.println("\tInterpretes: " + this.interpretes);
	}
	
	public String formattedObra() {
		
		String PeliStr = 
				"PRODUCTORA:" + this.productora + "\n" + 
				"INTERPRETES:" + this.interpretes  + "\n" ;
				
				return PeliStr;
	}

}
