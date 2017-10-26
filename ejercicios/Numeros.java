/**
* Esta clase define objetos que contienen
* un atributo denominado numero
* y posee un metodo para devolver
* el valor doble
* @author Manuel Molino
* @version 1.0
*/
public class Numeros{

	private int numero; //propiedad de los objetos.
	
/**
* Constructor: es un metodo que tiene
* el mismo nombre que la clase y se
* usa para crear objetos
* @param n parametro para inicializar el objeto
* se usa para inicializar los objetos
* de tipo numero
*/

	public Numeros(int n){
	this.numero=n;
	}
	
/**
* metodo que devuelve el valor doble
* @return el valor doble del atributo
* numero de dicho objeto.
*/

	public int doble(){
	return this.numero * 2;
	}

/**
* metodo que devuelve el valor triple
* @return el valor triple del atributo
* numero de dicho objeto.
*/

	public int triple(){
	return this.numero * 3;
	}

/**
* metodo que devuelve el valor medio
* @return el valor medio del atributo
* numero de dicho objeto.
*/

	public double mitad(){
	return this.numero / 2.0;
	}

}


//clase para comprobar el funcionamiento de la
//clase anterior
class TestNumeros {
	
	public static void main(String[] arg){
	
		//Creo uno objeto de tipo Numero
		Numeros n1 = new Numeros(15);
		//Imprimo su valor doble
		System.out.println("Valor doble: "+n1.doble());
		System.out.println("Valor triple: "+n1.triple());
		System.out.println("Valor medio: "+n1.mitad());


	
	}

}
