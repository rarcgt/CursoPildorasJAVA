package ramirez.roberto.poo;

import java.util.GregorianCalendar;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*Empleados Antonio=new Empleados("Antonio",2300.5,2005,7,15);
		
		Jefes Ana=new Jefes("Ana",2900,2008,8,9);
		
		Ana.setIncentivo(300.5);
		
		System.out.println(Ana.getSueldo());*/
		
		
		
		Jefes Juan=new Jefes("Juan",8000,2013,8,5);
		
		Juan.setIncentivo(200);
		
		Empleados[] losEmpleados=new Empleados[5];
		
		losEmpleados[0]=new Empleados("Antonio", 2300.5,2008,8,9);
		losEmpleados[1]=new Empleados("Carlos", 5000.5,2007,6,5);
		losEmpleados[2]=new Empleados("Maria", 2500.5,2006,11,7);
		losEmpleados[3]=new Empleados("Ana", 7000.5,2009,5,3);
		losEmpleados[4]=Juan; //Principio de sustitucion...! (ES UN jefe SIEMPRE un	 empleado) //UPCASTING O CASTING IMPLICITO
		
		
		for(int i=0;i<losEmpleados.length;i++) {
			
			System.out.println(losEmpleados[i].getDatosEmpleado()+" y un salario de: "+losEmpleados[i].getDatosEmpleado());
			
		}
		
		
	}
	
}
	
class Empleados{
	
	//El nombre no debe cambiar..
	private final String nombre;
	
	private double sueldo;
	
	GregorianCalendar calendario;
	
	private int Id;
	
	private static int IdSiguiente=1;
		
	   public Empleados(String nom, double sue, int anio, int mes, int dia) {
	    	
	    nombre=nom;
	    sueldo=sue;
	    
	    calendario=new GregorianCalendar(anio, mes, dia);
	    
	    Id=IdSiguiente;
	    IdSiguiente++;
	    	
	   }
	    
	   public String getDatosEmpleado() {
	    	
	    return "El empleado "+nombre+" y tiene ID: "+Id;
	    	
	   }
	   
	   public static String getIdSiguiente() {
		   
		   return "El Id del siguiente empleado sera: "+IdSiguiente;
	   }

	   public double getSueldo() {
		   
		   return sueldo;
		   
	   }
	   
	   public GregorianCalendar getFechaAlta() {
		   
		   return calendario;
		   
	   }
	   
	   public void setSubeSueldo(double porcentaje) {
		   
		   double aumento=sueldo*(porcentaje/100);
		   
		   sueldo+=aumento;
		   
		   
	   }
}

//MAGIA DE LA HERENCIA
class Jefes extends Empleados{

	private double incentivo;
	
	public Jefes(String nom, double sue, int anio, int mes, int dia) {
		super(nom, sue, anio, mes, dia);
		// TODO Auto-generated constructor stub
	}
	
	public void setIncentivo(double b) {
		
		incentivo=b;
		
	}
	
	public double getSueldo() {
		
		double sueldoJefe=super.getSueldo();
		
		return sueldoJefe+incentivo;
		
	}
	
}


