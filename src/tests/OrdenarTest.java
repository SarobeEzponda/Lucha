package tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import logica.Ordenar;
import personas.Personaje;

public class OrdenarTest {


	
	@Before
	public void setUp (){
		
		ArrayList <Personaje> testPer = new ArrayList <Personaje> ();
	}
	@After 
	public void tearDown ()
	{
		
	}
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
