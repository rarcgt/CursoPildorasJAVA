package ramirez.roberto.poo;

import java.util.Random;

public class Cuenta {
	
	//Declaracion de atributos y metodos(si es que existen)...
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	
	public Cuenta(String nombreTitular, double saldo) {
		
		this.nombreTitular=nombreTitular;
		this.saldo=saldo;
		
		Random rnd = new Random();
		
		this.numeroCuenta=rnd.nextLong();
		
		
	}
	
	public void setIngreso(double ingreso) {
		
		this.saldo+=ingreso;
		
	}
	
	public void setReintegro(double reintegro) {
		
		this.saldo-=reintegro;
		
	}
	
	public String getSaldo() {
		
		return "El saldo de la cuenta es: "+this.saldo+"\n";
	}
	
	public String getDatosCuenta() {
		
		String datos="";
		
		datos="Titular: "+nombreTitular+"\n"+
		"No. de Cuenta: "+numeroCuenta+"\n"+
				"Saldo: "+saldo+"\n";
		
		return datos;
		
	}
	
	public static void Transferencia(Cuenta usuario1, Cuenta usuario2, double monto) {
		
		if(monto<0) {
			
			System.out.println("No puede ingresar un monto negativo o menor que 0");
			
		}else {
			
			usuario1.saldo-=monto;
			
			usuario2.saldo+=monto;
			
		}
		
		
		
	}

}
