package Tema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner tecla = new Scanner ( System.in ); 
			int num ; 
			int cont, factorial  ; 
			System.out.println ( "Escribe un numero "); 
			num = tecla.nextInt(); 		
			
			factorial =1; 
			
			
			for (cont=1 ; (cont<num) ;cont+=1) {
				
			
				System.out.println ( cont ); 
			 
			
				factorial= factorial * cont ; 
				 
				
			}
			System.out.println ("El factorial de "+num+ " es  " + factorial); 
	}

}
