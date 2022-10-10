package TelaDeLogin;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame implements ActionListener{
	
	private JLabel intro, username, pass;   
	private JTextField username1;
	private JPasswordField pass1;
	private JButton submeter, limpar;
	
	public TelaLogin() {
		this.setTitle("Tela De Login");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setLayout(new GridLayout(4,2));
		
		intro = new JLabel("Bem vindo ao sistema");
		username = new JLabel("Username: ");
		pass = new JLabel("Passoword: ");
		
		username1 = new JTextField(20);
		pass1 = new JPasswordField(20);
		
		submeter = new JButton("Submeter");
		submeter.addActionListener(this);
		limpar = new JButton("Limpar");
		limpar.addActionListener(this);
		
		this.add(intro);
		this.add(new JLabel());
		this.add(username);
		this.add(username1);
		this.add(pass);
		this.add(pass1);
		this.add(submeter);
		this.add(limpar);
		
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == submeter) {
			if(username1.getText().equals("Benildo") && pass1.getText().equals("1234")) {
				JOptionPane.showInternalMessageDialog(null, "Sucesso");
			}
			
		}
		if(e.getSource() == limpar) {
			username1.setText("");
			pass1.setText("");
			
		}
		
	}

}
