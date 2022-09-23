package ramirez.roberto.poo;

public class UsoCuenta {

	public static void main(String[] args) {

		Cuenta cuenta1 = new Cuenta("Roberto Ramirez", 250);
		Cuenta cuenta2 = new Cuenta("Benito Camelo", 750);
		
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta2.getSaldo());
		System.out.println(cuenta1.getDatosCuenta());
		System.out.println(cuenta2.getDatosCuenta());
		
		cuenta1.setIngreso(250);
		cuenta2.setIngreso(200);
		
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta2.getSaldo());
		System.out.println(cuenta1.getDatosCuenta());
		System.out.println(cuenta2.getDatosCuenta());
		
		Cuenta.Transferencia(cuenta1, cuenta2, 500);
		
		System.out.println(cuenta1.getSaldo());
		System.out.println(cuenta2.getSaldo());
		System.out.println(cuenta1.getDatosCuenta());
		System.out.println(cuenta2.getDatosCuenta());
			

	}

}
