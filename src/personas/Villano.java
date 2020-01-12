package personas;

public class Villano extends Personaje{
	boolean poderSanar;



	public Villano() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Villano(boolean poderSanar) {
		super();
		this.poderSanar = poderSanar;
	}

	public Villano(int idPer, boolean bando, String nombre, int vida, int ataque, boolean poderSanar) {
		super(idPer, bando, nombre, vida, ataque);

		// TODO Auto-generated constructor stub
	}

	public boolean isPoderSanar() {
		return poderSanar;
	}

	public void setPoderSanar(boolean poderSanar) {
		this.poderSanar = poderSanar;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	
	
}
