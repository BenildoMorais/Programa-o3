package Aula05092022;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela2 {
	private JFrame fr; 
	private JPanel P1, P2, P3;
	private ImageIcon img;
	private JLabel lb;
	private JLabel tx1, tx2, tx3, tx4;
	private JButton bt1, bt2, bt3;
	
	
	
	public Tela2() {
		fr = new JFrame();
		P1 = new JPanel();
		P2 = new JPanel();
		P3 = new JPanel();
		
		fr.setSize(450,750);
		fr.setTitle("Primeira tela");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		
		tx1=new JLabel("Vermelho");
		tx1.setForeground(Color.red);
		
		tx2=new JLabel("Verde");
		tx2.setForeground(Color.green);
		
		tx3=new JLabel("Amarelo");
		tx3.setForeground(Color.yellow);
		
		tx4=new JLabel("Azul");
		tx4.setForeground(Color.blue);
		
		bt1=new JButton("Vermelho");
		bt1.setBackground(Color.red);
		
		bt2=new JButton("Amarelo");
		bt2.setBackground(Color.yellow);
		
		bt3=new JButton("Azul");
		bt3.setBackground(Color.blue);
		
		
		fr.setLayout(new GridLayout(1,2));
		img = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\ImagensTeste.jpg");
		lb = new JLabel(img);
		fr.add(lb);
		
		
		P1.setLayout(new GridLayout(2,1));
		
			P2.setLayout(new FlowLayout());
			P2.add(tx1);
			P2.add(tx2);
			P2.add(tx3);
			P2.add(tx4);	
		P1.add(P2);
		
			P3.setLayout(new FlowLayout());
			P3.add(bt1);
			P3.add(bt2);
			P3.add(bt3);
		
		P1.add(P3);
		
		
		fr.add(P1);
			
			
		fr.setVisible(true);
		
	}

}
