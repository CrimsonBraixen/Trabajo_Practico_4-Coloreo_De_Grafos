package tp4;

public class Arista implements Comparable<Arista>{

	private int fila;
	private int columna;
	private int random;
	
	public Arista(int fila, int columna, int random){
		this.fila = fila;
		this.columna = columna;
		this.random = random;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

	public int compareTo(Arista arista) {
		if(this.random<arista.random){
			return -1;
		}
		else if(this.random>arista.random){
			return 1;
		}
		return 0;
	}
}
