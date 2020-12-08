public class DecimalNumber {
    double number;

    int NumeroInteiro(){
        return (int) number;
    }
    double NumeroDecimal(){
        return (number - (int) number);
    }

}
