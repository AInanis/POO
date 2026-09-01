package Modelo;

public enum Tipo {
PAMPA_32(15),
AURORA_AUSTRAL(17),
CHACRA_PROFUNDA(6);
	
  private int cantidad;
	
	Tipo(int cantidad){
		this.cantidad = cantidad ;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
}
