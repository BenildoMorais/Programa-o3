package Aula02092022;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class gridLayout {

	private JFrame fr;
	private JLabel lb, lbUser, lbSenha;
	private JTextField txtUser, txtSenha;
	private JButton bt;
	
	
	public gridLayout() {
		fr = new JFrame();
		
		fr.setSize(450,250);
		fr.setTitle("GridLayout");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lb=new JLabel("Autenticacao");
		lbUser=new JLabel("UserName");
		txtUser=new JTextField(20);
		lbSenha=new JLabel("Password");
		txtSenha=new JTextField(20);
		bt=new JButton("Autenticar");
		
		fr.setLayout(new GridLayout(4,2,10,15));
		
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
