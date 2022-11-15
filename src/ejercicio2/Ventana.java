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
import javax.swing.JOptionPane;

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
		int boton = e.getButton();
        // MouseEvent.BUTTON3 es el boton derecho, mientras que 1 es el izquierdo
		if (boton == 1) {
			JOptionPane.showMessageDialog(this, "Has pulsado el boton izquierdo");
		} else if(boton == 3) {
			JOptionPane.showMessageDialog(this, "Has pulsado el boton derecho");
		}
		
		
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
