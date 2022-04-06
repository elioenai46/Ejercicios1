/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Conversor de pesetas a euros  
 */
package Ejercicio3;

public class Convertidor {
	private double pesetas;

	public Convertidor(double pesetas) {
		this.pesetas = pesetas;
	}

	public double getPesetas() {
		return pesetas;
	}

	public void setPesetas(double pesetas) {
		this.pesetas = pesetas;
	}

	public double getResultado() {
		return this.pesetas / 166386;
	}

	public void imprimirResultado() {
		System.out.println(this.pesetas + " Pesetas es igual a " + this.getResultado() + " Euros ");
	}

}
