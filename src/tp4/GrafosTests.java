package tp4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.junit.Test;

public class GrafosTests {
	
	int cantidadDeColoresMinimo=1001;
	int numeroDeCorridaMinimo=0;
	/*
	@Test
	public void coloreoCasoDeClaseAleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\casoDeClase.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		grafo.aArchivo("Pruebas\\out\\casoDeClase.out");
		System.out.println(cantidadDeColoresMinimo);
		pw.close();
	}
	
	@Test
	public void coloreo40Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<10000; i++){
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio40Aleatorio.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	/*
	@Test
	public void coloreo40WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio40WelshPowell.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo40Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio40.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio40Matula.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo60Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio60Aleatorio.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo60WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio60WelshPowell.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo60Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio60.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio60Matula.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo90Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio90Aleatorio.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo90WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio90WelshPowell.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo90Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoAleatorio90.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoAleatorio90Matula.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	*/
	@Test
	public void coloreo50Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoRegular50Aleatorio.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo50WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoRegular50WelshPowell.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo50Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular50.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoRegular50Matula.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	/*
	@Test
	public void coloreo75Aleatorio() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearSecuencial();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoRegular75Aleatorio.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo75WelshPowell() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearWelshPowell();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoRegular75WelshPowell.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	
	@Test
	public void coloreo75Matula() throws IOException{
		PrintWriter pw = new PrintWriter(new FileWriter(new File("Resultados\\resultados.txt")));
		GrafoNDNP grafo = new GrafoNDNP("Pruebas\\in\\grafoRegular75.in");
		for(int i=0; i<100; i++){
			int colores = grafo.colorearMatula();
			pw.println(String.valueOf(colores));
			if(cantidadDeColoresMinimo > colores){
				cantidadDeColoresMinimo = colores;
			}
		}
		System.out.println(cantidadDeColoresMinimo);
		grafo.aArchivo("Pruebas\\out\\grafoRegular75Matula.out");
		pw.println("Fin coloreo");
		pw.close();
	}
	*/
}
