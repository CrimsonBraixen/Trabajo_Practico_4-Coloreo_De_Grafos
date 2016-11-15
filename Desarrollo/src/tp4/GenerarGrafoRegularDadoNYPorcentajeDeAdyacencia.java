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

	public GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(double porcentaje, int cantNodos){
		cantidadDeNodos = cantNodos;
		porcentajeDeAdyacenciaEntrada = porcentaje;
		matriz = new MatrizSimetrica(cantidadDeNodos);
		grado = (int) (porcentajeDeAdyacenciaEntrada*(cantidadDeNodos-1));
		cantidadDeAristasEntrada = (cantidadDeNodos*grado)/2;
		gradoMaximoEntrada = grado;
		gradoMinimoEntrada = grado;
		new GenerarGrafoRegularDadoNYGrado(grado, cantidadDeNodos);
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
		GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia grafo50 = new GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(0.5, 1000);
		GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia grafo75 = new GenerarGrafoRegularDadoNYPorcentajeDeAdyacencia(0.75, 1000);
		grafo50.generarArchivo("Pruebas\\in\\grafoRegular50.in");
		grafo75.generarArchivo("Pruebas\\in\\grafoRegular75.in");
	}
}
