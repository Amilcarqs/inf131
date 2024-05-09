package holamundo;

import java.util.HashMap;
import java.util.Map;

public class ejemploHashMap {
	public static void main(String args[]){
		
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		
		mapa.put(50, "a");
		mapa.put(10, "b");
		mapa.put(100, "c");
		
		System.out.println("mapa = "+mapa);
		System.out.println("contains = "+mapa.containsKey(10));
		
		System.out.println("contains = "+mapa.containsValue("b"));
		
		System.out.println("get(10) = "+mapa.get(10));

		

		
		
		
		
		}
}
