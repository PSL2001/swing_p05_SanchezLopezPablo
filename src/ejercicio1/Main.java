/**
 * swing_p05_SanchezLopezPablo - ejercicio1 - Main.java
 * 9 nov 2022 - 10:06:24
 * @author Pablo Sánchez López
 */
package ejercicio1;

/**
 * The Class Main.
 *
 * @author usuario
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		//Creamos la ventanas (tienen un constructor para nombrarlas)
		Ventana v1 = new Ventana("Ventana 1");
		Ventana v2 = new Ventana("Ventana 2");
		//Añadimos un windowfocuslistener que va a crear una nueva clase que requiere el Jframe
		v1.addWindowFocusListener(new EscuchaEvento(v1.getContentPane()));
		v2.addWindowFocusListener(new EscuchaEvento(v2.getContentPane()));

	}

}
