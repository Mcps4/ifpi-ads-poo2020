package Atividade6;

public class TesteEstoque {

	public static void main(String[] args) {
Estoque estoque = new Estoque();
		
		Produto produto = new Produto();
		
		produto.setId(1);
		produto.setDescricao("Computador");
		produto.setValor(2000);
		produto.setQuantidade(1);
		
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel();
		
		produtoPerecivel.setId(2);
		produtoPerecivel.setDescricao("Banana");
		produtoPerecivel.setValor(3);
		produtoPerecivel.setQuantidade(6);
		produtoPerecivel.setDataVencimento(2021, 2, 2);
		
		estoque.inserir(produto);
		estoque.inserir(produtoPerecivel);
		
		estoque.consultar(1);
		estoque.excluir(1);
	

	}

}
