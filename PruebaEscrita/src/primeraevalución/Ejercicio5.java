package primeraevalución;

public class Ejercicio5 { 
	
	//metodo pintar vector 
	public static void pintarMatriz (int matriz[]) {
	
	for (int i=0 ; i <matriz.length; i++) {

	System.out.print(matriz[i]+" | ");
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz [] = new int [5]; 

// vector "tirada de dados " 
		for (int i = 0 ; i< matriz.length; i++) {
			matriz [i]=(int)(Math.random()*6+1); 
		}pintarMatriz(matriz); 
		
		for (int i = 0 ; i< matriz.length; i++ ) {
			for (int j =0 ; j <matriz[i]; j++) {
				matriz [j]= matriz [j+1]; 
				
			} 
		}
		
	
	
	}

}
