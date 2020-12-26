package Questao6;

public class TesteMicroblog {
    public static void main(String args[]) {
		Microblog microblog = new Microblog(3);
		
		Postagem post1 = new Postagem();
		Postagem post2 = new Postagem();
		Postagem post3 = new Postagem();
		
		post1.id = 1;
		post1.texto = "olá como você está!";
		
		post2.id = 2;
		post2.texto = "Barcelona ganha do real madrid";
		
		post3.id = 3;
		post3.texto = "Cristiano Ronaldo não é eleito melhor do mundo";
		
		microblog.adicionarPostagem(post1);
		microblog.adicionarPostagem(post2);
		microblog.adicionarPostagem(post3);
		
		microblog.curtir(1);
		microblog.curtir(2);
		microblog.curtir(3);
		microblog.curtir(3);
		microblog.curtir(3);
		microblog.curtir(1);
		
		
		System.out.println(microblog.postagemMaisCurtida());
	}
}
