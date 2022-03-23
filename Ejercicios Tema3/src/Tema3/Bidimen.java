package Tema3;

public class Bidimen {
	
	
          public static void media (int[][] matriz ) {
        	  String [] asignaturas = {" FOL ", " SISTEMA INFO  ", " LENGUAJE ", " BASE DATOS ", " ENTORNOS ", " PROGRAMACION " }; 
	        
        	  for (int i=0 ; i < matriz.length ; i++) {
	        	
		     int total=0;
				for (int j=0 ; j <matriz[0].length; j++ ) {
					total = total+ matriz[i][j] ; 
				}
		System.out.println("La Nota media de "+asignaturas[i]+ " es "+(total/matriz[0].length));
	}
}
           public static void pintarMatriz(int[][] matriz ) {
	
	             for (int i = 0 ; i<matriz.length ; i++ ) {
		         for (int j=0 ; j <matriz[i].length; j++) {
			     System.out.print(matriz [i][j]+"|");
		   }
		      System.out.println (); 
	}
	
}
	     public static void main(String[] args) {
		// TODO Auto-generated method stub
//ASIGNATURAS , FOL , SIS , LENG , ENTORNOS ,  PROGRA , SISTEINF
		//NOTAS por asignaturas 4 notas por cada asignatura
		
		int notas [] [] = new int [6][4]; 
		
		// llenamos la matriz con notas 
		
		
		for (int i =0 ; i < notas.length; i++) { //filas 
			for (int j=0 ; j < notas[i].length; j++) {//columnas 
				notas [i] [j] = (int)( Math.random() * 10 + 1) ; 
				
				
			}
		}
		//pintar matriz 
		pintarMatriz(notas);
		// media 
		media(notas); 
	}
	

}
