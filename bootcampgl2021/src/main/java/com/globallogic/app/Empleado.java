package com.globallogic.app;

public class Empleado {

	static double salario;
	static String nombre = "Alex";
	
	public static double getSalario() {
		return salario;
	}
	public static void setSalario(double salario) {
		Empleado.salario = salario;
	}
	public static String getNombre() {
		return nombre;
	}
	public static void setNombre(String nombre) {
		Empleado.nombre = nombre;
	}
	public static String getPagoPorHoraExtra() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
