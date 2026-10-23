package modelo;

public class Persona {
private String nombre;
private String dni;
private int locura;
private int ubicacion ;
private int secretos;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Persona(String nombre, String dni, int locura, int ubicacion, int secretos) {
	this.nombre = nombre;
	this.dni = dni;
	this.locura = locura;
	this.ubicacion = ubicacion;
	this.secretos = secretos;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public int getLocura() {
	return locura;
}
public void setLocura(int locura) {
	this.locura = locura;
}
public int getUbicacion() {
	return ubicacion;
}
public void setUbicacion(int ubicacion) {
	this.ubicacion = ubicacion;
}
public int getSecretos() {
	return secretos;
}
public void setSecretos(int secretos) {
	this.secretos = secretos;
}
}
