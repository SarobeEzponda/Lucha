package logica;

import java.util.ArrayList;

import personas.Superheroe;
import personas.Villano;
import sqlite.SelectData;

/**
 * Es una clase en donde se realiza la pelea y se obtiene el ganador.
 * @author Pablo Sarobe Ezponda.
 */
public class Pelea {
private static  ArrayList<Superheroe> selecSuper = new ArrayList <Superheroe> ();
private static  ArrayList<Villano> selecVil = new ArrayList <Villano> ();

		static String nombreS ="";
		static String nombreV = "";
		static int vidaS;
		static int vidaV;
		static int ataqueS;
		static int ataqueV;
		static boolean poderAtaqueS = false;
		static boolean poderSanarV = false;
		static boolean poderAtaqueS2 = false;
		static boolean poderSanarV2 = false;
		static int numRandom;
		

		/**
		 * Es un método en donde se pasa el superheroe y el villano seleccioando en la vetana de arena.
		 * @param selecSuper es un ArrayList con el superheroe seleccionado previamente.
		 * @param selecVil es un ArrayList con el villano seleccionado previamente.
		 * @return devuelve un String, con un mensaje, en donde puede haber ganado el superheroe, el villano o quedarse en empate.
		 */
		public static String sistemaPelea (ArrayList <Superheroe> selecSuper ,ArrayList <Villano> selecVil){
			
		String dev =  "";
			
			int i = 0;
			nombreS = selecSuper.get(i).getNombre();
			vidaS = selecSuper.get(i).getVida();
			ataqueS = selecSuper.get(i).getAtaque();
			poderAtaqueS = selecSuper.get(i).isPoderAtaque();
			
			System.out.println(nombreS + " " + vidaS + "  " + ataqueS);
			
			nombreV = selecVil.get(i).getNombre();
			vidaV = selecVil.get(i).getVida();
			ataqueV = selecVil.get(i).getAtaque();
			poderSanarV = selecVil.get(i).isPoderSanar();
			
			System.out.println(nombreV + " " + vidaV + "  " + ataqueV);
			do{

				poderAtaqueS2 = selecSuper.get(i).ataquePo(poderAtaqueS);
				poderSanarV2 = selecVil.get(i).vidaPo(poderSanarV);
				
					 if(poderAtaqueS2 == true)
					 {
						 ataqueS =ataqueS + 70;
						 
						 vidaS = vidaS - ataqueV;
						 vidaV = vidaV - ataqueS;
					 }
					 else{
						 vidaS = vidaS - ataqueV;
						 vidaV = vidaV - ataqueS;
					 }
				 
					 if(poderSanarV2 == true){
					
						 vidaV = vidaV + 200;
						 vidaS = vidaS - ataqueV;
						 vidaV = vidaV - ataqueS;					 
					 }
					 else
					 {
						 vidaS = vidaS - ataqueV;
						 vidaV = vidaV - ataqueS;
					 }

		} while (vidaS >= 0 && vidaV >=0 );
			if (vidaS <0 && vidaV < 0)
			{
				System.out.println("Empate");
				dev = "Empate";
			}
			else if (vidaS < 0)
			{
				System.out.println("Ha ganado el villano: " + nombreV);
				dev = "Ha ganado: " + nombreV;
			}
			else
			{
				System.out.println("Ha ganado el superheroe: " + nombreS);
				dev = "Ha ganado: " + nombreS;
			}
			return dev;
}
}