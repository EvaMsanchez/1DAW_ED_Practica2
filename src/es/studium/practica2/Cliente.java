package es.studium.practica2;

/**
 * Creación de la clase Cliente.
 * @author EVA
 * @version 1.0
 * @since 02/02/2023
 */
public class Cliente
{
	
	//Atributos
	/**
	 * Definimos los atributos: dni, nombre y dirección.
	 */
	private String dniCliente;
	private String nombre;
	private String direccionCliente;

	
	//Constructor vacío o por defecto.
	/**
	 * Constructor vacío o por defecto.
	 * Inicializamos los valores de los atributos.
	 */
	public Cliente()
	{
		dniCliente = "";
		nombre = "";
		direccionCliente = "";
	}

	
	//Constructor por parámetros.
	/**
	 * Constructor por parámetros.
	 * @param dniC - Parámetro que se asigna al atributo dniCliente.
	 * @param nombreApellidoC - Parámetro que se asigna al atributo nombre.
	 * @param direccionC - Parámetro que se asigna al atributo direccionCliente.
	 */
	public Cliente (String dniC, String nombreApellidoC, String direccionC)
	{
		dniCliente = dniC;
		nombre = nombreApellidoC;
		direccionCliente = direccionC;
	}

	
	//Métodos.
	/**
	 * 
	 * @return Devuelve el valor del atributo dniCliente.
	 */
	public String getDniCliente()
	{
		return dniCliente;
	}

	/**
	 * 
	 * @param dniCliente - Parámetro que se asigna al atributo dniCliente.
	 */
	public void setDniCliente(String dniCliente)
	{
		this.dniCliente = dniCliente;
	}

	/**
	 * 
	 * @return Devuelve el valor del atributo nombre.
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * 
	 * @param nombre - Parámetro que se asigna al atributo nombre.
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Devuelve el valor del atributo direccionCliente.
	 */
	public String getDireccionCliente()
	{
		return direccionCliente;
	}

	/**
	 * 
	 * @param direccionCliente - Parámetro que se asigna al atributo direccionCliente.
	 */
	public void setDireccionCliente(String direccionCliente)
	{
		this.direccionCliente = direccionCliente;
	}

}

