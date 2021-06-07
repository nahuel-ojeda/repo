package com.globallogic.app;

public class ControlFlujoFor {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println("Valor iterado:" + i);
		}
		System.out.println();

		for (int x = 0; x < 10000; x++) {
			if (x % 20 == 0) {
				// System.out.println(x);
			}
		}
		System.out.println();

		String diasSemana[] = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
		for (int i = 0; i < diasSemana.length; i++) {
			System.out.println("Dia de la semana: " + diasSemana[i]);
		}
	}
}
