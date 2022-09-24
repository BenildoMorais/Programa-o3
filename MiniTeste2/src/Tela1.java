

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tela1 {
	
	private JFrame fr;
	private JPanel p1, p1a, p1b,p1c, p2, p2b, p2a, p2a1, p2a2;
	private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7;
	private JButton bt1, bt2, bt3, bt4;
	private JTextField tx1, tx2, tx3, tx4, tx5,tx6;
	private JTextArea ta;
	private JList lista;
	private String[] item = {"item","item","item"};
	private JTextField txt;
	
	
	public Tela1() {
		fr = new JFrame();
		fr.setSize(500,400);
		fr.setTitle("Design Preview [ContactEditor]");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1a = new JPanel();
		p1b = new JPanel();
		p1c = new JPanel();
		
		p2 = new JPanel();
		p2a = new JPanel();
		p2b = new JPanel();
		p2a1 = new JPanel();
		p2a2 = new JPanel();
		
		lista = new JList (item);
		
		//txt = new JTextField();
		//txt.add(lista);
		
		lb1 = new JLabel("First Name:");
		lb2 = new JLabel("Last Name:");
		lb3 = new JLabel("Title:");
		lb4 = new JLabel("Nickname:");
		
		lb5 = new JLabel("Display Format:");
		
		lb6 = new JLabel("E-mal Adress: ");
		
		ImageIcon img = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\11.jpg");
		lb7 = new JLabel(img);
		
		
		tx1 = new JTextField(50);
		tx2 = new JTextField(50);
		tx3 = new JTextField(50);
		tx4 = new JTextField(50);
		tx5 = new JTextField(20);
		tx6 = new JTextField(20);
		
		bt1 = new JButton("Add");
		bt2 = new JButton("Edit");
		bt3 = new JButton("Remove");
		bt4 = new JButton("As Default");
		
		ta = new JTextArea(5,50);
		
		
		fr.setBackground(Color.blue);
		
		fr.setLayout(new GridLayout(4,1));
		
		p1.setLayout(new GridLayout(3,1));
		
		p1a.setLayout(new GridLayout(1,4));
		p1a.add(lb1);
		p1a.add(tx1);
		p1a.add(lb2);
		p1a.add(tx2);
		p1.add(p1a);
		
		p1b.setLayout(new GridLayout(1,4));
		p1b.add(lb3);
		p1b.add(tx3);
		p1b.add(lb4);
		p1b.add(tx4);
		p1.add(p1b);
		
		p1c.setLayout(new FlowLayout());
		p1c.add(lb5);
		p1c.add(new JLabel());
		p1.add(p1c);
		
		fr.add(p1);
		
		fr.add(lb7);
		
		p2.setLayout(new BorderLayout());
		
		p2a.setLayout(new GridLayout(2,1));
		p2a1.setLayout(new FlowLayout());
		p2a1.add(lb6);
		p2a1.add(tx6);
		p2a.add(p2a1);
		
		p2a.add(lista);
		p2.add(BorderLayout.CENTER,p2a);
		
		
		p2b.setLayout(new GridLayout(4,1,2,2));
		p2b.add(bt1);
		p2b.add(bt2);
		p2b.add(bt3);
		p2b.add(bt4);
		p2.add(BorderLayout.EAST,p2b);
		
		fr.add(p2);
		
		
		fr.setVisible(true);
	
	}

}
