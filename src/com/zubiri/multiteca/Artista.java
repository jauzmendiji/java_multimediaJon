package com.zubiri.multiteca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Artista {

	private String nombre;
	private int anioNacimiento;
		
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
	
	public Artista() {
		// TODO Auto-generated constructor stub
	}
	
	public Artista(String nombre, int anioNacimiento){
		
		this.nombre= nombre;
		this.anioNacimiento = anioNacimiento;
	}
	
	public String formattedArtista() {

		String ArtistaStr = 
		"NOMBRE:" + this.nombre + "\n" + 
		"AñO DE NACIMIENTO:" + this.anioNacimiento  + "\n";
		
		return ArtistaStr;
	}

	
}