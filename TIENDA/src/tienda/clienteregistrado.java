package tienda;

import java.time.LocalDate;

public class clienteregistrado extends cliente  {
	
	private String email; 
	private String password ; 
	private  LocalDate fechaNacimiento ; 
	private LocalDate fecharegistro ; 
	private static double descuento ;
	
	
	public clienteregistrado(cliente uncliente ) {
		super(uncliente);
		// TODO Auto-generated constructor stub
	}


	


	public clienteregistrado(String nombre, String apellido, String dni, String localidad, String direccion) {
		super(nombre, apellido, dni, localidad, direccion);
		
		this.email=email; 
		this.password= password  ; 
		this.fechaNacimiento = fechanacimiento; 
		this.fecharegistro = fecharegistro; 
		this.descuento= descuento;
		// TODO Auto-generated constructor stub
	}



     @Override
	public double descuento() {
		// TODO Auto-generated method stub
		return 0;
	}
     
     

	
	
	
	
	

}
