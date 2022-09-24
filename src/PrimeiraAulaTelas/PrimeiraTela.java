package PrimeiraAulaTelas;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrimeiraTela {

	private JFrame fr;
	private JButton bt;
	private JLabel txNome;
	
	public PrimeiraTela() {
		fr = new JFrame();
		fr.setSize(450,150);
		fr.setTitle("Primeira tela");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		
		bt = new JButton("Gravar");
		txNome = new JLabel("Nome");
		fr.setLayout(new FlowLayout());
		
		fr.add(bt);
		fr.add(txNome);
		
		
		fr.setVisible(true);//deve ser sempre o ultimo para poder inicializar a tela antes dela ser mostrada
		}
}
