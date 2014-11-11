package interfaz;

public class Control_Restaurantes {
	
	Nodo_ControlRestaurantes inicio;
	
	public Control_Restaurantes(){
		
		inicio = null;
	}
	
	public void Agregar(String Nombre, String Tamales, String De, String A, String No_Personas, String Lugar){
		
		Nodo_ControlRestaurantes aux= inicio;
		
		if(aux == null){
			inicio = new Nodo_ControlRestaurantes(Nombre, Tamales, De, A, No_Personas, Lugar);
			
		}
		else{
			Nodo_ControlRestaurantes nuevo = new Nodo_ControlRestaurantes(Nombre, Tamales, De, A, No_Personas, Lugar);
			nuevo.referencia = aux;
			inicio = nuevo;
		}
	}
	
	public String Buscar(String Nombre){
		
		Nodo_ControlRestaurantes indice = inicio;
		
			while(indice!=null){
				
				if(Nombre.equals(indice.Nombre_Restaurante)){
					
					System.out.println(indice.Nombre_Restaurante);
					
					System.out.println(indice.Especialida_de_la_Casa);
					
					System.out.println(indice.Hora_de_Atencion1);
					
					System.out.println(indice.Hora_de_Atencion2);
					
					System.out.println(indice.Capacidad_por_Servicio);
					
					System.out.println(indice.Hubicacion);
				}
				
						indice = indice.referencia;
			}
			
							return "1";
	}
				
}


