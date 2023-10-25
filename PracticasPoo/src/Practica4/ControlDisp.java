package Practica4;

public class ControlDisp {
    public	static	void main(String[] args){
        
    Tablet t = new Tablet();
    System.out.println ("Apagando");
    
    t.apagar();
    t.cargar();
    t.grabarVideo();

      ConsolaVideo c = new ConsolaVideo();
    System.out.println("Bienvenido");
    
    c.encender();
    c.jugar();
    }
}

