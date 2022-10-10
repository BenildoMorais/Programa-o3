import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import Aula02092022.borderLayout;

public class refazendoEx3 extends JFrame implements ActionListener{

	private JButton frango, farinha, arroz, massa, finalizar;
	private JLabel produtos1, produtos2, iva1, iva2, total1, total2;
	private JTextArea txa;
	private JScrollPane sc;
	private JPanel p0,p1,p2,p3,p4,p5,p6,p7,p8,p9;
	private String texto;
	private JMenuBar barra;
	private JMenu menu;
	private Double valor=0.0;
	private StringBuilder informacao;
	private ImageIcon frango1, farinha1, arroz1,massa1;
	
	public refazendoEx3() {
		this.setTitle("Exemplo de teste");
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		frango1 = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\frango.png");
		farinha1 = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\farinha.png");
		arroz1 = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\arroz.png");
		massa1 = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\massa.jpg");
		
		informacao = new StringBuilder();
		
		p0 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		p8 = new JPanel();
		p9 = new JPanel();
		
		menu = new JMenu("Menu");
		barra = new JMenuBar();
		barra.add(menu);
		this.setJMenuBar(barra);
		
		frango = new JButton("Frango",frango1);
		frango.addActionListener(this);
		farinha = new JButton("Farinha",farinha1);
		farinha.addActionListener(this);
		arroz = new JButton(" Arroz ", arroz1);
		arroz.addActionListener(this);
		massa = new JButton("Massa",massa1);
		massa.addActionListener(this);
		finalizar = new JButton("Finalizar a Compra");
		finalizar.addActionListener(this);
		
		produtos1 = new JLabel("Valor dos Produtos:");
		produtos1.setForeground(Color.blue);
		produtos2 = new JLabel();
		iva1 = new JLabel("Valor do IVA:");
		iva1.setForeground(Color.blue);
		iva2 = new JLabel();
		total1 = new JLabel("Valor Total:");
		total1.setForeground(Color.blue);
		total2 = new JLabel();
		
		txa = new JTextArea(50,15);
		txa.setEditable(false);
		sc = new JScrollPane(txa);
		
		p1.setLayout(new GridLayout(9,1));
		p1.setBackground(Color.blue);
		
		p1.add(new JLabel());
		p2.setLayout(new FlowLayout());
		p2.setBackground(Color.blue);
		p2.add(frango);
		p1.add(p2);
		
		p1.add(new JLabel());
		p3.setLayout(new FlowLayout());
		p3.setBackground(Color.blue);
		p3.add(farinha);
		p1.add(p3);
		
		p1.add(new JLabel());
		p4.setLayout(new FlowLayout());
		p4.setBackground(Color.blue);
		p4.add(arroz);
		p1.add(p4);
		
		p1.add(new JLabel());
		p7.setLayout(new FlowLayout());
		p7.setBackground(Color.blue);
		p7.add(massa);
		p1.add(p7);
		
		//p1.add(new JLabel());
		this.add(BorderLayout.WEST,p1);
		
		p5.setLayout(new GridLayout(10,1));
		p5.add(produtos1);
		p5.add(produtos2);
		p5.add(iva1);
		p5.add(iva2);
		p5.add(total1);
		p5.add(total2);
		p5.add(new JLabel());
		p5.add(new JLabel());
		p5.add(new JLabel());
		p5.add(new JLabel());
		this.add(BorderLayout.EAST, p5);
		
		p6.setLayout(new BorderLayout());
		p6.add(BorderLayout.NORTH,new JLabel("\n \n"));
		p6.add(BorderLayout.WEST,new JLabel("   "));
		p6.add(BorderLayout.EAST,new JLabel("   "));
		
		p8.setLayout(new GridLayout(2,1));
		p8.add(sc);
		
		p9.setLayout(new GridLayout(3,1));
		p9.add(new JLabel());
		p0.setLayout(new FlowLayout());
		p0.add(finalizar);
		p9.add(p0);
		p9.add(new JLabel());
		p8.add(p9);
		
		p6.add(BorderLayout.CENTER,p8);
		
		this.add(BorderLayout.CENTER,p6);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frango) {
			informacao.append("Frango - 120.00Mt\n");
			this.valor += 120;
			txa.setText(informacao.toString());
		}
		if(e.getSource() == farinha) {
			informacao.append("Farinha - 80.00Mt\n");
			this.valor += 80;
			txa.setText(informacao.toString());
		}
		if(e.getSource() == arroz) {
			informacao.append("Arroz - 20.00Mt\n");
			this.valor += 20;
			txa.setText(informacao.toString());
		}
		if(e.getSource() == massa) {
			informacao.append("Massa - 50.00Mt\n");
			this.valor += 50;
			txa.setText(informacao.toString());
		}
		if(e.getSource() == finalizar) {
			produtos2.setText(Double.toString(valor)+" Mt");
			
			Double iva = valor - ((valor*17)/100);
			iva2.setText(Double.toString(iva)+" Mt");
			
			total2.setText(Double.toString(iva+this.valor)+" Mt");
		}
		
		
	}

}
