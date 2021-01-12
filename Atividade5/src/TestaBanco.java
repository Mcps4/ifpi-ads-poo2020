package Atividade5.src;

import java.util.Scanner;

public class TestaBanco {
	public static void main(String[] args) {
		Banco b = new Banco();
		
		Scanner sc = new Scanner(System.in);
		String opcao = "";
		
		do {
			System.out.println("\n1 - Cadastrar\n2 - Alterar\n3 - Excluir\n4 - Consultar\n5 - Creditar\n6 - Debitar\n7 - Transferir\n0 - Sair\n> ");
			
			opcao = sc.next();
			
			switch(opcao) {
				case "1":
					Conta contaCriada = new Conta();
					
					System.out.println("Digite o n�mero: ");
					contaCriada.setNumero(sc.next());
					
					System.out.println("Digite o saldo: ");
					contaCriada.setSaldo(sc.nextDouble());
					
					b.inserir(contaCriada);
					break;
					
				case "2":
					Conta contaAlterada = new Conta();
					
					System.out.println("Digite o n�mero: ");
					contaAlterada.setNumero(sc.next());;
					
					System.out.println("Digite o saldo: ");
					contaAlterada.setSaldo(sc.nextDouble());
					
					b.alterar(contaAlterada);
					break;
					
				case "3":
					String numeroContaAExcluir;
					
					System.out.println("Digite o n�mero da conta a ser exclu�da: ");
					numeroContaAExcluir = sc.next();
					
					b.excluir(numeroContaAExcluir);
					break;
					
				case "4":
					String numeroContaAConsultar;
					Conta contaConsultada;
					
					System.out.println("Digite o n�mero da conta a ser consultada: ");
					numeroContaAConsultar = sc.next();
					
					contaConsultada = b.consultar(numeroContaAConsultar);
					
					System.out.printf("\nN�mero da conta: %s - Saldo da conta: R$ %.2f", contaConsultada.getNumero(), contaConsultada.getSaldo());
					break;
					
				case "5":
					String numeroContaACreditar;
					double valorACreditar;
					
					System.out.println("Digite o n�mero da conta a ser creditada: ");
					numeroContaACreditar = sc.next();
					
					System.out.println("Digite o valor a ser creditado: R$ ");
					valorACreditar = sc.nextDouble();
					
					b.creditar(numeroContaACreditar, valorACreditar);
					break;
					
				case "6":
					String numeroContaADebitar;
					double valorADebitar;
					
					System.out.println("Digite o n�mero da conta a ser debitada: ");
					numeroContaADebitar = sc.next();
					
					System.out.println("Digite o valor a ser debitado: R$ ");
					valorADebitar = sc.nextDouble();
					
					b.debitar(numeroContaADebitar, valorADebitar);
					break;
				
				case "7":
					String numeroContaCredito, numeroContaDebito;
					double valorATransferir;
					
					System.out.println("Digite o n�mero da conta da qual vai ser debitado o valor da transfer�ncia: ");
					numeroContaCredito = sc.next();
					
					System.out.println("Digite o n�mero da conta da qual vai ser creditado o valor da transfer�ncia: ");
					numeroContaDebito = sc.next();
					
					System.out.println("Digite o valor que ser� transferido: R$ ");
					valorATransferir = sc.nextDouble();
					
					b.transferir(numeroContaCredito, numeroContaDebito, valorATransferir);
					break;
					
				default:
					break;
					
			}
		} while (!opcao.equals("0"));
		
		sc.close();

	}

}
