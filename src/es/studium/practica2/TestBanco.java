package es.studium.practica2;

/**
 * Creacion de la clase TestBanco.
 * Esta clase se encarga de ejecutar el programa principal.
 * @author EVA
 * @version 1.0
 * @since 02/02/2023
 */
public class TestBanco
{
	
	/**
	 * Constante con mensaje que muestra en la consola "La cuenta de" seguido del nombre del Cliente.
	 */
	private static final String CUENTA_DE = "La cuenta de ";
	
	/**
	 * Objeto de la clase Cuenta con los datos de la cuenta de Antonio.
	 */
	private static Cuenta cuentaAntonio;

	
	/**
	 * 
	 * @param args - Declaracion del metodo principal.
	 */
	public static void main(String[] args)
	{
		
		/* Antonio y Beatriz se hacen clientes del banco */ 
		Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n"); 
		Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4"); 
		
		/* Por defecto, todas las cuentas nuevas tienen 100€ */ 
		cuentaAntonio = new Cuenta(48151, 100, antonio); 
		Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz); 
		
		/* Antonio y Beatriz consultan el saldo */ 
		System.out.println(CUENTA_DE + cuentaAntonio.getCliente().getNombre() +
				" tiene " +cuentaAntonio.getSaldo() + " euros."); 
		System.out.println(CUENTA_DE + cuentaBeatriz.getCliente().getNombre() + 
				" tiene " + saldoBeatriz(cuentaBeatriz) + " euros."); 
		
		/* Beatriz transfiere 50€ a Antonio */
		cuentaBeatriz.setSaldo(saldoBeatriz(cuentaBeatriz) - 50);
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50); 
		
		/* Antonio y Beatriz vuelven a consultar su saldo para comprobar 
		que todo ha ido bien */ 
		System.out.println(CUENTA_DE + cuentaAntonio.getCliente().getNombre() + 
				" tiene " + cuentaAntonio.getSaldo() + " euros."); 
		System.out.println(CUENTA_DE + cuentaBeatriz.getCliente().getNombre() + 
				" tiene " + saldoBeatriz(cuentaBeatriz) + " euros."); 
		
		/* Antonio gana 100€ en una rifa y lo ingresa en su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100); 
		
		/* Beatriz tiene que pagar 30€ a hacienda y retira el dinero */
		cuentaBeatriz.setSaldo(saldoBeatriz(cuentaBeatriz) - 30); 
		
		/* Antonio y Beatriz consultan de nuevo el saldo de su cuenta. */
		System.out.println(CUENTA_DE + cuentaAntonio.getCliente().getNombre() + 
				" tiene " + cuentaAntonio.getSaldo() + " euros."); 
		System.out.println(CUENTA_DE + cuentaBeatriz.getCliente().getNombre() +
				" tiene " + saldoBeatriz(cuentaBeatriz) + " euros."); 
		
		/* Antonio transfiere 50€ a Beatriz y vuelven a consultar el saldo de 
		su cuenta */
		cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
		cuentaBeatriz.setSaldo(saldoBeatriz(cuentaBeatriz) + 50);
		System.out.println(CUENTA_DE + cuentaAntonio.getCliente().getNombre() + 
				" tiene " + cuentaAntonio.getSaldo() + " euros."); 
		System.out.println(CUENTA_DE + cuentaBeatriz.getCliente().getNombre() + 
				" tiene " + saldoBeatriz(cuentaBeatriz) + " euros."); 
	}

	
	/**
	 * 
	 * @param cuentaBeatriz - Parametro que representa la cuenta de Beatriz.
	 * @return Devuelve el valor del atributo saldo.
	 */
	public static int saldoBeatriz(Cuenta cuentaBeatriz)
	{
		return cuentaBeatriz.getSaldo();
	} 

}

