package ramirez.roberto.poo;

public class usoColegio {
	
	public static void main(String args[]) {
		
		Colegio colegio1=new Colegio("Liceo Javier",200);
		
		colegio1.setNuevoAlumno("Benito", 80);
		colegio1.setNuevoAlumno("Ricardo", 75);
		colegio1.setNuevoAlumno("Pepe", 95);
		colegio1.setNuevoAlumno("Erick", 66);
		colegio1.setNuevoAlumno("Luis", 55);
		colegio1.setNuevoAlumno("Mateo", 11);

		//colegio1.getTodos();
		
		colegio1.eliminaAlumno("Benito");
		colegio1.eliminaAlumno("Ricardo");
		colegio1.eliminaAlumno("Pepe");
		colegio1.obtenUno("Mateo").setNota(1000);
		
		colegio1.getTodos();
		
		
	}

}
