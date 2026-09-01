package Modelo;
import java.util.ArrayList;
import Heredados.Satelite;
public class Espacio  {

	private ArrayList<Satelite> satelites = new ArrayList<>();
	
	public ArrayList<Satelite> satelitesComunicacionEstanPorEntrarAHinbernacion(){
		ArrayList<Satelite> satelitesHinbernando = new ArrayList<>();
		for(Satelite s : satelites) {
			if(s.esComunicacion() && s.estaEnHinbernacion()) {
				satelitesHinbernando.add(s);
			}
		}
		return satelitesHinbernando ;
	}
	
	public int acumulacionDeCargaEnergetica() {
		int total = 0;
		for(Satelite s : satelites) {
			total += s.cantidadCienciaAcumulada();
			System.out.println(s.cantidadCienciaAcumulada());
		}
		return total;
		
	}
	
	public int acumulacioDeCargaEnCiencia() {
		int total = 0;
		for(Satelite s: satelites) {
			if(s.esCiencia()) {
				total += s.cantidadCienciaAcumulada();
			}
		}
		return total;
	}
}
