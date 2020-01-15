package personas;

import interfaces.AumentoAtaque;

/**
 * Es la clase de Superhéroes, en donde estn los constructores de Superhéroe que se irán utilizando a los largo de programa.
 * @author Pablo Sarobe Ezponda
 */
public class Superheroe extends Personaje implements AumentoAtaque {

	boolean poderAtaque;

	/**Método del constructor de la clase Superhéroe.
	 * @param poderAtaque es una variable de tipo booleano, que dice si tiene o no poder para aumentar el ataque.
	 */
	public Superheroe(boolean poderAtaque) {
		super();
		this.poderAtaque = poderAtaque;
	}

	/**
	 * Es el método de constructor vacío.
	 */
	public Superheroe() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**Método que devuelve si el superhéroe tiene poder o no.
	 * @return devolverá un boolean que dirá si el superhéroe tiene poder de ataque o no.
	 */
	public boolean isPoderAtaque() {
		return poderAtaque;
	}

	/**Método para introducir o modificar, si un superhéroe tiene poder de atque o no.
	 * @param poderAtaque es una variable boolean, que decide si un superhéroe tiene poder de ataque o no.
	 */
	public void setPoderAtaque(boolean poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}

	@Override
	public boolean ataquePo(boolean poder) {
		// TODO Auto-generated method stub
		boolean devS = false;
		
		if(poder==true)
		{
			int numRandom = (int) Math.floor(Math.random()*3);
				 if(numRandom==0)
				 {
					devS = true;
				 }
		}
		return devS;
		
	}
	
}
