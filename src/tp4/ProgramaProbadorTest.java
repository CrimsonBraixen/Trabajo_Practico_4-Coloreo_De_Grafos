package tp4;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class ProgramaProbadorTest {

	@Test
	public void programaProbadorEjercicioClase() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\casoDeClase.in", "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\out\\casoDeClase.out");
		Assert.assertFalse(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos40Adyacencia() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio40.in", "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\out\\grafoAleatorio40.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos60Adyacencia() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio40.in", "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\out\\grafoAleatorio60.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
	
	@Test
	public void programaProbadorGrafo600Nodos90Adyacencia() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\grafoAleatorio40.in", "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\out\\grafoAleatorio90.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
}
