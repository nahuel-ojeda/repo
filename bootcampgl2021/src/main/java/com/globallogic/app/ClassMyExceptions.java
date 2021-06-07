package com.globallogic.app;

public class ClassMyExceptions {

	public static void main(String[] args) {
		try {
            throw new MyExceptions("mi propia Excepción");
        } catch (MyExceptions e) {
            System.out.println("excepción: " + e.getMensaje());
        }


	}

}
