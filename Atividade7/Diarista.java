package Atividade7;

public class Diarista extends Empregado {
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() / 30;
	}
}
