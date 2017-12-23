package com.cip.prog2;

import java.util.Scanner;

public class TareasEntregar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println(" Por favor, introduzca los ºC: ");
		
		double grados = sc.nextDouble();
		
	    double Fº = (grados * (9)/5) + 32;
		
		System.out.println("Son " + Fº + " Fº");
		
		sc.close();

	}

}
