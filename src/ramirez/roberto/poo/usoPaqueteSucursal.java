package ramirez.roberto.poo;

import java.util.Scanner;

public class usoPaqueteSucursal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeroSucursal;
		String direccion;
		String ciudad;
		 
		 System.out.println("HOLA BIENVENIDO A PAQUETERIA S.A");
		 System.out.println();
		 
		 System.out.println("Ingresa el numero de sucursal");
		 numeroSucursal=entrada.nextInt();
		 entrada.nextLine();
		 
		 System.out.println("Ingresa la direccion de sucursal");
		 direccion=entrada.nextLine();
		 
		 
		 System.out.println("Ingresa la ciudad de la sucursal");
		 ciudad=entrada.nextLine();
		 
		 
		 Sucursal tienda1= new Sucursal(direccion,ciudad,numeroSucursal);
		 
		 int numeroPaquetes;
		 
		 System.out.println();
		 System.out.println("**************************************");
		 System.out.println("Cuantos paquetes desea enviar?");
		 numeroPaquetes=entrada.nextInt();
		 
		 Paquete Paquetes[]= new Paquete[numeroPaquetes];
		 
		  int referencia_envio;
		  double peso;
		  int dni_remitente;
		  int prioridad;
		 
		 for(int i=0; i<Paquetes.length;i++) {
			 
			 System.out.println("*****DATOS DEL PAQUETE "+(i+1)+" *****");
			 System.out.println();
			 
			 System.out.println("Referencia de envio:");
			 referencia_envio=entrada.nextInt();
			 
			 System.out.println("Peso del paquete:");
			 peso=entrada.nextDouble();
			 
			 System.out.println("DNI remitente:");
			 dni_remitente=entrada.nextInt();
			 
			 System.out.println("Prioridad del Paquete(0 Normal, 1 Alta, 2 Urgentee)");
			 prioridad=entrada.nextInt();
			 
			 Paquetes[i]=new Paquete(referencia_envio,peso, dni_remitente,prioridad);
			 
		 }
		 
		 System.out.println();
		 System.out.println("RESUMEN DE INGRESO....");
		 System.out.println();
		 
		 System.out.println("Numero de sucursal:");
		 System.out.println(tienda1.getNumero_Sucursal());
		 
		 System.out.println("Direccion:");
		 System.out.println(tienda1.getDireccion());
		 
		 System.out.println("Ciudad:");
		 System.out.println(tienda1.getCiudad());
		 
		 System.out.println("***********PAQUETES Y PRECIOS DE ENVIO**********");
		 System.out.println();
		 
		 for(int i=0; i<Paquetes.length;i++) {
			 
			 System.out.println("*****PAQUETE "+(i+1)+" *****");
			 System.out.println();
			 System.out.println("Referencia: "+Paquetes[i].getReferencia());
			 System.out.println("Peso: "+Paquetes[i].getPeso());
			 System.out.println("Prioridad: "+Paquetes[i].getPrioridad());
			 System.out.println("PRECIO A CANCELAR: "+tienda1.calculaPrecio(Paquetes[i]));
			 	
			 
		 }
		 
		
	}

}
