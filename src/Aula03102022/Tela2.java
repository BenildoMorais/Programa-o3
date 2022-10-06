package Aula03102022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

public class Tela2 extends JFrame implements ActionListener {
	 private JMenu sistema;
	 private JMenuItem dt,reg,lista,sair;
	 private JMenuBar barra;
	 private JSeparator sep;
	 private Tela3 registro;
	 
	 Tela2(){
		 super("Tela Principal");
		 instanciar();
		 propriedades();
		 addc();
		 setVisible(true);		 
	 }

	private void addc() {
		
		sistema.add(dt);
		sistema.add(new JSeparator());
		sistema.add(reg);
		sistema.add(new JSeparator());
		sistema.add(lista);	
		sistema.add(new JSeparator());
		sistema.add(sair);
		barra.add(sistema);
		setJMenuBar(barra);
	}

	private void propriedades() {
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setExtendedState(MAXIMIZED_BOTH);
		
	}

	private void instanciar() {
		sistema= new JMenu("Sistema ");
		dt= new JMenuItem("Dados do Programador",'D');
		dt.addActionListener(this);
		reg= new JMenuItem("Registro de Produtos",'R');
		reg.addActionListener(this);
		lista= new JMenuItem("Lista de Produtos",'L');
		lista.addActionListener(this);
		sair= new JMenuItem("Sair",'S');
		sair.addActionListener(this);
		barra= new JMenuBar();
		sep= new JSeparator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sair) {
			System.exit(0);
		}
		if(e.getSource() == reg) {
			registro = new Tela3();
			
		}
		if(e.getSource() == dt) {
			JOptionPane.showMessageDialog(null, "Feito por Catia e Benildo\nDia 03 de Outubro");
		}
		if(e.getSource() == lista) {
			new Tela4(registro.getLista());
		}
		
		
		
	}
	 
	
}
