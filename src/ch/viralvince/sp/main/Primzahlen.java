package ch.viralvince.sp.main;

public class Primzahlen {
	
	public boolean prüfeZahl(int i) {
		boolean b= false;
		int c=2;
		while(b == false) {
			if(i%c==0) {
				if(i!=c) {
					b = true;
					return true;
				} else {
					return false
				}
			}
		}
			
	}
	
	
}
