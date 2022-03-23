package Tema1;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int resultado ; 
		int A=6 , B=2 , C=3 ; 
		
		resultado=(A * C) %  C	; 
		System.out.println("a-"+resultado);
		
		
		resultado=A * B / C	;
		System.out.println("b-"+resultado);
		
		resultado= C % B + C * B ;
		System.out.println("c-"+resultado);
		
		resultado= A % ( A * B * C / (B + C) );
		System.out.println("d-"+resultado);
		
		resultado= B * B + C-B * (A % B );
		System.out.println("e-"+resultado);
		
		
	}

}




