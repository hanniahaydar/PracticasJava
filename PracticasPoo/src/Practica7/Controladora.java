package Practica7;
//import java.util.Scanner;
import java.io.*;
public class Controladora{
	
	// public static void main (String [] args) throws IOException, ClassNotFoundException{
			//  WebMaker generador = new WebMaker();
			
			 // try {
			 
			// PrintWriter	escritor = new PrintWriter("index.txt");
			//Scanner	lector = new Scanner(new FileReader("form.txt"));
			//escritor.println(generador.imprimirEncabezado());
			
			//escritor.println(generador.imprimirTexto("Un dragon que me quiero tatuar :p"));
		   // escritor.println(generador.insertarImagen("dragons.jpg"));
			//escritor.println(generador.imprimirTexto("Mi cantante favorito"));
			//escritor.println(generador.insertarImagen("Hs.jpg"));	
			
			
			//while(lector.hasNext())	{
			//	escritor.println(lector.nextLine());
	//}
	    //       escritor.println(generador.imprimirCierre());
	    //       lector.close();
	      //     escritor.close();
			// }catch (FileNotFoundException e) {
			//	 e.printStackTrace();
			 //}
		//}
		
		//DataOutputStream escritor	=	new	DataOutputStream
		//(new FileOutputStream("hola.bin"));
	//escritor.writeChar(33465);
	//escritor.writeShort('a');
	//escritor.writeDouble('z');
	//escritor.writeChar(10);
	//escritor.close();
	//DataInputStream	lector =	new	DataInputStream
//			(new FileInputStream("hola.bin"));
	//System.out.println(lector.readInt());
	//System.out.println(lector.readChar());
	//System.out.println(lector.readChar());
	//System.out.println(lector.readShort());
	//escritor.close();


	
	
	
	
	
  ObjectInputStream	lector	=	new	ObjectInputStream
	(new	FileInputStream("web.obj"));
    PrintWriter	escritor	=	new	PrintWriter("main.html");
    WebMaker	pagina =	(WebMaker)(lector.readObject());
    escritor.print(pagina.printPage());
   
    lector.close();
    escritor.close();
}

	
	