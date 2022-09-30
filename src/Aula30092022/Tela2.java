package Aula30092022;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;

public class Tela2 extends JFrame{
	
	private JMenu ficheiro, editar, proucurar, ajuda;
	private JMenuItem abrir, fechar, gravar, gravarT, sair, copiar, colar, cortar;
	private JCheckBoxMenuItem abrirTela;
	private JRadioButtonMenuItem corporativa, avancada;
	private ButtonGroup bg;
	private JMenuBar barra;
	
	public Tela2() {
		
		this.setSize(300, 300);
		this.setTitle("Tela2");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
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
		copiar = new JMenuItem("copiar");
		colar = new JMenuItem("colar");
		cortar = new JMenuItem("cortar");
		
		abrirTela = new JCheckBoxMenuItem("AbrirTela");
		
		bg = new ButtonGroup ();
		corporativa = new JRadioButtonMenuItem ("Corporativa");
		corporativa.setSelected(true);
		avancada = new JRadioButtonMenuItem("Avancada");
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
		
		
		this.setVisible(true);
		
	}

}
