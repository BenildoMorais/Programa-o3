package refazendoAula16092022;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tela1 implements ActionListener{
	
	private JFrame fr;
	private JLabel tx1,tx2, tr;
	private JTextField nr1, nr2, rs;
	private JButton bt;
	
	public Tela1() {
		fr = new JFrame();
		fr.setSize(350, 350);
		fr.setTitle("Calculadora");
		fr.setLocationRelativeTo(null);

		tx1 = new JLabel("Numero1: ");
		tx2 = new JLabel("Numero2: ");
		tr = new JLabel("Resultado: ");
		
		nr1 = new JTextField(20);
		nr2 = new JTextField(20);
		rs = new JTextField(20);
		
		bt = new JButton("Somar");
		bt.addActionListener(this);
		
		fr.setLayout(new GridLayout(4,2));
		fr.add(tx1);
		fr.add(nr1);
		fr.add(tx2);
		fr.add(nr2);
		fr.add(bt);
		fr.add(new JPanel());
		fr.add(tr);
		fr.add(rs);
		
		fr.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt) {
			Double resultado = Double.parseDouble(nr1.getText()) + Double.parseDouble(nr2.getText());
			String resultado1 = String.valueOf(resultado);
			rs.setText(resultado1);
		}
		
	}

}
