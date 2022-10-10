package refazendoAula03102022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class Tela1 extends JFrame implements ActionListener {
	
	private JMenu sistema, subMenu;
	private JMenuItem txt, sair, a,b,c;
	private JCheckBoxMenuItem data, tipo;
	private JRadioButtonMenuItem rd1, rd2;
	private JMenuBar barra;
	private ButtonGroup g1;

	public Tela1() {
		this.setTitle("Tela com Menu");
		this.setSize(400, 100);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		txt = new JMenuItem("Texto");
		sair = new JMenuItem("Sair");
		sair.addActionListener(this);
		a = new JMenuItem("A");
		b = new JMenuItem("B");
		c = new JMenuItem("C");
		
		data = new JCheckBoxMenuItem("Data");
		tipo = new JCheckBoxMenuItem("Tipo");
		
		g1 = new ButtonGroup();
		rd1 = new JRadioButtonMenuItem("Converter");
		rd1.setSelected(true);
		rd2 = new JRadioButtonMenuItem("Compilador");
		g1.add(rd1);
		g1.add(rd2);
		
		sistema = new JMenu("Sistema");
		subMenu = new JMenu("Sub menu");
		
		barra = new JMenuBar();
		
		subMenu.add(a);
		subMenu.add(b);
		subMenu.add(c);
		
		sistema.add(txt);
		sistema.addSeparator();
		sistema.add(data);
		sistema.add(tipo);
		sistema.addSeparator();
		sistema.add(rd1);
		sistema.add(rd2);
		sistema.addSeparator();
		sistema.add(subMenu);
		sistema.addSeparator();
		sistema.add(sair);
		
		barra.add(sistema);
		
		this.setJMenuBar(barra);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sair) {
			System.exit(0);
		}
		
	}

}
