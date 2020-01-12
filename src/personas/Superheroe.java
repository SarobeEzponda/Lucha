package personas;

public class Superheroe extends Personaje {

	boolean poderAtaque;

	public Superheroe(boolean poderAtaque) {
		super();
		this.poderAtaque = poderAtaque;
	}

	public Superheroe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Superheroe(int idPer, boolean bando, String nombre, int vida, int ataque, boolean poderAtaque) {
		super(idPer, bando, nombre, vida, ataque);
		// TODO Auto-generated constructor stub
	}

	public boolean isPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(boolean poderAtaque) {
		this.poderAtaque = poderAtaque;
	}

	@Override
	public String toString() {
		return this.getNombre();
	}
	
}
