package com.cip.prog2;

import java.util.Scanner;

public class TareasEntregar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println(" Por favor, introduzca los �C: ");
		
		double grados = sc.nextDouble();
		
	    double F� = (grados * (9)/5) + 32;
		
		System.out.println("Son " + F� + " F�");
		
		sc.close();

	}

}
