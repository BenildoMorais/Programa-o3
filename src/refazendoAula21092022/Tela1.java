package refazendoAula21092022;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Tela1 extends JFrame implements ActionListener{
	
	private JButton btNovo, btGravar, btRemover, btActualizar, btEstatistica; 
	private JLabel lbNumero, lbNome, lbMorada, lbTelemovel;
	private JTextField txNumero, txNome, txMorada, txTelemovel;
	private JRadioButton corrente, prazo, femenino, masculino;
	private JTextArea txa;
	private ButtonGroup g1, g2;
	private JPanel p1, p2, p3, p4, p5, p6, p7, p8, p9,a,b,c,d,e,f;
	
	
	public Tela1() {
		
		this.setTitle("Registro de Clientes");
		this.setSize(400, 450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btNovo = new JButton("Novo");
		btNovo.addActionListener(this);
		btGravar = new JButton("Gravar");
		btGravar.addActionListener(this);
		btRemover = new JButton("Remover");
		btRemover.addActionListener(this);
		btActualizar = new JButton("Actualizar");
		btActualizar.addActionListener(this);
		btEstatistica = new JButton("Estatistica");
		btEstatistica.addActionListener(this);
		
		lbNumero = new JLabel("Numero da Conta ");
		lbNome = new JLabel("Nome ");
		lbMorada = new JLabel("Morada ");
		lbTelemovel = new JLabel("Telemovel ");
		
		txNumero = new JTextField(10);
		txNumero.setEditable(false);
		txNome = new JTextField(20);
		txMorada = new JTextField(20);
		txTelemovel = new JTextField(20);
		
		txa = new JTextArea(20,50);
		
		g1 = new ButtonGroup();
		g2 = new ButtonGroup();

		corrente = new JRadioButton("corrente");
		corrente.setSelected(true);
		prazo = new JRadioButton("prazo");
		g1.add(corrente);
		g1.add(prazo);
		
		femenino = new JRadioButton("Femenino");
		femenino.setSelected(true);
		masculino = new JRadioButton("Masculino");		
		g2.add(femenino);
		g2.add(masculino);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		p8 = new JPanel();
		p9 = new JPanel();
		a = new JPanel();
		b = new JPanel();
		
		this.setLayout(new GridLayout(2,1));
		
		p1.setLayout(new BorderLayout());
		
		p9.setLayout(new GridLayout(5,1));
		p9.setBorder(new TitledBorder("Opcoes"));
		p9.add(btNovo);
		p9.add(btGravar);
		p9.add(btRemover);
		p9.add(btActualizar);
		p9.add(btActualizar);
		p9.add(btEstatistica);
		p1.add(BorderLayout.EAST,p9);
		
		p2.setLayout(new GridLayout(2,1));
		
		p3.setLayout(new GridLayout(4,1));
		p5.setLayout(new FlowLayout(FlowLayout.LEFT));
		p5.add(lbNumero);
		p5.add(txNumero);
		p3.add(p5);
		
		p6.setLayout(new FlowLayout(FlowLayout.LEFT));
		p6.add(lbNome);
		p6.add(txNome);
		p3.add(p6);
		
		p7.setLayout(new FlowLayout(FlowLayout.LEFT));
		p7.add(lbMorada);
		p7.add(txMorada);
		p3.add(p7);
		
		p8.setLayout(new FlowLayout(FlowLayout.LEFT));
		p8.add(lbTelemovel);
		p8.add(txTelemovel);
		p3.add(p8);
		
		p4.setLayout(new GridLayout(1,2));
		a.setLayout(new GridLayout(2,1));
		a.setBorder(new TitledBorder("Tipo de Conta"));
		a.add(corrente);
		a.add(prazo);
		p4.add(a);
		
		b.setLayout(new GridLayout(2,1));
		b.setBorder(new TitledBorder("Genero"));
		b.add(femenino);
		b.add(masculino);
		p4.add(b);
			
		
		p2.add(p3);
		p2.add(p4);
		
		p1.add(BorderLayout.CENTER,p2);
		
		this.add(p1);
		this.add(txa);
		
		
		this.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btNovo) {
			
		}
		
		
	}
	
}
