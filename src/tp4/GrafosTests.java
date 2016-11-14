package tp4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class GrafosTests {
	
	int cantidadDeColoresMinimo=1001;
	int numeroDeCorridaMinimo=0;
	
	@Test
	public void coloreo40Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo40Aleatorio.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo40WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo40WelshPowell.txt")));
		for(int i=0; i<10000; i++){	
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo40Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo40Matula.txt")));
		for(int i=0; i<10000; i++){	
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo60Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo60Aleatorio.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo60WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo60WelshPowell.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo60Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo60Matula.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo90Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo90Aleatorio.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo90WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo90WelshPowell.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo90Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo90Matula.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo50Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo50Aleatorio.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo50WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo50WelshPowell.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo50Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo50Matula.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	
	@Test
	public void coloreo75Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo75Aleatorio.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo75WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo75WelshPowell.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
	
	@Test
	public void coloreo75Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultadosColoreo75Matula.txt")));
		for(int i=0; i<10000; i++){
			GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		pw.close();
	}
}
