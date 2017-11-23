package ch.viralvince.sp.main;

import java.util.Scanner;



public class Main {
	
	
	static int[] a = new int[6];
	static int[] b = new int[6];
	
	public static void scan(){
		System.out.println("Geben sie 6 Zahlen ein");
		 
				Scanner sc = new Scanner(System.in);
				 a[0] = sc.nextInt();
				 a[1] = sc.nextInt();
				 a[2] = sc.nextInt();
				 a[3] = sc.nextInt();
				 a[4] = sc.nextInt();
				 a[5] = sc.nextInt();
				 sc.close();
		 
	}
	
	public static void compare(int[] f, int x, int u, int v) {
		if(u < v) {
			f[x] = u;
			f[x+1] = v;
		} else {
			f[x] = v;
			f[x+1] = u;
		}
	}
	
	public static void sort(){
		compare(b, 0, a[0], a[1]);
		compare(b, 2, a[2], a[3]);
		compare(b, 4, a[4], a[5]);
		//neue Zeile
		compare(a, 0, b[0], b[2]);
		compare(a, 2, b[1], b[4]);
		compare(a, 4, b[3], b[5]);
		//neue Zeile
		compare(b, 0, a[0], a[2]);
		compare(b, 2, a[1], a[4]);
		compare(b, 4, a[3], a[5]);
		//neue Zeile
		compare(a, 1, b[1], b[2]);
		compare(a, 3, b[3], b[4]);
		//neue Zeile
		compare(b, 2, a[2], a[3]);
		a[0] = b[0];
		a[2] = b[2];
		a[3] = b[3];
		a[5] = b[5];
		
	
	}
	
	public static void main(String[] args){
		Main.scan();
		Main.sort();
		System.out.println("Das Ergebnis lautet:");
		for(int l = 0; l != 6; l++) {
			System.out.println(a[l]);
		}
	}
}
