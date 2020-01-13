package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicioVentana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
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

	/**
	 * Create the frame.
	 */
	public InicioVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuDeInicio = new JLabel("MENU DE INICIO");
		lblMenuDeInicio.setBounds(146, 16, 124, 20);
		contentPane.add(lblMenuDeInicio);
		
		JButton btnArena = new JButton("ARENA");
		btnArena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArenaVentana a = new ArenaVentana();
				a.setLocationRelativeTo(InicioVentana.this);
				a.setVisible(true);
				InicioVentana.this.setVisible(false);
			}
		});
	
		btnArena.setBounds(146, 52, 115, 29);
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
		btnBuscar.setBounds(146, 97, 115, 29);
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
		btnSalir.setBounds(146, 142, 115, 29);
		contentPane.add(btnSalir);
	}
}
