package Tema3;
import java.util.Scanner ; 
public class Ejercicio2 {
	//pinta el vector !
	public static void pintarVector (int array[]) {
		
		for (int i=0 ; i <array.length; i++) {
	
		System.out.print(array[i]+" | ");
		}
		
	}
	//calcula la suma de los numeros introducidos y la media 
	
	public static void media(int array[]) {
		int total=0 ; 
		for (int i=0 ; i<10 ; i++) {
			total = total +array[i]; 
			
		}System.out.print("Suma total de los numeros " +total+" Media "+(total/10));
	
	}
	// calcula el mayor 
	public static void mayor (int array[]) {
		int mayor = array[0]; 
		
		for (int i =1 ; i < array.length;i++) {
			if (array[i] > mayor ) {
				mayor = array[i]; 
				
			} 
		}
		System.out.println(""); 
		System.out.println ("El mayor es "+ mayor );
		
	}
	//calcula el menor 
	public static void menor(int array[]) {
		int menor = array[0];
		for (int i=1 ; i < array.length; i++) {
			if (array[i]<menor ) {
				menor = array[i]; 
			}
		}
		
		System.out.println(""); 
		System.out.println ("El menor es "+menor );
		
		
	}
// MAIN MAIN MAIN MAIN 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tecla = new Scanner (System.in ); 
		int num ; 
		int array[]= new int[10]; 
	
		
		
				
	
				for (int i= 0 ; i<10;i++) {
					
					System.out.print("Escribe un num para introducir en la tabla ");
					
					num = tecla.nextInt(); 
					
					array[i]= num ; 
					
				
				} pintarVector(array); 
				media (array); 
				mayor (array); 
				menor (array); 
				
				
				System.out.println (""); 
				
				
			
				
			
	
	
	
		

	}

}