package Tema2;


import java.util.Scanner;


public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner tecla = new Scanner ( System.in ); 
			int num ; 
			int cont, doble=0 , triple=0  ; 
			System.out.println ( "Escribe un numero "); 
			num = tecla.nextInt(); 		
			

			
			for (cont=1 ; (cont<num) ;cont+=1) {
				
			
				System.out.println ( cont ); 
			 
				doble = cont*2 ; 
				triple = cont*3; 
				System.out.println ("El doble de este numero "+doble); 
				System.out.println ("El triple  de este numero "+triple); 
				
				
				
			}	
	     
	}

}
