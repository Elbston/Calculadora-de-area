package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Triangulo {
	public double base, altura, area;
	public void calcarea(Scanner prompt) {
		
		System.out.println("Digite a base: ");
		base = prompt.nextDouble();
		System.out.println("Digite a altura:");
		altura = prompt.nextDouble();
		area = (base * altura)/2;
	}
	public void Listadeatrib() {
		System.out.println("A altura �: " + altura);
		System.out.println("A base �: " + base);
		System.out.println("A area �: " + area);
	}
}
