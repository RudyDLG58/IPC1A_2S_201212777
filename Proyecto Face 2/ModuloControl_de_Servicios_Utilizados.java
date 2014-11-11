package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModuloControl_de_Servicios_Utilizados extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;

	//Puntero Lista
	Nodo_ControlServicios inicio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloControl_de_Servicios_Utilizados frame = new ModuloControl_de_Servicios_Utilizados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ModuloControl_de_Servicios_Utilizados() {
		
		//PUNTERO
		inicio = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTiposDeServicios = new JLabel("Tipo(s) de Servicio(s)");
		lblTiposDeServicios.setBounds(31, 24, 125, 14);
		contentPane.add(lblTiposDeServicios);
		
		JLabel lblPiscina = new JLabel("Piscina Q.10.00");
		lblPiscina.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblPiscina.setBounds(10, 49, 75, 14);
		contentPane.add(lblPiscina);
		
		JLabel lblBufetQ = new JLabel("Bufet Q.15.00");
		lblBufetQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblBufetQ.setBounds(10, 62, 75, 14);
		contentPane.add(lblBufetQ);
		
		JLabel lblLoungeQ = new JLabel("Lounge Q.20.00");
		lblLoungeQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblLoungeQ.setBounds(10, 74, 75, 14);
		contentPane.add(lblLoungeQ);
		
		JLabel lblAnfiteatroQ = new JLabel("Anfiteatro Q.25.00");
		lblAnfiteatroQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblAnfiteatroQ.setBounds(10, 85, 87, 14);
		contentPane.add(lblAnfiteatroQ);
		
		JLabel lblBaresQ = new JLabel("Bares Q.30.00");
		lblBaresQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblBaresQ.setBounds(10, 96, 75, 14);
		contentPane.add(lblBaresQ);
		
		JLabel lblRestauranteQ = new JLabel("Restaurante Q.35.00");
		lblRestauranteQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblRestauranteQ.setBounds(10, 107, 96, 14);
		contentPane.add(lblRestauranteQ);
		
		JLabel lblCanchasQ = new JLabel("Canchas Q.40.00");
		lblCanchasQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCanchasQ.setBounds(10, 118, 75, 14);
		contentPane.add(lblCanchasQ);
		
		JLabel lblEnfermeriaQ = new JLabel("Enfermeria Q.45.00");
		lblEnfermeriaQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblEnfermeriaQ.setBounds(10, 130, 87, 14);
		contentPane.add(lblEnfermeriaQ);
		
		JLabel lblClubDeNios = new JLabel("Club de Ni\u00F1os Q.50.00");
		lblClubDeNios.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblClubDeNios.setBounds(10, 141, 96, 14);
		contentPane.add(lblClubDeNios);
		
		JLabel lblDiscotecaQ = new JLabel("Discoteca Q.55.00");
		lblDiscotecaQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblDiscotecaQ.setBounds(10, 152, 96, 14);
		contentPane.add(lblDiscotecaQ);
		
		JLabel lblGimnacioQ = new JLabel("Gimnacio Q.60.00");
		lblGimnacioQ.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblGimnacioQ.setBounds(10, 164, 96, 14);
		contentPane.add(lblGimnacioQ);
		
		textField1 = new JTextField();
		textField1.setText("");
		textField1.setBounds(166, 21, 204, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(152, 62, 33, 14);
		contentPane.add(lblHora);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setBounds(162, 85, 33, 14);
		contentPane.add(lblInicio);
		
		textField2 = new JTextField();
		textField2.setText("");
		textField2.setBounds(193, 82, 67, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblFin = new JLabel("Fin");
		lblFin.setBounds(270, 85, 25, 14);
		contentPane.add(lblFin);
		
		textField3 = new JTextField();
		textField3.setText("");
		textField3.setBounds(294, 82, 76, 20);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		JLabel lblCapacidad = new JLabel("Capacidad");
		lblCapacidad.setBounds(152, 130, 61, 14);
		contentPane.add(lblCapacidad);
		
		textField4 = new JTextField();
		textField4.setText("");
		textField4.setBounds(214, 127, 46, 20);
		contentPane.add(textField4);
		textField4.setColumns(10);
		
		JLabel lblPrecioQ = new JLabel("Precio Q.");
		lblPrecioQ.setBounds(270, 130, 61, 14);
		contentPane.add(lblPrecioQ);
		
		textField5 = new JTextField();
		textField5.setText("");
		textField5.setBounds(324, 127, 46, 20);
		contentPane.add(textField5);
		textField5.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Agregar(textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText());
			    textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				textField5.setText("");
			}
		});
		btnAceptar.setBounds(152, 184, 89, 23);
		contentPane.add(btnAceptar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Buscar(textField1.getText());
			}
		});
		btnBuscar.setBounds(281, 184, 89, 23);
		contentPane.add(btnBuscar);
	}
	//funcion agregar a lista
public void Agregar(String Servicio, String Inicio, String Fin, String No_Personas, String Monto){
		
		Nodo_ControlServicios aux = inicio;
		
		if (aux == null){
			inicio = new Nodo_ControlServicios(Servicio, Inicio, Fin, No_Personas, Monto);
		}	
			else{
				Nodo_ControlServicios nuevo = new Nodo_ControlServicios(Servicio, Inicio, Fin, No_Personas, Monto);
				nuevo.referencia = aux;
				inicio = nuevo;
		}
	}

public String Buscar(String Servicio){
	
	Nodo_ControlServicios indice = inicio;
	
	while(indice!=null){
		if(Servicio.equals(indice.Tipo_de_Servicio)){
			textField1.setText(indice.Tipo_de_Servicio);
			
			textField2.setText(indice.Hora_inicio);
			
			textField3.setText(indice.Hora_fin);
			
			textField4.setText(indice.Capacidad);
			
			textField5.setText(indice.Precio);
		}
		
		indice = indice.referencia;
	}
	
	return "1";		 
}

}
