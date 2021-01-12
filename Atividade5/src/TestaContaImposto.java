package Atividade5.src;

public class TestaContaImposto {
	public static void main(String args[]) {
		ContaImposto contaImposto = new ContaImposto("1", 500);
		
		contaImposto.creditar(200);
		
		System.out.printf("\nSaldo atual: R$ %.2f", contaImposto.getSaldo());
		
		contaImposto.debitar(350);
		
		System.out.printf("\nSaldo atual: R$ %.2f", contaImposto.getSaldo());
	}
}
