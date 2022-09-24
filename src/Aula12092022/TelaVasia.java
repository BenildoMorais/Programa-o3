package Aula12092022;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaVasia {
	
	private JFrame fr;
	private JLabel msg;
	
	public TelaVasia(String nome) {
		fr = new JFrame();
		fr.setSize(450,250);
		fr.setTitle("Eventos");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		msg = new JLabel("Ola ".concat(nome));
		fr.add(msg);
		
		fr.setVisible(true);
	}
}
