/**
 * swing_p05_SanchezLopezPablo - ejercicio4 - Panel.java
 * 14 nov 2022 - 8:38:39
 * @author Pablo Sánchez López
 */
package ejercicio4;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author usuario
 *
 */
public class Panel extends JPanel implements KeyListener {
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	private JLabel luser, lpass;
	private JTextField tfuser;
	private JPasswordField pfpass;
	
	public Panel() {
		layout = new GridBagLayout();
		constraints = new GridBagConstraints();
		this.setLayout(layout);
		
		luser = new JLabel("Usuario");
		lpass = new JLabel("Contraseña");
		
		tfuser = new JTextField();
		pfpass = new JPasswordField();
		
		//Listeners
		tfuser.addKeyListener(this);
		pfpass.addKeyListener(this);
		
		constraints.insets = new Insets(0, 0, 10, 0);
		constraints.ipadx = 100;
		
		constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.gridx = 0;
	    constraints.gridy = 0;
	    this.add(luser,constraints);

	    constraints.gridx = 1;
	    constraints.gridy = 0;
	    this.add(tfuser,constraints);

	    constraints.fill = GridBagConstraints.HORIZONTAL;
	    constraints.gridx = 0;
	    constraints.gridy = 1;
	    this.add(lpass,constraints);

	    constraints.gridx = 1;
	    constraints.gridy = 1;
	    this.add(pfpass,constraints); 
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo=e.getKeyCode();
		Object compo = e.getSource();
		if (codigo == 10) {
			if (compo == tfuser) {
				JOptionPane.showMessageDialog(this, "texto de usuario: " + tfuser.getText());
			} else if (compo == pfpass) {
				JOptionPane.showMessageDialog(this, "texto de pass: " + pfpass.getPassword());
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
