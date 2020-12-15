package Questao9;

public class TesteProduto {
    public static void main(String[] args){
        Produto bola = new Produto(123,2,50,"bola de futsal");
        Produto computador = new Produto(555,1,6000,"PC gamer");
        Produto ps5 = new Produto(324,1,5000,"Playstation 5");

        bola.quantidadeMinima = 10;
        computador.quantidadeMinima = 20;
        ps5.quantidadeMinima = 15;

        ps5.baixar(5);
        System.out.println(ps5.quantidade);

        computador.baixar(10);
        System.out.println(computador.quantidade);

        bola.reajusta(20);
        System.out.println(bola.mostrarValor());

        System.out.println(ps5.equals(computador));
    }
}
