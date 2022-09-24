package Aula16092022;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela1 implements ActionListener{

	private JFrame fr;
	private JButton bt1, bt2;
	private JLabel n1, n2, rs;
	private JTextField tx1, tx2, tr;
	
	public Tela1() {
		fr = new JFrame();
		fr.setSize(350, 350);
		fr.setTitle("Calculadora");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\calculadora.png"); 
		fr.setIconImage(img.getImage());
		
		n1 = new JLabel("Numero 1");
		n2 = new JLabel("Numero 2");
		rs = new JLabel("Resultado");

		tx1 = new JTextField(20);
		tx2 = new JTextField(20);
		tr = new JTextField(20);
		tr.setEditable(false);
		
		bt1 = new JButton("Somar");
		bt1.addActionListener(this);
		
		bt2 = new JButton("Subtrair");
		bt2.addActionListener(this);
		
		
		fr.setLayout(new GridLayout(4,2));
		fr.add(n1);
		fr.add(tx1);
		fr.add(n2);
		fr.add(tx2);
		fr.add(bt1);
		fr.add(bt2);
		fr.add(rs);
		fr.add(tr);
		
		fr.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt1) {
			Double resultado = Double.parseDouble(tx1.getText()) + Double.parseDouble(tx2.getText());
			String Resultado1 = String.valueOf(resultado);
			tr.setText(Resultado1);
			
		}
		if(e.getSource() == bt2) {
			Double resultado = Double.parseDouble(tx1.getText()) - Double.parseDouble(tx2.getText());
			String Resultado1 = String.valueOf(resultado);
			tr.setText(Resultado1);
		}
	}
	
}
