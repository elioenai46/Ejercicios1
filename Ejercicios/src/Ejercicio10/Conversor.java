/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Conversor de Mb a Kb
 */
package Ejercicio10;

public class Conversor {
	private double megabyte;

	public Conversor(double megabyte) {
		this.megabyte = megabyte;
	}

	public double getkilobyte() {
		return this.megabyte * 1000;
	}

	public void imprimirResultado() {
		System.out.println(this.megabyte + " megabytes es equivalente a " + getkilobyte() + " kilobytes");
	}

	public double getMegabyte() {
		return megabyte;
	}

	public void setMegabyte(double megabyte) {
		this.megabyte = megabyte;
	}

}
