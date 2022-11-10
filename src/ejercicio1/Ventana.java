/**
 * swing_p05_SanchezLopezPablo - ejercicio1 - Ventana.java
 * 9 nov 2022 - 10:12:39
 * @author Pablo Sánchez López
 */
package ejercicio1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;


/**
 * The Class Ventana.
 *
 * @author usuario
 */
public class Ventana extends JFrame {
	
	/**
	 * Crea una nueva ventana.
	 *
	 * @param el titulo de la ventana
	 * 
	 */
	public Ventana(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setBounds(300,300,500,350);
		
		this.setVisible(true);
	}
	
	
}
