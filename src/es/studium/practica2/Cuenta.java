package es.studium.practica2;

public class Cuenta
{
	
	//Atributos
	private int numeroCuenta;
	private int saldo;
	private Cliente cliente;

	
	//Constructor vacío o por defecto.
	public Cuenta()
	{
		numeroCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	
	//Constructor por parámetros.
	public Cuenta (int numeroC, int saldoC, Cliente cli)
	{
		numeroCuenta = numeroC;
		saldo = saldoC;
		cliente = cli;
	}

	
	//Métodos.
	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}

	public int getSaldo()
	{
		return saldo;
	}

	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

}


