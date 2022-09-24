package Aula19092022;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import Aula16092022.Tela2;

public class Tela3 implements ActionListener{
	
	private JFrame fr;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6;
	
	public Tela3() {
		
		fr = new JFrame();
		fr.setSize(400, 400);
		fr.setTitle("Teste de Atalhos");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img0 = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\Options.png");
		ImageIcon img = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\imagem.jpg");
		ImageIcon img1 = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\3D-Developer.jpg");
		ImageIcon img2 = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\Options.jpg");
		ImageIcon img3 = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\Options.jpg");
		
		fr.setIconImage(img0.getImage());
		
		bt1 = new JButton("Botao1",img);
		bt2 = new JButton("Botao2",img1);
		bt3 = new JButton("Botao3",img2);
		bt4 = new JButton("Botao4",img3);
		bt5 = new JButton("Botao5");
		bt6 = new JButton("Botao6");
		
		fr.setLayout(new GridLayout(3,2,8,8));
		fr.add(bt1);
		bt1.setToolTipText("botao para estudar");
		
		fr.add(bt2);
		bt2.setToolTipText("Botao para chamar tela de prato preferido");
		bt2.addActionListener(this);
		
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		fr.add(bt6);
		
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt2) {
			new Tela2();
		}
		
	}

}
