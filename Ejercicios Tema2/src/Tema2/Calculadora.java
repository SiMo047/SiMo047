package Tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int opcion = 0 ;
		Scanner teclado= new Scanner(System.in);		
		int operacion,num1, num2 ; 
		
		do {
			
			System.out.println("1.Sumar");
			System.out.println("2.Restar");
			System.out.println("3.Multiplicar");
			System.out.println("4.Dividir");
			System.out.println("5.Salir" );
		
			try {
				opcion= (teclado.nextInt());
			} catch (InputMismatchException e) {
				System.out.println("No has introducido un numero");
			}
			
			
			switch (opcion) {
			case 1: System.out.println("Introduce num1"); 
			      num1=teclado.nextInt(); 
			      System.out.println("Introduce num2"); 
			      num2 = teclado.nextInt(); 
			      operacion = num1+num2 ; 
			      System.out.println("El resultado es "+ operacion);  break; 
			     
			     
			case 2: System.out.println("Introduce num1"); 
		      num1=teclado.nextInt(); 
		     System.out.println("Introduce num2"); 
		      num2 = teclado.nextInt(); 
		    operacion = num1-num2 ; 
		    System.out.println("El resultado es "+ operacion);  break; 
		    
			case 3: System.out.println("Introduce num1"); 
		      num1=teclado.nextInt(); 
		     System.out.println("Introduce num2"); 
		      num2 = teclado.nextInt(); 
		    operacion = num1*num2 ; 
		    System.out.println("El resultado es "+ operacion);  break; 
			
			case 4 : System.out.println("Introduce num1"); 
		      num1=teclado.nextInt(); 
		     System.out.println("Introduce num2"); 
		      num2 = teclado.nextInt(); 
		    operacion = num1/num2 ; 
		    System.out.println("El resultado es "+ operacion);  break; 
			case 5 : System.out.println("SALIENDO....") ; break; 
		    
		   
		
			
			}
			
		

		} while (opcion<6);
	 }

}
