package ramirez.roberto.poo;

public class Vehiculos {
	
	public Vehiculos(int ruedas) { //Constructor de la clase... Mismo nombre que la clase..
		
		this.ruedas=ruedas;
		
		largo=2;
		
		ancho=1;
		
		peso=2;
		
		color="sin color";
		
		
	}
	
	public Vehiculos(int ruedas, int largo, int ancho, int peso) {
		
		this.ruedas=ruedas;
		
		this.largo=largo;
		
		this.ancho=ancho;
		
		this.peso=peso;
		
		color="sin color";
		
	}
	
	
	public void setExtra(boolean climatizador) {
		
		this.climatizador=climatizador;
		
	}
	
	public void setExtra(boolean gps, boolean climatizador, boolean tapiceriaCuero) {
		
		this.climatizador=climatizador;
		this.gps=gps;
		this.tapiceriaCuero=tapiceriaCuero;
		
		
	}
	
	
	
	public String getExtra() {
		
		if(climatizador && gps==false && tapiceriaCuero==false) return "Tu vehiculo lleva el pack 1 de extras";
		else if(climatizador && gps && tapiceriaCuero) return "Tu vehiculo lleva el pack 2 de extras";
		
		else return "La combinacion de extras escogida no se admite";
	}
	
	public void setColor(String color) { // metodo setter que establece valor de propiedad.
		
		this.color=color;
		
	}
	
	public String getColor() { // metodo getter que devuelve valor de propiedad..
		
		
		
		return color;
	}
	
	public String getDatosVehiculo(){
		
		
		return "Tu vehiculo tiene "+ruedas+" ruedas. Ademas tiene "+largo+" metros de largo";
	}
	
	private int ruedas;
	
	private String color;
	
	private int largo;
	
	private int ancho;
	
	private int peso;
	
	
	//PROPIEDADES EXTRAS...
	
	private boolean climatizador;
	
	private boolean tapiceriaCuero;
	
	private boolean gps;
	
	
	

}
