package logica;

import java.util.ArrayList;

import personas.Personaje;
import sqlite.SelectData;

/**
 * Es una clase para ordenar listas de Personaje para emplearlas en la ventana de Busquedas
 * @author Pablo Sarobe Ezponda
 */
public class Ordenar {
	
	private static   ArrayList <Personaje> listaPersonaje = new ArrayList <Personaje> ();
	
	/**
	 * Es el método de ordenar por vida los Personajes, de menos a más.
	 * @return devuelve un ArrayList de Personajes ordenador por vida (de menos a más).
	 */
	public static ArrayList<Personaje> ordenVida (){
		
		SelectData s = new SelectData ();
		listaPersonaje = s.selectPersonajes();
		
		mergeSort(listaPersonaje);
	    System.out.println("\nSorted List:");
	    
	    
	    ArrayList<Personaje> listaVida = new ArrayList <Personaje> ();
	    
	    for( Personaje p: listaPersonaje)
	    	listaVida.add(p);
	   //   System.out.print(p + " \n");
	    
		
		return listaVida;
	    
	}
	/**
	 * Es un método que pasa el ArrayList de Personajes al método doMergeSort.
	 * @param listaPersonaje es un ArrayList de Personajes.
	 */
	public static void mergeSort(ArrayList<Personaje>listaPersonaje){
		  doMergeSort(listaPersonaje);
		}
	/**
	 * En este método se realiza el algoritmo de ordenación por mergeShort.
	 * @param listaPersonaje se pasa el ArrayList de Personaje para que se ordene.
	 */
	private static void doMergeSort(ArrayList<Personaje> listaPersonaje){
		  int middle;
		  ArrayList<Personaje> left = new ArrayList<>();
		  ArrayList<Personaje> right = new ArrayList<>();
		  
		  if (listaPersonaje.size() > 1) {
		     middle = listaPersonaje.size() / 2;
		        // copy the left half of numbers into left.
		        for (int i = 0; i < middle; i++) 
		            left.add(listaPersonaje.get(i));
		 
		        //copy the right half of numbers into right.
		        for (int j = middle; j < listaPersonaje.size(); j++)
		            right.add(listaPersonaje.get(j));
		            
		     doMergeSort(left);
		     doMergeSort(right);
		     
		     merge(listaPersonaje, left, right);
		  }
		}
	/**
	 * Es otro método para poder realizar la ordenación por MergShort.
	 * @param listaPersonaje es un ArrayList de Personajes.
	 * @param left es un ArrayList de Personajes que se emplea como apoyo para ordenar por vida.
	 * @param rightes un ArrayList de Personajes que se emplea como apoyo para ordenar por vida.
	 */
	private static void merge(ArrayList<Personaje> listaPersonaje, ArrayList<Personaje> left, ArrayList<Personaje> right){
		  //set up a temporary arraylist to build the merge list
		  ArrayList<Personaje> temp = new ArrayList<>(); 
		  
		  //set up index values for merging the two lists 
		  int numbersIndex = 0;    
		  int leftIndex = 0;
		  int rightIndex = 0;

		  while (leftIndex < left.size() && rightIndex < right.size()) {
		    if (left.get(leftIndex).getVida() < right.get(rightIndex).getVida() ) { //cambio
		    	listaPersonaje.set(numbersIndex, left.get(leftIndex));
		            leftIndex++;
		        } else {
		        	listaPersonaje.set(numbersIndex, right.get(rightIndex));
		            rightIndex++;
		        }
		        numbersIndex++;
		    }
		   
		    int tempIndex = 0;
		    if (leftIndex >= left.size()) {
		        temp = right;
		        tempIndex = rightIndex;
		    } 
		    else {
		        temp = left;
		        tempIndex = leftIndex;
		    }
		 
		    for (int i = tempIndex; i < temp.size(); i++) {
		    	listaPersonaje.set(numbersIndex, temp.get(i));
		        numbersIndex++;
		    }
		 }
/**
 * Es el método de ordenar por ataque los Personajes, de menos a más.
 * @return devuelve un ArrayList de Personajes ordenador por ataque (de menos a más).
 */
public static ArrayList<Personaje> ordenAtaque (){
		
		SelectData s = new SelectData ();
		listaPersonaje = s.selectPersonajes();
		
		mergeSortA(listaPersonaje);
	    System.out.println("\nSorted List:");
	    
	    
	    ArrayList<Personaje> listaAtaque = new ArrayList <Personaje> ();
	    
	    for( Personaje p: listaPersonaje)
	    	listaAtaque.add(p);
	   //   System.out.print(p + " \n");
	    
		
		return listaAtaque;
	    
	}
	/**
	 * Es un método que pasa el ArrayList de Personajes al método doMergeSortA.
	 * @param listaPersonaje listaPersonaje es un ArrayList de Personajes.
	 */
	public static void mergeSortA(ArrayList<Personaje>listaPersonaje){
		  doMergeSortA(listaPersonaje);
		}
	/**
	 * En este método se realiza el algoritmo de ordenación por mergeShort.
	 * @param listaPersonaje se pasa el ArrayList de Personaje para que se ordene.
	 */
	private static void doMergeSortA(ArrayList<Personaje> listaPersonaje){
		  int middle;
		  ArrayList<Personaje> left = new ArrayList<>();
		  ArrayList<Personaje> right = new ArrayList<>();
		  
		  if (listaPersonaje.size() > 1) {
		     middle = listaPersonaje.size() / 2;
		        // copy the left half of numbers into left.
		        for (int i = 0; i < middle; i++) 
		            left.add(listaPersonaje.get(i));
		 
		        //copy the right half of numbers into right.
		        for (int j = middle; j < listaPersonaje.size(); j++)
		            right.add(listaPersonaje.get(j));
		            
		     doMergeSortA(left);
		     doMergeSortA(right);
		     
		     mergeA(listaPersonaje, left, right);
		  }
		}
	/**
	 * Es otro método para poder realizar la ordenación por MergShort.
	 * @param listaPersonaje es un ArrayList de Personajes.
	 * @param left es un ArrayList de Personajes que se emplea como apoyo para ordenar por ataque.
	 * @param right es un ArrayList de Personajes que se emplea como apoyo para ordenar por ataque.
	 */
	private static void mergeA(ArrayList<Personaje> listaPersonaje, ArrayList<Personaje> left, ArrayList<Personaje> right){
		  //set up a temporary arraylist to build the merge list
		  ArrayList<Personaje> temp = new ArrayList<>(); 
		  
		  //set up index values for merging the two lists 
		  int numbersIndex = 0;    
		  int leftIndex = 0;
		  int rightIndex = 0;

		  while (leftIndex < left.size() && rightIndex < right.size()) {
		    if (left.get(leftIndex).getAtaque() < right.get(rightIndex).getAtaque() ) { //cambio
		    	listaPersonaje.set(numbersIndex, left.get(leftIndex));
		            leftIndex++;
		        } else {
		        	listaPersonaje.set(numbersIndex, right.get(rightIndex));
		            rightIndex++;
		        }
		        numbersIndex++;
		    }
		   
		    int tempIndex = 0;
		    if (leftIndex >= left.size()) {
		        temp = right;
		        tempIndex = rightIndex;
		    } 
		    else {
		        temp = left;
		        tempIndex = leftIndex;
		    }
		 
		    for (int i = tempIndex; i < temp.size(); i++) {
		    	listaPersonaje.set(numbersIndex, temp.get(i));
		        numbersIndex++;
		    }
		 }
}
