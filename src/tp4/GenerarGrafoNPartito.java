package tp4;

public class GenerarGrafoNPartito {

	public GenerarGrafoNPartito(int cantidadDeNodos, int nPartito) {
		MatrizSimetrica matriz = new MatrizSimetrica(cantidadDeNodos);
		int cantidadDeNodosPorGrupo = cantidadDeNodos / nPartito;
		int multiplicacion = cantidadDeNodosPorGrupo*nPartito;
		int resta = multiplicacion - cantidadDeNodos;
		int contadorDeNodosQueSobran = Math.abs(resta);
		matriz.ponerTodoTrue();
		if(resta<0){
			for(int i=0; i<cantidadDeNodos; i++){
				for(int j=1; j<cantidadDeNodosPorGrupo+contadorDeNodosQueSobran; j++){
					if(i+(j*nPartito)<cantidadDeNodos){
						matriz.setValor(false, i, i+(j*nPartito));
					}
				}
				if(contadorDeNodosQueSobran > 0){
					matriz.setValor(false, i, i+(cantidadDeNodosPorGrupo*nPartito));
					contadorDeNodosQueSobran--;
				}
			}
		}
		else{
			
		}
	}
}
