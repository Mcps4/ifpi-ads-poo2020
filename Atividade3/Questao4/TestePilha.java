package Questao4;

public class TestePilha {
    public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.empilhar(1);
		pilha.empilhar(2);
		pilha.desempilhar();
		pilha.empilhar(3);
		System.out.println(pilha.estaCheia());
		System.out.println(pilha.retornarTopo());
		pilha.exibir();
	}

}
