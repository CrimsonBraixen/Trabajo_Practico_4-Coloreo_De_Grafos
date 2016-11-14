package tp4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia {

	int grado;
	int cantidadDeNodos;
	int cantidadDeAristasEntrada;
	double porcentajeDeAdyacenciaEntrada;
	int gradoMaximoEntrada;
	int gradoMinimoEntrada;
	MatrizSimetrica matriz;
	/*
	public GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(double porcentajeDeAdyacencia, int cantidadDeNodos) {
		grado = (int)(porcentajeDeAdyacencia*(cantidadDeNodos-1));
		this.cantidadDeNodos = cantidadDeNodos;
		matriz = new MatrizSimetrica(cantidadDeNodos);
		cantidadDeAristasEntrada=0;
		porcentajeDeAdyacenciaEntrada = porcentajeDeAdyacencia;
		gradoMaximoEntrada=grado;
		gradoMinimoEntrada=grado;
		if (grado < cantidadDeNodos && cantidadDeNodos > 0 && grado >= 0) {
			MatrizSimetrica matriz = new MatrizSimetrica(cantidadDeNodos);
			int cantidadDeAristas = 0;
			if (cantidadDeNodos % 2 == 0) { // par
				if (grado % 2 == 1) {
					generarMatrizGradoImpar();
				}
				else{
					generarMatrizGradoPar();
				}
			} //impar
			else{
				generarMatrizGradoPar();
			}
		}
	}

	private void generarMatrizGradoPar() {
		int saltoNodo = 1;

		for (int i = 0; i < grado / 2; i++) {
			for (int j=0; j < cantidadDeNodos; j++) {
				cantidadDeAristasEntrada++;
				matriz.setValor(true, j, (j + saltoNodo) % cantidadDeNodos);
			}
			saltoNodo++;
		}
	}

	private void generarMatrizGradoImpar() {
		int saltoImpar = (cantidadDeNodos / 2);
		for (int i = 0; i < saltoImpar; i++) {
			for(int j=i+1; j < saltoImpar; j++){
				cantidadDeAristasEntrada++;
				matriz.setValor(true, i, j);
			}
		}
	}
	*/
	public GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(double porcentaje, int cantNodos){
		// Calculo la cantidad de aristas que tendra el grafo
		cantidadDeNodos = cantNodos;
		porcentajeDeAdyacenciaEntrada = porcentaje;
		matriz = new MatrizSimetrica(cantidadDeNodos);
		grado = (int) (porcentajeDeAdyacenciaEntrada*(cantidadDeNodos-1));
		cantidadDeAristasEntrada = (cantidadDeNodos*grado)/2;
		/*// Calculo la cantidad de aristas que voy a tener (aproximadamente)
		int cantAristasDelGrafoNPND = (int)(porcentajeDeAdyacenciaEntrada * cantidadDeAristasEntrada);
		// Obtengo el grado haciendo Grado = 2 * CantAristas / CantNodos
		grado = 2*cantAristasDelGrafoNPND/cantidadDeNodos;*/
		gradoMaximoEntrada = grado;
		gradoMinimoEntrada = grado;
		new GenerarGrafoRegularDadoNYGrado(grado, cantidadDeNodos);
		//generarGrafoRegularPorGrado(cantidadDeNodos, grado);
	}
	/*
	public void generarGrafoRegularPorGrado(int cantNodos, int grado){
		// Si el grado es mayor a la cant de nodos - 1, devolver null
		if(grado>cantNodos-1){
			System.out.println("El grado no puede ser mayor que la cantidad de nodos menos uno.");
			return;
		}
		// Si el grado es impar y el grado tambien, devolver null
		if(cantNodos%2 != 0 && grado%2 != 0){
			System.out.println("Al ser la cantidad de nodos impar, el grado debe ser par.");
			return;
		}
		// Crear la matriz de adyacencia para el grafo
		MatrizSimetrica matriz = new MatrizSimetrica(cantNodos);
		// Voy colocando las aristas del grafo
		int salto = 1;
		for(int i=0; i<grado/2; i++){
			// Doy una vuelta
			for(int j=0; j<cantNodos; j++){
				matriz.setValor(true, j, (j+salto)%cantNodos);
			}
			salto++;
		}
		// En caso de ser impar, agrego las faltanes (las que tienen cantNodos/2 de distancia)
		if(grado % 2 != 0){
			for(int i=0; i<cantNodos/2; i++){
				matriz.setValor(true, i, (i+cantNodos/2)%cantNodos);
			}
		}
	}
	*/
	public void generarArchivo(String path) throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File(path)));
		pw.print(grado+" ");
		pw.print(cantidadDeAristasEntrada+" ");
		pw.print(porcentajeDeAdyacenciaEntrada+" ");
		pw.print(gradoMaximoEntrada+" ");
		pw.println(gradoMinimoEntrada);
		for(int i=0; i < matriz.getOrdenMatriz(); i++){
			for(int j=i+1; j<matriz.getOrdenMatriz(); j++){
				if(matriz.getValor(i, j)){
					pw.println(i+" "+j);
				}
			}
		}
		pw.close();
	}
	
	public static void main(String []args) throws IOException{
		GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia grafo50 = new GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(0.5, 1000);
		GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia grafo75 = new GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(0.75, 1000);
		grafo50.generarArchivo("Pruebas\\in\\grafoRegular50.in");
		grafo75.generarArchivo("Pruebas\\in\\grafoRegular75.in");
	}
}
