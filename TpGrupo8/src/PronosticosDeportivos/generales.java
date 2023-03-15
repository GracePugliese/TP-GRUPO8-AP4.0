package PronosticosDeportivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class generales {
	////////////////////////////////////////////////////////////
	//Metodo para leer el archivo                            //
	//////////////////////////////////////////////////////////
	public static void LeerArchivo(String arch) {	
				
		try { // Sobre el error hay que hacer sourround
			for(String linea: Files.readAllLines(Paths.get(arch))) {					
				String[] cadenaAuxiliar = linea.split(";");
				for(String p: cadenaAuxiliar) {				
					System.out.println(p);
					}	
				}
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//////////////////////////////////////////////////////
	// Metodo para contar las lineas de un archivo     //
	////////////////////////////////////////////////////
	public static int contarLineaEnArchivo(String arch) {
		int contador=0;
		try { // Sobre el error hay que hacer sourround
			for(String linea: Files.readAllLines(Paths.get(arch))) {					
				contador++;	
				}			
					
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contador;
	}	
	
}