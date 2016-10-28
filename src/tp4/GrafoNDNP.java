package tp4;

import java.util.ArrayList;

public class GrafoNDNP {
	MatrizSimetrica matriz;
	
	public GrafoNDNP(MatrizSimetrica matriz){
		this.matriz = matriz;
	}
	
	public void coloreoSecuencialAleatorio(){
		ArrayList<Character> colores = new ArrayList<Character>();
		for(int i=0; i<matriz.getOrdenMatriz()-1; i++){
			for(int j=i+1; j<matriz.getOrdenMatriz(); j++){
				
			}
		}
	}
}
