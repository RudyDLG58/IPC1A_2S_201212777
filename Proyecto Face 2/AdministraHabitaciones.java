// Administracion de habitaciones

package interfaz;

import java.util.*;

public class AdministraHabitaciones {
	
Nodo_AdministrHabitaciones inicio;
	
	public AdministraHabitaciones(){
		
		inicio = null;	
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
			System.out.println(indice.Tipo_de_Habitacion);
			
			System.out.println(indice.Camas_Num);
			
			System.out.println(indice.Edificio_Num);
			
			System.out.println(indice.Nivel_Num);
			
			System.out.println(indice.Estado_de_Habitacion);
			
			System.out.println(indice.Precio_Habitacion);
			
		}
		
		indice = indice.referencia;
	}
	
	return "1";		 
}
}
