package com.globallogic.app;

public class ExcepcionArray {

	int[] array = { 0, 1, 2, 3, 4, 5 };

	int getValor(int indice) {
		return array[indice];
	}

	public static void main(String[] args) {
		ExcepcionArray ea = new ExcepcionArray();
		try {
			ea.getValor(6);
			System.out.println("valor " + ea.getValor(5));
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Excepción: indice de array fuera de limites" + e.getMessage());
		}

	}

}
