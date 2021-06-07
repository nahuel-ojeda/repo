package com.globallogic.app;

public class AnimalMain {

	public static void main(String[] args) {
		Perro dog = new Perro();

		dog.dormir();
		dog.sonidoAnimal();
		dog.Come("Perro");
		Animal.Camina("Perro");
		System.out.println("**********************");
	}
}
