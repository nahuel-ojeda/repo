package com.globallogic.app;

public class EmpleadoPunto6 extends Persona {

	private static double pagoPorHoraExtra; // atributo de clase
	private String dni;
	private String nombre;
	private double sueldoBase;
	static int horasExtras;
	private double tipoIRPF;
	private char casado; // S ó N
	private int numeroHijos;

	public EmpleadoPunto6(String documento, String nacion) {
		super(documento, nacion);

	}

	public static double getPagoPorHoraExtra() {
		return pagoPorHoraExtra;
	}

	public static void setPagoPorHoraExtra(double pagoPorHoraExtra) {
		EmpleadoPunto6.pagoPorHoraExtra = pagoPorHoraExtra;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getTipoIRPF() {
		return tipoIRPF;
	}

	public void setTipoIRPF(double tipoIRPF) {
		this.tipoIRPF = tipoIRPF;
	}

	public char getCasado() {
		return casado;
	}

	public void setCasado(char casado) {
		this.casado = casado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	// calcular el importe de las horas extra
	public double calcularImporteHorasExtras() {
		return horasExtras * pagoPorHoraExtra;
	}

	// calcular el sueldo bruto
	public double calcularSueldoBruto() {
		return sueldoBase + calcularImporteHorasExtras();
	}

	// calcular el importe de las retencion por IRPF
	public double calcularRetencionIrpf() {
		double tipo = tipoIRPF;
		if (casado == 's' || casado == 'S') {
			tipo = tipo - 2; // 2 puntos menos si está casado
		}
		tipo = tipo - numeroHijos; // un punto menos por cada hijo
		if (tipo < 0) {
			tipo = 0;
		}
		return calcularSueldoBruto() * tipo / 100;
	}

	// calcular el importe liquido a cobrar
	public double calcularSueldo() {
		return calcularSueldoBruto() - calcularRetencionIrpf();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nDni: ");
		sb.append(dni);
		sb.append("\nSueldo Base: ");
		sb.append(sueldoBase);
		sb.append("\nHoras Extras: ");
		sb.append(horasExtras);
		sb.append("\ntipo IRPF: ");
		sb.append(tipoIRPF);
		sb.append("\nCasado: ");
		sb.append(casado);
		sb.append("\nNúmero de Hijos: ");
		sb.append(numeroHijos);
		return sb.toString();
	}

	@Override
	public void mostrarDatos() {
		System.out.println("Nacion:" + EmpleadoPunto6.getPagoPorHoraExtra());

	}


}
