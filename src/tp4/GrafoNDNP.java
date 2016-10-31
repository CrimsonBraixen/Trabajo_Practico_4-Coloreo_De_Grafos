package tp4;

import java.util.ArrayList;
import java.util.Collections;
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
		for(int i=0;i<cantidadDeNodosEntrada;i++){
			nodos.add(new Nodo(i));
		}
	}
	

	public void coloreoSecuencialAleatorio(){
		int color=1;
		nodosColoreados.put(nodos.get(0).getNumero(), color);
		for(int i=1;i<nodos.size()-1;i++){
				color = 1;
				while(!sePuedeColorear(i,color)){
					color++;
				}
				nodosColoreados.put(i, color);
			}
	}
	

	private boolean sePuedeColorear(int i, int color) {

		for(int j=0; i<nodos.size();j++){
			if(matriz.getValor(i, j)){
				if(nodosColoreados.containsKey(j)&&nodosColoreados.get(j)==color){
					return false;
				}
			}
		}
		return true;
		
	}


	public void colorearSecuencial() {
		Collections.shuffle(nodos);
		coloreoSecuencialAleatorio();
	}

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
