package tp4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class GrafoNDNP {
	MatrizSimetrica matriz;
	ArrayList<Nodo> nodos;
	int []nodosColoreados;
	private int cantidadDeColores;
	private double porcentajeDeAdyacenciaEntrada;
	private int gradoMaximoEntrada;
	private int gradoMinimoEntrada;
	private int cantidadDeAristasEntrada;
	private int cantidadDeNodosEntrada;
	
	public GrafoNDNP(int cantidadDeNodosEntrada){
		matriz = new MatrizSimetrica(cantidadDeNodosEntrada);
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
		mezclar();
		ordenarEstablementeWelshPowell();
		colorear();
		return cantidadDeColores+1;
	}

	public int colorearMatula() {
		calcularGrados();
		mezclar();
		ordenarEstablementeMatula();
		colorear();
		return cantidadDeColores+1;
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
		mezclar();
		colorear();
		return cantidadDeColores+1;
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
	
	public void mezclar(){
		Random random = new Random();
		int indice;
		Nodo aux;
		for(int i=0; i<nodos.size(); i++){
			indice = random.nextInt(nodos.size());
			aux = nodos.get(i);
			nodos.set(i, nodos.get(indice));
			nodos.set(indice, aux);
		}
	}
}
