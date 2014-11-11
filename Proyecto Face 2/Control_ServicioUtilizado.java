//Control de Servicios Utilizados

package interfaz;

public class Control_ServicioUtilizado {
	
Nodo_ControlServicios inicio;
	
	public Control_ServicioUtilizado(){
		
		inicio = null;	
	}
	
public void Agregar(String Servicio, String Inicio, String Fin, String No_Personas, String Monto){
		
		Nodo_ControlServicios aux = inicio;
		
		if (aux == null){
			inicio = new Nodo_ControlServicios(Servicio, Inicio, Fin, No_Personas, Monto);
		}	
			else{
				Nodo_ControlServicios nuevo = new Nodo_ControlServicios(Servicio, Inicio, Fin, No_Personas, Monto);
				nuevo.referencia = aux;
				inicio = nuevo;
		}
	}

public String Buscar(String Servicio){
	
	Nodo_ControlServicios indice = inicio;
	
	while(indice!=null){
		if(Servicio.equals(indice.Tipo_de_Servicio)){
			
			System.out.println(indice.Hora_inicio);
			
			System.out.println(indice.Hora_fin);
			
			System.out.println(indice.Capacidad);
			
			System.out.println(indice.Precio);
		}
		
		indice = indice.referencia;
	}
	
	return "1";		 
}

}
