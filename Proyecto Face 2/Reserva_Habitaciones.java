//Reserva de habitaciones

package interfaz;

import java.util.*;

public class Reserva_Habitaciones {
	
	/*public String Nombre = "leon";
	public String Inicio = "enero 5";
	public String Fin = "febrero 5";
	public String Monto = "700";*/
	
		Nodo_Reserva inicio;
	
	public Reserva_Habitaciones(){
		
		inicio = null;	
	}

	public void Agregar(String Nombre, String Inicio, String Fin, String Monto){
		
		System.out.println("ingreso agregar");
		
		Nodo_Reserva aux = inicio;
			
		if(aux==null){
		   inicio=new Nodo_Reserva(Nombre, Inicio, Fin, Monto,inicio); 
		 //  System.out.println("ingreso agregar 1");
		}
		
		else{
//			System.out.println("ingreso agregar 2");
				Nodo_Reserva nuevo = new Nodo_Reserva(Nombre, Inicio, Fin, Monto);
				nuevo.referencia = aux;
				inicio = nuevo;
		}
	}
	
	public  String Buscar(String Nombre){
		
		VentanaPrincipal_Hotel bus = new VentanaPrincipal_Hotel();
		
		Nodo_Reserva indice = inicio;
		System.out.println("ingreso 1");
		while(indice!=null){
			System.out.println("ingreso 2");	
			if(Nombre.equals(indice.Nombre_Cliente)){
				System.out.println(indice.Nombre_Cliente);
	//			VentanaPrincipal_Hotel.textField3.setText(indice.Precio);
				System.out.println(indice.Precio);
				
				System.out.println(indice.Fecha_Inicio);
				
				System.out.println(indice.Fecha_Fin);
		
			
			}
			
			indice = indice.referencia;
			
		}
		
		return "1";
		
	}
/*
	public static void main(String[] args) {
		
		Reserva_Habitaciones reserva = new Reserva_Habitaciones();
		
		}
	*/
}