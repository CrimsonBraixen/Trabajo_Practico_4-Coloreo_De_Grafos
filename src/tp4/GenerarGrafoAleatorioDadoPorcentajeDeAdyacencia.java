package tp4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

import com.sun.javafx.geom.transform.GeneralTransform3D;

public class GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia {

	int grado;
	int cantidadDeAristasEntrada;
	double porcentajeDeAdyacenciaEntrada;
	int gradoMaximoEntrada;
	int gradoMinimoEntrada;
	MatrizSimetrica matriz;
	
	public GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia(double porcentaje, int orden){
		this.grado = orden;
		cantidadDeAristasEntrada=0;
		porcentajeDeAdyacenciaEntrada = porcentaje;
		matriz = new MatrizSimetrica(orden);
		Arista []vector = new Arista[(orden*(orden-1))/2];
		
		for(int fila=0;fila<orden-1;fila++){
			for(int columna=fila+1; columna<orden; columna++){
				Random random = new Random();
				vector[(int)(fila*orden+columna-(Math.pow(fila, 2)+3*fila+2)/2)] = new Arista(fila, columna, random.nextInt());
			}
		}
		Arrays.sort(vector);
		int dondeCorta= (int)porcentaje*vector.length;
		for(int i=0; i<dondeCorta; i++){
			cantidadDeAristasEntrada++;
			matriz.setValor(true, vector[i].getFila(), vector[i].getColumna());
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
		GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia grafo40 = new GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia(40, 600);
		GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia grafo60 = new GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia(60, 600);
		GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia grafo90 = new GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia(90, 600);
		grafo40.generarArchivo("C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio40.in");
		grafo60.generarArchivo("C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio60.in");
		grafo90.generarArchivo("C:\\Users\\CrimsonBraixen\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio90.in");
	}
}
