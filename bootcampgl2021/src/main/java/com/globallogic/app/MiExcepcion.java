package com.globallogic.app;

public class MiExcepcion {

	public static void main(String[] args) {
		Electrodomestico mE1 = null;
		
		try {
			mE1.getPeso();
		} catch (Exception e) {
			System.out.println("Se produjo una expcion. " + e.getMessage());
		}
		
	}

}
