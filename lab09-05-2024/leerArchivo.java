package holamundo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class leerArchivo {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("texto.txt");
		Scanner lee = new Scanner(f);
		
		Set<String> clave = new TreeSet<String>();
		
		while(lee.hasNext()) {
			String palabra = lee.next();
			clave.add(palabra);
			//System.out.println(palabra);
		}
		
		System.out.println("Palabras sin repetir= "+clave);
		
		
		

	}

}
