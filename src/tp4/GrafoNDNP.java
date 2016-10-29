package tp4;

import java.util.ArrayList;

public class GrafoNDNP {
	MatrizSimetrica matriz;
	
	public GrafoNDNP(MatrizSimetrica matriz){
		this.matriz = matriz;
	}
	
	public void coloreoSecuencialAleatorio(){
		int color;
		for(int i=0; i<matriz.getOrdenMatriz()-1; i++){
			for(int j=i+1; j<matriz.getOrdenMatriz(); j++){
				color = 1;
				//while(!sePuedeColorear()){
					color++;
				//}
				matriz.setVectorPintado(color, i, j);
			}
		}
	}
/*
	public void colorearSecuencial() {
		Collections.shuffle(nodos);
		colorearSecuencialAlternativo();
	}
*/
}
