package ramirez.roberto.poo;

public class Colegio {
	
	private String nombreColegio;
	private int capacidadColegio;
	private Alumno Alumnos[];
	
	public Colegio(String nombreColegio, int capacidadColegio) {
		
		this.nombreColegio = nombreColegio;
		this.capacidadColegio = capacidadColegio;
		this.Alumnos=new Alumno[capacidadColegio];
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	public int getCapacidadColegio() {
		return capacidadColegio;
	}

	public void setCapacidadColegio(int capacidadColegio) {
		this.capacidadColegio = capacidadColegio;
	}

	public Alumno[] getAlumnos() {
		return Alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		Alumnos = alumnos;
	}
	
	public String getTodos() {
		
		for(int i=0;i<Alumnos.length;i++) {
			
			if(Alumnos[i]!=null) {
				
				System.out.println("Nombre del alumno: "+Alumnos[i].getNombre());
				System.out.println("Nombre del colegio: "+this.getNombreColegio());
				System.out.println("Nota media: "+Alumnos[i].getNota());
				System.out.println();
			}
			
		}
		
		return null;
		
	}
	
	public void  setNuevoAlumno(String nombre, double nota) {
		
		for(int i=0;i<Alumnos.length;i++) {
			
			if(Alumnos[i]==null) {
				
				Alumnos[i]= new Alumno(nombre,nota);
				break;
			}
			
		}
		
	}
	
	public Alumno obtenUno(String nombre) {
		
		for(int i=0;i<Alumnos.length;i++) {
			
			if(Alumnos[i]!=null) {
				
				if(Alumnos[i].getNombre().equals(nombre)) {
					
					System.out.println("Nombre del alumno: "+Alumnos[i].getNombre());
					System.out.println("Nombre del colegio: "+this.getNombreColegio());
					System.out.println("Nota media: "+Alumnos[i].getNota());
					System.out.println();
					
					return Alumnos[i];
					
				}
				
			}
			
		}
		
		return null;
		
	}

	public void eliminaAlumno(String nombre) {
		
		for(int i=0;i<Alumnos.length;i++) {
			
			if(Alumnos[i]!=null) {
				
				if(Alumnos[i].getNombre().equals(nombre)) {
					
					Alumnos[i]=null;
					
				}
				
			}
			
		}
		
		
	}
	
	
}
