package Tema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner tecla = new Scanner ( System.in ); 
		int num ; 
		int cont ; 
		System.out.println ( "Escribe un numero "); 
		num = tecla.nextInt(); 		
		

		
		for (cont=2 ; (cont<num) ;cont+=1) {
			
		if (cont%2==0) {
			cont++; 
		}
			System.out.println ( cont ); 
			
			
		}	
     
	
	}

}
