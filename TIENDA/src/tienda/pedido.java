package tienda;

import java.time.LocalDate;
import java.util.ArrayList;

import tienda.pedido.Lineapedido;

public class pedido {
	public class Lineapedido {

		public double subtotal() {
			// TODO Auto-generated method stub
			return 0;
		}

		public Object getproducto() {
			// TODO Auto-generated method stub
			return null;
		}

		public int getcantidad() {
			// TODO Auto-generated method stub
			return 0;
		}

		public void setcantidad(int i) {
			// TODO Auto-generated method stub
			
		}
	
	}


	private static int incremento=1; 
	private LocalDate fecha ; 
	private int cod ;
	private double total ; //calculado 
	private cliente cliente  ; 
	private ArrayList<Lineapedido> lineas ; 
	
	
	public pedido () {
		super(); 
		this.cod=pedido.incremento; 
		pedido.incremento++; 
		this.fecha=LocalDate.now();
		this.total=0; 
		}
	
	public pedido (cliente cliente ) {
		super(); 
		this.cod=pedido.incremento; 
		pedido.incremento++; 
		this.fecha=LocalDate.now();
		this.cliente=cliente; 
		this.lineas = new ArrayList<>(); 
		this.total=0; 
		}

public double total () {
	double total =0; 
// total se va actulizando cada vez que a?ado una nueva linea pedido con el metodo nuevalinea
	return total - this.cliente.descuento();
}

public ArrayList<Lineapedido> getLineas(){
	return this.lineas ; 
	
}

public void nuevaLinea(Lineapedido lp) {
	boolean encontrado=false ; 
	for (Lineapedido linea : lineas ) {
		if (linea.getproducto().equals(lp.getproducto())) {
			linea.setcantidad(linea.getcantidad()+ lp.getcantidad());
			encontrado=true ; 
			this.total += lp.subtotal(); 			
		}
	}
	
	if (!encontrado) {
		lineas.add(lp);	
		this.total += lp.subtotal();
	}
	
	
}

	
	
}
