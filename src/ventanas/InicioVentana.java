package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

/**Es la clase con la ventana inicio, en donde existen diferentes posibilidades, ARENA, BUSCAR Y SALIR.
 * @author Pablo Sarobe Ezponda
 *
 */
public class InicioVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Método en donde se ejecuta main
	 */
	/**Met
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioVentana frame = new InicioVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**Se crea el JFrame con diversas opciones, Arena (otra ventana para combatir), Buscar (para buscar más infor) y SALIR.
	 * 
	 */
	public InicioVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnArena = new JButton("ARENA");
		btnArena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArenaVentana a = new ArenaVentana();
				a.setLocationRelativeTo(InicioVentana.this);
				a.setVisible(true);
				InicioVentana.this.setVisible(false);
			}
		});
		
		JLabel lblMenuDeInicio = new JLabel("MENU DE INICIO");
		lblMenuDeInicio.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblMenuDeInicio.setForeground(Color.WHITE);
		lblMenuDeInicio.setBackground(Color.RED);
		lblMenuDeInicio.setBounds(122, 40, 156, 20);
		contentPane.add(lblMenuDeInicio);
	
		btnArena.setBounds(133, 99, 115, 29);
		contentPane.add(btnArena);
		
	
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BusquedaVentana a = new BusquedaVentana();
				a.setLocationRelativeTo(InicioVentana.this);
				a.setVisible(true);
				InicioVentana.this.setVisible(false);
			}
		});
		btnBuscar.setBounds(133, 147, 115, 29);
		contentPane.add(btnBuscar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				   int respuesta = JOptionPane.showOptionDialog(InicioVentana.this, "¿Estás seguro de salir?","Confirmar", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, null, null);
			 
			        if (respuesta == 0) 
			        {
			        	System.exit(0);			        
			        }
				
			}
		});
		btnSalir.setBounds(133, 192, 115, 29);
		contentPane.add(btnSalir);
		
		JPanel panelFoto = new JPanel();
		panelFoto.setBounds(0, 0, 375, 276);
		panelFoto.setBackground(Color.DARK_GRAY);
		contentPane.add(panelFoto);
		panelFoto.setLayout(null);
		
		JLabel labelF = new JLabel("New label");
		labelF.setBounds(0, 0, 445, 286);
		panelFoto.add(labelF);
		labelF.setIcon(new ImageIcon(InicioVentana.class.getResource("/imagenes/ElCombateDefinitivo_opt (1).jpg")));
		
	}
}
