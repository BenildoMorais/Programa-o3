package Ex1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Tela_1 implements ActionListener {
	private JFrame frame;
	private JButton btBotton1, btBotton2, btBotton3;
	private JRadioButton rbFlow, rbGrid1, rbGrid2;
	private JLabel lbSelecione, lbBotoes;
	private JPanel panelCima, panelCimaCenter, panelBaixo, panelBaixoCenter;
	private ButtonGroup bgRadio;
	private ImageIcon imgF, imgG1, imgG2, imgFrame;
	
	public Tela_1() {
		//Frame
		imgFrame = new ImageIcon("D:\\Files\\School\\ISUTC\\2 ANO\\II Semestre\\Programação III\\FrameIcon.PNG");
		frame = new JFrame();
		frame.setIconImage(imgFrame.getImage());
		frame.setTitle("Gerenciadores de Layout");
		frame.setSize(300,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(new GridLayout(2,1));
		
		//Image
		/*imgF = new ImageIcon("D:\\Files\\School\\ISUTC\\2 ANO\\II Semestre\\Programação III\\BtFlow.PNG");
		imgG1 = new ImageIcon("D:\\Files\\School\\ISUTC\\2 ANO\\II Semestre\\Programação III\\BtGrid1.PNG");
		imgG2 = new ImageIcon("D:\\Files\\School\\ISUTC\\2 ANO\\II Semestre\\Programação III\\BtGrid2.PNG");*/
		
		//Label
		lbSelecione = new JLabel("Selecione o Layout");
		lbBotoes = new JLabel("Botoes");
		
		//Botoes
		btBotton1 = new JButton("Botton 1",imgF);
		btBotton2 = new JButton("Botton 2",imgG1);
		btBotton3 = new JButton("Botton 3",imgG2);
		
		//RadioButton
		rbFlow = new JRadioButton("FlowLayout");
		rbFlow.setSelected(true);
		rbFlow.setMnemonic(KeyEvent.VK_F);
		rbFlow.setToolTipText("Ao clicar sobre o componente os botoes estarao dispostos sob forma de um FlowLayout centralizado");
		
		rbGrid1 = new JRadioButton("GridLayout 1");
		rbGrid1.setMnemonic(KeyEvent.VK_G);
		rbGrid1.setToolTipText("Ao clicar sobre o componente os botoes estarao dispostos sob forma de um GridLayout 2x2");
		
		rbGrid2 = new JRadioButton("GridLayout 2");
		rbGrid2.setMnemonic(KeyEvent.VK_I);
		rbGrid2.setToolTipText("Ao clicar sobre o componente os botoes estao dispostos sob forma de GridLayout 3x1");
		
		bgRadio = new ButtonGroup();
		bgRadio.add(rbFlow);
		bgRadio.add(rbGrid1);
		bgRadio.add(rbGrid2);
	
		
		// Panel
		panelCima = new JPanel();
		panelCima.setLayout(new BorderLayout());
		
		panelCimaCenter = new JPanel();
		panelCimaCenter.setLayout(new GridLayout(3,1));
		panelCimaCenter.add(rbFlow);
		panelCimaCenter.add(rbGrid1);
		panelCimaCenter.add(rbGrid2);
		
		panelCima.add("North",lbSelecione);
		panelCima.add("Center",panelCimaCenter);
		
		panelBaixo = new JPanel();
		panelBaixo.setLayout(new BorderLayout());
		panelBaixoCenter = new JPanel();
		panelBaixoCenter.setLayout(new FlowLayout(FlowLayout.CENTER));
		panelBaixoCenter.add(btBotton1);
		panelBaixoCenter.add(btBotton2);
		panelBaixoCenter.add(btBotton3);
		
		panelBaixo.add("North", lbBotoes);
		panelBaixo.add("Center", panelBaixoCenter);
		
		frame.add(panelCima);
		frame.add(panelBaixo);
		rbFlow.addActionListener(this);
		rbGrid1.addActionListener(this);
		rbGrid2.addActionListener(this);
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == rbFlow ) {
			panelBaixoCenter.setLayout(new FlowLayout(FlowLayout.CENTER));
			panelBaixoCenter.updateUI();
		}
		if(e.getSource() == rbGrid1) {
			panelBaixoCenter.setLayout(new GridLayout(2,2));
			panelBaixoCenter.updateUI();
		}
		if(e.getSource() == rbGrid2) {
			panelBaixoCenter.setLayout(new GridLayout(3,1));
			panelBaixoCenter.updateUI();
		}
		
		
	}
	
}
