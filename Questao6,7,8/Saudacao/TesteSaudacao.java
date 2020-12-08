public class TesteSaudacao {
    public static void main(String[] args){
        Saudacao saudacao = new Saudacao();

        saudacao.texto = "Bom dia, ";
        saudacao.destinatario = "Caio";
        System.out.println(saudacao.obtersaudacao());

    }
}
