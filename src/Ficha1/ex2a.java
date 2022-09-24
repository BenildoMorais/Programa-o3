package Ficha1;

import java.util.Iterator;
import java.util.Scanner;

public class ex2a {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		veiculo[] v1 = new veiculo[5];
		
		try {
			for (int i = 0; i < v1.length; i++) {
				v1[i] = new aviao("boeng","branco");
				if(i == 4) {
					v1[4] = (carro)v1[3];
				}
			}
		}
		catch(ClassCastException e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
