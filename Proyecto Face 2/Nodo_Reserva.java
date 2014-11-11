package interfaz;

import java.util.*;

public class Nodo_Reserva {

	String Nombre_Cliente="";
	String Fecha_Inicio="";
	String Fecha_Fin="";
	String Precio="";
	Nodo_Reserva referencia;
	
public Nodo_Reserva (String Nombre, String Inicio, String Fin, String Monto){
	
	Nombre_Cliente = Nombre;
	Fecha_Inicio = Inicio;
	Fecha_Fin = Fin;
	Precio = Monto;
	referencia = null;
}

public Nodo_Reserva (String Nombre, String Inicio, String Fin, String Monto, Nodo_Reserva n){
	
	Nombre_Cliente = Nombre;
	Fecha_Inicio = Inicio;
	Fecha_Fin = Fin;
	Precio = Monto;
	referencia = n;
}
}
