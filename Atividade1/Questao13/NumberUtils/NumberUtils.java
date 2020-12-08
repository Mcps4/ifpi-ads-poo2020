public class NumberUtils {
    int num;
    boolean isPair(){
        return (num % 2 == 0);
    }
    boolean isOdd(){
        return (num % 2 != 0);
    }
    boolean isPrime(){
        for (int x = 2; x < num; x++) {
            if (num % x == 0)
                return false;   
        }
        return true;
    }
    String printCount(){
        String numeros = "";
        for(int y = 0; y <= num; ++y){
            numeros += y + ", ";
        }
        return numeros;
    }
    String printReverseCount(){
        String numeros = "";
        for(int z = num; z >= 0; --z){
            numeros += z + ", ";
        }
        return numeros;
    }
}
