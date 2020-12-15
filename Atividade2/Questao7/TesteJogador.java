public class TesteJogador {
    public static void main(String[] args){
        Jogador jogador1 = new Jogador(25,10,80);
        Jogador jogador2 = new Jogador(15,12,100);

        jogador1.atacar(jogador2);
        jogador2.atacar(jogador1);

        System.out.println(jogador1.verPontosJogador());
        System.out.println(jogador2.verPontosJogador());

        if(jogador1.verPontosJogador() > jogador2.verPontosJogador()){
            System.out.println("O jogador 1 venceu!");
        } else {
            System.out.println("O jogador 2 venceu!");
        }
    }
}
