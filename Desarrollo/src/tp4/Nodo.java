package tp4;

public class Nodo implements Comparable<Nodo>{
	private int numero;
	private int color;
	private int grado;
	
	public Nodo(int numero, int color){
		this.numero = numero;
		this.color = color;
	}

	public Nodo(int numero) {
		this.numero = numero;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color=color;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public Integer getNumero() {
		return numero;
	}

	public int compareTo(Nodo o) {
		if(grado > o.grado){
			return 1;
		}
		else if(grado < o.grado){
			return -1;
		}
		return 0;
	}

	public void sumarGrado() {
		grado++;
	}
}
