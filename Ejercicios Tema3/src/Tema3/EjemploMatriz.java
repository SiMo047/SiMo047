package Tema3;

public class EjemploMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		int matriz[][]= new int[4][6];
	
		int i =0; 
		int j=0;
		for (i=0 ; i<matriz.length; i++) {
			System.out.print("Fila " + i );
			for (j=0 ; j<matriz[0].length; j++) {
				System.out.print("  Columna "+j );
			}
			System.out.println("");
		}
		
		
		
		
	}

}
