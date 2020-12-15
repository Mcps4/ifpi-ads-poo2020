package Questao8;

public class TesteConta {
    public static void main(String[] args){
        Conta c1 = new Conta("1",1000);
        Conta c2 = new Conta("2",750);

        c1.sacar(250);
        System.out.println(c1.consultarSaldo());

        c2.trasferir(c1, 500);
        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());
    }
}
