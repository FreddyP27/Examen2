package examen2.freddyarmando.perezcampos.examen.parte2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ficheros {
	public static void leerLineasfichero(String nombre, Map<Integer,String> mapa) {
		
		Path path = Paths.get(nombre);
		int contador = 0;
        int contadorJava = 0;
        try{
            
		    List<String> lines = Files.readAllLines(path);
            for (String linea : lines) {
            	mapa.put(contador+1, linea);
                contador++;
                String [] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    if (palabra.toLowerCase().contains("java")){
                        contadorJava++;
                    }    
                }
                
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        System.out.println("Las lineas totales del fichero: "+contador);
        System.out.println("La palabra java aparece: "+contadorJava);
   	}
	
	public static void numLineaPalabra(Map<Integer,String> mapa) {
		for (Map.Entry<Integer,String> entry : mapa.entrySet()){
			String[] palabras = entry.getValue().split(" "); 
			for (String palabra : palabras) {
                if (palabra.toLowerCase().contains("java")){
                	System.out.println("En la linea "+ entry.getKey() + " aparece la palabra Java");
                	System.out.println("Linea "+ entry.getKey() + "tiene "+ palabras.length + " caracteres");
                } 
            }
		}
	}
	
		

	public static void main(String[] args) {
		String nombreArchivo = "D:\\ficheros\\FicheroEjercicio2.txt";
		Map<Integer,String> mapa = new HashMap<>();
		leerLineasfichero(nombreArchivo, mapa);
		numLineaPalabra(mapa);
	   
	        
	}
}
