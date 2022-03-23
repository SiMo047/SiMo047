package Tema1;

public class Ejercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=4 , b=2 , c=3 , d = 2 ;
		int res,res1, res2 ; 
		
		res=(int) (5*Math.pow(a, 7)+Math.pow(b, 3)+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)));
		res1= (int) Math.sqrt(4*a*Math.pow(b, 2)+ Math.pow(a+b,2)); 
		res2 =  (int)((Math.pow(a, 3)*b/2*a*b*b)- Math.sqrt(12*Math.pow(d, 4))); 
		
		
		
         
        		 System.out.println(res);
        		 System.out.println(res1); 
        		 System.out.print( res2 ); 
	}

}
