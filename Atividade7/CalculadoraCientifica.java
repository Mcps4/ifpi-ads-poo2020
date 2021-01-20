package Atividade7;

public class CalculadoraCientifica extends Calculadora {

	public double exponenciar(double base, double expoente) {
		return Math.pow(base, expoente);
	}
	
	public double divisao(double operando1, double operando2, boolean valorArredondado) {
		double resultado = super.divisao(operando1, operando2);
		
		if (valorArredondado == true) {
			return Math.round(resultado);
		}
		
		return resultado;
	}

}
