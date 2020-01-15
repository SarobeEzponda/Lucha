package personas;

import interfaces.AumentoVida;

/**Es la clase Villano, en donde están los constructores de Villano que se irán utilizando a lo largo del programa. 
 * @author Pablo Sarobe Ezponda
 */
public class Villano extends Personaje implements AumentoVida{
	boolean poderSanar;

	/**Método con el constructor vacío.
	 * 
	 */
	public Villano() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**Método del cosntructor de la clase Villano.
	 * @param poderSanar es una variable booleana que indica si el villano puede aumentar su a través de un poder.
	 */
	public Villano(boolean poderSanar) {
		super();
		this.poderSanar = poderSanar;
	}


	/**Método que devuelve la variable poderSanar.
	 * @return variabel boolena con la información que indica si el villano puede aumentar su vida a través de un poder.
	 */
	public boolean isPoderSanar() {
		return poderSanar;
	}

	/**Método en el que se introduce o modifíca la variable poderSanar.
	 * @param poderSanar variable booleana que indica si un villano tiene el poder de aumentar su vida.
	 */
	public void setPoderSanar(boolean poderSanar) {
		this.poderSanar = poderSanar;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}

	@Override
	public boolean vidaPo(boolean pderVida) {
		// TODO Auto-generated method stub
		boolean devS = false;
		
		if(pderVida==true)
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
