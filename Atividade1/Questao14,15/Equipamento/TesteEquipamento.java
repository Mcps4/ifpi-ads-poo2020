public class TesteEquipamento {
    public static void main(String[] args){
        Equipamento computador = new Equipamento();
        Equipamento geladeira = new Equipamento();
        computador.liga();
        geladeira.desliga();
        computador.inverte();
        geladeira.inverte();

        if(computador.ligado == true) {
            System.out.println("O computador está ligado!");
        } else {
            System.out.println("O computador está desligado!");
        }
        if(geladeira.ligado == true) {
            System.out.println("A geladeira está ligada!");
        } else {
            System.out.println("A geladeira está desligada!");
        }
    }
}

