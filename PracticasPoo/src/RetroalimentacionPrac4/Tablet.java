package RetroalimentacionPrac4;
public class Tablet extends DispositivoMovil{
    public Tablet() {
        super(0);
      marca = "Apple";
      cargaBateria = 90;
      modelo = "S34";
    
    } 
    public void apagar(){
        System.out.println("apagando sistema");
    }
    public void cargar(){
        System.out.println("Batería baja");
    }
    public void grabarVideo (){
        System.out.println("Grabando video");
    }
}

