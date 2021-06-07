package com.globallogic.app;

public class Televisor extends Electrodomestico {

	private double pulgadas;
	private String resolution;

	public Televisor(String marca, double peso, char consumo, String color, double pulgadas, String resolution) {
		super(marca, peso, consumo, color);
		this.pulgadas = pulgadas;
		this.resolution = resolution;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public void encender() {
		System.out.println();
		System.out.println("Encendiendo Heladera");
		System.out.println("Marca: " + getMarca());
		System.out.println("Peso: " + getPeso());
		System.out.println("Consumo:" + getConsumo());
		System.out.println("Color: " + getColor());
		System.out.println("Pulgadas: " + getPulgadas());
		System.out.println("Resolusion: "+ getResolution());
	}
	
	public void cambiarCanal(int cambiar) {

	}

}
