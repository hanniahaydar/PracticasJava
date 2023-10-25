package RetroalimentacionPrac4;

public class TestDispositivo {
	public static void main(String[] args){
		Laptop lap = new Laptop();
		lap.encender();
		lap.verCargaBateria();
		lap.apagar();
		Celular	cel	=	new	Celular("123-4567890");
		cel.encender();
		cel.verCargaBateria();
		cel.llamar("098-7654321");
		lap.apagar();
		cel.apagar();
		Laptop	lap2 = new	Laptop();
        System.out.println("Lap	es	igual	a	Lap2?	:	"	+	lap.equals(lap2));
    
System.out.println("El	objeto	de	"	+	lap2.getClass().toString()	+	"	llamado	lap2	vive	en	"	+	lap2.toString());

	}
}
