package Aula21092022;

import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.print.attribute.IntegerSyntax;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Tela1 implements ActionListener{
	
	private JFrame fr;
	private JPanel P1, P11, P111,P12, P112, P1121, P1122;
	private JLabel lbnc, lbno, lbmr, lbtl;
	private JTextField txnc, txno, txmr, txtl; 
	private JButton bt1, bt2, bt3, bt4, bt5;
	private JRadioButton t1, t2, g1, g2; 
	private ButtonGroup Tc, Gen;
	private JList tx;
	private Clientes cl1;
	private Vector<Clientes> cl;
	
	public Tela1() {
		fr = new JFrame();
		P1 = new JPanel();
		P11 = new JPanel();
		P111 = new JPanel();
		P12 = new JPanel();
		P112 = new JPanel();
		P1121 = new JPanel();
		P1122 = new JPanel();
		
		fr.setSize(400, 400);
		fr.setTitle("Teste de Atalhos");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		cl = new Vector<Clientes>();
		tx = new JList<Clientes>(cl);
		
		Tc = new ButtonGroup();
		t1 = new JRadioButton("Corrente");
		t2 = new JRadioButton("Prazo");
		Tc.add(t1);
		Tc.add(t2);
		
		Gen = new ButtonGroup();
		g1 = new JRadioButton("Femenino");
		g2 = new JRadioButton("Masculino");
		Gen.add(g1);
		Gen.add(g2);
		
		lbnc = new JLabel("Numero de Conta: ");
		txnc = new JTextField(10);
		txnc.setEditable(false);
		//lbnc.setHorizontalAlignment(SwingConstants.RIGHT);
		
		lbno = new JLabel("Nome: ");
		txno = new JTextField(20);
		
		lbmr = new JLabel("Morada: ");
		txmr = new JTextField(20);
		
		lbtl = new JLabel("Telefone: ");
		txtl = new JTextField(20);
		
		bt1 = new JButton("Novo");
		bt1.setMnemonic(KeyEvent.VK_N);
		bt1.addActionListener(this);
		
		bt2 = new JButton("Gravar");
		bt2.setMnemonic(KeyEvent.VK_G);
		bt2.addActionListener(this);
		
		bt3 = new JButton("Remover");
		bt3.setMnemonic(KeyEvent.VK_R);
		bt3.addActionListener(this);
		
		bt4 = new JButton("Actualizar");
		bt4.setMnemonic(KeyEvent.VK_A);
		bt4.addActionListener(this);
		
		bt5 = new JButton("Estatisticas");
		bt5.setMnemonic(KeyEvent.VK_E);
		bt5.addActionListener(this);
		
		fr.setLayout(new GridLayout(2,1));
		
		P1.setLayout(new BorderLayout());
		
		P11.setLayout(new GridLayout(2,1));
		
		P112.setLayout(new GridLayout(1,2));
		P1121.setLayout(new GridLayout(2,1));
		P1121.add(t1);
		P1121.add(t2);
		P1121.setBorder(new TitledBorder("Tipo de Conta"));
		P112.add(P1121);
		
		
		P1122.setLayout(new GridLayout(2,1));
		P1122.add(g1);
		P1122.add(g2);
		P1122.setBorder(new TitledBorder("Genero"));
		P112.add(P1122);
		
		P111.setLayout(new GridLayout(4,2));
		P111.add(lbnc);
		P111.add(txnc);
		
		P111.add(lbno);
		P111.add(txno);
		
		P111.add(lbmr);
		P111.add(txmr);
		
		P111.add(lbtl);
		P111.add(txtl);
		
		P12.setLayout(new GridLayout(5,1));
		P12.setBorder(new TitledBorder("Opcoes"));
		P12.add(bt1);
		P12.add(bt2);
		P12.add(bt3);
		P12.add(bt4);
		P12.add(bt5);
		
		P11.add(P111);
		P11.add(P112);
		
		P1.add(BorderLayout.EAST,P12);
		
		P1.add("Center",P11);
		
		
		fr.add(P1);
		
		fr.add(tx);
		
		fr.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt1) {
			cl1 = new Clientes(cl.size(),txno.getText(),txmr.getText(), Integer.valueOf(txtl.getText()) ,"df","f");
			cl.add(cl1);
		}

		
	}

}
