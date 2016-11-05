package tp4;

import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class GrafosTests {
	
	int cantidadDeColoresMinimo=1001;
	int numeroDeCorridaMinimo=0;
	
	@Test
	public void coloreo40Aleatorio() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearSecuencial();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo40WelshPowell() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearWelshPowell();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo40Matula() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearMatula();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo60Aleatorio() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearSecuencial();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo60WelshPowell() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearWelshPowell();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo60Matula() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearMatula();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo90Aleatorio() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearSecuencial();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo90WelshPowell() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearWelshPowell();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo90Matula() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearMatula();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo50Aleatorio() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearSecuencial();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo50WelshPowell() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearWelshPowell();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo50Matula() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearMatula();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo75Aleatorio() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearSecuencial();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo75WelshPowell() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearWelshPowell();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo75Matula() throws IOException{
		PrintWriter pw = new FileWriter(new File("Resultados\\resultados.txt"));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearMatula();
			pw.append(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
}
