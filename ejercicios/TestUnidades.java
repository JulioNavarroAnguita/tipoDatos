public class TestUnidades {
	
	public static void main (String[] args) {
		
		double lado1 =  UnidadesLibreria.cambiarYardasAMetros(10);
		double lado2 =  UnidadesLibreria.cambiarYardasAMetros(13.5);
		double superficie = (lado1 * lado2);
		System.out.println("Superficie de los lados es: " + superficie + " m\u00B2");
		
	}
}

