package refazendoAula05092022;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela1a {
	private JFrame fr;
	private ImageIcon img;
	private JLabel lb;
	
	public Tela1a () {
		fr = new JFrame();
		fr.setSize(450, 450);
		fr.setTitle("Tela Com Imagem");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		
		fr.setLayout(new FlowLayout());
		img = new ImageIcon ("C:\\Users\\CFPE4\\Pictures\\251966_original_4320x7680.jpg");
		lb = new JLabel (img);
		fr.add(lb);
		
		fr.setVisible(true);
		
	}
}
