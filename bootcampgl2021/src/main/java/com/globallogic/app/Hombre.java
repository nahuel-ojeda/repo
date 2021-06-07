package com.globallogic.app;

class Hombre implements PersonaInterface, Animal {

	public void hablar() {
		System.out.println("Las personas hablan mucho");
	}

	public void dormir() {
		System.out.println("El hombre duerme muchas horas");
	}

	public void sonidoAnimal() {
		System.out.println("El hombre no hace sonidos de animal");
	}

	public static void main(String[] args) {

		Hombre hombre = new Hombre();

		hombre.dormir();
		hombre.hablar();
		hombre.sonidoAnimal();
		hombre.Come();

	}

}
