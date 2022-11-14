/**
 * swing_p05_SanchezLopezPablo - ejercicio3 - Ventana.java
 * 14 nov 2022 - 8:28:09
 * @author Pablo Sánchez López
 */
package ejercicio3;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame implements MouseMotionListener {
	
	
	public Ventana() {
		super("Ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500,10,500,350);
		this.addMouseMotionListener(this);
		this.setVisible(true);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("El usuario está arrastrando el ratón");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("El usuario esta moviendo el ratón");
		
	}
}
