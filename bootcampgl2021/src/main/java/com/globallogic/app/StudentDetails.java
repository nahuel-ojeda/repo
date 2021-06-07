package com.globallogic.app;

import java.util.Scanner;

public class StudentDetails {

	static int studentAge() {

		Scanner ingresar = new Scanner(System.in);
		System.out.print("Ingresar numero: ");
		
		int age = ingresar.nextInt();
		System.out.println("La edad del estudiante es: " + age);
		return age;
	}

	public static void main(String[] args) {

		String estudiante;

		StudentDetails StudentDetails = new StudentDetails();

		Integer studentAge = studentAge();

	}
}
