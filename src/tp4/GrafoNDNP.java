package tp4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GrafoNDNP {
	MatrizSimetrica matriz;
	ArrayList<Nodo> nodos;
	int []nodosColoreados;
	//private Map<Integer, Integer> nodosColoreados;
	private int cantidadDeColores;
	private double porcentajeDeAdyacenciaEntrada;
	private int gradoMaximoEntrada;
	private int gradoMinimoEntrada;
	private int cantidadDeAristasEntrada;
	private int cantidadDeNodosEntrada;
	
	public GrafoNDNP(int cantidadDeNodosEntrada){
		matriz = new MatrizSimetrica(cantidadDeNodosEntrada);
		//nodosColoreados = new HashMap<Integer, Integer>();
		nodosColoreados = new int[cantidadDeNodosEntrada];
		nodos = new ArrayList<Nodo>();
		cantidadDeColores=1;
		for(int i=0;i<cantidadDeNodosEntrada;i++){
			nodos.add(new Nodo(i));
			nodosColoreados[i] = -1;
		}
	}
	
	public GrafoNDNP(String pathIn) throws IOException {
		Scanner scanner = new Scanner(new File(pathIn)).useLocale(Locale.US);
		cantidadDeNodosEntrada = scanner.nextInt();
		matriz = new MatrizSimetrica(cantidadDeNodosEntrada);
		nodos = new ArrayList<Nodo>();
		nodosColoreados = new int[cantidadDeNodosEntrada];
		//nodosColoreados = new HashMap<Integer, Integer>();
		cantidadDeAristasEntrada = scanner.nextInt();
		porcentajeDeAdyacenciaEntrada = scanner.nextDouble();
		gradoMaximoEntrada = scanner.nextInt();
		gradoMinimoEntrada = scanner.nextInt();
		for(int i=0; i<cantidadDeAristasEntrada; i++){
			matriz.setValor(true, scanner.nextInt(), scanner.nextInt());
		}
		for(int i=0;i<cantidadDeNodosEntrada;i++){
			nodos.add(new Nodo(i));
			nodosColoreados[i] = -1;
		}
		scanner.close();
	}

	public void colorear(){
		int color=0;
		ArrayList<Integer> adyacentes = new ArrayList<>();
		//nodosColoreados.put(nodos.get(0).getNumero(), color);
		for(int i=0;i<nodos.size();i++){
			adyacentes = obtenerAdyacentes(nodos.get(i).getNumero());
			color = obtenerColor(adyacentes);
			if(color > cantidadDeColores){
				cantidadDeColores = color;
			}
			nodosColoreados[nodos.get(i).getNumero()] = color;
		}
	}
	
	public ArrayList<Integer> obtenerAdyacentes(int i){
		ArrayList<Integer> adyacentes=new ArrayList<>();
		for(int j=0;j<cantidadDeNodosEntrada;j++){
			if((j<i && matriz.getValor(j,i)) || (j>i && matriz.getValor(i,j))){
				adyacentes.add(j);
			}
		}
		return adyacentes;
	}

	private int obtenerColor(ArrayList<Integer> adyacentes) {
		boolean []colores = new boolean[cantidadDeNodosEntrada];
		for(int c=0; c<cantidadDeNodosEntrada; c++){
			colores[c] = false;
		}
		for(int i=0; i<adyacentes.size(); i++){
			if(nodosColoreados[adyacentes.get(i)] != -1){
				colores[nodosColoreados[adyacentes.get(i)]] = true;
			}
		}
		for(int j=0; j<colores.length; j++){
			if(colores[j]==false){
				return j;
			}
		}
		return 0;
	}
	/*while(!sePuedeColorear(i,color)){
	color++;
	if(color > cantidadDeColores){
		cantidadDeColores = color;
	}
}*/
/*
	private boolean sePuedeColorear(int i, int color) {
		for(int j=0; j<nodos.size();j++){
			if(nodos.get(i).getNumero() != nodos.get(j).getNumero()){
				if(nodos.get(i).getNumero()<nodos.get(j).getNumero()){
					if(matriz.getValor(nodos.get(i).getNumero(), nodos.get(j).getNumero())){
						if(nodosColoreados.containsKey(nodos.get(j).getNumero()) && (nodosColoreados.get(nodos.get(j).getNumero())==color)){
							return false;
						}
					}
				}
				else if(nodos.get(i).getNumero()>nodos.get(j).getNumero()){
					if(matriz.getValor(nodos.get(j).getNumero(), nodos.get(i).getNumero())){
						if(nodosColoreados.containsKey(nodos.get(j).getNumero()) && (nodosColoreados.get(nodos.get(j).getNumero())==color)){
							return false;
						}
					}
				}
			}
		}
		return true;
	}
*/
/*
	public void colorear(){
		int resultados[] = new int[cantidadDeNodosEntrada];
        boolean disponible[] = new boolean[cantidadDeNodosEntrada];
        for (int colores = 0; colores< cantidadDeNodosEntrada; colores++){
        	disponible[colores] = false;
        	resultados[colores] = -1;
        }
        resultados[nodos.get(0).getNumero()] = 1;
		nodosColoreados.put(nodos.get(0).getNumero(), 1);
		boolean [][]distancia = obtenerMatrizDeAdyacencia();
		for(int i=1; i<cantidadDeNodosEntrada; i++){
			boolean adyacentes[] = distancia[nodos.get(i).getNumero()];
			for(int j=0; j<adyacentes.length; j++){
				if(adyacentes[j] && resultados[nodos.get(j).getNumero()] != -1){
					disponible[resultados[nodos.get(j).getNumero()]] = true;
				}
			}
			int colores;
            for (colores = 1; colores < cantidadDeNodosEntrada; colores++){
                if(!disponible[colores]){
                	break;        	
                }
			}
            if(cantidadDeColores < colores+1){
        		cantidadDeColores = colores+1;
        	}
            resultados[nodos.get(i).getNumero()] = colores+1;
            nodosColoreados.put(nodos.get(i).getNumero(), colores+1);
            for(int j=0; j<adyacentes.length; j++){
                if(resultados[nodos.get(j).getNumero()] != -1)
                	disponible[resultados[nodos.get(j).getNumero()]] = false;
            }
		}
	}

	public void colorear(){
		boolean [][]distancia = obtenerMatrizDeAdyacencia();
		nodosColoreados.put(nodos.get(0).getNumero(), 1);
		boolean adyacentes[] = distancia[nodos.get(0).getNumero()];
		for(int i=1; i<cantidadDeNodosEntrada; i++){
			if(adyacentes[nodos.get(i).getNumero()]){
				nodosColoreados.put(nodos.get(i).getNumero(), 2);
			}
			else{
				nodosColoreados.put(nodos.get(i).getNumero(), 1);
			}
		}
		for(int j=1; j<cantidadDeNodosEntrada; j++){
			adyacentes = distancia[nodos.get(j).getNumero()];
			for(int k=0; k<cantidadDeNodosEntrada; k++){
				if(k!=nodos.get(j).getNumero() && adyacentes[k] && nodosColoreados.get(nodos.get(j).getNumero())==nodosColoreados.get(k)){
					if(cantidadDeColores < nodosColoreados.get(k) + 1){
		        		cantidadDeColores = nodosColoreados.get(k) + 1;
		        	}
					nodosColoreados.put(k, nodosColoreados.get(k) + 1);
				}
			}
		}
	}
	
	
	private void colorear(){
		cantidadDeColores = 0;
		// Por cada nodo que no este pintado tomo un nuevo color para pintar
		// Pregunto por cada nodo no adyacente al nodo en curso si puede ser pintado
		boolean sePuedePintar = false;
		for(int i=0; i<cantidadDeNodosEntrada; i++){
			// Si no esta pinado, busco sus no adyacentes a ver si puedo pintarlos
			if(nodosColoreados.get(i)==null){
				nodosColoreados.put(i, i);
				cantidadDeColores++;
				// Si es el ultimo y esta sin pintar, pintarlo y finalizar el algoritmo
				if(i==cantidadDeNodosEntrada-1){
					nodosColoreados.put(i, i);
				}
				else{
					for(int j=i+1; j<cantidadDeNodosEntrada; j++){
						// Al encontrar un adyacente me fijo si lo puedo pintar del mismo color
						if(!matriz.getValor(nodos.get(i).getNumero(), nodos.get(j).getNumero())){
							// Bandera si se puede pintar el nodo
							sePuedePintar = true;
							// Pregunto por cada nodo adyacente al nodo[j] si alguno esta pintando ya de ese color
							int k=0;
							while(sePuedePintar && k<cantidadDeNodosEntrada){
								if(matriz.getValor(nodos.get(j).getNumero(), nodos.get(k).getNumero())){
									if(nodosColoreados.get(k) != null && nodosColoreados.get(k) == (nodosColoreados.get(i))){
										sePuedePintar=false;
									}
								}
								k++;
							}
							// Si se puede pintar lo pinto, si no sigo
							if(sePuedePintar)
								nodosColoreados.put(j, nodosColoreados.get(i));
						}
					}
				}
			}
		}
	}
	*/
	private boolean[][] obtenerMatrizDeAdyacencia() {
		boolean [][]distancia = new boolean[cantidadDeNodosEntrada][cantidadDeNodosEntrada];
		for(int i=0;i<cantidadDeNodosEntrada;i++){
			for(int j=i;j<cantidadDeNodosEntrada;j++){
			   if(j==i){
				   distancia[i][j]=false;
			   }
			   else{
				   if(matriz.getValor(i, j)){
					   distancia[i][j]=true;
					   distancia[j][i]=true;
				   }
				   else{
					   distancia[i][j]=false;
					   distancia[j][i]=false;
				   }
			   }
		  }
		}
		return distancia;
	}

	public void calcularGrados(){
		for(int i=0; i<matriz.getOrdenMatriz()-1; i++){
			for(int j=i+1; j<matriz.getOrdenMatriz(); j++){
				if(matriz.getValor(i, j)){
					nodos.get(i).sumarGrado();
					nodos.get(j).sumarGrado();
				}
			}
		}
	}
	
	public int colorearWelshPowell() {
		calcularGrados();
		Collections.shuffle(nodos, new Random(System.nanoTime()));
		ordenarEstablementeWelshPowell();
		colorear();
		return cantidadDeColores;
	}

	public int colorearMatula() {
		calcularGrados();
		Collections.shuffle(nodos, new Random(System.nanoTime()));
		ordenarEstablementeMatula();
		colorear();
		return cantidadDeColores;
	}
	
	private void ordenarEstablementeWelshPowell() {
		for(int i=0; i<nodos.size()-1; i++){
			for(int j=0; j<nodos.size()-i-1; j++){
				if(nodos.get(j+1).compareTo(nodos.get(j)) > 0){
					Nodo aux = nodos.get(j+1);
					nodos.set(j+1, nodos.get(j));
					nodos.set(j, aux);
				}
			}
		}
	}
	
	private void ordenarEstablementeMatula() {
		for(int i=0; i<nodos.size()-1; i++){
			for(int j=0; j<nodos.size()-i-1; j++){
				if(nodos.get(j+1).compareTo(nodos.get(j)) < 0){
					Nodo aux = nodos.get(j+1);
					nodos.set(j+1, nodos.get(j));
					nodos.set(j, aux);
				}
			}
		}
	}
	
	public int colorearSecuencial() {
		Collections.shuffle(nodos, new Random(System.nanoTime()));
		colorear();
		return cantidadDeColores;
	}

	public void setValor(boolean valor, int fila, int columna) {
		matriz.setValor(valor, fila, columna);
	}

	public void add(Integer clave, Integer color) {
		nodosColoreados[clave] = color;
	}

	public boolean containsKey(Integer clave) {
		return nodosColoreados[clave] != -1;
	}

	public int size() {
		return nodosColoreados.length;
	}

	public boolean getValor(int i, int j) {
		return matriz.getValor(i, j);
	}

	public Integer get(int i) {
		return nodosColoreados[i];
	}

	public void aArchivo(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		pw.print(nodos.size()+" ");
		pw.print(cantidadDeColores+" ");
		pw.print(getCantidadDeAristas()+" ");
		pw.print(porcentajeDeAdyacenciaEntrada+" ");
		pw.print(gradoMaximoEntrada+" ");
		pw.println(gradoMinimoEntrada);
		for(int i=0; i < nodosColoreados.length; i++){
			pw.println(i+" "+nodosColoreados[i]);
		}
		pw.close();
	}
	
	public int getCantidadDeAristas() {
		return cantidadDeAristasEntrada;
	}
}
