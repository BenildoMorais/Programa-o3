package refazendoAula02092022;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class flowLayout1 {

	private JFrame fr;
	private JLabel lb;
	private JTextField txt;
	private JButton bt;
	
	
	public flowLayout1 () {
		
		fr = new JFrame();
		fr.setSize(450,250);
		fr.setTitle("FlowLayout");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setLayout(new FlowLayout());
		lb = new JLabel("Bem bindo ao Sistema");
		txt = new JTextField(20);
		bt = new JButton("Submeter");
		fr.add(lb);
		fr.add(txt);
		fr.add(bt);
		
		fr.setVisible(true);
	}
	
}
