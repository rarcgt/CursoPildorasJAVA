package ramirez.roberto.poo;

import java.util.Scanner;

public class usoCuentaCorriente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		CuentaCorriente cuenta1=new CuentaCorriente("Roberto",250);
		CuentaCorriente cuenta2=new CuentaCorriente("Benito",750);

		System.out.println("LAS CUENTAS REGISTRADA SON ");
		System.out.println("Cuenta 1");
		System.out.println(cuenta1.getNoCuenta());
		System.out.println(cuenta1.getNombreTitular());
		System.out.println(cuenta1.getSaldo());
		System.out.println();
		System.out.println("Cuenta 2");
		System.out.println(cuenta2.getNoCuenta());
		System.out.println(cuenta2.getNombreTitular());
		System.out.println(cuenta2.getSaldo());
		System.out.println();
		System.out.println("TRANSFERENCIA ENTRE CUENTAS");
		System.out.print("Saldo cuenta debita: "+cuenta2.getSaldo());
		System.out.println();
		System.out.print("Saldo cuenta acredita: "+cuenta1.getSaldo());
		System.out.print("Cuanto desea transferir?");
		double monto=in.nextDouble();
		
		CuentaCorriente.Transferencia(cuenta2, cuenta1, monto);
		System.out.println("Transferencia exitosa :)");
		System.out.print("Saldo cuenta debita: "+cuenta2.getSaldo());
		System.out.println();
		System.out.print("Saldo cuenta acredita: "+cuenta1.getSaldo());
		
		
		
		
		
	}

}
