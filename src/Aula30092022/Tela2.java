package Aula30092022;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class Tela2 extends JFrame implements ActionListener{
	
	private JMenu ficheiro, editar, proucurar, ajuda;
	private JMenuItem abrir, fechar, gravar, gravarT, sair, copiar, colar, cortar;
	private JCheckBoxMenuItem abrirTela;
	private JRadioButtonMenuItem corporativa, avancada;
	private ButtonGroup bg;
	private JMenuBar barra;
	private JButton in, pe, ad;
	
	public Tela2() {
		
		this.setSize(400, 100);
		this.setTitle("Tela2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new FlowLayout());
		
		in = new JButton("Introduzir");
		in.setVisible(false);
		pe = new JButton("Pesquisar");
		pe.setVisible(false);
		ad = new JButton("Administracao");
		ad.setVisible(false);
		
		ficheiro = new JMenu("Ficheiro");
		editar = new JMenu("editar");
		proucurar = new JMenu("proucurar");
		ajuda = new JMenu("ajuda");
		barra = new JMenuBar();
		abrir = new JMenuItem("abrir");
		fechar = new JMenuItem("fechar");
		gravar = new JMenuItem("gravar");
		gravarT = new JMenuItem("gravarT");
		sair = new JMenuItem("sair");
		sair.addActionListener(this);
		copiar = new JMenuItem("copiar");
		colar = new JMenuItem("colar");
		cortar = new JMenuItem("cortar");
		
		abrirTela = new JCheckBoxMenuItem("AbrirTela");
		abrirTela.addActionListener(this);
		
		bg = new ButtonGroup ();
		corporativa = new JRadioButtonMenuItem ("Corporativa");
		corporativa.addActionListener(this);
		corporativa.setSelected(true);
		avancada = new JRadioButtonMenuItem("Avancada");
		avancada.addActionListener(this);
		bg.add(corporativa);
		bg.add(avancada);
		
		ficheiro.add(abrir);
		ficheiro.addSeparator();
		ficheiro.add(fechar);
		ficheiro.add(gravar);
		ficheiro.add(gravarT);
		ficheiro.addSeparator();
		ficheiro.add(sair);
		
		editar.add(copiar);
		editar.addSeparator();
		editar.add(colar);
		editar.addSeparator();
		editar.add(cortar);
		
		proucurar.add(abrirTela);
		
		ajuda.add(corporativa);
		ajuda.add(avancada);
		
		barra.add(ficheiro);
		barra.add(editar);
		barra.add(proucurar);
		barra.add(ajuda);
		this.setJMenuBar(barra);
		
		this.add(in);
		this.add(pe);
		this.add(ad);
		
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == abrirTela) {
			new Tela1();
		}
		if(e.getSource() == corporativa) {
			in.setVisible(true);
			pe.setVisible(true);
			ad.setVisible(false);
		}
		if(e.getSource() == avancada) {
			ad.setVisible(true);
			in.setVisible(true);
			pe.setVisible(true);
			
		}
		if(e.getSource() == sair) {
			System.exit(EXIT_ON_CLOSE);
		}
		
	}

}
