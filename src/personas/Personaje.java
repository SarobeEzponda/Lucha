package personas;

/**
 * Es la clase Personaje, en donde est�n los constructores de Personaje que se ir�n utilizando a lo largo del programa.
 * @author Pablo Sarobe
 *
 */
public class Personaje {

	private int idPer;
	private boolean bando;
	private String nombre;
	private int vida;
	private int ataque;
	

	/**Es el m�todo de constructor vac�o.
	 * 
	 */
	public Personaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**M�todo del constructor de la clase Personaje.
	 * @param idPer variable de tipo int, para diferenciar persoanjes.
	 * @param bando variable de tipo boolean, para saber a que bando pertenece.
	 * @param nombre variable de tipo String, es para saber el nombre del Personaje.
	 * @param vida variable de tipo int, es la vida de dicho Personaje.
	 * @param ataque variable de tipo int, es el ataque de dicho Personaje.
	 */
	public Personaje(int idPer, boolean bando, String nombre, int vida, int ataque) {
		super();
		this.idPer = idPer;
		this.bando = bando;
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
	}



	/**M�todo que devuelve la variable idPer que indica que persoanje es por un n�mero.
	 * @return Devuelve la variable idPer que indica por un n�mero un personaje.
	 */
	public int getIdPer() {
		return idPer;
	}
	/**M�todo que se introduce o modif�ca el idPer de un personaje.
	 * @param idPer es la variable con la que se puede identificar a un persoanje.
	 */
	public void setIdPer(int idPer) {
		this.idPer = idPer;
	}
	/**M�todo que devuelve la variable bando, para saber a cual pertenece.
	 * @return Devuelve la variable bando, para saber a cual pertenece.
	 */
	public boolean isbando() {
		return bando;
	}
	/**M�todo para introducir o modificar el bando de un personje.
	 * @param bando variable booleana con el nado del personaje.
	 */
	public void setEquipo(boolean bando) {
		this.bando = bando;
	}
	/**M�todo que devolver� el nombre del personaje.
	 * @return devolver� un String con el nombre del personaje.
	 */
	public String getNombre() {
		return nombre;
	}
	/**M�todo que introduce o modif�a la el parametro nombre del personaje.
	 * @param nombre variable String que contiene el nombre del personaje.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**M�todo que devuele la vida de un personaje.
	 * @return devolver� un int con la vida de dicho personaje.
	 */
	public int getVida() {
		return vida;
	}
	/**M�todo que introduce o modif�ca la vida de un personaje.
	 * @param vida es una variable de tipo int que contiene la vida del personaje.
	 */
	public void setVida(int vida) {
		this.vida = vida;
	}
	/**M�todo que devuelve el ataque de un personaje.
	 * @return devolver� un int con el ataque de dicho personaje.
	 */
	public int getAtaque() {
		return ataque;
	}
	/**M�todo que introduce o modif�ca el ataque de un personaje.
	 * @param ataque es una variable de tipo int que contiene el ataque del personaje.
	 */ 
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return "Personaje "+ "nombre=" + nombre + ", vida=" + vida + ", ataque="
				+ ataque + ".";
	}
	
	
}
