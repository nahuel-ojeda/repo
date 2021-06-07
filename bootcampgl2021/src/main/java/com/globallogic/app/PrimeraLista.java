package com.globallogic.app;

public class PrimeraLista {

	public static void main(String[] args) {

		String[] letters = { "A", "B", "C" };
		for (String i : letters) {
			System.out.println(i);
		}
		System.out.println("Cantidad de elementos en la lista: " + letters.length);
		letters[0] = "X";
		for (String i : letters) {
			System.out.println(i);
		}
	}
}
