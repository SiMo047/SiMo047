package Tema2;

public class Ejercicio11 {
	static int contD (int num) {
		int contador =0 ; 
		int division=0; 
		
		do {
			division = (int) num / 10; 
			num = division ; 
			contador ++; 
			
		} while (division>0); 
	return contador ; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println (contD(9982)); 
	}
	

}
