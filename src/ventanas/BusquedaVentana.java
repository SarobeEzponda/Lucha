package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Ordenar;
import personas.Personaje;
import personas.Villano;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BusquedaVentana extends JFrame {

	private JPanel contentPane;
	JTextArea textAreaBus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BusquedaVentana frame = new BusquedaVentana();
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
	public BusquedaVentana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenuDeLuchadores = new JLabel("MENU DE LUCHADORES");
		lblMenuDeLuchadores.setBounds(105, 16, 175, 20);
		contentPane.add(lblMenuDeLuchadores);
		
		JLabel lblBuscarPor = new JLabel("Buscar por:");
		lblBuscarPor.setBounds(34, 45, 81, 20);
		contentPane.add(lblBuscarPor);
		
		JList listFil = new JList();
		listFil.setBounds(156, 89, 112, 93);
		contentPane.add(listFil);
		
		DefaultListModel listModelF = new DefaultListModel();		
		listModelF.addElement("Superheroe");
		listModelF.addElement("Villano");		
		listFil.setModel(listModelF);
		
		JList  listBus = new JList();
		listBus.setBounds(28, 89, 98, 92);
		contentPane.add(listBus);
		
		
		DefaultListModel listModel = new DefaultListModel();		
	
			listModel.addElement("Vida");
			listModel.addElement("Ataque");
			
		listBus.setModel(listModel);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioVentana a = new InicioVentana();
				a.setVisible(true);
				BusquedaVentana.this.dispose();
			}
		});
		btnVolver.setBounds(25, 197, 104, 29);
		contentPane.add(btnVolver);
		
		Ordenar ordenar = new Ordenar();
		
		
		ArrayList <Personaje> listaAtaque = Ordenar.ordenAtaque();
		
		textAreaBus = new JTextArea();
		textAreaBus.setBounds(288, 90, 185, 92);
		textAreaBus.setVisible(false);
		getContentPane().add(textAreaBus);

		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(listBus.getSelectedValue()=="Vida"){
						textAreaBus.setVisible(true);
						ArrayList <Personaje> listaVida = Ordenar.ordenVida();
						String texto1 = "";
						
						if(listFil.getSelectedValue()=="Superheroe")
						{																	
							for(int i = 0; i<listaVida.size(); i++){
								if(listaVida.get(i).getIdPer()==0 || listaVida.get(i).getIdPer()==1 ){
									texto1 = texto1 + listaVida.get(i).getNombre() +" tiene vida de " + listaVida.get(i).getVida()+ System.lineSeparator() ;
										 
									textAreaBus.setText(texto1);
								}
							}
						}
								else{
	//						String texto1 = "";
	//						ArrayList <Personaje> listaVida = Ordenar.ordenVida();
	//						for(int i = 0; i<listaVida.size(); i++){
	//							listaVida.get(i);
									for(int i = 0; i<listaVida.size(); i++){
										if(listaVida.get(i).getIdPer()==2 || listaVida.get(i).getIdPer()==3 ){
									texto1 = texto1 + listaVida.get(i).getNombre() +" tiene vida de " + listaVida.get(i).getVida()+ System.lineSeparator() ;
										 
									textAreaBus.setText(texto1);
										}
									}
								}
								}
				else if(listBus.getSelectedValue()=="Ataque")
				{
					textAreaBus.setVisible(true);
					String texto1 = "";
					
//					for(int i = 0; i<listaAtaque.size(); i++){
//					
//					texto1 = texto1 + listaAtaque.get(i).getNombre() +" tiene ataque de " + listaAtaque.get(i).getAtaque()+ System.lineSeparator() ;
//						 
//					textAreaBus.setText(texto1);
//				}
					if(listFil.getSelectedValue()=="Superheroe")
					{																	
						for(int i = 0; i<listaAtaque.size(); i++){
							if(listaAtaque.get(i).getIdPer()==0 || listaAtaque.get(i).getIdPer()==1 ){
								texto1 = texto1 + listaAtaque.get(i).getNombre() +" tiene ataque de " + listaAtaque.get(i).getAtaque()+ System.lineSeparator() ;
									 
								textAreaBus.setText(texto1);
							}
						}
					}
							else{
//						String texto1 = "";
//						ArrayList <Personaje> listaVida = Ordenar.ordenVida();
//						for(int i = 0; i<listaVida.size(); i++){
//							listaVida.get(i);
								for(int i = 0; i<listaAtaque.size(); i++){
									if(listaAtaque.get(i).getIdPer()==2 || listaAtaque.get(i).getIdPer()==3 ){
								texto1 = texto1 + listaAtaque.get(i).getNombre() +" tiene ataque de " + listaAtaque.get(i).getAtaque()+ System.lineSeparator() ;
									 
								textAreaBus.setText(texto1);
									}
								}
							}
							
				}

			}
		});
		btnBuscar.setBounds(288, 45, 98, 29);
		contentPane.add(btnBuscar);
		
		JLabel lblFiltrarPor = new JLabel("Filtrar por:");
		lblFiltrarPor.setBounds(156, 45, 81, 20);
		contentPane.add(lblFiltrarPor);
		

	}
	
}
