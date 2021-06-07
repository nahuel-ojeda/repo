package com.globallogic.app;

public interface Animal {

	public void dormir();

	public void sonidoAnimal();

	default void Come(String s) {
		System.out.println("El " + s + " Camina");
	}

	static void Camina(String s) {
		System.out.println("El " + s + " se alimenta");
	}
}

class Perro implements Animal {
	public void dormir() {
		System.out.println("zzzzzzzzz");
	}

	public void sonidoAnimal() {
		System.out.println("El Perro hace guau guau");
	}

}
