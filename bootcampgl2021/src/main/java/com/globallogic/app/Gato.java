package com.globallogic.app;

public class Gato {

	private String nombre;
	private int patas;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public static void main(String[] args) {
		
		Gato gato = new Gato ();
		
		gato.setNombre("muruna");
		System.out.println("Nombre: " + gato.getNombre());
		
		gato.setPatas(4);
		System.out.println("Patas:" + gato.getPatas());
	}
}
