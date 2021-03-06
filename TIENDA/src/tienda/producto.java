package tienda;

import java.util.Objects;

public class producto {
private String cod ; 
private String nombre ; 
private String descripcion ; 
private categoria categoria ;
private double precio ; 
private double iva ; // %10 iva 1.10 aqui en la clase 


public producto(String nombre, String descripcion, tienda.categoria categoria, double precio, double iva) {
	super();
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.categoria = categoria;
	this.precio = precio;
	this.iva = iva;
	
	this.cod=this.nombre ;
	for (int i=0 ; i<0 ; i++)
		 this.cod += (int)(Math.random()*9)+1;
	this.cod = this.nombre.substring(0 , 4) +"-";} 
	


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
 * @return the descripcion
 */
public String getDescripcion() {
	return descripcion;
}
/**
 * @param descripcion the descripcion to set
 */
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
/**
 * @return the categoria
 */
public categoria getCategoria() {
	return categoria;
}
/**
 * @param categoria the categoria to set
 */
public void setCategoria(categoria categoria) {
	this.categoria = categoria;
}
/**
 * @return the precio
 */
public double getPrecio() {
	return precio;
}
/**
 * @param precio the precio to set
 */
public void setPrecio(double precio) {
	this.precio = precio;
}
/**
 * @return the iva
 */
public double getIva() {
	return iva;
}
/**
 * @param iva the iva to set
 */
public void setIva(double iva) {
	this.iva = iva;
}
/**
 * @return the cod
 */
public String getCod() {
	return cod;
}


@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("producto [cod=");
	builder.append(cod);
	builder.append(", nombre=");
	builder.append(nombre);
	builder.append(", descripcion=");
	builder.append(descripcion);
	builder.append(", categoria=");
	builder.append(categoria);
	builder.append(", precio=");
	builder.append(precio);
	builder.append(", iva=");
	builder.append(iva);
	builder.append("]");
	return builder.toString();
}



@Override
public int hashCode() {
	return Objects.hash(cod);
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	producto other = (producto) obj;
	return Objects.equals(cod, other.cod);
}






}
