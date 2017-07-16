package ch.viralvince.sp.main;

import java.util.*;

public class Main {

	public static void main (String[] args) {
		System.out.println("Aretmetische Reie");
		Scanner Eingabe = new Scanner(System.in);                                                
		System.out.println("Zahl?"); 
		String zahl = Eingabe.next();
		Integer x = Integer.valueOf(zahl);
		Integer e = 0;
		Integer j = 0;
		for(int i=1; i<x+1; i++) {
			j = j+2;
			e = e+j-1;
		}
		
		
		System.out.println("Das Ergebnis ist " + e);
		Eingabe.close();
	}
	
	

}
