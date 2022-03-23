package tienda;

import java.util.Objects;

public abstract class cliente implements descontable {
	
	protected String nombre ; 
	protected String apellido ; 
	protected String dni ; 
	protected String localidad ; 
	protected String direccion ; 
	
	
	
	
	

	public cliente(String nombre, String apellido, String dni, String localidad, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.localidad = localidad;
		this.direccion = direccion;
	}
	
	public cliente(cliente uncliente) {
		this.nombre = uncliente.nombre;
		this.apellido = uncliente.apellido;
		this.dni = uncliente.dni;
		this.localidad = uncliente.localidad;
		this.direccion = uncliente.direccion;
		
		
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

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the localidad
	 */
	public String getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/*tooo string */

	@Override
	public String toString() {
		return "cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", localidad=" + localidad
				+ ", direccion=" + direccion + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		cliente other = (cliente) obj;
		return Objects.equals(dni, other.dni);
	}

	public abstract double descuento(); 
	
	
	

}
