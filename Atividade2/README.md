1.	Resposta: Não, a inicialização esta correta mas por quantReservas ser um atributo ele retornara como padrão o valor 0 que será incrementado se for chamado o método adicionarReserva().
2.	 Resposta: O código vai dar um erro de compilação pois o método construtor da classe Hotel não pode receber um valor inteiro já que não foi especificado previamente.
3.	Resposta: O código dar erro pois o this presente no system.out.println() e usado para referenciar valor de a que por não ter recebido nenhuma atribuição ele retorna por padrão 0 que e o resultado do código.
4.	O compilador não sabe identificar o que cada variável significa devido a ambiguidade e uma das ferramentas utilizadas para resolver esse tipo de problema e a utilização do this para se referir ao valor presente na classe o código fica assim.

void x(double valor) {

   this.valor += valor;
 
}

5.	O código dar erro pois na definição do método Radio foi pedido um parâmetro que não foi dado no método construtor do objeto r.
6.	a) os dois prints vão mostrar 90 pois a partir da atribuição de c1 em c2 ele aponta para o mesmo lugar em memoria logo não tem como ocorrer a transferência de c1 para c2.

   b) Por não ter mais referencia o c1 será excluído pelo garbage collector.
