package Tema2;
import java.util.Scanner ; 
public class Ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print ("Escribe un numero para visualizar caules los primos anteriores a el  ");
		Scanner tecla = new Scanner (System.in); 
		
		int num ; 
		num = tecla.nextInt(); 
		int cont=0 ; 
		for (int j=1 ; j<num ; j++) {
			
			for (int i=1 ; i<=j ; i++) {
				if (j%i==0) {
					cont++; 
			 
				}
			}
			     if (cont<=2) {
				 System.out.print("Es primo "+j);
		         }
			     
			    
					
		} 
		
		
	    }
		
	
}
