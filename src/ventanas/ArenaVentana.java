package ventanas;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Pelea;
import personas.Superheroe;
import personas.Villano;
import sqlite.SelectData;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;

/**Es la clase ArenaVentana en donde, se selecciona a un villano y un suerhéroe para combatir entre ellos y se
 * obtiene a un vencedor o un empate. Además se puede obtener información general de los personajes.
 * @author Pablo Sarobe Ezponda
 *
 */
public class ArenaVentana extends JFrame {

	/**Método en dodne se lanza la ventana
	 * 
	 */
	private JPanel contentPane;
	private ArrayList <Villano>listaVillano ;
	private ArrayList <Superheroe>listaSuperheroe;
	JTextArea textArea;
	JTextArea textAreaV;

	/**Met
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArenaVentana frame = new ArenaVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Se crea el JFrame en dodne se puede realizar diferentes opciones, se selecciona un villano y un spuerhéroe y 
	 * combaten pulsanod el botón LUCHA. Si le pulsas el botón de más infor, obtienes información adicional.
	 * Si pulsas el botón VOLVER vuelves al menu inicial (ventana inicio)
	 */
	public ArenaVentana() {
		
		Pelea pelea = new Pelea ();
		
		SelectData s = new SelectData();
		listaVillano = s.selectVillanos();
		listaSuperheroe = s.selectSuperheroes();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArena = new JLabel("ARENA");
		lblArena.setBounds(366, 16, 69, 20);
		contentPane.add(lblArena);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioVentana a = new InicioVentana();
				a.setVisible(true);
				ArenaVentana.this.dispose();
			}
		});
		btnVolver.setBounds(123, 371, 115, 29);
		contentPane.add(btnVolver);
		
		JLabel lblSuperheroes = new JLabel("Superheroes:");
		lblSuperheroes.setBounds(137, 44, 101, 20);
		contentPane.add(lblSuperheroes);
		
		JLabel lblVillanos = new JLabel("Villanos:");
		lblVillanos.setBounds(589, 44, 69, 20);
		contentPane.add(lblVillanos);
		
		JList <Superheroe> listSuper = new JList<Superheroe>();
		listSuper.setBounds(144, 71, 86, 55);
		contentPane.add(listSuper);
		
		DefaultListModel<Superheroe> listModel = new DefaultListModel <Superheroe>();
		for (int i = 0; i < listaSuperheroe.size(); i++)
			{
			    listModel.addElement(listaSuperheroe.get(i));
			}
		listSuper.setModel(listModel);
				
		JList <Villano >listVil = new JList <Villano>();
		listVil.setBounds(572, 71, 86, 55);
		contentPane.add(listVil);
		
		DefaultListModel<Villano> listModel1 = new DefaultListModel <Villano>();
		for (int i = 0; i < listaVillano.size(); i++)
			{
			    listModel1.addElement(listaVillano.get(i));
			}
		listVil.setModel(listModel1);

		
		JTextArea textAreaGana = new JTextArea();
		textAreaGana.setBounds(333, 375, 183, 45);
		
		textAreaGana.setVisible(false);
		getContentPane().add(textAreaGana);
		
		ArrayList<Superheroe> selecSuper = new ArrayList <Superheroe> ();
		ArrayList<Villano> selecVil = new ArrayList <Villano> ();
		JButton btnLuchar = new JButton("LUCHAR");
		btnLuchar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				for(int i = 0; i<listaSuperheroe.size(); i++)
				{
					if(listaSuperheroe.get(i)== listSuper.getSelectedValue())
					{
						int j =0;
						selecSuper.clear();
						selecSuper.add(listaSuperheroe.get(i));
						System.out.println("el nombre es:" + selecSuper.get(j));
					}
				}
				for(int i = 0; i<listaVillano.size(); i++)
				{
					if(listaVillano.get(i)== listVil.getSelectedValue())
					{
						int j =0;
						selecVil.clear();
						selecVil.add(listaVillano.get(i));
						System.out.println("el nombre es:" + selecVil.get(j));
					}
				}			
				String textoG = pelea.sistemaPelea(selecSuper,selecVil);
				textAreaGana.setText(textoG);
				textAreaGana.setVisible(true);
			}
		});
		btnLuchar.setBounds(572, 371, 115, 29);
		contentPane.add(btnLuchar);
		
		JButton btnSinfor = new JButton("Mas Infor");
		btnSinfor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textArea.isVisible()){
					textArea.setVisible(false);					
				}
				else 
					textArea.setVisible(true);;			
			}
		});
		btnSinfor.setBounds(15, 182, 120, 24);
		contentPane.add(btnSinfor);
		
		textArea = new JTextArea ();
		textArea.setBounds(15, 222, 363, 45);
		String texto1 = "Batman: 400 de vida y 100 de ataque, no tiene poder \n" +
						"Superman: 300 de vida y 110 de ataque, si tiene poder";
		textArea.setText(texto1);
		textArea.setVisible(false);
		getContentPane().add(textArea);
		
		JButton btnMsInfor = new JButton("M\u00E1s Infor");
		btnMsInfor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textAreaV.isVisible())
				{
					textAreaV.setVisible(false);
				}
				else 
					textAreaV.setVisible(true);
			}
		});
		btnMsInfor.setBounds(433, 182, 115, 29);
		contentPane.add(btnMsInfor);
		
		textAreaV = new JTextArea();
		textAreaV.setBounds(433, 222, 366, 45);
		String textoV = "Joker: 500 de vida y 130 de ataque, no tiene poder \n" +
						"Thanos: 250 de vida y 80 de ataque, si tiene poder";
		textAreaV.setText(textoV);
		textAreaV.setVisible(false);
		getContentPane().add(textAreaV);

	}
}
