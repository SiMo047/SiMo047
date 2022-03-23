package Tema2;
import java.util.Scanner; 
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tecla = new Scanner (System.in); 
		int num ; 
		
		do {
			System.out.println("Escribe un numero");
			num = tecla.nextInt(); 
		
		} while (num>10); 
		System.out.println ("FIN "); 
	}

}
