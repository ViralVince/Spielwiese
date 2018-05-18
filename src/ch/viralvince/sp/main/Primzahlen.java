package ch.viralvince.sp.main;

public class Primzahlen {
	
	public void prüfeZahl(int i) {
		boolean b= false;
		int c=2;
		while(b == false) {
			if(i%c==0) {
				if(i!=c) {
					
					b = true;
					System.out.println("JA");
				} else {
					System.out.println("NEIN");
				} if(c>=i) {
					break;
				}
			
				c++;
			}
		}
			
	}
	
	
}
