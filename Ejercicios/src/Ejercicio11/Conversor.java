/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Conversor de Kb a Mb
 */
package Ejercicio11;

public class Conversor {
	private double kilobyte;

	public Conversor(double kilobyte) {
		super();
		this.kilobyte = kilobyte;
	}

	public double getMegabyte() {
		return this.kilobyte * 0.001;
	}

	public void imprimirResultado() {
		System.out.println(this.kilobyte + " kilobytes es equivalente a " + getMegabyte() + " megabytes");
	}

	public double getKilobyte() {
		return kilobyte;
	}

	public void setKilobyte(double kilobyte) {
		this.kilobyte = kilobyte;
	}

}
