package ramirez.roberto.poo;

public class Sucursal {

	private int numeroSucursal;
	private String direccion;
	private String ciudad;
	
	
	
	public Sucursal(String direccion, String ciudad, int numeroSucursal) {
		
		this.direccion=direccion;
		this.ciudad=ciudad;
		this.numeroSucursal=numeroSucursal;
		
		
	}
	
	public String getNumero_Sucursal() {
		
		return "El numero de sucursal es "+numeroSucursal;
		
	}
	
	public String getDireccion(){
		
		return "Direccion: "+direccion;
		
	}
	
	public String getCiudad() {
		
		return "Ciudad: "+ciudad;
		
	}
	
	public double calculaPrecio(Paquete p) {
		
		double precio;
		precio=p.getPeso();
		
		if(p.getPrioridad()==1) {
			
			precio=precio+10;
			
		}else if(p.getPrioridad()==2) {
			
			precio=precio+20;
			
		}
		
		return precio;
		
	}
	
}
