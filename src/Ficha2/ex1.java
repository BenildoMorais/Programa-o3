package Ficha2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ex1 {

	private JFrame fr;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11, bt12;
	
	public ex1() {
		fr = new JFrame();
		
		fr.setSize(450,250);
		fr.setTitle("GridLayout");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bt1=new JButton("Button#1");
		bt2=new JButton("Button#2");
		bt3=new JButton("Button#3");
		bt4=new JButton("Button#4");
		bt5=new JButton("Button#5");
		bt6=new JButton("Button#6");
		bt7=new JButton("Button#7");
		bt8=new JButton("Button#8");
		bt9=new JButton("Button#9");
		bt10=new JButton("Button#10");
		bt11=new JButton("Button#11");
		bt12=new JButton("Button#12");
		
		fr.setLayout(new GridLayout(4,3,10,10));
		
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		fr.add(bt6);
		fr.add(bt7);
		fr.add(bt8);
		fr.add(bt9);
		fr.add(bt10);
		fr.add(bt11);
		fr.add(bt12);
		
		fr.setVisible(true);
	}
}
