package Aula12092022;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela1 implements ActionListener{

	private JFrame fr;
	private JTextField tx1;
	private JButton bt1,bt2;
	
	public Tela1() {
		
		fr = new JFrame();
		fr.setSize(450,250);
		fr.setTitle("Eventos");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tx1 = new JTextField(20);
		bt1 = new JButton("Submeter");
		bt2 = new JButton("Limpar");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		fr.setLayout(new FlowLayout());
		fr.add(tx1);
		fr.add(bt1);
		fr.add(bt2);
		
		
		fr.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt1) {
			JOptionPane.showMessageDialog(null, tx1);
		}
		
		if(e.getSource() == bt2) {
			tx1.setText("");
		}
		
	}
}
