package refazendoAula02092022;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayout1 {

	private JFrame fr;
	private JButton btNorte;
	private JButton btOeste;
	private JButton btCentro;
	private JButton btEste;
	private JButton btSul;
	private JPanel PE;
	private JLabel lb1, lb2, lb3;
	
	public BorderLayout1 () {
		fr = new JFrame();
		PE = new JPanel();
		
		lb1 = new JLabel("   b1   ");
		lb2 = new JLabel("   b2   ");
		lb3 = new JLabel("   b3   ");
		
		fr.setSize(450,250);
		fr.setTitle("BorderLayout");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btNorte = new JButton("Norte");
		btOeste = new JButton("Oeste");
		btCentro = new JButton("Centro");
		btEste = new JButton("Este");
		btSul = new JButton("Sul");
		
		fr.setLayout(new BorderLayout());
		
		fr.add("Center",btCentro);
		fr.add("North",btNorte);
		fr.add("West",btOeste);
		fr.add("South",btSul);
		
		PE.setLayout(new GridLayout(3,1));
		PE.add(lb1);
		PE.add(lb2);
		PE.add(lb3);
		fr.add("East",PE);
		
		
		
		fr.setVisible(true);
	}
}
