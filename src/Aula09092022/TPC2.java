package Aula09092022;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class TPC2 {

	private JFrame fr;
	private JPanel PE, PC, PCa, PCb, PCUp, PCUp1, PCUp2, PCUp3, PCUp4, PCUp5, PCDow, PCDow1, PCDow1a, PCDow1b, PCDow1c, PCDow2;
	private JButton bt1, bt2, bt3, bt4, btl, btr;
	private JLabel tx1, tx2, tx3, tx3a, tx4, tx5;
	private JTextField lb1, lb2, lb3;
	private JRadioButton rdf, rdm;
	private ButtonGroup gpG;
	private JCheckBox ch1, ch2, ch3;
	private JComboBox cb;
	private JList lista, numeros;
	private JTextArea txa, txb;
	private JScrollPane sc1, sc2;
	
	public TPC2() {
		fr = new JFrame();
		PE = new JPanel();
		PC = new JPanel();
		PCa = new JPanel();
		PCb = new JPanel();
		PCUp = new JPanel();
		PCUp1 = new JPanel();
		PCUp2 = new JPanel();
		PCUp3 = new JPanel();
		PCUp4 = new JPanel();
		PCUp5 = new JPanel();
		PCDow = new JPanel();
		PCDow1 = new JPanel();
		PCDow1a = new JPanel();
		PCDow1b = new JPanel();
		PCDow1c = new JPanel();
		PCDow2 = new JPanel();
		
		txa = new JTextArea(5,20);
		txb = new JTextArea(6,20);
		
		String [] objectos = {"Redes","Inernet","Compiladores","Segurancs","BD"};
		lista = new JList(objectos);
		
		String [] objectos1 = {"1","2","3","4","5","6","7","8","9","10"};
		cb = new JComboBox (objectos1);
		
		sc1 = new JScrollPane(lista);
		sc2 = new JScrollPane(txb);
		sc2.setBorder(new TitledBorder("Observações"));
		
		btl = new JButton("Esquerda");
		btr = new JButton("Direita");
		
		ch1 = new JCheckBox("Curso 1");
		ch2 = new JCheckBox("Curso 2");
		ch3 = new JCheckBox("Curso 3");
		
		gpG = new ButtonGroup();
		rdf = new JRadioButton ("Femenino");
		rdm = new JRadioButton("Masculino");
		gpG.add(rdf);
		gpG.add(rdm);
		
		
		tx1 = new JLabel("         Nome: ");
		lb1 = new JTextField(29);
		
		
		tx2 = new JLabel("  Endereco: ");
		lb2 = new JTextField(29);
		
		tx3 = new JLabel("       Cidade: ");
		lb3 = new JTextField(19);
		tx3a = new JLabel("Estado: ");
		
		tx4 = new JLabel("          Sexo: ");
		tx5 = new JLabel("     Opcoes: ");
				
		fr.setSize(500,450);
		fr.setTitle("TelaRegistro TPC");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		
		bt1 = new JButton("Inserir");
		bt2 = new JButton("Gravar");
		bt3 = new JButton("Consultar");
		bt4 = new JButton("Sair");
		
		fr.setLayout(new BorderLayout());
		
		
		PE.setLayout(new GridLayout(10,1,2,2));
		PE.add(bt1);
		PE.add(bt2);
		PE.add(bt3);
		PE.add(bt4);
		
		
		PC.setLayout(new GridLayout(2,1));
		PCa.setLayout(new GridLayout(5,1));
		
		PCUp1.setLayout(new FlowLayout(FlowLayout.LEADING));
		PCUp1.add(tx1);
		PCUp1.add(lb1);
		PCa.add(PCUp1);
		
		PCUp2.setLayout(new FlowLayout(FlowLayout.LEADING));
		PCUp2.add(tx2);
		PCUp2.add(lb2);
		PCa.add(PCUp2);
		
		PCUp3.setLayout(new FlowLayout(FlowLayout.LEADING));
		PCUp3.add(tx3);
		PCUp3.add(lb3);
		PCUp3.add(tx3a);
		PCUp3.add(cb);
		PCa.add(PCUp3);

		PCUp4.setLayout(new FlowLayout(FlowLayout.LEADING));
		PCUp4.add(tx4);
		PCUp4.add(rdm);
		PCUp4.add(rdf);
		PCa.add(PCUp4);
		
		PCUp5.setLayout(new FlowLayout(FlowLayout.LEADING));
		PCUp5.add(tx5);
		PCUp5.add(ch1);
		PCUp5.add(ch2);
		PCUp5.add(ch3);
		PCa.add(PCUp5);
		
			PC.add(PCa);
		
		PCb.setLayout(new GridLayout(2,1));
		
		PCDow1.setLayout(new GridLayout(1,3));
		PCDow1.add(sc1);
		
		PCDow1a.setLayout(new GridLayout(4,1));
		PCDow1a.add(btl);
		PCDow1a.add(btr);
		PCDow1a.add(new JLabel());
		PCDow1a.add(new JLabel());
		PCDow1.add(PCDow1a);
		PCDow1.add(txa);
		
		PCDow1.setBorder(new TitledBorder("Interesses"));
		
		PCb.add(PCDow1);

		PCb.add(sc2);
		
		PC.add(PCa);
		PC.add(PCb);
		
		fr.add("Center",PC);
		fr.add("East",PE);
		
		fr.setVisible(true);
		
	}
}

