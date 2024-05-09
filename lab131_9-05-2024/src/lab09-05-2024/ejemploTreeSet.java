package holamundo;

import java.util.Set;
import java.util.TreeSet;

public class ejemploTreeSet {
	public static void main(String args[]){
		
		Set<Integer> claves = new TreeSet<Integer>();
		claves.add(50);
		claves.add(10);
		claves.add(100);//al agregar lo va ordenando de manera ascendente
		System.out.println("claves= "+claves);
		
		System.out.println("contains = "+claves.contains(10)); //O(1) para contains, para verificar si un elemento esta en la tabla hash
		System.out.println("contains = "+claves.contains(21));
		
		
		claves.remove(10);
		System.out.println("claves= "+claves);
		Set<String> clave = new TreeSet<String>();
		clave.add("hoy");
		clave.add("sabado");
		clave.add("alfo");

		clave.add("sabado");
		System.out.println("claves= "+clave);
		}
}
