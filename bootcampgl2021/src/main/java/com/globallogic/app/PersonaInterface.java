package com.globallogic.app;

public interface PersonaInterface {

	public void hablar();

	public void dormir();

	default void Come() {
		System.out.println("Se ejecuta método de la clase Hombre");
	}
}
