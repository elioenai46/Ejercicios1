/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Clase para calcular el area de un rectangulo
 */
package Ejercicio5;

public class Rectangulo {
	private double base;
	private double altura;

	public Rectangulo() {

	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return this.base * this.altura;
	}

	public void imprimirArea() {
		System.out.println("el area del rectangulo es: " + this.getArea());
	}
}
