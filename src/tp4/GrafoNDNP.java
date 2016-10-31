package tp4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GrafoNDNP {
	MatrizSimetrica matriz;
	ArrayList<Nodo> nodos;
	private Map<Integer, Integer> nodosColoreados;
	
	public GrafoNDNP(int cantidadDeNodosEntrada){
		matriz = new MatrizSimetrica(cantidadDeNodosEntrada);
		nodosColoreados = new HashMap<Integer, Integer>();
		nodos = new ArrayList<Nodo>();
	}
	
	public void coloreoSecuencialAleatorio(){
		int color=1;
		nodosColoreados.put(0, color);
		for(int i=0; i<matriz.getOrdenMatriz()-1; i++){
			for(int j=i+1; j<matriz.getOrdenMatriz(); j++){
				color = 1;
				while(!sePuedeColorear(i, j)){
					color++;
				}
				nodosColoreados.put((int)(i * matriz.getOrdenMatriz() + j - (Math.pow(i, 2) + 3 * i + 2) / 2), color);
			}
		}
	}

	private boolean sePuedeColorear(int i, int j) {
		return false;
	}

/*
	public void colorearSecuencial() {
		Collections.shuffle(nodos);
		colorearSecuencialAleatorio();
	}
*/
	public void setValor(boolean valor, int fila, int columna) {
		matriz.setValor(valor, fila, columna);
	}

	public void add(Integer clave, Integer color) {
		nodosColoreados.put(clave, color);
	}

	public boolean containsKey(Integer clave) {
		return nodosColoreados.containsKey(clave);
	}

	public int size() {
		return nodosColoreados.size();
	}

	public boolean getValor(int i, int j) {
		return matriz.getValor(i, j);
	}

	public Integer get(int i) {
		return nodosColoreados.get(i);
	}

}
