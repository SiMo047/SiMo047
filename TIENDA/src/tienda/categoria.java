package tienda;

public class categoria {

	
	private String nombre ;

	@Override
	public String toString() {
		return "categoria [nombre=" + nombre + "]";
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public categoria(String nombre) {
		super();
		this.nombre = nombre;
	} 
	
	
}
