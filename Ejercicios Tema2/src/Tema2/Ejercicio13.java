package Tema2;
import java.util.Scanner;
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in); 
	System.out.print("Introduce numero de filas ");
		int num = teclado.nextInt(); 
		 
		
	       for (int i=1; i<=num ; i++)		{	
	    	   
	    	   for (int  j=1 ; j <= i; j++) {
			     System.out.print ("*");
	    	   } 
	    	   System.out.println ("") ;
	       } 
			
		
	}

}
