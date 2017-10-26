public class Constante {
	
	public static final int CONSTANTE1 = 8; 
	
	public static void main (String[] args) {
		
		int variable = 18;
		final int CONSTANTE2 = 18; //defino constante mediante la palabra final siempre delante de el tipo
		
		System.out.println("variable : " + variable);
		System.out.println("constante : " + CONSTANTE1);
		System.out.println("constante : " + CONSTANTE2);
		
		//modificamos valores
		variable++;
		//CONSTANTE++; ¡ERROR! es una constante
		System.out.println("variable : " + variable);
		System.out.println("constante : " + CONSTANTE1);

		
	}
	
}

