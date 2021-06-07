package com.globallogic.app;

public class GeneraExcepcion {

	public static void main(String[] args) {
		try {
			throw new Exception("Esto es una Excepcion");
		} catch (Exception e) {
			System.out.println("Se produjo un excepcion: " + e.getMessage());
		} finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}

	}

}
