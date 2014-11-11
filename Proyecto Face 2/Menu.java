package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		getContentPane().setEnabled(false);
		getContentPane().setForeground(Color.WHITE);
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMenu.setBounds(186, 11, 61, 27);
		getContentPane().add(lblMenu);
		
		JButton btnNewButton = new JButton("Reservar Habitacion");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			
				VentanaPrincipal_Hotel vh=new VentanaPrincipal_Hotel();				
				vh.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(32, 50, 158, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Entradas y Salidas");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				ModuloControl_de_EntradaSalidas_Huespedes mesh = new ModuloControl_de_EntradaSalidas_Huespedes();
				mesh.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(32, 84, 158, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Administrar Habitacion");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				ModuloAdministracion_de_Habitaciones mah = new ModuloAdministracion_de_Habitaciones();
				mah.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(32, 118, 168, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnServiciosAUtilizar = new JButton("Servicios a Utilizar");
		btnServiciosAUtilizar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				ModuloControl_de_Servicios_Utilizados msu = new ModuloControl_de_Servicios_Utilizados();
				msu.setVisible(true);
			}
		});
		btnServiciosAUtilizar.setBounds(32, 150, 158, 23);
		getContentPane().add(btnServiciosAUtilizar);
		
		JButton btnRestaurantes = new JButton("Restaurantes");
		btnRestaurantes.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				ModuloControl_de_Restaurantes mcr = new ModuloControl_de_Restaurantes();
				mcr.setVisible(true);
			}
		});
		btnRestaurantes.setBounds(32, 184, 158, 23);
		getContentPane().add(btnRestaurantes);

	}
}
