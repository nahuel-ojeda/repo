package com.globallogic.app;

public class Cafetera extends Electrodomestico {

	public double litros;

	public Cafetera(String marca, double peso, char consumo, String color, double litros) {
		super(marca, peso, consumo, color);
		
		this.litros = litros;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	@Override
	public void encender() {
		System.out.println();
		System.out.println("Encendiendo Cafetera");
		System.out.println("Marca: " + getMarca());
		System.out.println("Peso: " + getPeso());
		System.out.println("Consumo:" + getConsumo());
		System.out.println("Color: " + getColor());
		System.out.println("Litros: " + getLitros());
	}
	public void elegirSabor(String elegir) {

	}

}
