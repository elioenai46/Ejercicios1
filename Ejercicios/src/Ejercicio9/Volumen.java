/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Calcula el volumen de un cono a partir de la formula V= 1/3*PI*R^2*H
 */
package Ejercicio9;

public class Volumen {
	private double altura;
	private double radio;
	public Volumen(double altura, double radio) {
		this.altura = altura;
		this.radio = radio;
	}
	public double getResultado() {
		return 0.333*3.1415*(this.radio*this.radio)*this.altura;
		
	}
	public void imprimirResultado() {
		System.out.println("El volumen es: "+getResultado());
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio = radio;
	}


}
