/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Clase para multiplicar dos nùmeros
 */
package Ejercicio4;

public class Multiplicacion {
	private double num1;
	private double num2;

	public Multiplicacion(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public double getMultiplicacion() {
		return this.num1 * this.num2;
	}

	public void imprimirMultiplicacion() {
		System.out.println("Multiplicacion : " + this.num1 + " x " + this.num2 + " = " + this.getMultiplicacion());
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

}
