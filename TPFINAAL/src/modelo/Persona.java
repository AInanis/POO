package modelo;

import java.time.LocalDate;

import enums.SituacionLaboral;

public class Persona {
	 private String dni;
	    private String nombre;
	    private String apellido;
	    private LocalDate fechaNacimiento;
	    private SituacionLaboral situacionLaboral;
	    private Barrio barrio;

	    public Persona(String dni, String nombre,String apellido, LocalDate fechaNacimiento,
	                   SituacionLaboral situacionLaboral, Barrio barrio) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.fechaNacimiento = fechaNacimiento;
	        this.situacionLaboral = situacionLaboral;
	        this.barrio = barrio;
	        this.apellido = apellido;
	    }
	    
	    public void asociarBarrio(Barrio barrio) {
	        this.barrio = barrio;
	    }

	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getNombreCompleto() {
	        return nombre;
	    }

	    public void setNombreCompleto(String nombreCompleto) {
	        this.nombre = nombreCompleto;
	    }

	    public LocalDate getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    public void setFechaNacimiento(LocalDate fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    public SituacionLaboral getSituacionLaboral() {
	        return situacionLaboral;
	    }

	    public void setSituacionLaboral(SituacionLaboral situacionLaboral) {
	        this.situacionLaboral = situacionLaboral;
	    }

	    public Barrio getBarrio() {
	        return barrio;
	    }

}
