package personas;

import interfaces.AumentoAtaque;

/**
 * Es la clase de Superh�roes, en donde estn los constructores de Superh�roe que se ir�n utilizando a los largo de programa.
 * @author Pablo Sarobe Ezponda
 */
public class Superheroe extends Personaje implements AumentoAtaque {

	boolean poderAtaque;

	/**M�todo del constructor de la clase Superh�roe.
	 * @param poderAtaque es una variable de tipo booleano, que dice si tiene o no poder para aumentar el ataque.
	 */
	public Superheroe(boolean poderAtaque) {
		super();
		this.poderAtaque = poderAtaque;
	}

	/**
	 * Es el m�todo de constructor vac�o.
	 */
	public Superheroe() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**M�todo que devuelve si el superh�roe tiene poder o no.
	 * @return devolver� un boolean que dir� si el superh�roe tiene poder de ataque o no.
	 */
	public boolean isPoderAtaque() {
		return poderAtaque;
	}

	/**M�todo para introducir o modificar, si un superh�roe tiene poder de atque o no.
	 * @param poderAtaque es una variable boolean, que decide si un superh�roe tiene poder de ataque o no.
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
