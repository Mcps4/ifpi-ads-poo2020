package Atividade7;

public class Calculadora {
	
	public double soma(double operando1, double operando2) {
		return operando1 + operando2;
	}
	
    public int soma(int operando1, int operando2) {
        return (int) (soma(Double.valueOf(operando1), Double.valueOf(operando2)));
    }

	public String soma(String operando1, String operando2) {
	    int operando1Int = Integer.parseInt(operando1);
	    int operando2Int = Integer.parseInt(operando2);
	    return String.valueOf(soma(operando1Int, operando2Int));
	}
	
	public double divisao(double operando1, double operando2) {
		return operando1 / operando2;
	}

	
}
