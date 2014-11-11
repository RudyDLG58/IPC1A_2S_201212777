package interfaz;

public class Nodo_ControlRestaurantes {


	String Nombre_Restaurante = "";
	String Especialida_de_la_Casa = "";
	String Hora_de_Atencion1 = "";
	String Hora_de_Atencion2 = "";
	String Capacidad_por_Servicio = "";
	String Hubicacion = "";
	Nodo_ControlRestaurantes referencia;
	
	public Nodo_ControlRestaurantes (String Nombre, String Tamales, String De, String A, String No_Personas, String Lugar){
		
		Nombre_Restaurante = Nombre;
		Especialida_de_la_Casa = Tamales;
		Hora_de_Atencion1 = De;
		Hora_de_Atencion2= A;
		Capacidad_por_Servicio = No_Personas;
		Hubicacion = Lugar;
		referencia = null;
	}
	
	public Nodo_ControlRestaurantes (String Nombre, String Tamales, String De, String A, String No_Personas, String Lugar, Nodo_ControlRestaurantes n){
		
		Nombre_Restaurante = Nombre;
		Especialida_de_la_Casa = Tamales;
		Hora_de_Atencion1 = De;
		Hora_de_Atencion2= A;
		Capacidad_por_Servicio = No_Personas;
		Hubicacion = Lugar;
		referencia = n;
	}
}
