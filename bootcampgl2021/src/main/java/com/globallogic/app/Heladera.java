package com.globallogic.app;

public class Heladera extends Electrodomestico {

	private double capacidad;
	private boolean tieneFreezer;
	private double capacidadFreezer;

	public Heladera(String marca, double peso, char consumo, String color, double capacidad, boolean tieneFreezer,
			double capacidadFreezer) {

		super(marca, peso, consumo, color);

		this.capacidad = capacidad;
		this.tieneFreezer = tieneFreezer;
		this.capacidad = capacidad;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isTieneFreezer() {
		return tieneFreezer;
	}

	public void setTieneFreezer(boolean tieneFreezer) {
		this.tieneFreezer = tieneFreezer;
	}

	public double getCapacidadFreezer() {
		return capacidadFreezer;
	}

	public void setCapacidadFreezer(double capacidadFreezer) {
		this.capacidadFreezer = capacidadFreezer;
	}

	@Override
	public void encender() {
		System.out.println();
		System.out.println("Encendiendo electrodoméstico");
		System.out.println("Marca: " + getMarca());
		System.out.println("Peso: " + getPeso());
		System.out.println("Consumo:" + getConsumo());
		System.out.println("Color: " + getColor());
		System.out.println("Capasidad: " + getCapacidad());
		System.out.println("Tiene Freezer: " + isTieneFreezer());
		System.out.println("Capacidad del Freezer: " + getCapacidadFreezer());
		
	}
	
	public void guardarElemento(String guardar) {

	}

	public void extraerElemento(String extraer) {

		
	}
}