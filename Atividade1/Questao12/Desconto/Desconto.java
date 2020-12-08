public class Desconto {
    double valor, desconto;
    double caucula(){
        return (valor * (1-(desconto / 100)));
    }
}
