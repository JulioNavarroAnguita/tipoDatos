public class Ambitos {
	
	static int variableMiembro = 1;
	
	/*System.out.println(variableMiembro + "-" + variableLocal + "-" + variableBloque1 + "-" + variableBloque2);*/
	//System.out.println(variableMiembro); Arriba del metodo main no puedo usar System.out.println
	
	public static void main (String[] args) {
		
		System.out.println(variableMiembro);
		int variableLocal = 2;
		System.out.println(variableMiembro + "-" + variableLocal);
			
		{
			
			int variableBloque1 = 3;
			System.out.println(variableMiembro + "-" + variableLocal + "-" + variableBloque1);
			
			{
				
				int variableBloque2 = 4;
				System.out.println(variableMiembro + "-" + variableLocal + "-" + variableBloque1 + "-" + variableBloque2);
				
			}
				
		}
		
	}
	
}

