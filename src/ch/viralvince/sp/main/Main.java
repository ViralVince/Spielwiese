package ch.viralvince.sp.main;

import java.util.Scanner;

public class Main {

//	public static void main (String[] args) {
//		System.out.println("Aretmetische Reie");
//		Scanner Eingabe = new Scanner(System.in);                                                
//		System.out.println("Zahl?"); 
//		String zahl = Eingabe.next();
//		Integer x = Integer.valueOf(zahl);
//		Integer e = 0;
//		Integer j = 0;
//		for(int i=1; i<x+1; i++) {
//			j = j+2;
//			e = e+j-1;
//		int rarityRandom = (int) (Math.random() * 2);
//		System.out.println(rarityRandom);
//		}
//		
//		
//	System.out.println("Das Ergebnis ist " + e);
//		Eingabe.close();
//	}
//	
//	
//
//	private static int ggt(int zahl1, int zahl2) {
//		   while (zahl2 != 0) {
//		     if (zahl1 > zahl2) {
//		       zahl1 = zahl1 - zahl2;
//		     } else {
//		       zahl2 = zahl2 - zahl1;
//		     }
//		   }
//		   return zahl1;
//		 }
//
//
//		 public static void main(String[] args) {
//			 
//			 System.out.println("GGT Rechner");
//			 	Scanner Eingabe = new Scanner(System.in);                                                
//				System.out.println("Zahl1?"); 				
//				System.out.println("Zahl2?"); 
//				String arg1 = Eingabe.next();
//				Integer zahl1 = Integer.valueOf(arg1);
//				String arg2 = Eingabe.next();
//				Integer zahl2 = Integer.valueOf(arg2);
//
//		   int ergebnis = ggt(zahl1, zahl2);
//
//		   System.out.println("Der GGT von "  + zahl1 +
//		       " und " + zahl2 + " ist: " + ergebnis);
//		 }
	public static void main(String args[]){
		int a;
		int b;
		int r;
		int x=0;
		int y=0;
		int lcm;
 
 
 
		System.out.println("Geben Sie die Zahlen a,b ein," +
		 "von denen Sie das kgV ermitteln wollen");
 
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
 
		r=a%b;
 
		while(r>0){
			x=b;
			y=r;
 
			r=x%y;
		}
 
		 if(a==b)
				lcm=a*b;
			else
				lcm = (a*b)/y;
		System.out.println("das kgV von "+a+" und "+b+" ist "+lcm);
	}
}

