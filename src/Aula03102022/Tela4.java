package Aula03102022;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListModel;

public class Tela4 extends JFrame implements ActionListener{
	
	private JList lista;
	private ArrayList productos;
	private String[] productos2;


	public Tela4(ArrayList lista1) {

		this.setSize(300,300);
		this.setTitle("Lista Dos productos");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		productos = lista1;
		productos2 = new String [lista1.size()];
		for (int i = 0 ; i < lista1.size() ; i++) {
			productos2[i] = productos.get(i).toString();
		}
		
		lista = new JList(productos2);
		this.add(lista);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
