package refazendoAula09092022;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class TelaRegistro {
	
	private JFrame fr;
	private JPanel p1,p2;
	private JLabel lb1, lb2;
	private Font f;
	private JList jl;
	private JRadioButton btm ,btf;
	private JCheckBox ck1, ck2, ck3;
	private ButtonGroup btg;
	private JTextArea txt;
	private JScrollPane sc;
	
	public TelaRegistro() {
		
		fr = new JFrame();
		fr.setSize(350,500);
		fr.setTitle("TelaRegistro");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		f = new Font("Arial",Font.ITALIC,25);
		lb1 = new JLabel("Tela de registro de estudante");
		lb1.setForeground(Color.blue);
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(f);
		
		lb2 = new JLabel("Escolha uma fruta: ");
		
		String [] frutas = {"Pessego","Uva","Manga","Manga","Papaia","Banana"};
		jl = new JList(frutas);
		
		btf = new JRadioButton("Femenino");
		btf.setSelected(true);
		btm = new JRadioButton("Masculino");
		btg = new ButtonGroup();
		btg.add(btf);
		btg.add(btm);
		
		ck1 = new JCheckBox("Mt1");
		ck2 = new JCheckBox("Mt2");
		ck3 = new JCheckBox("T1");
		
		txt = new JTextArea(50,200);
		sc = new JScrollPane(txt);
		
		fr.setLayout(new GridLayout(3,1));
		
		p1.setLayout(new GridLayout(3,1));
		p1.add(new JPanel());
		p1.add(lb1);
		p1.add(new JPanel());
		fr.add(p1);
		
		p2.setLayout(new FlowLayout());
		
		p2.setBackground(Color.blue);
		p2.add(lb2);
		p2.add(jl);
		p2.add(btf);
		p2.add(btm);
		p2.add(ck1);
		p2.add(ck2);
		p2.add(ck3);
		
		fr.add(p2);
		
		fr.add(sc);
		
		fr.setVisible(true);
		
	}

}
