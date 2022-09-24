package Aula09092022;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
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
	private JLabel tx1,tx2;
	private  Font f;
	private JPanel ft1, ft2;
	private JList cb;
	private JRadioButton rdf, rdm;
	private ButtonGroup gpG;
	private JTextArea txA;
	private JScrollPane sc;
	private JCheckBox ch1, ch2, ch3;

	
	public TelaRegistro () {
		fr = new JFrame();
		ft1 = new JPanel();
		ft2 = new JPanel();
		gpG = new ButtonGroup();
		txA = new JTextArea(20,5);
		f = new Font("Arial",Font.ITALIC, 25);
		sc = new JScrollPane(txA);
		
		String [] lista = {"Pessego","Uva","Manga","papaia","Banana"};
		cb = new JList(lista);
		
		rdf = new JRadioButton ("Femenino");
		rdm = new JRadioButton("Masculino");
		ch1 = new JCheckBox("MT1");
		ch2 = new JCheckBox("MT2");
		ch3 = new JCheckBox("T1");
		
		
		fr.setSize(450,150);
		fr.setTitle("TelaRegistro");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		
		tx1=new JLabel("Tela de registro de Estudante");
		tx1.setHorizontalAlignment(SwingConstants.CENTER);
		tx1.setForeground(Color.blue);
		tx1.setFont(f);
		
		tx2=new JLabel("Escolha a fruta: ");
		
		
		fr.setLayout(new GridLayout(3,1));
		
		ft1.setLayout(new GridLayout(3,1));
		ft1.add(new JLabel());
		ft1.add(tx1);
		ft1.add(new JLabel());
		fr.add(ft1);
		
		
		ft2.setLayout(new FlowLayout());
		gpG.add(rdf);
		gpG.add(rdm);
		ft2.add(tx2);
		ft2.setBackground(Color.CYAN);
		ft2.add(cb);
		ft2.add(rdf);
		ft2.add(rdm);
		ft2.add(ch1);
		ft2.add(ch2);
		ft2.add(ch3);
		fr.add(ft2);
		
		fr.add(sc);
		
		
		
		fr.setVisible(true);
		
		
		
		
		
	}
}
