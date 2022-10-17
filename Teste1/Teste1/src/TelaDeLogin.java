//Benildo Renaldo Morais Augusto

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TelaDeLogin extends JFrame implements ActionListener{

	private JLabel username, pass;
	private JPasswordField pass1;
	private JTextField username1;
	private JButton entrar, cancelar;
	private String pass0 = "1234";
	private String username0 = "admin";
	private ImageIcon img;
	
	public TelaDeLogin() {
		this.setTitle("Pagina de Login");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		img = new ImageIcon("C:\\Users\\CFPE4\\Pictures\\3D-Developer.jpg");
		
		username = new JLabel("Username: ");
		pass = new JLabel("Password: ");
		pass1 = new JPasswordField(20);
		username1 = new JTextField(20);
		
		entrar = new JButton("Entrar",img);
		entrar.addActionListener(this);
		cancelar = new JButton("Cancelar",img);
		cancelar.addActionListener(this);
		
		
		this.setLayout(new GridLayout(3,2));
		this.add(username);
		this.add(username1);
		this.add(pass);
		this.add(pass1);
		this.add(entrar);
		this.add(cancelar);
		
		
		
		this.setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == entrar ) {
			if(username1.getText().equals(username0) && pass1.getText().equals(pass0)) {
			new Tela1();
			}else {
				JOptionPane.showInternalMessageDialog(null, "Dados invalidos");
			}
		}
		if(e.getSource() == cancelar) {
			System.exit(0);
		}
		
		
	}
	
	

}
