package ramirez.roberto.poo;

import java.util.Random;

public class CuentaCorriente {

	Random rdm=new Random();
	
	private String nombreTitular;
	private double saldo;
	private long noCuenta;
	
	
	public CuentaCorriente(String nombreTitular, double saldo) {
	
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
		this.noCuenta = rdm.nextLong();
	}


	public String getNombreTitular() {
		return nombreTitular;
	}


	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public long getNoCuenta() {
		return noCuenta;
	}


	public void setNoCuenta(long noCuenta) {
		this.noCuenta = noCuenta;
	}
	
	public static void Transferencia(CuentaCorriente cuentaDebita,CuentaCorriente cuentaAcredita, double monto) {
		
		double saldoDebita=cuentaDebita.getSaldo();
		cuentaDebita.setSaldo(saldoDebita-monto);
		
		double saldoAcredita=cuentaAcredita.getSaldo();
		cuentaAcredita.setSaldo(saldoAcredita+monto);
	
		
		
	}
	
	

}


