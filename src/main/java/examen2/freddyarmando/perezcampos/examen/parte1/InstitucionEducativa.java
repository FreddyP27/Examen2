package examen2.freddyarmando.perezcampos.examen.parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class InstitucionEducativa {
	
	private static void mostrarMaster(List<Master> masters) {
		for(Master master : masters) {
			master.mostrar();
		}
	}
	
	private static void eliminarCodigo(List<Master> masters, int codigo) {
		for(Master master : masters) {
			if(master.obtenerCodigo() == codigo ) {
				System.out.println("El curso "+ master.obtenerNombre() + " sera eliminado de la lista");
				masters.remove(master);
			}
		}
	}
	
	private static void mastersOficiales(List<Master> masters) {
		for(Master master : masters) {
			if(master.isOficial()) {
				master.mostrar();
			}
		}
	}
	
	private static void iniciar() {
		Master master1 = new Master("curso1", 1, 1, true);
		Master master2 = new Master("curso2", 2, 2, true);
		Master master3 = new Master("curso3", 3, 3, false);
		List<Master> masters = new CopyOnWriteArrayList<>();
		masters.add(master1);
		masters.add(master2);
		masters.add(master3);
		mostrarMaster(masters);
		eliminarCodigo(masters,2);
		mastersOficiales(masters);
		
	}

	public static void main(String[] args) {
		iniciar();

	}

}
