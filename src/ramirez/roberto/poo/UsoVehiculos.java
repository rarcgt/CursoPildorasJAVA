package ramirez.roberto.poo;

public class UsoVehiculos {

	public static void main(String[] args) {
		
		Vehiculos miCoche = new Vehiculos(4); //Creando primera instancia perteneciente a la clase Vehiculos...
		
		miCoche.setColor("verde");
		
		System.out.println(miCoche.getColor());
		
		Vehiculos miCoche2 = new Vehiculos(4);
		
		miCoche2.setColor("rojo");
		
		miCoche2.setExtra(true);
		
		System.out.println(miCoche2.getExtra());
		
		System.out.println(miCoche2.getColor());
		
		Vehiculos moto1=new Vehiculos(2);
		
		System.out.println(miCoche.getDatosVehiculo());
		
		System.out.println(moto1.getDatosVehiculo());
		
		Vehiculos miMoto= new Vehiculos(2,1,2,2);
		
		miMoto.setColor("negro");
		
		Vehiculos miCamion=new Vehiculos(2,1,2,2);
					
		miCamion.setColor("verde");
		
		miCamion.setExtra(true,true,true);
		
		System.out.println(miCamion.getExtra());
		
		

	}

}
