package Atividade5.src;

public class TestaCalculadora {
	public static void main(String args[]) {
		
		Calculadora calculadora = new Calculadora(10,5);
		
		System.out.printf("A soma �: %d", calculadora.somar());
		System.out.printf("\nA subtra��o �: %d", calculadora.subtrair());
		
	}
}
