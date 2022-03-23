package Tema3;

public class Ejercicio7 {
	
	public static void pintarVector (int numero[]) {
	
		for (int i=0 ; i <numero.length; i++);
		System.out.print("|");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero[]= new int[10]; 
		for (int i = 0 ; i< 8 ; i++) {
			numero [i] =(int )(Math.random()* 100 + 1 ); 
			
		} pintarVector(numero); 
	
	
	
	}

}
