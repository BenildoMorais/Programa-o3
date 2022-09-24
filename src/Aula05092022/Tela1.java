package Aula05092022;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela1 {
	private JFrame fr;
	private ImageIcon img;
	private JLabel lb;
	
	public Tela1(){
		fr = new JFrame();
		fr.setSize(450,750);
		fr.setTitle("Tela 1");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);
		
		fr.setLayout(new FlowLayout());
		img = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\ImagensTeste.jpg");
		lb = new JLabel(img);
		fr.add(lb);
		
		fr.setVisible(true);
	}

}
