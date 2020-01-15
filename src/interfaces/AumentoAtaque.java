package interfaces;

/**
 * @author Pablo Sarobe Ezponda
 * Esta es la interface de aumento de ataque 
 */
public interface AumentoAtaque {
	
	/**
	 * Este método se le implementará al la clase Superheroe.
	 * @param pderAtaque es un parametro de tipo booleano que pasará si el Superheroe tiene poder de aumento de ataque o no.
	 * @return devolverá un booleano true/false si el Superheroe tiene poder o no.
	 */
	public abstract boolean ataquePo(boolean pderAtaque);

}
