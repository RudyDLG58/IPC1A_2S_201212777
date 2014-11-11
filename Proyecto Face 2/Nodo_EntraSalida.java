//Nodo de Control de entradas y salidas
package interfaz;

public class Nodo_EntraSalida {

	String Nombre_Cliente = "";
	String Fecha_Entrada = "";
	String Hora_Entrada = "";
	String Fecha_Salida = "";
	String Hora_Salida = "";
	Nodo_EntraSalida referencia;
	
	public Nodo_EntraSalida (String Nombre, String F_entrada, String H_entrada, String F_salida, String H_salida){
		
		Nombre_Cliente = Nombre;
		Fecha_Entrada = F_entrada;
		Hora_Entrada = H_entrada;
		Fecha_Salida =  F_salida;
		Hora_Salida = H_salida;
		referencia = null;
	}
	
	public Nodo_EntraSalida (String Nombre, String F_entrada, String H_entrada, String F_salida, String H_salida, Nodo_EntraSalida n){
		
		Nombre_Cliente = Nombre;
		Fecha_Entrada = F_entrada;
		Hora_Entrada = H_entrada;
		Fecha_Salida =  F_salida;
		Hora_Salida = H_salida;
		referencia = n;
	}
}