package com.globallogic.app;

public class TiposPrimitivos {

	public static void main(String[] args) {

		int myNum = 15;
		System.out.println("El valor de mi munero es " + myNum);

		char myChar = 'a';
		System.out.println("El valor de mi caracter es " + myChar);

		byte myByte = 5;
		System.out.println("El valor de mi byte es " + myByte);

		short myShort = 500;
		System.out.println("El valor de mi short es " + myShort);

		long myLong = 9786;
		System.out.println("El valor de mi long es " + myLong);

		float myFloat = 2436.2456f;
		System.out.println("El valor de mi float es " + myFloat);

		double myDouble = 500745.2389;
		System.out.println("El valor de mi doble es " + myDouble);

		boolean myboolean = true;
		System.out.println("El valor de b es " + myboolean);
		System.out.println();

		System.out.println("clases wrapper de cada tipo primitivo:");

		Integer intWrapper = 15;
		Character charWrapper = 'A';
		Byte byteWrapper = 5;
		Short shortWrapper = 500;
		Long longWrapper = (long) 9786;
		Float floatWrapper = 2436.2456f;
		Double doubleWrapper = 5.99;
		Boolean booleanWrapper = true;

		System.out.println("El valor de mi munero es " + intWrapper.intValue());
		System.out.println("El valor de mi caracter es " + charWrapper.charValue());
		System.out.println("El valor de mi byte es " + byteWrapper.byteValue());
		System.out.println("El valor de mi short es " + shortWrapper.shortValue());
		System.out.println("El valor de mi long es " + longWrapper.longValue());
		System.out.println("El valor de mi float es " + floatWrapper.floatValue());
		System.out.println("El valor de doble es " + doubleWrapper.doubleValue());
		System.out.println("El valor de b es " + booleanWrapper.booleanValue());

	}
}
