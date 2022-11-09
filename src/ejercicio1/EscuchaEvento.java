/**
 * swing_p05_SanchezLopezPablo - ejercicio1 - Oyente.java
 * 9 nov 2022 - 10:16:30
 * @author Pablo Sánchez López
 */
package ejercicio1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author usuario
 *
 */
public class EscuchaEvento extends WindowAdapter {
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
}
