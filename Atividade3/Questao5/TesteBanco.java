package Questao5;

public class TesteBanco {
    public static void main(String[] args){
        Banco banco = new Banco(6);
		Conta c1 = new Conta("1", 500);
		Conta c2 = new Conta("2", 725);
		Conta c3 = new Conta("3", 375);
		Conta c4 = new Conta("4", 1500);
		
		banco.inserir(c1);
		banco.inserir(c2);
		banco.inserir(c3);
		banco.inserir(c4);
		banco.transferir("1", "2", 150);
		
		System.out.println(banco.quantidadeContasCadastradas());
		System.out.println(banco.totalValorDepositado());
		System.out.println(banco.mediaSaldo());
    }
}
