import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Calculadora {
	
	private JFrame fr;
	private JPanel Pup, Pc, PDow;
	private JTextField tr;
	private JTextArea tr1;
	
	public Calculadora () {
		
		fr = new JFrame();
		fr.setSize(350,500);
		fr.setTitle("Calculadora");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setLayout(new BorderLayout());
		
		Pup = new JPanel();
		Pc = new JPanel();
		PDow = new JPanel();
		
		//tr = new JTextField(1000);
		tr1 = new JTextArea(2,20);
		tr1.setEditable(false);
		
		Pc.setLayout(new GridLayout(5,4,10,10));
		fr.add("Center",Pc);
		
		Pup.setLayout(new GridLayout(1,1,30,30));
		Pup.add(tr1);
		fr.add("North",Pup);
		
		
		fr.setVisible(true);
	}


}
