package Atividade7;

public class TestaBanco {
	public static void main(String[] args) {
		Conta conta = new Conta("1",300);
		Poupanca poupanca = new Poupanca("2", 250, 1);
		
		Banco banco = new Banco(5);
		banco.inserir(conta);
		banco.inserir(poupanca);
		
		Conta poupanca2 = new Poupanca("5", 150, 10);
		banco.inserir(poupanca2);
		banco.renderJuros("5");
		System.out.println(banco.consultar("5").getSaldo());
		

		ContaImposto contaImposto = new ContaImposto("6",400);
		contaImposto.sacar(200);
		System.out.println(contaImposto.getSaldo());
		
	}
		
}
