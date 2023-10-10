package br.edu.figurasgeometricasplanas;

import java.util.Scanner;

public class Quadrado {
	public double lado, area;
	public void calcarea(Scanner prompt) {
		
		System.out.println("Digite a lado: ");
		lado = prompt.nextDouble();
		area = Math.pow(lado,2);
	}
	public void Listadeatrib() {
		System.out.println("A altura é: " + lado);
		System.out.println("A area é: " + area);
	}
}
