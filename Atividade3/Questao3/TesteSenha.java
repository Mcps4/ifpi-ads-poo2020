package Questao3;

public class TesteSenha {
    public static void main(String args[]) {
		Senha senha = new Senha();
		
		senha.valor = "Saladacozida123";
		senha.iguais("Saladacozida123");
		senha.iguaisTrim(" Saladacozida123 ");
		System.out.println(senha.tamanhoSeguro());
	    	System.out.println(senha.possuiNumero()");
		System.out.println(senha.possuiMaiusculaMinuscula());
	   	System.out.println(senha.ehValida()");
		
	}
}
