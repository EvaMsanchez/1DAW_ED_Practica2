package es.studium.practica2;

public class Cliente
{
	
	//Atributos
	private String dniCliente;
	private String nombre;
	private String direccionCliente;

	
	//Constructor vac�o o por defecto.
	public Cliente()
	{
		dniCliente = "";
		nombre = "";
		direccionCliente = "";
	}

	
	//Constructor por par�metros.
	public Cliente (String dniC, String nombreApellidoC, String direccionC)
	{
		dniCliente = dniC;
		nombre = nombreApellidoC;
		direccionCliente = direccionC;
	}

	
	//M�todos.
	public String getDniCliente()
	{
		return dniCliente;
	}

	public void setDniCliente(String dniCliente)
	{
		this.dniCliente = dniCliente;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDireccionCliente()
	{
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente)
	{
		this.direccionCliente = direccionCliente;
	}

}

