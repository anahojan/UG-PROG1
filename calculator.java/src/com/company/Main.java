package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner vhod = new Scanner(System.in);
		for (int i = 1; i > 0 ; i++); {
			System.out.println("Vnesite prvo število");
			double a = vhod.nextDouble();
			System.out.println("Vnesite drugo številko");
			double b = vhod.nextDouble();
			System.out.println("Izberite operator (+,-,/,*):");
			String operator = vhod.next();

			if (operator.equals("+")) {
				System.out.println(a + b);
			}
			if (operator.equals("*")) {
				System.out.println(a * b);
			}
			if (operator.equals("/")) {
				System.out.println(a / b);
			}
			if (operator.equals("-")) {
				System.out.println(a - b);
			}
		}

	}
}

