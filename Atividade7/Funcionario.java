package Atividade7;

public class Funcionario extends Pessoa {
	private int matricula;
	private double salario;
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setSalario(double salario) {
		if(salario > 0) {
			this.salario = salario;
		} else {
			System.out.println("O salário não pode ser negativo.");
		}
		
	}
	
	public double getSalario() {
		return salario;
	}
	
	public double getSalarioPrimeiraParcela() {
		return this.getSalario() * 0.6;
	}
	
	public double getSalarioSegundaParcela() {
		return this.getSalario() * 0.4;
	}
	
	
}
