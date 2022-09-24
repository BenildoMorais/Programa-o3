import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculadora {
	
	private JFrame fr;
	private JPanel Pup, Pc, PDow;
	private JTextArea tr1;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12, bt13, bt14, bt15, bt16, bt17, bt18, bt19, bt20, bt21;
	
	public Calculadora () {
		
		fr = new JFrame();
		fr.setSize(350,500);
		fr.setTitle("Calculadora");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setLayout(new BorderLayout());
		
		Pup = new JPanel();
		Pc = new JPanel();
		PDow = new JPanel();
		
		bt1 = new JButton("1");
		bt2 = new JButton("2");
		bt3 = new JButton("3");
		bt4 = new JButton("4");
		bt5 = new JButton("5");
		bt6 = new JButton("6");
		bt7 = new JButton("7");
		bt8 = new JButton("8");
		bt9 = new JButton("9");
		bt10 = new JButton("10");
		bt11 = new JButton("11");
		bt12 = new JButton("12");
		bt13 = new JButton("0");
		bt14 = new JButton(".");
		bt15 = new JButton("C");
		bt16 = new JButton("CE");
		bt17 = new JButton("+");
		bt18 = new JButton("-");
		bt19 = new JButton("/");
		bt20 = new JButton("*");
		bt21 = new JButton("Calcular");
		
		tr1 = new JTextArea(3,20);
		tr1.setEditable(false);
		
		Pc.setLayout(new GridLayout(5,4,5,5));
		Pc.add(bt1);
		Pc.add(bt2);
		Pc.add(bt3);
		Pc.add(bt4);
		Pc.add(bt5);
		Pc.add(bt6);
		Pc.add(bt7);
		Pc.add(bt8);
		Pc.add(bt9);
		Pc.add(bt10);
		Pc.add(bt11);
		Pc.add(bt12);
		Pc.add(bt13);
		Pc.add(bt14);
		Pc.add(bt15);
		Pc.add(bt16);
		Pc.add(bt17);
		Pc.add(bt18);
		Pc.add(bt19);
		Pc.add(bt20);
		
		fr.add("Center",Pc);
		
		fr.add(BorderLayout.EAST,new JLabel("  "));
		fr.add(BorderLayout.WEST,new JLabel("  "));
		
		PDow.setLayout(new GridLayout(3,1));
		PDow.add(new JLabel());
		PDow.add(bt21);
		PDow.add(new JLabel());
		
		fr.add(BorderLayout.SOUTH,PDow);
		
		Pup.setLayout(new GridLayout(1,1,30,30));
		Pup.add(tr1);
		fr.add("North",Pup);
		
		
		fr.setVisible(true);
	}


}
