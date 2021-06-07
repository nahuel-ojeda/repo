package com.globallogic.app;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalEmplado {

	final static int MAXIMO_EMPLEADOS = 20;
    static EmpleadoPunto6[] empleados = new EmpleadoPunto6[MAXIMO_EMPLEADOS];
    static int indice = 0;
    static Scanner sc = new Scanner(System.in);

   
	public static void main(String[] args) {
		double importe;
		EmpleadoPunto6 e;
       // leerEmpleados();
        if (numeroDeEmpleados() > 0) {
        	//mostrar empleados
            System.out.println("\n\nEmpleados introducidos: ");
            mostrar();

            importe = leerImporteHorasExtras();

            //asignar el atributo estático pagoPorHoraExtra
            EmpleadoPunto6.setPagoPorHoraExtra(importe);

            //calcular el empleado que más cobra
            e = empleadoQueMasCobra();
            System.out.println("\n\nEmpleado que más cobra:");
            System.out.println(e);
            System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

            //calcular el empleado que menos cobra
            e = empleadoQueMenosCobra();
            System.out.println("\n\nEmpleado que menos cobra:");
            System.out.println(e);
            System.out.printf("Sueldo: %.2f € %n", e.calcularSueldo());

            //calcular el empleado que más cobra por horas extra
            e = empleadoQueMasCobraPorHorasExtras();
            System.out.println("\n\nEmpleado que más cobra por horas extras:");
            System.out.println(e);
            System.out.printf("Total horas extras: %.2f €" , e.calcularImporteHorasExtras());

            //calcular el empleado que menos cobra por horas extra
            e = empleadoQueMenosCobraPorHorasExtras();
            System.out.println("\n\nEmpleado que menos cobra por horas extras:");
            System.out.println(e);
            System.out.printf("Total horas extras: %.2f €" , e.calcularImporteHorasExtras());

            //ordenar por salario de menor a mayor
            ordenarPorSalario();
            System.out.println("\n\nEmpleados ordenados por salario:");
            mostrarEmpleadosYSalarios();

        }
    }

	//método para leer todos los empleados y guardarlos en el array
    public static void leerEmpleados() throws IOException {
        EmpleadoPunto6 e;
        String dni, nombre;
        double sueldoBase;
        int horasExtras;
        double tipoIRPF;
        char casado;  // S ó N
        int numeroHijos;
        int i, N;

        do {
            System.out.print("Número de empleados? ");
            N = sc.nextInt();
        } while (N < 0 || N > MAXIMO_EMPLEADOS);
       
        for (i = 1; i <= N; i++) {
            sc.nextLine(); //limpiar el intro
            System.out.println("Empleado " + i);
            System.out.print("Dni: ");
            dni = sc.nextLine();
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Sueldo Base: ");
            sueldoBase = sc.nextDouble();
            System.out.print("Horas extra: ");
            horasExtras = sc.nextInt();
            System.out.print("Tipo de IRPF: ");
            tipoIRPF = sc.nextDouble();
            System.out.print("Casado (S/N): ");
            casado = (char) System.in.read();
            System.out.print("Número de hijos: ");
            numeroHijos = sc.nextInt();

            e = new EmpleadoPunto6(dni, nombre); //crear una nueva instancia de empleado

            e.setNombre(nombre);
            e.setSueldoBase(sueldoBase);
            e.setHorasExtras(horasExtras);
            e.setTipoIRPF(tipoIRPF);
            e.setCasado(Character.toUpperCase(casado));
            e.setNumeroHijos(numeroHijos);

            empleados[indice] = e; //se añade el empleado al array
            indice++;
        }
    }
	//método para mostrar todos los empleados
    public static void mostrar() {
        for (int i = 0; i < indice; i++) {
            System.out.println(empleados[i]);
        }
    }

    //método para pedir el importe de la hora extra
    public static double leerImporteHorasExtras() {
        double importe;
        System.out.print("Introduce el importe a pagar por cada hora extra: ");
        importe = sc.nextDouble();
        return importe;
    }

    //método que devuelve el número total de empleados
    public static int numeroDeEmpleados() {
        return indice;
    }

    //método que devuelve el empleado que más cobra
    public static EmpleadoPunto6 empleadoQueMasCobra() {
        EmpleadoPunto6 mayor = empleados[0];
        for (int i = 1; i < indice; i++) {
            if (empleados[i].calcularSueldo() > mayor.calcularSueldo()) {
                mayor = empleados[i];
            }
        }
        return mayor;
    }

    //método que devuelve el empleado que menos cobra
    public static EmpleadoPunto6 empleadoQueMenosCobra() {
    	EmpleadoPunto6 menor = empleados[0];
        for (int i = 1; i < indice; i++) {
            if (empleados[i].calcularSueldo() < menor.calcularSueldo()) {
                menor = empleados[i];
            }
        }
        return menor;
    }

    //método que devuelve el empleado que más cobra por horas extra
    public static EmpleadoPunto6 empleadoQueMasCobraPorHorasExtras() {
    	EmpleadoPunto6 mayor = empleados[0];
        for (int i = 1; i < indice; i++) {
            if (empleados[i].calcularImporteHorasExtras() > mayor.calcularImporteHorasExtras()) {
                mayor = empleados[i];
            }
        }
        return mayor;
    }

    //método que devuelve el empleado que menos cobra por horas extra
    public static EmpleadoPunto6 empleadoQueMenosCobraPorHorasExtras() {
        EmpleadoPunto6 menor = empleados[0];
        for (int i = 1; i < indice; i++) {
            if (empleados[i].calcularImporteHorasExtras() < menor.calcularImporteHorasExtras()) {                 
                menor = empleados[i];
            }
        }
        return menor;
    }

    //método para ordenar todos los empleados por su salario de menor a mayor
    public static void ordenarPorSalario() {

        int i, j;
        EmpleadoPunto6 aux;
        for (i = 0; i < indice - 1; i++) {
            for (j = 0; j < indice - i - 1; j++) {
                if (empleados[j + 1].calcularSueldo() < empleados[j].calcularSueldo()) {
                    aux = empleados[j + 1];
                    empleados[j + 1] = empleados[j];
                    empleados[j] = aux;
                }
            }
        }
    }

    //método para mostrar los datos de cada empleado junto con su sueldo
    public static void mostrarEmpleadosYSalarios() {
        for (int i = 0; i < indice; i++) {
            System.out.println(empleados[i]);
            System.out.printf("Sueldo: %.2f € %n" , empleados[i].calcularSueldo());
        }
    }
// Fin de la Clase Principal

}


