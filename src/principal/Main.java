package principal;



import ventanas.InicioVentana;

/**
 * Clase principal del programa
 * @author Pablo Sarobe Ezponda
 */
public class Main { 
	/**
	 * Desde este método main se lanza la aplicación hacia la ventana de inicio.
	 * @param args Es el argumento del método main.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		InicioVentana inicioVentana = new InicioVentana ();
		inicioVentana.setVisible(true);
	}

}
