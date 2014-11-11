// Administracion de habitaciones
package interfaz;

public class Nodo_AdministrHabitaciones {
	
	String Tipo_de_Habitacion = "";
	String Camas_Num = "";
	String Edificio_Num = "";
	String Nivel_Num = ""; 
	String Estado_de_Habitacion = "";
	String Precio_Habitacion = "";
	Nodo_AdministrHabitaciones referencia;
	
public Nodo_AdministrHabitaciones (String habitacion, String camas, String edificio, String nivel, String estado, String Precio_por_dia){
		
	Tipo_de_Habitacion = habitacion;
	Camas_Num = camas;
	Edificio_Num = edificio;
	Nivel_Num = nivel;
	Estado_de_Habitacion = estado;
	Precio_Habitacion = Precio_por_dia;
	referencia = null;
	}

public Nodo_AdministrHabitaciones (String habitacion, String camas, String edificio, String nivel, String estado, String Precio_por_dia, Nodo_AdministrHabitaciones n){

Tipo_de_Habitacion = habitacion;
Camas_Num = camas;
Edificio_Num = edificio;
Nivel_Num = nivel;
Estado_de_Habitacion = estado;
Precio_Habitacion = Precio_por_dia;
referencia = n;
	}
}
