package Tema2;
import java.util.Scanner ; 
public class Ejercicio17 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in); 
		
		int num=1 , num2;
		System.out.println("Escribe dos numero ") ; 
		
		num += teclado.nextInt(); 
		
		num2 = teclado.nextInt();
		
		int cont=0   ; 
		
			for (int i=num ; i<num2; i++) {
	    	
	    			if (i%2==0) {
	    		 cont++;
	    				System.out.print (i+"-");
	    				System.out.println(cont);
	    			}
	    	}
		
		
	
			
	} 
		}
		



	


