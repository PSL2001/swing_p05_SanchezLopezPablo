/**
 * swing_p05_SanchezLopezPablo - ejercicio4 - Ventana.java
 * 14 nov 2022 - 8:36:20
 * @author Pablo Sánchez López
 */
package ejercicio4;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame {
	private Panel panel;
	public Ventana() {
		super("Ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500,10,500,350);
		panel = new Panel();
		this.add(panel);
		this.setVisible(true);
	}
}
