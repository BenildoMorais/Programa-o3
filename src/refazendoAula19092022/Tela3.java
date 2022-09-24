package refazendoAula19092022;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela3 {
	
	private JFrame fr;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6;
	
	public Tela3() {

		fr = new JFrame();
		
		ImageIcon img = new ImageIcon("C:\\Users\\CFPE4\\Desktop\\Icones Para Mt1\\Developer.png");
		ImageIcon img1 = new ImageIcon("C:\\Users\\CFPE4\\Desktop\\Icones Para Mt1\\games_2.png");
		ImageIcon img2 = new ImageIcon("C:\\Users\\CFPE4\\Desktop\\Icones Para Mt1\\ImageReady.png");

		bt1 = new JButton("Botao1", img);
		bt2 = new JButton("Botao2", img1);
		bt3 = new JButton("Botao3",img2);
		bt4 = new JButton("Botao4");
		bt5 = new JButton("Botao5");
		bt6 = new JButton("Botao6");
		
		
		fr.setSize(400,400);
		fr.setTitle("Teste de Imagens");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setIconImage(img1.getImage());
		
		fr.setLayout(new GridLayout(3,2));
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		fr.add(bt6);
		
		fr.setVisible(true);
	}

}
