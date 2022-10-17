//Benildo Renaldo Morais Augusto

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Tela2 extends JFrame implements ActionListener {

	private JLabel novo, usado, pagar, valor, vparcela;
	private JButton calcular, ncalcular, fechar;
	private JRadioButton unica, doze, vinte;
	private JTextField novo1, usado1, pagar1, vparcela1;
	private ButtonGroup g1;
	private JPanel p1, p2, p3, p4, p5, p6, p7;
	private Double nr1, nr2, nr3, nr4, nr5;

	public Tela2() {
		this.setTitle("Calculo de Parcelas");
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();

		nr1 = 0.0;
		nr2 = 0.0;
		nr3 = 0.0;
		nr4 = 0.0;
		nr5 = 0.0;

		novo = new JLabel("Valor do carro Novo.....:");
		usado = new JLabel("Valor do Carro Usado...:");
		pagar = new JLabel("Valor a pagar...:");
		vparcela = new JLabel("Valor da Parcela:");

		novo1 = new JTextField(20);
		usado1 = new JTextField(20);
		pagar1 = new JTextField(20);
		pagar1.setEditable(false);
		vparcela1 = new JTextField(20);
		vparcela1.setEditable(false);

		calcular = new JButton("Calcular");
		calcular.addActionListener(this);
		ncalcular = new JButton("Novo Calculo");
		ncalcular.addActionListener(this);
		fechar = new JButton("Fechar");
		fechar.addActionListener(this);

		g1 = new ButtonGroup();
		unica = new JRadioButton("Parcela Unica");
		unica.setSelected(true);
		doze = new JRadioButton("12x");
		vinte = new JRadioButton("24x");
		g1.add(unica);
		g1.add(doze);
		g1.add(vinte);

		this.setLayout(new GridLayout(7, 1));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.add(novo);
		p1.add(novo1);
		this.add(p1);

		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2.add(usado);
		p2.add(usado1);
		this.add(p2);

		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		p3.add(pagar);
		p3.add(pagar1);
		this.add(p3);

		p4.setLayout(new FlowLayout(FlowLayout.LEFT));
		p4.add(calcular);
		p4.add(ncalcular);
		p4.add(fechar);
		this.add(p4);

		p5.setLayout(new FlowLayout(FlowLayout.LEFT));
		p5.add(unica);
		p5.add(new JLabel("          "));
		p5.add(vparcela);
		this.add(p5);

		p6.setLayout(new FlowLayout(FlowLayout.LEFT));
		p6.add(doze);
		p6.add(new JLabel("         "));
		p6.add(vparcela1);
		this.add(p6);

		p7.setLayout(new FlowLayout(FlowLayout.LEFT));
		p7.add(vinte);
		this.add(p7);

		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == fechar) {
			this.dispose();
		}
		if (e.getSource() == ncalcular) {
			novo1.setText("");
			usado1.setText("");
			pagar1.setText("");
			vparcela1.setText("");
		}
		if (e.getSource() == calcular) {
			if (doze.isSelected() && usado1.getText().equals("")) {
				nr1 = Double.valueOf(novo1.getText());
				nr5 = nr1 + ((nr1 * 15) / 100);
				pagar1.setText(String.valueOf(nr5));
				vparcela1.setText(String.valueOf(nr5 / 12));
			}
			if (vinte.isSelected() && usado1.getText().equals("")) {
				nr1 = Double.valueOf(novo1.getText());
				nr5 = nr1 + ((nr1 * 25) / 100);
				pagar1.setText(String.valueOf(nr5));
				vparcela1.setText(String.valueOf(nr5 / 24));
			}
			
			if(vinte.isSelected()) {
				nr1 = Double.valueOf(novo1.getText());
				nr2 = Double.valueOf(usado1.getText());
				nr5 = nr1-nr2+(((nr1-nr2)*25)/100);
				pagar1.setText(String.valueOf(nr5));
				vparcela1.setText(String.valueOf(nr5/24));
			}
			if(doze.isSelected()) {
				nr1 = Double.valueOf(novo1.getText());
				nr2 = Double.valueOf(usado1.getText());
				nr5 = nr1-nr2+(((nr1-nr2)*15)/100);
				pagar1.setText(String.valueOf(nr5));
				vparcela1.setText(String.valueOf(nr5/12));
			}

		}

	}

}
