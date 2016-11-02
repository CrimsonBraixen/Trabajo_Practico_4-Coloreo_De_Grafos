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
import java.util.Scanner;

public class GrafoNDNP {
	MatrizSimetrica matriz;
	ArrayList<Nodo> nodos;
	private Map<Integer, Integer> nodosColoreados;
	private int cantidadDeColores;
	private double porcentajeDeAdyacenciaEntrada;
	private int gradoMaximoEntrada;
	private int gradoMinimoEntrada;
	private int cantidadDeAristasEntrada;
	private int cantidadDeNodosEntrada;
	
	public GrafoNDNP(int cantidadDeNodosEntrada){
		matriz = new MatrizSimetrica(cantidadDeNodosEntrada);
		nodosColoreados = new HashMap<Integer, Integer>();
		nodos = new ArrayList<Nodo>();
		cantidadDeColores=1;
		for(int i=0;i<cantidadDeNodosEntrada;i++){
			nodos.add(new Nodo(i));
		}
	}
	
	public GrafoNDNP(String pathIn) throws IOException {
		Scanner scanner = new Scanner(new File(pathIn)).useLocale(Locale.US);
		cantidadDeNodosEntrada = scanner.nextInt();
		matriz = new MatrizSimetrica(cantidadDeNodosEntrada);
		nodos = new ArrayList<Nodo>();
		nodosColoreados = new HashMap<Integer, Integer>();
		cantidadDeAristasEntrada = scanner.nextInt();
		porcentajeDeAdyacenciaEntrada = scanner.nextDouble();
		gradoMaximoEntrada = scanner.nextInt();
		gradoMinimoEntrada = scanner.nextInt();
		for(int i=0; i<cantidadDeAristasEntrada; i++){
			matriz.setValor(true, scanner.nextInt(), scanner.nextInt());
		}
		for(int i=0;i<cantidadDeNodosEntrada;i++){
			nodos.add(new Nodo(i));
		}
		scanner.close();
	}

	public void colorear(){
		int color=1;
		//nodosColoreados.put(nodos.get(0).getNumero(), color);
		for(int i=0;i<nodos.size();i++){
				color = 1;
				while(!sePuedeColorear(i,color)){
					color++;
					if(color > cantidadDeColores){
						cantidadDeColores = color;
					}
				}
				nodosColoreados.put(nodos.get(i).getNumero(), color);
			}
	}
	

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
		ordenarDescendentemente();
		colorear();
		return cantidadDeColores;
	}
	
	public int colorearMatula() {
		calcularGrados();
		ordenarAscendentemente();
		colorear();
		return cantidadDeColores;
	}
	
	public int colorearSecuencial() {
		Collections.shuffle(nodos);
		colorear();
		return cantidadDeColores;
	}

	private void ordenarDescendentemente() {
		Collections.sort(nodos, Collections.reverseOrder());
	}
	
	private void ordenarAscendentemente() {
		Collections.sort(nodos);
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

	public void aArchivo(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		pw.print(nodos.size()+" ");
		pw.print(cantidadDeColores+" ");
		pw.print(getCantidadDeAristas()+" ");
		pw.print(porcentajeDeAdyacenciaEntrada+" ");
		pw.print(gradoMaximoEntrada+" ");
		pw.println(gradoMinimoEntrada);
		for(int i=0; i < nodosColoreados.size(); i++){
			pw.println(i+" "+nodosColoreados.get(i));
		}
		pw.close();
	}
	
	public int getCantidadDeAristas() {
		/*int contador=0;
		for(int i=0; i<matriz.getOrdenMatriz(); i++){
			for(int j=i+1; j<matriz.getOrdenMatriz(); j++){
				if(matriz.getValor(i, j)){
					contador++;
				}
			}
		}
		return contador;*/
		return cantidadDeAristasEntrada;
	}
}
