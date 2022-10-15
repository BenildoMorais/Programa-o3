package Aula10102022;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Tela1 extends JFrame implements MouseListener {
	
	private JLabel lbnome;
	private JTextField nome1;
	private JButton submeter;
	
	public Tela1() {
		this.setTitle("MouseListener");
		this.setSize(400,100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		lbnome = new JLabel("Nome: ");
		lbnome.addMouseListener(this);
		nome1 = new JTextField(20);
		nome1.addMouseListener(this);
		submeter = new JButton("Submeter");
		submeter.addMouseListener(this);
		
		this.setLayout(new FlowLayout());
		this.add(lbnome);
		this.add(nome1);
		this.add(submeter);
		
		
		
		
		this.setVisible(true);
		
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == submeter) {
			JOptionPane.showMessageDialog(null,"Click do Mouse");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	/*	if(e.getSource() == nome1) {
			JOptionPane.showMessageDialog(null,"press do Mouse");
		}*/
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		if(e.getSource() == lbnome) {
//			JOptionPane.showMessageDialog(null,"Realsed do Mouse");
//		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == nome1) {
			JOptionPane.showMessageDialog(null,"Mouse passou dali entao agora teremos mais uma label");
			this.add(new JLabel("Hahahahahahahahahahahaahahahahahaah"));
			
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == lbnome) {
			JOptionPane.showMessageDialog(null,"Método mouseExited");
		}
		
	}

}
