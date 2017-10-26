public class Unidades {
	
	public static void main (String[] args) {
		
		double lado1 =  cambiarYardasAMetros(10);
		double lado2 =  cambiarYardasAMetros(13.5);
		double superficie = (lado1 * lado2);
		System.out.println("Superficie de los lados es: " + superficie + " m\u00B2");
		
		
	}
	
	public static double cambiarYardasAMetros (double yardas){
		return yardas * 0.9144;
		
	}

}




