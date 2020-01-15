package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logica.Pelea;
import personas.Superheroe;
import personas.Villano;


/**Clase en donde se realza la comprobación del algoritmo de pelea en JUnit.
 * @author Pablo Sarobe Ezponda
 *
 */
public class PeleaTest {

	private ArrayList <Superheroe> testSuper = new ArrayList<Superheroe> ();
	private ArrayList <Villano> testVil = new ArrayList <Villano> ();
	
	
	/**Método con el Before.
	 * 
	 */
	@Before
	public void setUp (){
		
		Superheroe a = new Superheroe ();
		a.setIdPer(0);
		a.setEquipo(true);
		a.setNombre("Batman");
		a.setVida(450);
		a.setAtaque(150);
		a.setPoderAtaque(false);		
		testSuper.add(a);
		
		Villano b = new Villano ();
		b.setIdPer(2);
		b.setEquipo(false);
		b.setNombre("Joker");
		b.setVida(500);
		b.setAtaque(130);
		b.setPoderSanar(false);		
		testVil.add(b);
	}
	/**Método con el After.
	 * 
	 */
	@After
	public void tearDown (){
		
	}
	/**Método en dodne se realiza el test de comprobación de JUnit
	 * 
	 */
	@Test
	public void comprobarAccion (){
		
		
		Pelea pelea = new Pelea();
		String comparar = Pelea.sistemaPelea(testSuper, testVil);
		assertEquals("Empate",comparar);
	}
}
	
