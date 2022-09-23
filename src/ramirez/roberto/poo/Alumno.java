package ramirez.roberto.poo;

public class Alumno {

	
	private static int correlativo=1;
	private String nombre;
	private double nota;
	private int noAlumno;
	
	public Alumno(String nombre, double nota) {
		
		this.nombre = nombre;
		this.nota = nota;
		this.noAlumno = correlativo;
		correlativo++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getNoAlumno() {
		return noAlumno;
	}

	public void setNoAlumno(int noAlumno) {
		this.noAlumno = noAlumno;
	}
	
	
	
}
