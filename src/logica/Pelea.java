package logica;

import java.util.ArrayList;

import personas.Superheroe;
import personas.Villano;
import sqlite.SelectData;



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
		static int numRandom;
		

		
		
//		public static  void peleaArena(){
//			
//			sistemaPelea();
//			return;
//		}
		public static String sistemaPelea (ArrayList <Superheroe> selecSuper ,ArrayList <Villano> selecVil){
			
		String dev = "";
			
			int i = 0;
			nombreS = selecSuper.get(i).getNombre();
			vidaS = selecSuper.get(i).getVida();
			ataqueS = selecSuper.get(i).getAtaque();
		//	poderAtaqueS = selecSuper.get(i).
			System.out.println(nombreS + " " + vidaS + "  " + ataqueS);
			
			nombreV = selecVil.get(i).getNombre();
			vidaV = selecVil.get(i).getVida();
			ataqueV = selecVil.get(i).getAtaque();
			
			System.out.println(nombreV + " " + vidaV + "  " + ataqueV);
			do{

				 numRandom = (int) Math.floor(Math.random()*6);
				 if(numRandom==0){
					 if(poderAtaqueS == true)
					 {
						 ataqueS =ataqueS + 70;
						 
						 vidaS = vidaS - ataqueV;
						 vidaV = vidaV - ataqueS;
					 }
					 else{
						 vidaS = vidaS - ataqueV;
						 vidaV = vidaV - ataqueS;
					 }
				 }
				 else if (numRandom == 1)
				 {
					 if(poderSanarV == true)
					 {
						 vidaV = vidaV + 200;
						 vidaS = vidaS - ataqueV;
						 vidaV = vidaV - ataqueS;					 
					 }
					 else
					 {
						 vidaS = vidaS - ataqueV;
						 vidaV = vidaV - ataqueS;
					 }
					 
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