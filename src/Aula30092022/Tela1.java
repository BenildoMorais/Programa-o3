package Aula30092022;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Tela1 extends JFrame implements ActionListener {
	
	private JMenu sis, gest, sub;
	private JMenuItem txt, sair, A, B, C, D;
	private JCheckBoxMenuItem dt, tp;
	private JRadioButtonMenuItem rd1, rd2;
	private JMenuBar barra;
	private ButtonGroup bg;
	
	
	public Tela1() {
		this.setSize(300,500);
		this.setTitle("Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		sis = new JMenu("Sistema");
		sub = new JMenu("Sub Menu");
		
		txt = new JMenuItem("Texto");
		sair = new JMenuItem("Sair");
		sair.addActionListener(this);
		
		barra = new JMenuBar();
		dt = new JCheckBoxMenuItem("Data");
		tp = new JCheckBoxMenuItem("Tipo");
		bg = new ButtonGroup();
		rd1 = new JRadioButtonMenuItem("Converter");
		rd1.setSelected(true);
		rd2 = new JRadioButtonMenuItem("Compilador");
		bg.add(rd1);
		bg.add(rd2);
		
		sis.add(txt);
		sis.addSeparator();
		sis.add(dt);
		sis.add(tp);
		sis.addSeparator();
		sis.add(rd1);
		sis.add(rd2);
		sis.addSeparator();
		sis.add(sub);
		sis.addSeparator();
		sis.add(sair);
		
		barra.add(sis);
		
		this.setJMenuBar(barra);
		//this.add(BorderLayout.NORTH,barra);
		
		
		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sair) {
			System.exit(EXIT_ON_CLOSE);
			
		}
		
	}
	

}
