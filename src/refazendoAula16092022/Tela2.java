package refazendoAula16092022;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Tela2 implements ActionListener{
	
	private JFrame fr;
	private JLabel lb;
	private Font f;
	private JCheckBox p1, p2, p3, p4, p5;

	public Tela2() {
		fr = new JFrame();
		fr.setSize(350,350);
		fr.setTitle("Teste de Atalhos");
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lb = new JLabel("Pratos Favoritos");
		lb.setForeground(Color.blue);
		f = new Font("Arial",Font.BOLD,20);
		lb.setFont(f);
		
		p1 = new JCheckBox("Feijao");
		p1.addActionListener(this);
		p1.setMnemonic(KeyEvent.VK_1 );
		
		p2 = new JCheckBox("Frango");
		p2.addActionListener(this);
		p2.setMnemonic(KeyEvent.VK_2 );
		
		p3 = new JCheckBox("Peixe");
		p3.addActionListener(this);
		p3.setMnemonic(KeyEvent.VK_3 );
		
		p4 = new JCheckBox("Camarao");
		p4.addActionListener(this);
		p4.setMnemonic(KeyEvent.VK_4 );
		
		p5 = new JCheckBox("Hamburguer");
		p5.addActionListener(this);
		p5.setMnemonic(KeyEvent.VK_5 );
		
		fr.setLayout(new FlowLayout());
		fr.add(lb);
		fr.add(p1);
		fr.add(p2);
		fr.add(p3);
		fr.add(p4);
		fr.add(p5);
		
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == p1) {
			if(p1.isSelected()) {
				JOptionPane.showMessageDialog(null, p1.getText());
			}
		}
		
		if(e.getSource() == p2) {
			if(p2.isSelected()) {
				JOptionPane.showMessageDialog(null, p2.getText());
			}
		}
		
		if(e.getSource() == p3) {
			if(p3.isSelected()) {
				JOptionPane.showMessageDialog(null, p3.getText());
			}
		}
		
		if(e.getSource() == p4) {
			if(p4.isSelected()) {
				JOptionPane.showMessageDialog(null, p4.getText());
			}
		}
		
		if(e.getSource() == p5) {
			if(p5.isSelected()) {
				JOptionPane.showMessageDialog(null, p5.getText());
			}
		}
	}
}
