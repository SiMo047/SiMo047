package Tema1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner entrada= new Scanner(System.in);
			
		int numero , numero2 ;
		System.out.println ("Escribe un numero"); 
		numero=entrada.nextInt();
		numero2=numero%10 ;
		numero=numero/10;
		
		
		
		System.out.println ( "Aqui esta intercambiado " +numero2+numero );
		
		
	}

}
