package Aula09092022;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class TPC {

	private JFrame fr;
	private JPanel PE, PC, PCUp, PCUp1, PCUp2, PCUp3, PCUp4, PCUp5, PCDow, PCDow1, PCDow2;
	private JButton bt1, bt2, bt3, bt4;
	private JLabel tx1, tx2, tx3, tx3a, tx4, tx5;
	private JTextField lb1, lb2, lb3;
	private JRadioButton rdf, rdm;
	private ButtonGroup gpG;
	private JCheckBox ch1, ch2, ch3;
	
	public TPC() {
		fr = new JFrame();
		PE = new JPanel();
		PC = new JPanel();
		PCUp = new JPanel();
		PCUp1 = new JPanel();
		PCUp2 = new JPanel();
		PCUp3 = new JPanel();
		PCUp4 = new JPanel();
		PCUp5 = new JPanel();
		PCDow = new JPanel();
		PCDow1 = new JPanel();
		PCDow2 = new JPanel();
		
		ch1 = new JCheckBox("Curso 1");
		ch2 = new JCheckBox("Curso 2");
		ch3 = new JCheckBox("Curso 3");
		
		gpG = new ButtonGroup();
		rdf = new JRadioButton ("Femenino");
		rdm = new JRadioButton("Masculino");
		
		tx1 = new JLabel("Nome: ");
		lb1 = new JTextField(20);
		
		tx2 = new JLabel("Endereco: ");
		lb2 = new JTextField(20);
		
		tx3 = new JLabel("Cidade: ");
		lb3 = new JTextField(20);
		tx3a = new JLabel("Estado");
		
		tx4 = new JLabel("Sexo: ");
		tx5 = new JLabel("Opcoes: ");
		
		fr.setSize(450,500);
		fr.setTitle("TelaRegistro");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		
		bt1 = new JButton("Inserir");
		bt2 = new JButton("Gravar");
		bt3 = new JButton("Consultar");
		bt4 = new JButton("Sair");
		
		fr.setLayout(new BorderLayout());
		
		PE.setLayout(new GridLayout(10,1,20,10));
		PE.add(bt1);
		PE.add(bt2);
		PE.add(bt3);
		PE.add(bt4);
		
		PC.setLayout(new GridLayout(2,1));
		PCUp.setLayout(new GridLayout(5,1));
		
		PCUp1.setLayout(new FlowLayout());
		PCUp1.add(tx1);
		PCUp1.add(lb1);
		PCUp.add(PCUp1);
		
		PCUp2.setLayout(new FlowLayout());
		PCUp2.add(tx2);
		PCUp2.add(lb2);
		PCUp.add(PCUp2);
		
		PCUp3.setLayout(new FlowLayout());
		PCUp3.add(tx3);
		PCUp3.add(lb3);
		PCUp3.add(tx3a);
		PCUp.add(PCUp3);
		
		PCUp4.setLayout(new FlowLayout());
		gpG.add(rdf);
		gpG.add(rdm);
		PCUp4.add(tx4);
		rdm.setSelected(true);
		PCUp4.add(rdm);
		PCUp4.add(rdf);
		PCUp.add(PCUp4);
		
		PCUp5.setLayout(new FlowLayout());
		PCUp5.add(tx5);
		PCUp5.add(ch1);
		PCUp5.add(ch2);
		PCUp5.add(ch3);
		PCUp.add(PCUp5);
		
		PC.add(PCUp);
		
		
		PCDow.setLayout(new GridLayout(2,1));
		PC.add(PCDow);
		
		
		fr.add("Center",PC);
		fr.add("East",PE);
		
		fr.setVisible(true);
		
	}
}
