package refazendoAula12092022;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela2 {
	
	private JFrame fr;
	private JLabel lb1, lb2;
	private JTextField tx1, tx2;
	private JButton bt1, bt2;
	
	public Tela2() {
		
		fr = new JFrame();
		fr.setSize(400,250);
		fr.setTitle("Eventos \"por Adicionar\"");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lb1 = new JLabel("User: ");
		lb2 = new JLabel("Senha: ");
		
		tx1 = new JTextField(20);
		tx2 = new JTextField(20);
		
		bt1 = new JButton("Autenticar");
		bt2 = new JButton("Limpar");
		
		fr.setLayout(new GridLayout(3,2));
		fr.add(lb1);
		fr.add(tx1);
		fr.add(lb2);
		fr.add(tx2);
		fr.add(bt1);
		fr.add(bt2);
		
		fr.setVisible(true);
	}

}
