package Aula12092022;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tela2 implements ActionListener{
	
	private JFrame fr;
	private JLabel lbUser, lbSenha;
	private JPasswordField tx2;
	private JTextField tx1;
	private JButton bt1, bt2;
	
	public Tela2() {
		fr = new JFrame();
		fr.setSize(450,250);
		fr.setTitle("Eventos");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbUser = new JLabel("User: ");
		tx1 = new JTextField(20);
		
		lbSenha= new JLabel("Senha: ");
		tx2 = new JPasswordField(20);
		
		bt1 = new JButton("Autenticar");
		bt2 = new JButton("Limpar");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		fr.setLayout(new GridLayout(3,3));
		fr.add(lbUser);
		fr.add(tx1);
		fr.add(lbSenha);
		fr.add(tx2);
		fr.add(bt1);
		fr.add(bt2);
		
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt1) {
			if(tx1.getText().equals("admin") && tx2.getText().equals("1234")) {
				JOptionPane.showMessageDialog(null, "Sucesso");
				//apagar();
				fr.dispose();
				new TelaVasia(tx1.getText());
				
			}else {
				apagar();
				JOptionPane.showMessageDialog(null, "O User ou a Senha está errada");
			}
		}
		
		if(e.getSource() == bt2) {
			apagar();
		}
		
	}

	private void apagar() {
		tx1.setText("");
		tx2.setText("");
	}

}
