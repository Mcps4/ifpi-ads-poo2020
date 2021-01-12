package Atividade5.src;

public class TestaCalculadora {
	public static void main(String args[]) {
		
		Calculadora calculadora = new Calculadora(10,5);
		
		System.out.printf("A soma é: %d", calculadora.somar());
		System.out.printf("\nA subtração é: %d", calculadora.subtrair());
		
	}
}
