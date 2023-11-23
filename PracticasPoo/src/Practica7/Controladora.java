package Practica7;
import java.util.Scanner;
import java.io.*;
public class Controladora{
	
	public static void main (String [] args) throws IOException, ClassNotFoundException{
		 WebMaker generador = new WebMaker();
		
		 try {
		 
		 PrintWriter	escritor = new PrintWriter("index.txt");
		Scanner	lector = new Scanner(new FileReader("form.txt"));
		escritor.println(generador.imprimirEncabezado());
		
		escritor.println(generador.imprimirTexto("Un dragon que me quiero tatuar :p"));
	    escritor.println(generador.insertarImagen("dragons.jpg"));
		escritor.println(generador.imprimirTexto("Mi cantante favorito"));
		escritor.println(generador.insertarImagen("Hs.jpg"));	
		
		
		while(lector.hasNext())	{
			escritor.println(lector.nextLine());
}
           escritor.println(generador.imprimirCierre());
           lector.close();
           escritor.close();
		 }catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }
	}
		
}
