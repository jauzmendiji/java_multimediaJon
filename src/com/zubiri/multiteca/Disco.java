package com.zubiri.multiteca;

import java.io.IOException;
import java.util.Scanner;

public class Disco extends Obra{
	
	private String discografica;
	private int nCanciones;
	
	public Disco(String titulo, Artista autor, int anioEdicion, String discografica, int nCanciones) {
		super(titulo, autor, anioEdicion);
		this.discografica = discografica;
		this.nCanciones = nCanciones;
	}
	public Disco (Scanner sc) throws IOException{
		
		super(sc);
		System.out.println("Escribe la discografica del disco");
		this.setDiscografica(sc.next());
		System.out.println("Escribe el numero de canciones");
		this.setnCanciones(sc.nextInt());
	}
	
	public String getDiscografica() {
		
		return discografica;
	}
	
	public void setDiscografica(String discografica) {
		
		this.discografica = discografica;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	public void mostrarObra(){
		
		System.out.println("Disco:");
		super.mostrarObra();
		System.out.println("\tDiscografica: " + this.discografica);
		System.out.println("\tNumero de canciones del disco: " + this.nCanciones);
	}
	
	public String formattedObra() {
		
		String DiscoStr = 
				"DISCOGRAFICA:" + this.discografica + "\n" + 
				"NUMERO DE CANCIONES:" + this.nCanciones  + "\n" ;
				
				return DiscoStr;
	}
}