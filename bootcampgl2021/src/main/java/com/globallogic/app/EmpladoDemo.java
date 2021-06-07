package com.globallogic.app;

public class EmpladoDemo {

	public static void main(String[] args) {
		
		Empleado Empleado = new Empleado();

		Empleado.setSalario(1000);
		
		System.out.println(Empleado.getNombre() +" tiene un Salario promedio de "+Empleado.getSalario());
	}

}
