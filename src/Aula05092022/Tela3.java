package Aula05092022;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela3 {
	
	private JFrame fr;
	private JLabel tx1;
	private JButton bt1, bt2, bt3;
	private JPanel PC;
	
	public Tela3() {
		
		fr=new JFrame();
		PC=new JPanel();
		fr.setSize(450,250);
		fr.setTitle("BorderLayout");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tx1=new JLabel("Tela de Registro de Estudante");
		tx1.setFont(new Font("Arial",Font.BOLD,25));
		tx1.setHorizontalAlignment(0);
		tx1.setVerticalTextPosition(0);
		
		bt1=new JButton("Vermelho");
		bt1.setBackground(Color.red);
		
		bt2=new JButton("Amarelo");
		bt2.setBackground(Color.yellow);
		
		bt3=new JButton("Azul");
		bt3.setBackground(Color.blue);
		
		fr.setLayout(new GridLayout(6,1));
		fr.add(new JLabel());
		fr.add(tx1);
		fr.add(new JLabel());
		
		PC.setLayout(new GridLayout(1,3,10,10));
		PC.add(bt1);
		PC.add(bt2);
		PC.add(bt3);
		fr.add(PC);
		
		fr.add(new JLabel());
		fr.add(new JLabel());
	
		fr.setVisible(true);
	}
	
	

}
