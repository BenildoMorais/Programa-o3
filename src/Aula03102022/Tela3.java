package Aula03102022;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela3 extends JFrame implements ActionListener{
	
	private JLabel nr, referencia, descricao, custo, lucro, venda;
	private JTextField txnr, txreferencia, txdescricao, txcusto, txlucro, txvenda; 
	private JButton gravar, novo;

	public Tela3() {
		instanciar();
		propriedades();
		add();
		this.setVisible(true);
		
	}
	
	
	private void add() {
		this.add(nr);
		this.add(txnr);
		this.add(referencia);
		this.add(txreferencia);
		this.add(descricao);
		this.add(txdescricao);
		this.add(lucro);
		this.add(txlucro);
		this.add(venda);
		this.add(txvenda);
		this.add(gravar);
		this.add(novo);
		
	}


	private void propriedades() {
		this.setLayout(new GridLayout(6,2,10,10));
		this.setTitle("Registro de Producto");
		this.setSize(300,450);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}


	private void instanciar() {

		nr = new JLabel ("Numero: ");
		txnr = new JTextField(20);
		
		referencia = new JLabel ("Referencia: ");
		txreferencia = new JTextField(20);
		
		descricao = new JLabel ("Descricao: ");
		txdescricao = new JTextField(20);
		
		custo = new JLabel ("Preco Custo: ");
		txcusto = new JTextField(20);
		
		lucro = new JLabel ("Margem Lucro: ");
		txlucro = new JTextField(20);
		
		venda = new JLabel ("Preco Venda: ");
		txvenda = new JTextField(20);
		
		gravar = new JButton("Gravar");
		novo = new JButton("Novo");
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
