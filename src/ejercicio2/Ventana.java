/**
 * swing_p05_SanchezLopezPablo - ejercicio2 - Ventana.java
 * 10 nov 2022 - 13:41:00
 * @author Pablo Sánchez López
 */
package ejercicio2;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

/**
 * @author usuario
 *
 */
public class Ventana extends JFrame implements MouseListener {

	/**
	 * 
	 */
	public Ventana() {
		super("Ventana");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(500,10,500,350);
		this.addMouseListener(this);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getButton());
        // MouseEvent.BUTTON3 es el boton derecho
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
