package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logica.Ordenar;
import personas.Personaje;

/**Clase en donde se realzia la comprobaci�n de JUnit de el algoritmo de MergeShort
 * @author Pablo Sarobe Ezponda
 *
 */
public class OrdenarTest {
	
	/** M�todo con el Before.
	 * 
	 */
	@Before
	public void setUp (){
		
		ArrayList <Personaje> testPer = new ArrayList <Personaje> ();
	}
	/**M�todo con el After.
	 * 
	 */
	@After 
	public void tearDown ()
	{
		
	}
	/**M�todo en dodne se realiza el test de comprobaci�n de JUnit.
	 * 
	 */
	@Test
	public void test() {
		
		Ordenar ordenar = new Ordenar ();
		ArrayList <Personaje> testPer = Ordenar.ordenVida();
		String texto1 = " ";
		for (int i = 0; i < testPer.size(); i++)
		{
			texto1 = texto1 + testPer.get(i).getNombre() + " " + testPer.get(i).getVida() + " ";
		}
		assertEquals(" Thanos 250 Superman 300 Batman 400 Joker 500 ",texto1);
	}

}
