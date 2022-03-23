package tienda;

public class lineapedido {

	private producto producto ; 
	private int cantidad ;
	
	public lineapedido(producto producto ,int cantidad ) {
		super(); 
		this.producto = producto; 
		this.cantidad=cantidad ; 
	}
	
	

	
	/**
	 * @return the producto
	 */
	public producto getProducto() {
		return producto;
	}
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(producto producto) {
		this.producto = producto;
	}
	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	} 
	
	public double subtotal() {
		return this.producto.getPrecio() + this.cantidad + this.producto.getIva(); 
	}
	
	
	
}
