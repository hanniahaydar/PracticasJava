package Practica4;
public class ConsolaVideo extends DispositivoMovil {
    public ConsolaVideo () {
        super(0);
         marca = "Sony";
         modelo = "PS4";
    }
    public void jugar(){
        System.out.println("Elige juego");
    }
    public void encender(){
        System.out.println("Bienvenido");
    }
}
