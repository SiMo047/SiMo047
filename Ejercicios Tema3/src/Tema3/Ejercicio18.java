package Tema3;

public class Ejercicio18 {

	
	public static void pintarMatriz (int numero[][]) {
		int i ; 
		for (i=0 ; i <numero.length; i++);
		  for (int j = 0 ; j<numero.length; j++) {
			 
		  }  
		
	}


	public static void main(String[] args){
		// TODO Auto-generated method stub
int encuesta [][]= new int [10][3]; 

	for (int i= 0 ; i < encuesta.length ; i++) {
	//sexo 
	encuesta[i][0]= (int)(Math.random()*2)+1; 
	
// trabaja
	encuesta [i][1] = (int )(Math.random()*2)+1 ; 
	
	//sueldo 
		if (encuesta[i][1]==2 ) {
		//no trabja entonces sueldo es 0 
		encuesta [i][2]=0 ; 
	} else 
		// si trabaja -- 600--2000 
		encuesta [i][2]= (int ) (Math.random()*1401)+600; 
		
 
  
	
	//pintamos 
	
	//calcular % 
	int numeroHombre =0;  
	int numeroMujer = 0 ; 
				for (i= 0 ; i < encuesta.length ;i++ ) {
		
		
						if (encuesta [i][0]==1)
							numeroHombre++ ; 
						if (encuesta [i][0]==2)
							numeroMujer++; 
					}
		
			}
	pintarMatriz(encuesta ); 
	}
}








