package Atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {
ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	public void inserir(Produto produto) {
		
		if (produtos.size() == 0) {
			this.produtos.add(produto);
			System.out.println("Produto adicionado com sucesso!");
		} else {
			for (int i = 0; i < produtos.size(); i++) {
				
				if (produtos.get(i).getId() == produto.getId() || produtos.get(i).getDescricao() == produto.getDescricao()) {
					System.out.println("ID ou Nome do produto já existe. não deve existir produtos com nome ou ID's iaguais");
				} else {
					this.produtos.add(produto);
					System.out.println("Produto adicionado com sucesso!");
					return;
				}
			}
		}
		
	}
	
	public void consultar(int id) {
		Produto produtoCons = null;
		int opcao, quantidade;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == id) {
				produtoCons = produtos.get(i);
			}
		}
		
		if (produtoCons != null) {
			
			System.out.println("Nome do produto: " + produtoCons.getDescricao());
			System.out.println("\nID do produto: " + produtoCons.getId());
			System.out.printf("Preço do produto: R$ %.2f\n", produtoCons.getValor());
			System.out.println("Quantidade do produto: " + produtoCons.getQuantidade());
			
			do {
				
				System.out.println("Você gostaria de repor ou dar baixa na quantidade do produto? (1 - Sim | 0 - Não)");
				opcao = scanner.nextInt();
				
				if (opcao == 1) {
					System.out.println("1 - Repor | 2 - Dar baixa");
					opcao = scanner.nextInt();
					
					if (opcao == 1) {
						System.out.println("Quantidade: ");
						quantidade = scanner.nextInt();
						produtoCons.repor(quantidade);
					}
					
					if (opcao == 2) {
						System.out.println("Quantidade: ");
						quantidade = scanner.nextInt();
						produtoCons.darBaixa(quantidade);
					}
				}
				
			} while (opcao != 0);
		} else {
			System.out.printf("\nProduto de ID %d não encontrado.\n", id);
		}
	}
	
	public void excluir(int id) {
		int posExcluir = -1;
		
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getId() == id) {
				posExcluir = i;
			}
		}
		
		if (posExcluir != -1) {
			produtos.remove(posExcluir);
			System.out.println("\nProduto excluído com sucesso!");
		} else {
			System.out.printf("\n O Produto de ID %d não foi encontrado.\n", id);
		}
	}
}
