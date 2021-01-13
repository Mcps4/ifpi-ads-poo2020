package Atividade6;

public class TesteVeiculos {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		Carro carro = new Carro();
		CarroEletrico carroEletrico = new CarroEletrico();
		
		veiculo.placa = "ABC5H32";
		veiculo.ano = 2015;
		
		carro.placa = "LDQ4G12";
		carro.ano = 2016;
		carro.modelo = "Gol";
		
		carroEletrico.placa = "XFS7D35";
		carroEletrico.ano = 2021;
		carroEletrico.modelo = "Camaro";
		carroEletrico.autonomiaBateria = 300;

	}

}
