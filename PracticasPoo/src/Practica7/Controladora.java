package Practica7;
import java.util.Scanner;
import java.io.*;
public class Controladora{
	
	public static void main (String [] args) throws IOException{
		// WebMaker generador = new WebMaker();
		// PrintWriter	escritor = new PrintWriter("index.txt");
		// Scanner	lector = new Scanner(new FileReader("form.txt"));
		// escritor.println(generador.imprimirEncabezado());
		
		// escritor.println(generador.imprimirTexto("Un dragon que me quiero tatuar :p"));
		//escritor.println(generador.insertarImagen("dragons.jpg"));
		//escritor.println(generador.imprimirTexto("Mi cantante favorito"));
		//escritor.println(generador.insertarImagen("Hs.jpg"));
		//escritor.println(generador.imprimirTexto("el nombre de una canción"));
		//escritor.println(generador.insertarImagen("Sweet.jpg"));	
		
		//while(lector.hasNext())	{
			//escritor.println(lector.nextLine());
//}
           //escritor.println(generador.imprimirCierre());
           //lector.close();
           //escritor.close();
         
		
		
		DataOutputStream escritor	=	new	DataOutputStream
				(new FileOutputStream("hola.bin"));
	escritor.writeInt(33465);
	escritor.writeChar('a');
	escritor.writeChar('z');
	escritor.writeShort(10);
	escritor.close();
	DataInputStream	lector =	new	DataInputStream
				(new FileInputStream("hola.bin"));
	System.out.println(lector.readInt());
	System.out.println(lector.readChar());
	System.out.println(lector.readChar());
	System.out.println(lector.readShort());
	escritor.close();
	}
}
