package interfaz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Lector {
	
	String direccion, estacion, id, kilometros;
	boolean nEstacion;
	ListaEnlazada lista = null;
	BufferedReader lectorArchivo;
	
	public Lector(String direccion){
		this.direccion = direccion;
		try {
			lectorArchivo = new BufferedReader(new FileReader(direccion));
			String linea;
			while(( linea = lectorArchivo.readLine().toLowerCase())!=null){
				System.out.println(linea);
				if(!linea.isEmpty()){
					comandos(linea);					
				}
			}
			lectorArchivo.close();
			
		} catch (IOException e) {
			System.out.println("Error al abrir el archivo.");
		}
	}
	
	public void comandos(String linea){
		if(linea.contains("suben")){
			if(isComando(linea)){
				String temp[] = linea.split("\\s+");
				int pasajeros= Integer.valueOf(temp[1]);
				int clase = Integer.valueOf(temp[3]);
				if(clase == 1){
					
				}
				if(clase == 3){
					
				}
			}
		}else if(linea.contains("bajan")){
			if(isComando(linea)){
				String temp[] = linea.split("\\s+");
				int pasajeros= Integer.valueOf(temp[1]);
				int clase = Integer.valueOf(temp[3]);
				if(clase == 1){
					
				}
				if(clase == 3){
					
				}
			}
		}else if(isEstacion(linea)){
			String temp []= linea.split("\\s+");
			estacion = temp[0];
			id = temp[1];
			kilometros = temp[2];
		}else{
			System.out.println("Ingreso no valido.");
		}
	}
	
	public boolean isEstacion(String linea){
		boolean isEstacion=false;
		String temporal[];
		temporal = linea.split("\\s+");
		if(temporal.length == 3 && temporal[2].contains("km")){
			isEstacion = true;
		}
		nEstacion = false;
		return isEstacion;
	}
	
	public boolean isComando(String linea){
		boolean isComando=false;
		String temp[]=linea.split("\\s+");
		if(temp.length == 4 && temp[2].contains("clase") && 
				(temp[0].contains("suben") ^ temp[0].contains("bajan"))){
			isComando=true;
		}
		return isComando;
	}
	
	public boolean finEstacion(){
		return true;
	}

}
