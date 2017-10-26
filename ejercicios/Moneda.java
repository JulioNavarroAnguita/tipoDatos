public class Moneda {
	
	static final double EUROS_A_DOLARES = 1.18115;
	static final double DOLARES_A_EUROS = 0.846632519;
	public static void main (String[] args) {
		
		cambiarEurosADolares(15);
		cambiarDolaresAEuros(230.3);
		
	}
	
	public static void cambiarEurosADolares (double euros) {
		
		System.out.println( euros + " E son " + euros * EUROS_A_DOLARES + " $");
	}
	
	public static void cambiarDolaresAEuros (double dolares) {
		
		System.out.println( dolares + " $ son " + dolares * DOLARES_A_EUROS+ " E");
	}
}

