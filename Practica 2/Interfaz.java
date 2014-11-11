package interfaz;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Interfaz extends JFrame {
	
	private JMenuBar menu = new JMenuBar();
	private NewCanvas canvas = new NewCanvas();
	String estacionActual = "Estacion: ";
	String direccionArchivo = "";
	Lector lector = null;
	
	public Interfaz(){
		super("Train Sim X");
		setLayout(null);
		setBounds(0,0,400,400);
		
		//barra de menu
		setJMenuBar(menu);
		JMenu archivo = new JMenu("Archivo");
		JMenuItem abrir = new JMenuItem("Abrir");
		archivo.add(abrir);
		abrir.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFileChooser archivoAbrir = new JFileChooser();
				archivoAbrir.showOpenDialog(null);
				try{
					direccionArchivo = archivoAbrir.getSelectedFile().getPath();
					lector = new Lector(direccionArchivo);
				}catch(NullPointerException n){}
			}
		});
		menu.add(archivo);
		
		//Nombre de la estacion
		JLabel estaciones = new JLabel(estacionActual);
		estaciones.setBounds(5,5,300,28);
		add(estaciones);
		
		//Canvas
		canvas.setBounds(5,35,400,235);
		canvas.setBackground(this.getBackground());
		add(canvas);
		
		//Botones
		JButton avanzar = new JButton("Avanzar");
		JButton retroceder = new JButton("Retroceder");
		avanzar.setBounds(70,280,150,50);
		avanzar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		retroceder.setBounds(235,280,150,50);
		avanzar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		add(avanzar); add(retroceder);
	}
	
	public static void main(String args[]){
		Interfaz inter = new Interfaz();
		inter.setLocationRelativeTo(null);
		inter.setResizable(false);
		inter.setDefaultCloseOperation(Interfaz.EXIT_ON_CLOSE);
		inter.setVisible(true);
	}
	
}

class NewCanvas extends Canvas{
	
	@Override
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;
		g2d.scale(0.5, 0.5);
		g2d.setColor(Color.orange.darker());
		for(int y =126; y < getHeight();y+=127)	g2d.fillRect(0, y, 800, 10);
		new Vagon(this).paint0(g);
	}
}