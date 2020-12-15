package Questao9;

public class Produto {
    int codigo, quantidade, quantidadeMinima;
    String descricao;
    double valor;

    Produto(int codigo, int quantidade, double valor, String descricao){
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valor = valor;
        this.descricao = descricao;
    }

    boolean baixar(int quantidade){
        if (this.quantidade - quantidade <= quantidadeMinima) {
			return false;
		} else {
            this.quantidade -= quantidade;
            return true;			
		}
    }
    void repor(int quantidade){
        this.quantidade += quantidade;
    }

    void reajusta(double taxa){
        this.valor += (taxa /100) * this.valor;
    }

    public String toString(){
        return this.codigo + " || " + this.descricao + " || R$ " + this.valor + " || " + this.quantidade;
    }

    boolean equals(Produto produto){
        if (produto.codigo == this.codigo){
            return true;
        } else{
            return false;
        }
    }
    double mostrarValor(){
        return valor;
    }
}
