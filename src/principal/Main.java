package principal;



import ventanas.InicioVentana;

/**
 * Clase principal del programa
 * @author Pablo Sarobe Ezponda
 */
public class Main { 
	/**
	 * Desde este m�todo main se lanza la aplicaci�n hacia la ventana de inicio.
	 * @param args Es el argumento del m�todo main.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		InicioVentana inicioVentana = new InicioVentana ();
		inicioVentana.setVisible(true);
	}

}
