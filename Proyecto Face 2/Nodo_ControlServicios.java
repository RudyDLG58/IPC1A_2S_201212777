//Control de Servicios Utilizados

package interfaz;

public class Nodo_ControlServicios {
	
	String Tipo_de_Servicio = "";
	String Hora_inicio = "";
	String Hora_fin = "";
	String Capacidad = "";
	String Precio = "";
	Nodo_ControlServicios referencia;

public Nodo_ControlServicios (String Servicio, String Inicio, String Fin, String No_Personas, String Monto){
		
	Tipo_de_Servicio = Servicio;
	Hora_inicio = Inicio;
	Hora_fin = Fin;
	Capacidad = No_Personas;
	Precio = Monto;
	referencia = null;
	}

public Nodo_ControlServicios (String Servicio, String Inicio, String Fin, String No_Personas, String Monto, Nodo_ControlServicios n){
	
Tipo_de_Servicio = Servicio;
Hora_inicio = Inicio;
Hora_fin = Fin;
Capacidad = No_Personas;
Precio = Monto;
referencia = n;
}

}
