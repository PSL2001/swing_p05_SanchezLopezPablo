/**
 * swing_p05_SanchezLopezPablo - ejercicio1 - EscuchaEvento.java
 * 10 nov 2022 - 13:14:04
 * @author Pablo Sánchez López
 */
package ejercicio1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

/**
 * The Class EscuchaEvento.
 *
 * @author usuario
 */
public class EscuchaEvento implements WindowFocusListener {
	
	/** The content pane. */
	private Container contentPane;
	
	/**
	 * Instantiates a new escucha evento.
	 *
	 * @param contentPane the content pane
	 */
	public EscuchaEvento(Container contentPane) {
		this.contentPane = contentPane;
	}

		/**
		 * Window gained focus.
		 *
		 * @param e the e
		 */
		@Override
		public void windowGainedFocus(WindowEvent e) {
			this.contentPane.setBackground(Color.GREEN);
		}

		/**
		 * Window lost focus.
		 *
		 * @param e the e
		 */
		@Override
		public void windowLostFocus(WindowEvent e) {
			this.contentPane.setBackground(Color.RED);
		}
	}
