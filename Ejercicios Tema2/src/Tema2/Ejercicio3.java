package Tema2;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner num = new Scanner (System.in) ; 
   int numero ;

System.out.println( "Escribe un numero "); 
numero = num.nextInt(); 
 
if ( (numero>=0)&&(numero<10) ) {
	
	switch (numero){
	case 0: System.out.println("CERO");break; 
	case 1: System.out.println("UNO"); break; 
	case 2: System.out.println("DOS");break; 
	case 3: System.out.println("TRS");break; 
	case 4: System.out.println("CUATRO");break; 
	case 5: System.out.println("CINCO");break; 
	case 6: System.out.println("SEIS");break; 
	case 7: System.out.println("SIETE");break; 
	case 8: System.out.println("OCHO");break; 
	case 9: System.out.println("NUEVE");break; 
	
	
	}
} else {
	System.out.println ("El numero que ha introducido no es de un digito"); 
} 
	}

}
