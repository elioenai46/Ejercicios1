/*
 Autor: Salvador Elioenai Antonio Pérez
 Fecha de creación: 05 de abril del 2022
 Fecha de actualización: 06 de abril del 2022
 Descripción: Calcula el salario semanal de un empleado con base a las horas trabajadas a razon de 12 euros la hora 
 */
package Ejercicio8;

public class Salario {
	private double horas;

	public Salario(double horas) {
		this.horas = horas;
	}

	public double getPago() {
		return this.horas * 7;
	}

	public void imprimirPago() {
		System.out.println("El total a pagar es: $" + getPago() * 12 + " Euros");
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

}
