package modelo;

public class Persona {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getLocura() {
		return locura;
	}

	public void setLocura(float locura) {
		this.locura = locura;
	}

	public float getSecretos() {
		return secretos;
	}

	public void setSecretos(float secretos) {
		this.secretos = secretos;
	}

	public float getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(float ubicacion) {
		this.ubicacion = ubicacion;
	}

	public float getLocuraMax() {
		return locuraMax;
	}

	public Persona(float locura, float secretos, float ubicacion) {
		super();
		this.locura = locura;
		this.secretos = secretos;
		this.ubicacion = ubicacion;
	}

	public Persona(int locura, int secretos) {
		this.locura = locura;
		this.secretos = secretos;
	}

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, float locura) {
		super();
		this.nombre = nombre;
		this.locura = locura;
	}

	private float locura;
	private float secretos;
	private float ubicacion;
	public Persona(String nombre, float locura, float secretos, float ubicacion) {
		super();
		this.nombre = nombre;
		this.locura = locura;
		this.secretos = secretos;
		this.ubicacion = ubicacion;
	}

	private final float locuraMax = 100;

	public boolean esLindo() {
		return locura > locuraMax * 0.75f;
	}

	public boolean esNormal() {
		return locura < 10 && secretos >= 500;
	}

	public boolean estaEnMaravilla() {
		return ubicacion < 0;
	}

	public void embellecer(float valor) {
		locura += valor;
		secretos -= 10;
	}

}
