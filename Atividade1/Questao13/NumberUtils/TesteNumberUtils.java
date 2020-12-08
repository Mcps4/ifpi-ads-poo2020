public class TesteNumberUtils {
    public static void main(String[] args){
        NumberUtils numberUtils = new NumberUtils();
        numberUtils.num = 10;
        System.out.println("O número é par: " + numberUtils.isPair());
        System.out.println("O número não é impar: " + numberUtils.isOdd());
        System.out.println("O número é Primo: " + numberUtils.isPrime());
        System.out.println("O número em contagem crescente é: " + numberUtils.printCount());
        System.out.println("O número em contagem decrescente é: " + numberUtils.printReverseCount());
    }
}
