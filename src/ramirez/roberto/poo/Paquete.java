package ramirez.roberto.poo;

public class Paquete {
	
	//Propiedades o atributos...
	
	private int referencia_envio;
	private double peso;
	private int dni_remitente;
	private int prioridad;
	
	public Paquete(int referencia_envio, double peso, int dni_remitente, int prioridad) {
		
		this.referencia_envio=referencia_envio;
		this.peso=peso;
		this.dni_remitente=dni_remitente;
		this.prioridad=prioridad;
		
	}
	
	public void setPeso(double peso) {
		
		this.peso=peso;
		
	}
	
	public void setPrioridad(int prioridad) {
		
		this.prioridad=prioridad;
		
	}
	
	public double getPeso() {
		
		return peso;
		
	}
	
	public int getPrioridad() {
		
		return prioridad;
		
	}
	
	public int getReferencia() {
		
		return referencia_envio;
		
	}

}
