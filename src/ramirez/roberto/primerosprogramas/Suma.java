package ramirez.roberto.primerosprogramas;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opt;
		
		boolean bandera;
		bandera=true;
		
		
		while(bandera) {
			
			System.out.println("Desea realizar una suma?");
			System.out.println("1. Si");
			System.out.println("2. No");
			
			opt = entrada.nextInt();
			
			if(opt==1) {
				
				System.out.println("Ingresa el primer numero que desea sumar");
				
				int num1=entrada.nextInt();
				
				System.out.println("Ingresa el segundo numero que desea sumar");
				
				int num2=entrada.nextInt();
				
				int resultado=num1+num2;
				
				System.out.println("El resultado de "+num1+" + "+num2+" = "+resultado);
				
				bandera=true;
				
			}else {
				
				bandera=false;
				System.out.println("Hasta luego");
				
			}
			
		}
		
		
	}

}
