package modelo;

public class Persona {
private int locura ;
private String dni;
private String nombre;
private int distancia;
private int secretos;
public int getLocura() {
	return locura;
}
public void setLocura(int locura) {
	this.locura = locura;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public Persona(int locura, String dni, String nombre, int distancia, int secretos) {
	this.locura = locura;
	this.dni = dni;
	this.nombre = nombre;
	this.distancia = distancia;
	this.secretos = secretos;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDistancia() {
	return distancia;
}
public void setDistancia(int distancia) {
	this.distancia = distancia;
}
public int getSecretos() {
	return secretos;
}
public void setSecretos(int secretos) {
	this.secretos = secretos;
}
}
