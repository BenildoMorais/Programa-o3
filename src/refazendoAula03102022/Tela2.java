package refazendoAula03102022;

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
import javax.swing.JRadioButtonMenuItem;

public class Tela2 extends JFrame implements ActionListener {

	private JMenuBar barra;
	private JMenu ficheiros, editar, proucurar, ajuda;
	private JMenuItem abrir, fechar, gravar, gravarT, sair, copiar, colar, cortar;
	private JCheckBoxMenuItem abrirTela;
	private JRadioButtonMenuItem corporativa, avancada;
	private ButtonGroup g1;
	private JButton introduzir, pesquisar, administracao;
	
	public Tela2() {
		
		this.setTitle("Menus");
		this.setSize(400,100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new FlowLayout());
		
		introduzir = new JButton("Introduzir");
		introduzir.setVisible(false);
		pesquisar = new JButton("Pesquisar");
		pesquisar.setVisible(false);
		administracao = new JButton("Administracao");
		administracao.setVisible(false);
		
		this.add(introduzir);
		this.add(pesquisar);
		this.add(administracao);
		
		abrir = new JMenuItem("Abrir");
		fechar = new JMenuItem("Fechar");
		gravar = new JMenuItem("Gravar");
		gravarT = new JMenuItem("Gravar tudo");
		sair = new JMenuItem("Sair");
		sair.addActionListener(this);
		
		copiar = new JMenuItem("Copiar");
		colar = new JMenuItem("Colar");
		cortar = new JMenuItem("Cortar");
		
		abrirTela = new JCheckBoxMenuItem("Abrir uma nova Tela");
		abrirTela.addActionListener(this);
		
		g1 = new ButtonGroup();
		corporativa = new JRadioButtonMenuItem("Corporativa");
		corporativa.setSelected(true);
		corporativa.addActionListener(this);
		avancada = new JRadioButtonMenuItem("Avancado");
		avancada.addActionListener(this);
		g1.add(corporativa);
		g1.add(avancada);
		
		ficheiros = new JMenu("Ficheiros");
		editar = new JMenu("Editar");
		proucurar = new JMenu("Proucurar");
		ajuda = new JMenu("Ajuda");
		
		ficheiros.add(abrir);
		ficheiros.addSeparator();
		ficheiros.add(fechar);
		ficheiros.add(gravar);
		ficheiros.add(gravarT);
		ficheiros.addSeparator();
		ficheiros.add(sair);
		
		editar.add(copiar);
		editar.addSeparator();
		editar.add(colar);
		editar.addSeparator();
		editar.add(cortar);
		
		proucurar.add(abrirTela);
		
		ajuda.add(corporativa);
		ajuda.add(avancada);
		
		barra = new JMenuBar();
		barra.add(ficheiros);
		barra.add(editar);
		barra.add(proucurar);
		barra.add(ajuda);
		
		this.setJMenuBar(barra);
		
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == sair) {
			System.exit(EXIT_ON_CLOSE);
		}
		if(e.getSource() == abrirTela) {
			new Tela1();
		}
		if (e.getSource() == corporativa) {
			introduzir.setVisible(true);
			pesquisar.setVisible(true);
			administracao.setVisible(false);
		}
		if (e.getSource() == avancada) {
			introduzir.setVisible(true);
			pesquisar.setVisible(true);
			administracao.setVisible(true);
		}
	}
	
	

}
