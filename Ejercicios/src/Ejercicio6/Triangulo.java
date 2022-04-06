/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Clase para calcular el area de un triangulo
 */
package Ejercicio6;

public class Triangulo {
	private double base;
	private double altura;
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	public double getArea() {
		return (this.base*this.altura)/2;
	}
	public void imprimirArea() {
		System.out.println("El area del triangulo es: "+getArea());
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
	

}
