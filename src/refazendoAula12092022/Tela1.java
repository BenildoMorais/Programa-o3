package refazendoAula12092022;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela1 {
	
	private JFrame fr;
	private JButton bt1, bt2;
	private JTextField txt;

	public Tela1() {
		
		fr = new JFrame();
		fr.setSize(400, 100);
		fr.setTitle("Eventos Podr adicionar");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bt1 = new JButton("Submeter");
		bt2 = new JButton("Limpar");
		
		txt = new JTextField(20);
		
		fr.setLayout(new FlowLayout());
		fr.add(txt);
		fr.add(bt1);
		fr.add(bt2);
		
		fr.setVisible(true);
	}

}
