package tp4;

public class MatrizSimetrica {

	private boolean []vector;
	private Integer []vectorPintado;
	private int ordenMatriz;
	
	public MatrizSimetrica(int grado){
		ordenMatriz = grado;
		vector = new boolean[(grado*(grado-1))/2];
		vectorPintado = new Integer[(grado*(grado-1))/2];
		for(int i=0; i<vector.length; i++){
			vector[i] = false;
		}
	}
	
	public void ponerTodoTrue(){
		for(int i=0; i<vector.length; i++){
			for(int j=i+1; j<vector.length; j++){
				vector[i] = true;
			}
		}
	}

	public boolean getValor(int fila, int columna) {
		return vector[(int)(fila*ordenMatriz+columna-(Math.pow(fila, 2)+3*fila+2)/2)];
	}

	public void setValor(boolean valor, int fila, int columna) {
		vector[(int)(fila*ordenMatriz+columna-(Math.pow(fila, 2)+3*fila+2)/2)] = true; 
	}

	public int getOrdenMatriz() {
		return ordenMatriz;
	}

	public void setOrdenMatriz(int ordenMatriz) {
		this.ordenMatriz = ordenMatriz;
	}
	
	public void setVectorPintado(Integer color, int fila, int columna) {
		vectorPintado[(int)(fila*ordenMatriz+columna-(Math.pow(fila, 2)+3*fila+2)/2)] = color; 
	}
}
