package Tema2;
import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner tecla = new Scanner (System.in);
		
		int num ; 
		System.out.print("Escribe un numero ");
		num = tecla.nextInt();
		
		for (int i =1 ; i<=num ; i++) {
		
			if (num%i==0 ) {
			
				System.out.print(i+",");
			}
		}
		
	}

}
