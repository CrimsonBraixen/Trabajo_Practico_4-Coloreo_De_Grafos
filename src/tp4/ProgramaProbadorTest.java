package tp4;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class ProgramaProbadorTest {
	
	@Test
	public void programaProbadorEjercicioClase() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\casoDeClase.in", "Pruebas\\out\\casoDeClase.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos40AdyacenciaAleatorio() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio40.in", "Pruebas\\out\\grafoAleatorio40Aleatorio.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos40AdyacenciaWelshPowell() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio40.in", "Pruebas\\out\\grafoAleatorio40WelshPowell.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos40AdyacenciaMatula() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio40.in", "Pruebas\\out\\grafoAleatorio40Matula.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos60AdyacenciaAleatorio() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio60.in", "Pruebas\\out\\grafoAleatorio60Aleatorio.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos60AdyacenciaWelshPowell() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio60.in", "Pruebas\\out\\grafoAleatorio60WelshPowell.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos60AdyacenciaMatula() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio60.in", "Pruebas\\out\\grafoAleatorio60Matula.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo1000Nodos50AdyacenciaAleatorio() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoRegular50.in", "Pruebas\\out\\grafoAleatorio90Aleatorio.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo1000Nodos50AdyacenciaWelshPowell() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoRegular50.in", "Pruebas\\out\\grafoAleatorio90WelshPowell.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo1000Nodos50AdyacenciaMatula() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoRegular50.in", "Pruebas\\out\\grafoAleatorio90Matula.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo1000Nodos75AdyacenciaAleatorio() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoRegular75.in", "Pruebas\\out\\grafoRegular75Aleatorio.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo1000Nodos75AdyacenciaWelshPowell() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoRegular75.in", "Pruebas\\out\\grafoRegular75WelshPowell.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo1000Nodos75AdyacenciaMatula() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoRegular75.in", "Pruebas\\out\\grafoRegular75Matula.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos90AdyacenciaAleatorio() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio90.in", "Pruebas\\out\\grafoAleatorio90Aleatorio.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos90AdyacenciaWelshPowell() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio90.in", "Pruebas\\out\\grafoAleatorio90WelshPowell.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos90AdyacenciaMatula() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("Pruebas\\in\\grafoAleatorio90.in", "Pruebas\\out\\grafoAleatorio90Matula.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
}
