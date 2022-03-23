package Tema3;
import java.util.Scanner;
public class Ejercicio13 {
	
	
	
	public static void pintarMatriz (int numero[][]) {
		int i ; 
		for (i=0 ; i <numero.length; i++);
		  for (int j = 0 ; j<numero.length; j++) {
			 
		  }  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in); 
		int matriz[][]= new int [3][4]; 
		// se rellana 
		for (int i =0 ; i < matriz.length; i ++ ) {
			System.out.println("Fila"+ i);
			for (int j=0 ; j< matriz [i].length ; j++ ) {
				System.out.print ("introduce valor "+j+":"); 
				
				matriz [i][j]= Integer.parseInt(teclado.nextLine()); 
				
			}
			System.out.println();
		}
		//pintamos maTRIZ 
		pintarMatriz (matriz ); 
		
		
		int suma ; 
		// SUmamos filas
		for (int i=0 ; i < matriz .length ; i++ ) {
			// cada  fila empiza A SUMAR desde cero 
			suma =0 ; 
			for (int j=0 ; j<matriz[i].length ; j++ ) {
				suma = suma + matriz [i][j]; 
			}
			System.out.println ( " La suma de la fila "+ i + " es " + suma ); 
			
		}
			
			int sumarC =0 ; 
		
			for ( int j = 0 ; j < matriz[0].length ; j ++) {
			   for ( int i= 0 ; i < matriz.length; i ++ )	{
				  sumarC +=  matriz[i][j]; 
			   }
			} System.out.println  (sumarC); 
		

	}

}
