package Tema3;
import java.util.Scanner ; 
public class Ejercicio1 {
	
	public static void pintarVector (int array[]) {
		
		for (int i=0 ; i <array.length; i++) {
	
		System.out.print(array[i]+" | ");
		}
		
	}


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
				System.out.println (""); 
				
				System.out.println("Invertido seria de la siguiente manera "); 
				
				
				for (int i=9 ; i>=0 ; i--) {
					
					System.out.print(array[i]+" | "); 
					
				}
				
				
	
	
	
		

	}

}
