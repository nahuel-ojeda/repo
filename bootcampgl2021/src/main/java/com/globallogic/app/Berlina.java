package com.globallogic.app;

public class Berlina extends Automovil {

	@Override
	void retroceder() {
		System.out.println("Soy el metodo retroceder de Automovil");
		
	}
	
	public static void main(String[]args) {
		Berlina berlina = new Berlina();
		
		berlina.avanzar();
		berlina.retroceder();
	}

}
