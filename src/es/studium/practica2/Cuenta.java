package es.studium.practica2;

/**
 * Creación de la clase Cuenta.
 * @author EVA
 * @version 1.0
 * @since 02/02/2023
 */
public class Cuenta
{
	
	//Atributos
	/**
	 * Definimos los atributos: númeroCuenta, saldo y cliente.
	 */
	private int numeroCuenta;
	private int saldo;
	private Cliente cliente;

	
	//Constructor vacío o por defecto.
	/**
	 * Constructor vacío o por defecto.
	 * Inicializamos los valores de los atributos.
	 */
	public Cuenta()
	{
		numeroCuenta = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	
	//Constructor por parámetros.
	/**
	 * Constructor por parámetros.
	 * @param numeroC - Parámetro que se asigna al atributo númeroCuenta.
	 * @param saldoC - Parámetro que se asigna al atributo saldo.
	 * @param cli - Parámetro que se asigna al atributo cliente.
	 */
	public Cuenta (int numeroC, int saldoC, Cliente cli)
	{
		numeroCuenta = numeroC;
		saldo = saldoC;
		cliente = cli;
	}

	
	//Métodos.
	/**
	 * 
	 * @return Devuelve el valor del atributo numeroCuenta.
	 */
	public int getNumeroCuenta()
	{
		return numeroCuenta;
	}

	/**
	 * 
	 * @param numeroCuenta - Parámetro que se asigna al atributo numeroCuenta.
	 */
	public void setNumeroCuenta(int numeroCuenta)
	{
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * 
	 * @return Devuelve el valor del atributo saldo.
	 */
	public int getSaldo()
	{
		return saldo;
	}

	/**
	 * 
	 * @param saldo - Parámetro que se asigna al atributo saldo.
	 */
	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}

	/**
	 * 
	 * @return Devuelve el valor del atributo cliente.
	 */
	public Cliente getCliente()
	{
		return cliente;
	}

	/**
	 * 
	 * @param cliente - Parámetro que se asigna al atributo cliente.
	 */
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

}


