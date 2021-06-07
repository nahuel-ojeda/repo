package com.globallogic.app;

import java.util.Scanner;

public class ControlFlujoIf {

	public static void main(String[] args) {

		int tres = 3;
		int diez = 10;

		int resultado = tres + diez;
		System.out.println(resultado);

		if (resultado <= 10) {
			System.out.println("La suma de los numeros es: " + resultado);
		} else {
			System.out.println("La suma de los numeros es Mayor a 10");
		}

		Scanner ingresar = new Scanner(System.in);
		System.out.print("Dado los siguientes valores de entrada “A” y “b”: ");

		String letra = ingresar.nextLine();

		String A = "A";
		String b = "b";

		if (letra.equals(b)) {
			System.out.println("No es una letra mayuscula");
		} else {
			System.out.println("Es una letra mayuscula");
		}
		
		int compra = 400;
		
		int igual300 = 300;
		int mayor350 = 350;
		float porcentaje;
		
		if (compra >= mayor350) {
			//porcentaje = (float) (compra*0.20);
			System.out.print("El descuento es de: $");
			System.out.println(porcentaje = (float) (compra*0.20));
		} else {
			System.out.println("Sin descuentos, el total es" + compra);
		}

	}

}
