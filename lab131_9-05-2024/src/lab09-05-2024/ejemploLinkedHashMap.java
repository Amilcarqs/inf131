package holamundo;

import java.util.LinkedHashMap;
import java.util.Map;

public class ejemploLinkedHashMap {
	public static void main(String args[]){
		
		Map<Integer, String> mapa = new LinkedHashMap<Integer, String>();
		
		mapa.put(50, "a");
		mapa.put(10, "b");
		mapa.put(100, "c");
		
		System.out.println("mapa = "+mapa);
		System.out.println("contains = "+mapa.containsKey(10));
		
		System.out.println("contains = "+mapa.containsValue("b"));
		
		System.out.println("get(10) = "+mapa.get(10));

		System.out.println("get(10) = "+mapa.hashCode());

		mapa.put(10, "g");
		System.out.println("mapa = "+mapa);
		
		
		
		}
}
