package Tema3;

public class Ejercicioclase {


	public static void pintarVector (int numeros []) {
		System.out.print("|");
		for (int i=0 ; i <numeros.length; i++);
		System.out.print ("|");
		
	}
	
	
	public static int sumarImpares(int numeros []) {
		int suma=0 ; 
		for (int i=0 ; i < numeros.length; i+= 2) {
			suma = suma + numeros [i];
		}
	   return suma ; 
	}
	////MAINNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numeros[] = new int [20] ; 
		for (int i=0 ; i < numeros.length; i++ ) {
			numeros [i] = (int) (Math.random() * 100 + 1 ); 
	 
			System.out.println(sumarImpares(numeros)); 
			
		}
	}

}
