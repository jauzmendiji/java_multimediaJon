package com.zubiri.multiteca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Artista {

	private String nombre;
	private int anioNacimiento;
	private static ArrayList<Artista> listaArtista = new ArrayList<Artista>();

	public Artista(String nombre, int anioNacimiento) {
	
		this.nombre = nombre;
		this.anioNacimiento = anioNacimiento;
	}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAnioNacimiento() {
		
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		
		this.anioNacimiento = anioNacimiento;
	}

	public static void mostrarArtista(String fichero) throws IOException {
		
		String linea;
		FileInputStream f;
	    InputStreamReader fr;
	    BufferedReader br;
	    
	    f = new FileInputStream(fichero);
    	fr = new InputStreamReader(f, "UTF8");
    	br = new BufferedReader(fr);
    	linea = br.readLine();
		
		if (linea == null) {
			System.out.println("No existen artistas en el fichero");
		}
		
		while ((linea != null) && (linea.compareTo("") != 0)) {
			Artista artista = new Artista (linea,",");
			listaArtista.add(artista);
			linea = br.readLine();
		}
	}
	
	public Artista (String linedArtista , String separ){
		
		String[] strArray = linedArtista.split(separ);
		this.setNombre(strArray[0]);
		this.setAnioNacimiento(Integer.parseInt(strArray[1]));
	}
	
	public String formattedArtista() {

		String ArtistaStr = 
		"NOMBRE:" + this.nombre + "\n" + 
		"AñO DE NACIMIENTO:" + this.anioNacimiento  + "\n";
		
		return ArtistaStr;
	}
	
}
