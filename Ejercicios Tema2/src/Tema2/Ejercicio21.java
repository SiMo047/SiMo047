package Tema2;
import java.util.Scanner ; 
public class Ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print ("Escribe un numero para comprobar si es primo ");
		Scanner tecla = new Scanner (System.in); 
		
		int num ; 
		num = tecla.nextInt(); 
		int cont=0 ; 
		
			for (int i=1 ; i<=num ; i++) {
				if (num%i==0) {
					cont++; 
			 
				}
			}
			     if (cont<=2) {
				 System.out.print("Es primo ");
		         }else {
		    	 System.out.print("No es primo");
		         }
		
		}
		
	}


