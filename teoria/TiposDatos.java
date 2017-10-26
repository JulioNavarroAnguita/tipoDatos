public class TiposDatos {
	public static void main (String[] args) {
		int  	numeroInt   = -123;
		double 	numeroDoble	= 4.12;
		float	numeroFloat	= 4.12f;
		String 	cadena		= "hola";
		long    numeroLong  = 1_000_000_000L;
		boolean booleano    = true;
		double  numeroExp   = 14.3e-5;
		System.out.println("Tipos de datos:\n" + "\nValor de int: " + numeroInt + "\nValor de double: " 
		+ numeroDoble + "\nValor de float: " + numeroFloat + "\nValor de String: " + cadena + "\nValor de long: " + numeroLong 
		+ "\nValor de boolean: " + booleano + "\nValor de Exponente: " + numeroExp);
	}
}
