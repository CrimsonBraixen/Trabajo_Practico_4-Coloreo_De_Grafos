package tp4;

import java.io.IOException;

public class GrafosTests {
	
	public static void main(String []args) throws IOException{
		GrafoNDNP grafo = new GrafoNDNP("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\casoDeClase.in");
		//grafo.colorearSecuencial();
		//grafo.colorearWelshPowell();
		//grafo.colorearMatula();
		grafo.aArchivo("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\out\\casoDeClase.out");
	}
}
