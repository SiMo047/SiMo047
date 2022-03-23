package Tema1;

public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t , conv,conv1, r   ;
		t= 10000; 
		conv=t/ 60 ;
		t%=60;
		conv1=conv/60 ; 
		r= conv%60;
		
		
		
		
		System.out.println ("Horas="+conv1+" Min="+r+" Seg="+t);
	
	}

}
