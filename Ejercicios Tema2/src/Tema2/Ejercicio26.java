package Tema2;
import java.util.Scanner ; 
public class Ejercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner tecla = new Scanner (System.in ); 
		int num ; 
		int resto , inver=0 ; 
	
		System.out.print ("Escribe un numero para invertirlo ");
		num = tecla.nextInt(); 
		
		while (num>0) {
			resto= num%10; 
			inver = inver*10+resto ; 
			num= num/10; 
		}
		System.out.print("Num invertido " + inver);
	
	}
	
	

}
