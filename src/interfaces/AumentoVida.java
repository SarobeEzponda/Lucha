package interfaces;

/**
 * @author Pablo Sarobe Ezponda
 *Es una interface que se implementara a la clase vVillano.
 */
public interface AumentoVida {

	/**
	 * @param pderVida es un parametro de tipo booleano que pasará si el Villano tiene poder de aumento de vida o no.
	 * @return devolverá un booleano true/false si el Villano tiene poder o no.
	 */
	public abstract boolean vidaPo(boolean pderVida);
}
