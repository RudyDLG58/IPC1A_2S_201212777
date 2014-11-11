package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ModuloControl_de_EntradaSalidas_Huespedes extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;

	//PUNTERO LISTA
	Nodo_EntraSalida inicio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModuloControl_de_EntradaSalidas_Huespedes frame = new ModuloControl_de_EntradaSalidas_Huespedes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ModuloControl_de_EntradaSalidas_Huespedes() {
		
		//PUNTERO
				inicio = null;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Entradas y Salidas de Huespedes");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Agregar(textField1.getText(), textField2.getText(), textField3.getText(), textField4.getText(), textField5.getText());
			    textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				textField5.setText("");
			}
		});
		btnNewButton.setBounds(73, 32, 219, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(87, 93, 48, 20);
		contentPane.add(lblNombre);
		
		textField1 = new JTextField();
		textField1.setText("");
		textField1.setBounds(133, 93, 159, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblFechaInicio = new JLabel("Fecha Inicio");
		lblFechaInicio.setBounds(51, 132, 64, 20);
		contentPane.add(lblFechaInicio);
		
		textField2 = new JTextField();
		textField2.setText("");
		textField2.setBounds(112, 132, 86, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(220, 132, 31, 20);
		contentPane.add(lblHora);
		
		textField3 = new JTextField();
		textField3.setText("");
		textField3.setBounds(249, 132, 86, 20);
		contentPane.add(textField3);
		textField3.setColumns(10);
		
		JLabel lblFechaFinal = new JLabel("Fecha Final");
		lblFechaFinal.setBounds(51, 173, 54, 14);
		contentPane.add(lblFechaFinal);
		
		textField4 = new JTextField();
		textField4.setText("");
		textField4.setBounds(112, 170, 86, 20);
		contentPane.add(textField4);
		textField4.setColumns(10);
		
		JLabel lblHora_1 = new JLabel("Hora");
		lblHora_1.setBounds(220, 173, 31, 14);
		contentPane.add(lblHora_1);
		
		textField5 = new JTextField();
		textField5.setText("");
		textField5.setBounds(249, 170, 86, 20);
		contentPane.add(textField5);
		textField5.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Control_EntraSalida es = new Control_EntraSalida();
				
				Buscar(textField1.getText());
			}
		});
		btnBuscar.setBounds(162, 215, 89, 23);
		contentPane.add(btnBuscar);
	}
	
	//FUNCION AGREGAR LISTA
public void Agregar(String Nombre, String F_entrada, String H_entrada, String F_salida, String H_salida){
		
		Nodo_EntraSalida aux = inicio;
		
		if (aux == null){
			inicio = new Nodo_EntraSalida(Nombre, F_entrada, H_entrada, F_salida, H_salida);
		}	
			else{
				Nodo_EntraSalida nuevo = new Nodo_EntraSalida(Nombre, F_entrada, H_entrada, F_salida, H_salida);
				nuevo.referencia = aux;
				inicio = nuevo;
		}
	}

//FUNCION BUSCAR LISTA
public String Buscar(String Nombre){
	
	Nodo_EntraSalida indice = inicio;
	
	while(indice!=null){
		if(Nombre.equals(indice.Nombre_Cliente)){
			textField1.setText(indice.Nombre_Cliente);
			
			textField2.setText(indice.Fecha_Entrada);
			
			textField3.setText(indice.Hora_Entrada);
			
			textField4.setText(indice.Fecha_Salida);
			
			textField5.setText(indice.Hora_Salida);
		}
		
		indice = indice.referencia;
	}
	
	return "1";		 
}


}
