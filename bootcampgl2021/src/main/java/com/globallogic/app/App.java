package com.globallogic.app;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		Electrodomestico electrodomestico = new Electrodomestico("LG", 80.0, 'A', "blanca");
		Heladera heladera = new Heladera("LG", 80.0, 'A', "Blanca", 400.5, true, 11.0);
		Televisor televisor = new Televisor("Sony", 30.0, 'A', "Negro", 32.0, "Full HD");
		Cafetera cafetera = new Cafetera("Next Preso", 3.0, 'A', "Rojo", 1.5);

		ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();
		
		lista.add(heladera);
		lista.add(televisor);
		lista.add(cafetera);
		
		for (Electrodomestico ele : lista) {
			ele.encender();
		}
	}
}
