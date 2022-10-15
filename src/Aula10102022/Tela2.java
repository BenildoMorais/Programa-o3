package Aula10102022;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela2 extends JFrame implements ActionListener{
	
	private JButton botao;
	private JLabel lb;
	private JFileChooser f;
	private ImageIcon img;
	
	public Tela2() {
		this.setTitle("MouseListener");
		this.setSize(400,100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		img = new ImageIcon();
		f = new JFileChooser();
		botao = new JButton ("Lev Ficheiro");
		botao.addActionListener(this);
		
		this.add(botao);
		
		this.setVisible(true);
		
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botao) {
			f.showOpenDialog(this);
			f.getSelectedFile().getAbsolutePath();
			img = new ImageIcon((f.getSelectedFile().getAbsolutePath()).replaceAll("/", "//"));
			lb = new JLabel(img);
		}
		
		
	}

}
