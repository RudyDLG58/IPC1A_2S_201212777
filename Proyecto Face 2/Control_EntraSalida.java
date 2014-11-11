
package interfaz;

import java.util.*;

public class Control_EntraSalida {

Nodo_EntraSalida inicio;
	
	public Control_EntraSalida(){
		
		inicio = null;	
	}
	
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

public String Buscar(String Nombre){
	
	Nodo_EntraSalida indice = inicio;
	
	while(indice!=null){
		if(Nombre.equals(indice.Nombre_Cliente)){
			System.out.println(indice.Nombre_Cliente);
			
			System.out.println(indice.Fecha_Entrada);
			
			System.out.println(indice.Hora_Entrada);
			
			System.out.println(indice.Fecha_Salida);
			
			System.out.println(indice.Hora_Salida);
		}
		
		indice = indice.referencia;
	}
	
	return "1";		 
}

}
