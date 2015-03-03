package com.zubiri.multiteca;

import java.util.Scanner;

public class Disco extends Obra{
	
	private String discografia;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int anioEdicion, String discografia, int nCanciones) {
		super(titulo, autor, anioEdicion);
		this.discografia = discografia;
		this.nCanciones = nCanciones;
	}
	public Disco (Scanner sc){
		
		super(sc);
		System.out.println("Escribe la discografia del disco");
		this.setDiscografia(sc.next());
		System.out.println("Escribe el numero de canciones");
		this.setnCanciones(sc.nextInt());
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
	
	public void mostrarDisco(){
		
		System.out.println("Disco:");
		super.mostrarObra();
		System.out.println("\tDiscografia: " + this.discografia);
		System.out.println("\tNumero de canciones del disco: " + this.nCanciones);
	}
	
	public String formattedObra() {
		
		String DiscoStr = 
				"DISCOGRAFIA:" + this.discografia + "\n" + 
				"NUMERO DE CANCIONES:" + this.nCanciones  + "\n" ;
				
				return DiscoStr;
	}
}
