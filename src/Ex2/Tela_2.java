package Ex2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Tela_2 implements ActionListener {
	private JFrame frame;
	private JLabel lbValCarNovo, lbValCarUsado, lbValPagar, lbParcelas, lbValorParcelas;
	private JButton btCalcular, btNovoCal, btFechar;
	private JRadioButton rbParcelaUnica, rb12x, rb24x;
	private JTextField txtValCarNovo, txtValCarUsado, txtValPagar,txtValParcela;
	private JPanel panelNorthG, panelNorthBHelp ,panelNorthF, panelSouthB, panelSouthG, panelSouthF,panelSouthGHelp;
	private ButtonGroup bgParcelas;
	
	public Tela_2() {
		frame = new JFrame();
		frame.setTitle("Calculo de Parcelas");
		frame.setSize(550,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout());
		
		//Label
		lbValCarNovo = new JLabel("       Valor do Carro Novo...........: ");
		lbValCarUsado = new JLabel("       Valor do Carro Usado........: ");
		lbValPagar = new JLabel("       Valor a pagar.......................: ");
		lbParcelas = new JLabel("Parcelas");
		lbValorParcelas = new JLabel("Valor da Parcela:");
		
		//Button
		btCalcular = new JButton("Calcular");
		btNovoCal = new JButton("Novo Calculo");
		btFechar = new JButton("Fechar");
		
		//RadioButton
		rbParcelaUnica = new JRadioButton("Parcela Unica");
		rbParcelaUnica.setSelected(true);
		rb12x = new JRadioButton("12 x");
		rb24x = new JRadioButton("24 x");
		
		
		
		//TExtField
		txtValCarNovo = new JTextField(15);
		txtValCarNovo.setText("0.00");
		txtValCarUsado = new JTextField(15);
		txtValCarUsado.setText("0.00");
		txtValPagar = new JTextField(15);
		txtValPagar.setText("0.00");
		txtValParcela = new JTextField(20);
		txtValParcela.setEnabled(false);
		
		
		//Button Group
		bgParcelas = new ButtonGroup();
		bgParcelas.add(rbParcelaUnica);
		bgParcelas.add(rb12x);
		bgParcelas.add(rb24x);
		
		//Panel Norte
		panelNorthG = new JPanel();
		panelNorthG.setLayout(new GridLayout(4,3));
		panelNorthG.add(lbValCarNovo);
		panelNorthG.add(txtValCarNovo);
		panelNorthG.add(new JPanel());
		panelNorthG.add(lbValCarUsado);
		panelNorthG.add(txtValCarUsado);
		panelNorthG.add(new JPanel());
		panelNorthG.add(lbValPagar);
		panelNorthG.add(txtValPagar);
		panelNorthG.add(new JPanel());
		
		panelNorthF = new JPanel();
		panelNorthF.setLayout(new FlowLayout());
		panelNorthF.add(btCalcular);
		panelNorthF.add(btNovoCal);
		panelNorthF.add(btFechar);
		panelNorthG.add(panelNorthF);
		
		panelSouthB = new JPanel();
		panelSouthB.setLayout(new BorderLayout());
		
		panelSouthB.add("North",lbParcelas);
		
		panelSouthG = new JPanel();
		panelSouthG.setLayout(new GridLayout(3,1));
		panelSouthG.add(rbParcelaUnica);
		panelSouthG.add(rb12x);
		panelSouthG.add(rb24x);
		panelSouthB.add("West",panelSouthG);
		
		panelSouthGHelp = new JPanel();
		panelSouthGHelp.setLayout(new GridLayout(3,1));
		panelSouthGHelp.add(lbValorParcelas);
		panelSouthGHelp.add(txtValParcela);
		panelSouthGHelp.add(new JLabel());
		
		panelSouthB.add("East",panelSouthGHelp);
		
		
		frame.add("North",panelNorthG);
		frame.add("Center",panelNorthF);
		frame.add("South",panelSouthB);
		btCalcular.addActionListener(this);
		btNovoCal.addActionListener(this);
		btFechar.addActionListener(this);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(btCalcular == e.getSource()) {
			try {
				double nr1 = Double.parseDouble(txtValCarNovo.getText());
				double nr2 = 0;
				if(txtValCarUsado.getText() != null) {
					nr2 = Double.parseDouble(txtValCarUsado.getText());
				}
				double res = nr1 + nr2;
				txtValPagar.setText(String.valueOf(res));
				
				if(rbParcelaUnica.isSelected()) {
					res = res + res*0.03;
				}
				if(rb12x.isSelected()) {
					res = res + res*0.15;
				}
				if(rb24x.isSelected()) {
					res = res + res*0.25;
				}
				txtValParcela.setText(String.valueOf(res));
				
			}catch(NumberFormatException ex) {
				//txtResultado.setText("");
				JOptionPane.showMessageDialog(null, ex.getMessage()+"\nPor favor, Verifique os valores.");
			}
	
		}
		if(btNovoCal == e.getSource()) {
			txtValCarNovo.setText("");
			txtValCarUsado.setText("");
			txtValPagar.setText("");
			txtValParcela.setText("");
		}
		if(btFechar == e.getSource()) {
			
			
		}
		
		
		
	}
	
	
}
