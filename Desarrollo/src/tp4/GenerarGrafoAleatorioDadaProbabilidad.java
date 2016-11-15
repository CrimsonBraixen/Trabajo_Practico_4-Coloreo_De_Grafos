package tp4;

import java.util.Random;

public class GenerarGrafoAleatorioDadaProbabilidad{
	
	public GenerarGrafoAleatorioDadaProbabilidad(int cantidadDeNodos, double probabilidad){
		Random random = new Random();
		MatrizSimetrica matriz = new MatrizSimetrica(cantidadDeNodos);
		final int cantidadMaximaDeAristas = (matriz.getOrdenMatriz()* (matriz.getOrdenMatriz()-1))/2;
		
		for (int i = 0; i < cantidadMaximaDeAristas; i++) {
			for(int j=i+1; j<cantidadMaximaDeAristas; j++){
				double porcentaje = random.nextDouble();
				if (porcentaje < probabilidad) {
					matriz.setValor(true, i, j);
				} 
				else {
					matriz.setValor(false, i, j);
				}
			}
		}
	}
}
