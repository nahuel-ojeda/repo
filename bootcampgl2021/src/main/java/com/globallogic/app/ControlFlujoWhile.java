package com.globallogic.app;

public class ControlFlujoWhile {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println("Valor iterado: " + i);
			i++;
		}

		System.out.println();
		
		int x = 1;
		while (x <= 50) {
			if (x % 2 == 0) {
				System.out.println("Valor iterado " + x + " par");
				x++;
			} else {
				System.out.println("Valor iterado " + x + " impar");
				x++;
			}
		}

	}

}
