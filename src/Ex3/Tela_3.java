package Ex3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tela_3 implements ActionListener {
	private JFrame frame;
	private JButton btFrango, btFarinha, btArroz, btMassa, btFinalizar;
	private JTextArea txa;
	private JTextField txtValProduto, txtValIva, txtValTotal;
	private ScrollPane scp;
	private JLabel lbVoid,lbMenu, lbValProdutos, lbValIva, lbValTotal, lbValPL, lbValIL, lbValTL;
	private JPanel panelVoidHelp, panelWest,panelCenter, panelEast;
	private  String txt = "";
	private double valProdutos;

	
	public Tela_3()  {
		frame = new JFrame();
		frame.setSize(500,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout());
		
		//Button
		btFrango = new JButton("Frango");
		btFarinha = new JButton("Farinha");
		btArroz = new JButton("Arroz");
		btMassa = new JButton("Massa");
		btFinalizar = new JButton("Finalizar a Compra");
		
		//Labeel
		lbMenu = new JLabel("Menu");
		lbValProdutos = new JLabel("Valor dos Produtos:  ");
		lbValProdutos.setForeground(Color.BLUE);
		lbValIva = new JLabel("Valor do IVA:  ");
		lbValIva.setForeground(Color.BLUE);
		lbValTotal = new JLabel("Valor Total:  ");
		lbValTotal.setForeground(Color.BLUE);
		lbVoid = new JLabel(" ");
		/*
		//TextField
		txtValProduto = new JTextField(15);
		txtValProduto.setBackground(Color.LIGHT_GRAY);
		txtValIva = new JTextField(15);
		txtValTotal = new JTextField(15);*/
		
		lbValPL = new JLabel();
		lbValPL.setFont(new Font("Arial",Font.BOLD,20));
		lbValIL = new JLabel();
		lbValTL = new JLabel();
		
		txa = new JTextArea(20,15);
		scp = new ScrollPane();
		scp.add(txa);
		
		panelWest = new JPanel();
		panelWest.setLayout(new GridLayout(10,1));
		panelWest.setBackground(Color.blue);
		panelWest.add(new JLabel());
		panelWest.add(btFrango);
		panelWest.add(new JLabel());
		panelWest.add(btFarinha);
		panelWest.add(new JLabel());
		panelWest.add(btArroz);
		panelWest.add(new JLabel());
		panelWest.add(btMassa);
		panelWest.add(new JLabel());
		panelWest.add(new JLabel());
		
		panelVoidHelp = new JPanel();
		panelVoidHelp.setLayout(new GridLayout(2,1));
		panelVoidHelp.add(lbVoid);
		panelVoidHelp.add(lbVoid);
		
		panelCenter = new JPanel();
		panelCenter.setLayout(new BorderLayout());
		panelCenter.add("North",panelVoidHelp);
		panelCenter.add("Center",scp);
		panelCenter.add("South",btFinalizar);
		
		panelEast = new JPanel();
		panelEast.setLayout(new GridLayout(10,1));
		panelEast.add(lbValProdutos);
		panelEast.add(lbValPL);
		panelEast.add(new JLabel());
		panelEast.add(lbValIva);
		panelEast.add(lbValIL);
		panelEast.add(new JLabel());
		panelEast.add(lbValTotal);
		panelEast.add(lbValTL);
		panelEast.add(new JLabel());
		panelEast.add(new JLabel());
		
		
		frame.add("North",lbMenu);
		frame.add("Center",panelCenter);
		frame.add("West", panelWest);
		frame.add("East", panelEast);
		frame.add("South",panelVoidHelp);
		
		btFrango.addActionListener(this);
		btFarinha.addActionListener(this);
		btArroz.addActionListener(this);
		btMassa.addActionListener(this);
		btFinalizar.addActionListener(this);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == btFrango) {
			txt+="Frango - 120.00MT\n";
			valProdutos+= 120;
			txa.setText(txt);
			
		}
		if(e.getSource() == btFarinha) {
			txt+="Farinha - 80.00MT\n";
			valProdutos+= 80;
			txa.setText(txt);
		
		}
		if(e.getSource() == btArroz) {
			txt+="Arroz - 20.00MT\n";
			valProdutos+= 20;
			txa.setText(txt);
			
		}
		if(e.getSource() == btMassa) {
			txt+="Massa - 35.00MT\n";
			valProdutos+= 35;
			txa.setText(txt);
			
		}
		if(e.getSource() == btFinalizar) {
			lbValPL.setText(String.valueOf(valProdutos)+" MT");
			lbValIL.setText(String.valueOf(valProdutos*0.17)+" MT");
			lbValTL.setText(String.valueOf(valProdutos + valProdutos*0.17)+" MT");
		}


	}
}
