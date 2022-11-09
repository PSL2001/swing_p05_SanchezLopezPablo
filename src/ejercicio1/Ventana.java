/**
 * swing_p05_SanchezLopezPablo - ejercicio1 - Ventana.java
 * 9 nov 2022 - 10:12:39
 * @author Pablo Sánchez López
 */
package ejercicio1;

import java.awt.HeadlessException;

import javax.swing.JFrame;


/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public Ventana(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(300,300,500,350);
		this.addWindowListener(new EscuchaEvento());
	}
	
}
