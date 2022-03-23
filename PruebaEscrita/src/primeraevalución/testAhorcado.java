package primeraevalución;

import java.util.Scanner;

public class testAhorcado {
	
	public static void main (String[] args) {
		Ahorcado mi_juego = new Ahorcado (); 
		System.out.println ( mi_juego ); 
		Scanner sc = new Scanner (System.in) ; 
		int opcion=0 ; 
		boolean resuelto = false ; 
		do {
			System.out.println("1 . intentar letra "); 
			System.out.println ("2 . resolver ") ; 
			
			opcion = Integer.parseInt(sc.next()) ; 
			switch (opcion) {
			case 1 : {
				//lee una letra 
				String letra = sc.nextLine() ;
				mi_juego.intentar(letra.charAt(0)); 
				System.out.println("tu palabra " + mi_juego.getPalabraIntentada()); 
				System.out.println("tus fallos  " + mi_juego.getFallos()); 
				//comprobar si esta solucionado 
				if ( mi_juego.solucion()) {
					System.out.println("Has ganado ");
					resuelto = true ; 
				}
				break ; 
				
			}
			case 2 : {}
			 break ;
			
			default : 
			}	
		
		}while ( !resuelto && mi_juego.getFallos() < 6 );
	}

}
