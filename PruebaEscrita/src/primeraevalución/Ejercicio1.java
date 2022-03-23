package primeraevalución;
import java.util.Scanner ; 
public class Ejercicio1 {
	//metodo pintar vector 
	public static void pintarMatriz (int numero[][]) {
		
		for (int i=0 ; i <numero.length; i++){
			
			
		  for (int j = 0 ; j<numero.length; j++) {
		System.out.print(numero[i][j]+"|");
		  }  
		  System.out.println("");
		 
		}
	}

// 				MAIN 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner ( System.in); 
		int opcion =0 ; 
		int matriz[] []= new int [20][20];
		
		int opciones ; 
  
		// creacion del vector [20][20]
		for (int i=0 ; i< matriz.length; i++ ) {
			matriz [i][0] = (int)( Math.random()* 100 + 1 ); 
			
			for (int j = 0 ; j<matriz[i].length; j++) {
				matriz[i][j]= (int)( Math.random()* 100 + 1 ); 
			}
		}  
		
		pintarMatriz(matriz ); 
	System.out.println (""); 
	
      			int sumar=0; 
	  //menu de opciones 
		do {
			System.out.println("1.Sumar Filas ");
			System.out.println("2.Sumar Columnas ");
			System.out.println("3.Sumar Diagonal  ");
			System.out.println("4.Media  ");
			System.out.println("5.Pintar Matriz  ");
			System.out.println("6.Ordenar  ");
			System.out.println("7.Salir  ");
			System.out.println (""); 
			opcion = (teclado.nextInt()); 
			switch (opcion) {
			case 1 : System.out.print( "Que fila desea sumar ");
			    opciones = (teclado.nextInt()); 
				for (int i = 0 ; i <matriz [0].length ; i++ ) {
					
					for (int j =0 ; j< matriz .length ; j ++ ) {
						sumar+= matriz [opciones][i];
					}
			   } System.out.println( sumar );
			}
			
			
			
		}while (opcion<=7);
		

 
	}
	
	
	
	
	}

