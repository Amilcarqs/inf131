package holamundo;

import java.util.HashSet;
import java.util.Set;

public class ejemplohashSet {
	public static void main(String args[]){
		Set<Integer> claves = new HashSet<Integer>();
		claves.add(50);
		claves.add(10);
		claves.add(100);
		System.out.println("claves= "+claves);
		
		System.out.println("contains = "+claves.contains(10)); //O(1) para contains, para verificar si un elemento esta en la tabla hash
		System.out.println("contains = "+claves.contains(21));
		
		
		
		
		
		
		
		
		
		}
}
