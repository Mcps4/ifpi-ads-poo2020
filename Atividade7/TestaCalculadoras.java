package Atividade7;

public class TestaCalculadoras {
	public static void main(String args[]) {
		CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
		
		System.out.println(calculadoraCientifica.exponenciar(3, 5));
		
		System.out.println(calculadoraCientifica.divisao(27, 6));
		System.out.println(calculadoraCientifica.divisao(27, 6, true));
	}
}
