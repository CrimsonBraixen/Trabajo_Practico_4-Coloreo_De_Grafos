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
	
	public GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(double porcentajeDeAdyacencia, int cantidadDeNodos) {
		grado = (int)porcentajeDeAdyacencia*(cantidadDeNodos-1);
		cantidadDeNodos = cantidadDeNodos;
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
		GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia grafo50 = new GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(50, 1000);
		GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia grafo75 = new GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(75, 1000);
		grafo50.generarArchivo("C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio50.in");
		grafo75.generarArchivo("C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio75.in");
		}
}
