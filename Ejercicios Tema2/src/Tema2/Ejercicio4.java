package Tema2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int euros = 362; 
		
		int b200=0 , b100=0 , b50=0 , b20=0 , b10=0 ; 
		// de 200
		b200= ( int)euros / 200 ; 
		
		if (euros % 200 !=0) {
		// de 100 
			b100= (int) (euros%200) / 100 ; 
			// de 50 
			b50 = (int) ((euros % 200 )%100 )/50 ; 
			//de 20 
			b20= (int)  (((euros % 200 )%100 )%50)/20 ; 
			//de 10 
			b10 = (int) ((((euros % 200 )%100 )%50)%20)/10 ;
		}
		System.out.println("De 200 hay "+ b200);
		System.out.println("De 100 hay "+b100);
		System.out.println("De 50 hay "+b50);
		System.out.println("De 20 hay "+b20);
		System.out.println("De 10 hay "+b10);
		
		
		

	}

}
