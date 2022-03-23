package Tema2;
import java.util.Scanner ; 
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tecla = new Scanner (System.in); 
		
		int num ; 
		int cont ; 
		int tabla=0 ; 
		System.out.println("Escribe un numero "); 
		num = tecla.nextInt(); 
		
		for (cont=1 ; (cont<num) ; cont+=1) {
			
			System.out.println ( cont ); 
			
			if (num<10) {
				tabla = cont*1 ; 
				tabla = cont*2 ; 
			}
			System.out.println (tabla); 
			
		}
		

	}

}
