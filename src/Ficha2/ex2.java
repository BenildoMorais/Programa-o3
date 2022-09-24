package Ficha2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ex2 {
	
	private JFrame fr;
	private JButton btNorte;
	private JButton btOeste;
	private JButton btCentro;
	private JButton btEste;
	private JButton btSul;
	
	private JPanel PC, UP, Dow,Cen;
	
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
	
	public ex2() {
		
        fr=new JFrame();
		
		PC=new JPanel();
		UP=new JPanel();
		Dow=new JPanel();
		Cen=new JPanel();
		
		fr.setSize(450,250);
		fr.setTitle("BorderLayout");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btNorte=new JButton("Norte");
		btOeste=new JButton("Oeste");
		btCentro=new JButton("Centro");
		btEste=new JButton("Este");
		btSul=new JButton("Sul");
		
		fr.setLayout(new BorderLayout());
		fr.add("Center",btCentro);
		fr.add("East",btEste);
		fr.add("North",btNorte);
		fr.add("West",btOeste);
		fr.add("South",btSul);
		
		PC.setLayout(new BorderLayout());
		
		UP.setLayout(new GridLayout(1,3,10,15));
		bt1=new JButton("Northwest");
		bt2=new JButton("North");
		bt3=new JButton("Northeast");
		UP.add(bt1);
		UP.add(bt2);
		UP.add(bt3);
		PC.add("North",UP);
			
		Dow.setLayout(new GridLayout(1,3,10,15));
		bt4=new JButton("Southest");
		bt5=new JButton("South");
		bt6=new JButton("Southeast");
		Dow.add(bt4);
		Dow.add(bt5);
		Dow.add(bt6);
		PC.add("South",Dow);
		
		Cen.setLayout(new GridLayout(3,3,50,15));
		bt7=new JButton("West");
		bt8=new JButton("Center");
		bt9=new JButton("East");
		Cen.add(new JLabel());
		Cen.add(new JLabel());
		Cen.add(new JLabel());
		Cen.add(bt7);
		Cen.add(bt8);
		Cen.add(bt9);
		Cen.add(new JLabel());
		Cen.add(new JLabel());
		Cen.add(new JLabel());
		PC.add("Center",Cen);

		fr.add("Center",PC);
		
		fr.setVisible(true);
	}

}
