package tp4;

import java.util.Arrays;
import java.util.Random;

public class GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia {

	public GenerarGrafoAleatorioDadoPorcentajeDeAdyacencia(double porcentaje, int grado){
		MatrizSimetrica matriz = new MatrizSimetrica(grado);
		Arista []vector = new Arista[(grado*(grado-1))/2];
		
		for(int fila=0;fila<grado-1;fila++){
			for(int columna=fila+1; columna<grado; columna++){
				Random random = new Random();
				vector[(int)(fila*grado+columna-(Math.pow(fila, 2)+3*fila+2)/2)] = new Arista(fila, columna, random.nextInt());
			}
		}
		Arrays.sort(vector);
		int dondeCorta= (int)porcentaje*vector.length;
		for(int i=0; i<dondeCorta; i++){
			matriz.setValor(true, vector[i].getFila(), vector[i].getColumna());
		}
	}
}
