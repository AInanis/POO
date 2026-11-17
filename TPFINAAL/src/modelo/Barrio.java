package modelo;

public abstract class Barrio {
	  private String nombreBarrio;
	    private double Hectareas;
    
	    public Barrio(String nombreBarrio, double Hectareas) {
	        this.nombreBarrio = nombreBarrio;
	        this.Hectareas = Hectareas;
	    }

	    public abstract double calcularDensidad(int cantidadPersonas);

	    public abstract boolean tieneCriticidadHabitacional();
	    
	 
	    public String getNombre() {
	        return nombreBarrio;
	    }

	    public void setNombre(String nombre) {
	        this.nombreBarrio = nombre;
	    }

	    public double getSuperficieHectareas() {
	        return Hectareas;
	    }

	    public void setSuperficieHectareas(double superficieHectareas) {
	        this.Hectareas = superficieHectareas;
	    }

	  
}
