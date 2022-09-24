package Ficha1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int result = 0;
		int numb2=0;
		
		System.out.print("Insira um numero: ");
		int numb1 = input.nextInt();
		
		try {
		System.out.print("Insira outro numero: ");
		numb2 = input.nextInt();
		} 
		catch(InputMismatchException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		try {
			result = numb1/numb2;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}



}
