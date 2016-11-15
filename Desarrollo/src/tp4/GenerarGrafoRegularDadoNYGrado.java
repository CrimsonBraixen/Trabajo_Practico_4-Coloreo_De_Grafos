package tp4;

public class GenerarGrafoRegularDadoNYGrado {

	public GenerarGrafoRegularDadoNYGrado(int grado, int cantidadDeNodos) {
		if (grado < cantidadDeNodos && cantidadDeNodos > 0 && grado >= 0) {
			MatrizSimetrica matriz = new MatrizSimetrica(cantidadDeNodos);
			int cantidadDeAristas = 0;
			if (cantidadDeNodos % 2 == 0) { // par
				if (grado % 2 == 1) {
					generarMatrizGradoImpar(cantidadDeNodos, matriz, cantidadDeAristas);
				}
				else{
					generarMatrizGradoPar(grado, cantidadDeNodos, matriz, cantidadDeAristas);
				}
			} //impar
			else{
				generarMatrizGradoPar(grado, cantidadDeNodos, matriz, cantidadDeAristas);
			}
		}
	}

	private void generarMatrizGradoPar(int grado, int cantidadDeNodos, MatrizSimetrica matriz, int cantidadDeAristas) {
		int saltoNodo = 1;

		for (int i = 0; i < grado / 2; i++) {
			for (int j=0; j < cantidadDeNodos; j++) {
				matriz.setValor(true, j, (j + saltoNodo) % cantidadDeNodos);
				cantidadDeAristas++;
			}
			saltoNodo++;
		}
	}

	private void generarMatrizGradoImpar(int cantidadDeNodos, MatrizSimetrica matriz, int cantidadDeAristas) {
		int saltoImpar = (cantidadDeNodos / 2);
		for (int i = 0; i < saltoImpar; i++) {
			for(int j=i+1; j < saltoImpar; j++){
				matriz.setValor(true, i, j);
				cantidadDeAristas++;
			}
		}
	}
}
