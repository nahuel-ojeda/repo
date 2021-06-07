package com.globallogic.app;

public class ControlFlujoForEach {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] num = numeros;
		for (int i : num) {
			System.out.println("Valor iterado:" + i);
		}

		System.out.println();

		String diasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

		for (String i : diasSemana) {
			System.out.println("Dia de la semana: " + i);
		}

		System.out.println();

		String myString = "Bootcamp 2021";
		char[] ch = new char[myString.length()];

		for (int i = 0; i < ch.length; i++) {
			ch[i] = myString.charAt(i);
		}

		for (char i : ch) {
			System.out.println("Letra: " + i);
		}
	}
}
