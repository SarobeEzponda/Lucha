package personas;

public  class Personaje {

	private int idPer;
	private boolean bando;
	private String nombre;
	private int vida;
	private int ataque;
	
	
	
	public Personaje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personaje(int idPer, boolean bando, String nombre, int vida, int ataque) {
		super();
		this.idPer = idPer;
		this.bando = bando;
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
	}



	public int getIdPer() {
		return idPer;
	}
	public void setIdPer(int idPer) {
		this.idPer = idPer;
	}
	public boolean isbando() {
		return bando;
	}
	public void setEquipo(boolean bando) {
		this.bando = bando;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	@Override
	public String toString() {
		return "Personaje "+ "nombre=" + nombre + ", vida=" + vida + ", ataque="
				+ ataque + ".";
	}
	
	
}
