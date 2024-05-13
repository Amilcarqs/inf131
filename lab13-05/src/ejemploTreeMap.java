import java.util.Map;
import java.util.TreeMap;

public class ejemploTreeMap {

	public static void main(String[] args) {
		
		Map<Integer,String> mapa= new TreeMap<Integer,String>();
		
		mapa.put(100, "A");
		mapa.put(10, "B");
		mapa.put(50, "C");
		
		System.out.println("Mapa= "+mapa);
		
		//buscar un elemento
		System.out.println("mapa.get(10) = "+mapa.get(10));

		//verificar si existe el elemnto
		System.out.println("containsKey(10) = "+mapa.containsKey(10));
		
		//establecer
		mapa.put(10, "Juan");
		
		System.out.println("Mapa= "+mapa);
		
		
		
		
		
		

	}

}
