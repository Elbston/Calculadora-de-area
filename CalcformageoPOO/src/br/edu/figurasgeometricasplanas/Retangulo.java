
package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Retangulo {
	public double base, altura, area;
	public void calcarea(Scanner prompt) {
		
		System.out.println("Digite a base: ");
		base = prompt.nextDouble();
		System.out.println("Digite a lado: ");
		altura = prompt.nextDouble();
		area = altura * base;
	}
	public void Listadeatrib() {
		System.out.println("A altura �: " + altura);
		System.out.println("A base �: " + base);
		System.out.println("A area �: " + area);
	}
}
