package Atividade7;

public class TestaPessoas {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Funcionario funcionario = new Funcionario();
		Professor professor = new Professor();
		
		pessoa.setNome("Fabio");
		pessoa.setSobrenome("Alencar");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSobrenome());
		System.out.println(pessoa.getNomeCompleto());
		
		funcionario.setNome("Caio");
		funcionario.setSobrenome("Moura");
		funcionario.setMatricula(1);
		funcionario.setSalario(25000);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getSobrenome());
		System.out.println(funcionario.getNomeCompleto());
		System.out.println(funcionario.getMatricula());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getSalarioPrimeiraParcela());
		System.out.println(funcionario.getSalarioSegundaParcela());
		
		professor.setNome("Luis");
		professor.setSobrenome("Almeida");
		professor.setMatricula(2);
		professor.setSalario(35000);
		professor.setTitulacao("Doutor");
		
		System.out.println(professor.getNome());
		System.out.println(professor.getSobrenome());
		System.out.println(professor.getNomeCompleto());
		System.out.println(professor.getMatricula());
		System.out.println(professor.getSalario());
		System.out.println(professor.getTitulacao());
		System.out.println(professor.getSalarioPrimeiraParcela());
		System.out.println(professor.getSalarioSegundaParcela());
	}
}
