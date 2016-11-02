package tp4;

import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class GrafosTests {
	
	int cantidadDeColoresMinimo=1001;
	int numeroDeCorridaMinimo=0;
	
	@Test
	public void coloreo40Aleatorio() throws IOException{
		//PrintWriter pw = new FileWriter(new File("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearSecuencial();
			//pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		//pw.close();
	}
	
	@Test
	public void coloreo40WelshPowell() throws IOException{
		//PrintWriter pw = new FileWriter(new File("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearWelshPowell();
			//pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		//pw.close();
	}
	
	@Test
	public void coloreo40Matula() throws IOException{
		//PrintWriter pw = new FileWriter(new File("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearMatula();
			//pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		//pw.close();
	}
}
