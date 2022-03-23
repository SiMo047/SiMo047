package Tema3;
import java.util.Scanner; 
public class array {

	public static void pintarvector (int notas[]) {
		//notas.leinght nos dice el tamaño del array 
		for (int i=0 ; i<notas.length ; i++) {
			System.out.print(notas[i]+" , ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int notas[];
		int numnotas=10; 
		
		notas = new int[numnotas]; 
		
		for (int i=0 ; i<10 ; i++) {
		Scanner teclado = new Scanner(System.in ); 
		System.out.println (" Dime una nota "); 
		int valor = teclado.nextInt(); 
		
		
		//Meto el valor leido de teclado en array 
		notas[i] = valor ; 
		}
		// pinto el vector 
		pintarvector(notas); 
	
	// calcular nota media 
		int total =0 ; 
		for (int i=0 ; i<notas.length; i++) {
		total = total + notas[i] ; 
		
		}
		System.out.println("El total es : "+ total ); 
		System.out.println( " La nota media es : "+ ( total /notas.length)); 
	}

	  
}
