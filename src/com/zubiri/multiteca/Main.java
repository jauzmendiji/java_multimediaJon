package com.zubiri.multiteca;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Main {

	public static void main(String[] args) throws IOException {
		
		int seleccion = -1;
		Scanner sc = new Scanner(System.in);
		
		if (args.length == 0) {
			System.out.println("El número de argumentos no es válido:");
			System.out.println("java main <fichero_multiteca>");
			System.exit(-1);
		}
		
		
		do {
			try{
				//Visualiza por terminal (stdout) las opciones del menu
				System.out.println("Mostrar multiteca---------------------------1");
				System.out.println("Insertar obra------------------------------2");
				System.out.println("Mostrar artistas--------------------------------3");
				System.out.println("SALIR DEL PROGRAMA-------------------------------4");
				   
				seleccion = sc.nextInt();
				switch (seleccion) {
					case 1: //Mostrar multiteca
						Multiteca.mostrarMultiteca(args[0]);
						break;
					
					case 2: //Insertar obra
						
						break;
					case 3: //Mostrar artistas
						if ( 1 == 1) {
						System.out.println("");
						}
						
						break;
					case 4: //Salimos
						break;
					default:
						System.out.println("No ha insertado la opcion correcta");
				
				}
		
			}catch(InputMismatchException e){
				System.out.println("Eso no es un número ");
				sc.nextLine();
			}
} while (seleccion != 4);
		
		System.out.println("Gracias por usar nuestro programa. Que tenga un buen día!");
		sc.close();
	}
}