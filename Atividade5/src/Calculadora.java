package Atividade5.src;

public class Calculadora {
	private int Operando1, Operando2;
	
	Calculadora(int Operando1, int Operando2) {
		this.Operando1 = Operando1;
		this.Operando2 = Operando2;
	}
	
	int somar() {
		return Operando1 + Operando2;
	}
	
	int subtrair() {
		return Operando1 - Operando2;
	}
}
