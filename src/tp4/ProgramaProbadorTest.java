package tp4;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class ProgramaProbadorTest {

	@Test
	public void programaProbador() throws IOException{
		ProgramaProbador pp = new ProgramaProbador("C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\in\\casoDeClase.in", "C:\\Users\\Martin Artime\\Documents\\GitKraken---Workspace\\Trabajo_Practico_4-Coloreo_De_Grafos\\Pruebas\\out\\casoDeClase.out");
		Assert.assertTrue(pp.probarSiLaSalidaEsCorrecta());
	}
}
