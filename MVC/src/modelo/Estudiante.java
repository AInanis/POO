package modelo;


import java.time.LocalDate;

public class Estudiante {
private String nombre ;
private String dni; // pk de "persona" estudiante 
private boolean hijos;
private String nivelEstudios ;
private LocalDate fechaNacimiento;


public Estudiante(String nombre,String dni,String nivelEstudios, boolean hijos ) {
	this.nombre = nombre ;
	this.nivelEstudios = nivelEstudios;
	this.hijos = hijos;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public boolean isHijos() {
	return hijos;
}
public void setHijos(boolean hijos) {
	this.hijos = hijos;
}
public String getNivelEstudios() {
	return nivelEstudios;
}
public void setNivelEstudios(String nivelEstudios) {
	this.nivelEstudios = nivelEstudios;
}
public LocalDate getFechaNacimiento() {
	return fechaNacimiento;
}
public void setFechaNacimiento(LocalDate fechaNacimiento) {
	this.fechaNacimiento = fechaNacimiento;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
};
}
