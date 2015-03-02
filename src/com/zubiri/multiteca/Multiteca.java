package com.zubiri.multiteca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	private Multiteca() {
		
	}

	public static void mostrarMultiteca(String fichero)throws IOException {
		
		Obra dana;
		FileInputStream f;
	    InputStreamReader fr;
	    BufferedReader br;
	    
	    f = new FileInputStream(fichero);
    	fr = new InputStreamReader(f, "UTF8");
    	br = new BufferedReader(fr);
    	dana = br.readLine();
    	
    	multiteca.add(dana);
    	br.close();
	}
	
	public String formattedMultiteca() {
		return null;
		
	}

	
	
}
