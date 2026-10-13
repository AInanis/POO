package modelo;

public class Personaje {
	private int locura;
    private int secreto;
    private int distancia;

    public Personaje(int locura, int secreto, int distancia) {
        this.locura = locura;
        this.secreto = secreto;
        this.distancia = distancia;
    }

    public int getLocura() {
        return locura;
    }

    public int getSecreto() {
        return secreto;
    }

    public int getDistancia() {
        return distancia;
    }

}
