package Aula03102022;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Tela1 extends JFrame implements ActionListener{
	
	private JLabel lbLogin, lbUser, lbSenha;
	private JTextField txt;
	private JPasswordField pass;
	private JButton btSubmeter, btLimpar;
	private static String username = "Admin";
	private static String password = "1234";
	
	public Tela1() {
		instanciar();
		propriedades();
		addComponts();
		
		this.setVisible(true);
		
	}

	private void addComponts() {
		this.add(lbLogin);
		this.add(new JLabel());
		this.add(lbUser);
		this.add(txt);
		this.add(lbSenha);
		this.add(pass);
		this.add(btSubmeter);
		this.add(btLimpar);
	}

	private void propriedades() {
		this.setTitle("Tela de Login");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(400,300);
		this.setResizable(false);
		this.setLayout(new GridLayout(4,2,10,10));
	}

	private void instanciar() {
		lbUser = new JLabel("Username: ",JLabel.RIGHT);
		lbSenha = new JLabel("Password: ",JLabel.RIGHT);
		lbLogin = new JLabel("Tela de Login");
		lbLogin.setFont(new Font("Arial",Font.BOLD, 20));
		txt = new JTextField(20);
		pass = new JPasswordField();
		btSubmeter = new JButton("Submeter");
		btSubmeter.addActionListener(this);
		btLimpar = new JButton("Limpar");
		btLimpar.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btLimpar) {
			txt.setText("");
			pass.setText("");
		}
		if (e.getSource() == btSubmeter) {
			if(txt.getText().equals(username) && pass.getText().equals(password)) {
				//JOptionPane.showMessageDialog(null, "Logado com Sucesso");
				new Tela2();
				this.dispose();
			}else {
				JOptionPane.showMessageDialog(null, "Estas a tentar a sorte nem?");
			}
		}
		
	}

}
