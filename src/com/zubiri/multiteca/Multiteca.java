package com.zubiri.multiteca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.*;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	public Multiteca(Scanner sc) throws IOException {
		int cant = -1;
		do{
			try{
				System.out.println("Cuantas obras quieres insertar? ");
				cant = sc.nextInt();
			}catch(InputMismatchException e){
				System.out.println("Eso no es un número");
				sc.nextLine();
			}
			System.out.println(cant);
		}while(cant < 0);
		for (int i = 0; i < cant; i++) {
			
			System.out.println("¿Qué obra quieres insertar?");
			System.out.println("Disco:-----------1");
			System.out.println("Libro:-----------2");
			System.out.println("Pelicula:--------3");
		    
			switch(sc.nextInt()) {
				case 1:
					Disco disco = new Disco(sc);
					multiteca.add(disco);
					break;
				case 2:
					Libro libro = new Libro(sc);
					multiteca.add(libro);
					break;
				case 3:
					Pelicula pelicula = new Pelicula(sc);
					multiteca.add(pelicula);
					break;
				default:
					System.out.println("No ha insertado la opción correcta.");
					break;
			}			
		}
		
	}

	public void mostrarMultiteca() {
		
		if (multiteca.size() == 0) {
			System.out.println("No se han cargado los obras");
		}
		for (int i = 0;i < multiteca.size();i++) {
			Obra obra = multiteca.get(i);
			obra.mostrarObra(); //dispatching din�mico a partir de polimorfismo
		}
	}
	
	public String formattedMultiteca() {
		return null;
		
	}

}

