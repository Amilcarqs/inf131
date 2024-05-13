import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LeerArchivo {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("texto.txt"); 
		Scanner lee = new Scanner(f);	
		/*//para leer los datos de un archivo
		while (lee.hasNext()) {
			String palabra = lee.next();
			System.out.print(palabra+" ");
			}			
		}
		*/

		/*Tarea:_
	    dado un texto ordenar alfabeticamente y mostrar la frecuencia con que se repite cada palabra
		Solucion: usamos un treemap porque en el treemap cuando se agrega se va ordenando
		usamos un String e Integer. En el string guardaremos la palabra 
		y en el integer la frecuencia */
		Map<String,Integer> mapa= new TreeMap<String,Integer>();
		while (lee.hasNext()) {
			String palabra = lee.next();
			if(!mapa.containsKey(palabra)) {
				mapa.put(palabra, 1);
			}else {
				int cantidad = mapa.get(palabra);
				mapa.put(palabra, cantidad+1);
			}			
		}
		System.out.println(mapa);
		
		mapa.keySet();
		for (String obj :mapa.keySet()) {
			   System.out.println(obj + " = " + mapa.get(obj)); 
		}
	}

}
