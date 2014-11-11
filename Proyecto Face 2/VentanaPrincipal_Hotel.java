package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaPrincipal_Hotel extends JFrame {

	private JPanel panel_general;
	private JTextField textField1;
	public JTextField textField2;
	public JTextField textField3;
	private JTextField textField4;
	private JButton button;
	private JButton btnBuscar;
	
	//PUNTERO LISTA
	Nodo_Reserva inicio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal_Hotel frame = new VentanaPrincipal_Hotel();
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
	public VentanaPrincipal_Hotel() {
		
		//PUNTERO
		inicio = null;
		
		setTitle("Hotel Decameron International");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 369);
		panel_general = new JPanel();
		panel_general.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel_general);
		panel_general.setLayout(null);
		
		
		JButton btnReservacionDeHabitacion = new JButton("Reservar Habitacion");
		btnReservacionDeHabitacion.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
		//		Reserva_Habitaciones reserva = new Reserva_Habitaciones();
					  
				
				Agregar(textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText());
			    textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				
			}
		});
		btnReservacionDeHabitacion.setBounds(27, 26, 159, 23);
		panel_general.add(btnReservacionDeHabitacion);
		
		textField1 = new JTextField();
		textField1.setText("");
		textField1.setBounds(300, 27, 91, 20);
		panel_general.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setText("");
		textField2.setBounds(300, 61, 91, 20);
		panel_general.add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setText("");
		textField3.setBounds(300, 88, 91, 20);
		panel_general.add(textField3);
		textField3.setColumns(10);
		
		textField4 = new JTextField();
		textField4.setText("");
		textField4.setBounds(300, 114, 91, 20);
		panel_general.add(textField4);
		textField4.setColumns(10);	
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent b) {
				
				Reserva_Habitaciones reserva = new Reserva_Habitaciones();
				
					Buscar(textField1.getText());
			}
		});
		btnBuscar.setBounds(27, 60, 89, 23);
		panel_general.add(btnBuscar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(196, 30, 46, 14);
		panel_general.add(lblNombre);
		
		JLabel lblNewLabel = new JLabel("Fecha Inicio");
		lblNewLabel.setBounds(196, 57, 57, 14);
		panel_general.add(lblNewLabel);
		
		JLabel lblFechaFinal = new JLabel("Fecha Final");
		lblFechaFinal.setBounds(196, 91, 57, 14);
		panel_general.add(lblFechaFinal);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(196, 117, 46, 14);
		panel_general.add(lblPrecio);
		
		
		
	}
	
	//FUNCION AGREGAR LISTA
	public void Agregar(String Nombre, String Inicio, String Fin, String Monto){
		
		System.out.println("ingreso agregar");
		Nodo_Reserva aux = inicio;
			
		if(aux==null){
		   inicio=new Nodo_Reserva(Nombre, Inicio, Fin, Monto,inicio); 
		   System.out.println("ingreso agregar 1");
		}else{
			System.out.println("ingreso agregar 2");
				Nodo_Reserva nuevo = new Nodo_Reserva(Nombre, Inicio, Fin, Monto);
				nuevo.referencia = aux;
				inicio = nuevo;
		}
	}
	
	//FUNCION BUSCAR LISTA
	
	public  String Buscar(String Nombre){
		
		Nodo_Reserva indice = inicio;
		
		while(indice!=null){	
			if(Nombre.equals(indice.Nombre_Cliente)){
			     textField1.setText(indice.Nombre_Cliente);
			     textField2.setText(indice.Fecha_Inicio);					
				 textField3.setText(indice.Fecha_Fin);
			     textField4.setText(indice.Precio);
					
			
			}
			
			indice = indice.referencia;
			
		}
		
		return "1";
		
	}

}
