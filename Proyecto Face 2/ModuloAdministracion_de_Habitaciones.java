package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ModuloAdministracion_de_Habitaciones extends JFrame {

	//Puntero de Lista
	Nodo_AdministrHabitaciones inicio;
	
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloAdministracion_de_Habitaciones frame = new ModuloAdministracion_de_Habitaciones();
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
	public ModuloAdministracion_de_Habitaciones() {
		
		//PUNTERO
		inicio = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HABITACIONES PARA HUESPEDES");
		lblNewLabel.setBounds(111, 22, 199, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblTipoDeHabitacion = new JLabel("Tipo de Habitacion");
		lblTipoDeHabitacion.setBounds(10, 69, 111, 14);
		getContentPane().add(lblTipoDeHabitacion);
		
		textField1 = new JTextField();
		textField1.setText("");
		textField1.setBounds(118, 66, 79, 20);
		getContentPane().add(textField1);
		textField1.setColumns(10);
		
		JLabel lblNoCamas = new JLabel("No. Camas");
		lblNoCamas.setBounds(10, 119, 86, 14);
		getContentPane().add(lblNoCamas);
		
		textField2 = new JTextField();
		textField2.setText("");
		textField2.setBounds(118, 116, 79, 20);
		getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNoEdificio = new JLabel("No. Edificio");
		lblNoEdificio.setBounds(10, 163, 67, 14);
		getContentPane().add(lblNoEdificio);
		
		textField3 = new JTextField();
		textField3.setText("");
		textField3.setBounds(118, 160, 79, 20);
		getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lblNoNivel = new JLabel("No. Nivel");
		lblNoNivel.setBounds(247, 69, 63, 14);
		getContentPane().add(lblNoNivel);
		
		textField4 = new JTextField();
		textField4.setText("");
		textField4.setBounds(316, 66, 86, 20);
		getContentPane().add(textField4);
		textField4.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(247, 119, 46, 14);
		getContentPane().add(lblEstado);
		
		textField5 = new JTextField();
		textField5.setText("");
		textField5.setBounds(316, 116, 86, 20);
		getContentPane().add(textField5);
		textField5.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(247, 163, 46, 14);
		getContentPane().add(lblPrecio);
		
		textField6 = new JTextField();
		textField6.setText("");
		textField6.setBounds(316, 160, 86, 20);
		getContentPane().add(textField6);
		textField6.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Agregar(textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText(),textField5.getText(), textField6.getText());
			    textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				textField5.setText("");
				textField6.setText("");
			}
		});
		btnAceptar.setBounds(123, 214, 89, 23);
		getContentPane().add(btnAceptar);
		
		JButton btnBuscart = new JButton("Buscar");
		btnBuscart.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Buscar(textField1.getText());
			}
		});
		btnBuscart.setBounds(252, 214, 89, 23);
		getContentPane().add(btnBuscart);
	}
	
public void Agregar(String habitacion, String camas, String edificio, String nivel, String estado, String Precio_por_dia){
		
		Nodo_AdministrHabitaciones aux = inicio;
		
		if (aux == null){
			inicio = new Nodo_AdministrHabitaciones(habitacion, camas, edificio, nivel, estado, Precio_por_dia);
			
		}	
			else{
				Nodo_AdministrHabitaciones nuevo = new Nodo_AdministrHabitaciones(habitacion, camas, edificio, nivel, estado, Precio_por_dia);
				nuevo.referencia = aux;
				inicio = nuevo;
		}
	}

public String Buscar(String habitacion){
	
	Nodo_AdministrHabitaciones indice = inicio;
	
	while(indice!=null){
		if(habitacion.equals(indice.Tipo_de_Habitacion)){
			textField1.setText(indice.Tipo_de_Habitacion);
			
			textField2.setText(indice.Camas_Num);
			
			textField3.setText(indice.Edificio_Num);
			
			textField4.setText(indice.Nivel_Num);
			
			textField5.setText(indice.Estado_de_Habitacion);
			
			textField6.setText(indice.Precio_Habitacion);
			
		}
		
		indice = indice.referencia;
	}
	
	return "1";		 
}
}
