public class TesteDecimalNumber {
    public static void main(String[] args){
        DecimalNumber decimalNumber = new DecimalNumber();
        decimalNumber.number = 7.5;
        System.out.println("Parte inteira: " + decimalNumber.NumeroInteiro());
        System.out.println("Parte decimal: " + decimalNumber.NumeroDecimal());
    }
}
