package refazendoAula02092022;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayout1 {

	private JFrame fr;
	private JLabel lb, lbUser, lbSenha;
	private JTextField txtUser, txtSenha;
	private JButton bt;
	
	public GridLayout1 () {
		fr = new JFrame();
		
		fr.setSize(450,250);
		fr.setTitle("GridLayout");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lb = new JLabel("Autenticacao");
		lbUser = new JLabel("Username");
		lbSenha = new JLabel("Password");
		txtUser = new JTextField(20);
		txtSenha = new JTextField(20);
		bt = new JButton("Autenticar");
		
		fr.setLayout(new GridLayout(4,2));
		
		fr.add(lb);
		fr.add(new JLabel());
		fr.add(lbUser);
		fr.add(txtUser);
		fr.add(lbSenha);
		fr.add(txtSenha);
		fr.add(bt);
		
		
		
		
		
		fr.setVisible(true);
		
	}
	
}
