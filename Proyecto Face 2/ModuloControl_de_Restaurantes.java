package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;



public class ModuloControl_de_Restaurantes extends JFrame {

	Nodo_ControlRestaurantes inicio;
	
	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloControl_de_Restaurantes frame = new ModuloControl_de_Restaurantes();
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
	public ModuloControl_de_Restaurantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restaurante");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(47, 35, 83, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mayan Place");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_1.setBounds(25, 60, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblTamales = new JLabel("Tamales");
		lblTamales.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblTamales.setBounds(25, 70, 46, 14);
		contentPane.add(lblTamales);
		
		JLabel lblMayanNights = new JLabel("Mayan Nights");
		lblMayanNights.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblMayanNights.setBounds(25, 93, 58, 14);
		contentPane.add(lblMayanNights);
		
		JLabel lblChuchitos = new JLabel("Chuchitos");
		lblChuchitos.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblChuchitos.setBounds(25, 105, 46, 14);
		contentPane.add(lblChuchitos);
		
		JLabel lblMayanGrill = new JLabel("Mayan Grill");
		lblMayanGrill.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblMayanGrill.setBounds(25, 129, 58, 14);
		contentPane.add(lblMayanGrill);
		
		JLabel lblCarneAzada = new JLabel("Carne azada");
		lblCarneAzada.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblCarneAzada.setBounds(25, 141, 46, 14);
		contentPane.add(lblCarneAzada);
		
		JLabel lblNewLabel_2 = new JLabel("Italian Noodles");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblNewLabel_2.setBounds(25, 164, 83, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblPolloDorado = new JLabel("Pollo Dorado");
		lblPolloDorado.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblPolloDorado.setBounds(25, 176, 46, 14);
		contentPane.add(lblPolloDorado);
		
		JLabel lblMediterraneanFlavor = new JLabel("Mediterranean Flavor");
		lblMediterraneanFlavor.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblMediterraneanFlavor.setBounds(25, 201, 124, 14);
		contentPane.add(lblMediterraneanFlavor);
		
		JLabel lblNewLabel_3 = new JLabel("Pezcado Dorado");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel_3.setBounds(25, 213, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		textField1 = new JTextField();
		textField1.setText("");
		textField1.setBounds(140, 33, 268, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblEspecialidadDeLa = new JLabel("Especialidad de la casa");
		lblEspecialidadDeLa.setBounds(140, 87, 140, 14);
		contentPane.add(lblEspecialidadDeLa);
		
		textField2 = new JTextField();
		textField2.setText("");
		textField2.setBounds(279, 82, 129, 25);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(140, 112, 46, 14);
		contentPane.add(lblHora);
		
		JLabel lblDe = new JLabel("De:");
		lblDe.setBounds(140, 138, 46, 14);
		contentPane.add(lblDe);
		
		textField3 = new JTextField();
		textField3.setText("");
		textField3.setBounds(161, 135, 86, 20);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		JLabel lblA = new JLabel("A:");
		lblA.setBounds(272, 138, 46, 14);
		contentPane.add(lblA);
		
		textField4 = new JTextField();
		textField4.setText("");
		textField4.setBounds(289, 135, 119, 20);
		contentPane.add(textField4);
		textField4.setColumns(10);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setBounds(140, 175, 66, 14);
		contentPane.add(lblCapacidad);
		
		textField5 = new JTextField();
		textField5.setText("");
		textField5.setBounds(203, 172, 46, 20);
		contentPane.add(textField5);
		textField5.setColumns(10);
		
		JLabel lblHubicacion = new JLabel("Hubicacion");
		lblHubicacion.setBounds(272, 175, 66, 14);
		contentPane.add(lblHubicacion);
		
		textField6 = new JTextField();
		textField1.setText("");
		textField6.setBounds(339, 172, 69, 20);
		contentPane.add(textField6);
		textField6.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Agregar(textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText(), textField6.getText());
			    textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				textField5.setText("");
				textField6.setText("");
			}
		});
		btnAceptar.setBounds(159, 208, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Buscar(textField1.getText());
			}
		});
		btnBuscar.setBounds(279, 208, 89, 23);
		contentPane.add(btnBuscar);
	}
	
public void Agregar(String Nombre, String Tamales, String De, String A, String No_Personas, String Lugar){
		
		Nodo_ControlRestaurantes aux= inicio;
		
		if(aux == null){
			inicio = new Nodo_ControlRestaurantes(Nombre, Tamales, De, A, No_Personas, Lugar);
			
		}
		else{
			Nodo_ControlRestaurantes nuevo = new Nodo_ControlRestaurantes(Nombre, Tamales, De, A, No_Personas, Lugar);
			nuevo.referencia = aux;
			inicio = nuevo;
		}
	}

public String Buscar(String Nombre){
	
	Nodo_ControlRestaurantes indice = inicio;
	
		while(indice!=null){
			
			if(Nombre.equals(indice.Nombre_Restaurante)){
				
				textField1.setText(indice.Nombre_Restaurante);
				
				textField2.setText(indice.Especialida_de_la_Casa);
				
				textField3.setText(indice.Hora_de_Atencion1);
				
				textField4.setText(indice.Hora_de_Atencion2);
				
				textField5.setText(indice.Capacidad_por_Servicio);
				
				textField6.setText(indice.Hubicacion);
			}
			
					indice = indice.referencia;
		}
		
						return "1";
}
}
