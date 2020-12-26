package Questao4;

public class Pilha {
    int[] array = new int[5];
    int index = 0;

    public void empilhar(int numero){
        if(index > 4){
            System.out.println("Pilha lotada!");
        } else{
            this.array[index] = numero;
            index ++;
        }
    }

    public boolean estaCheia(){
        if(index >= 5){
            return true;
        }
        return false;
    }

    public void desempilhar(){
        index --;
        this.array[index] = 0;
    }

    public int retornarTopo(){
        return this.array[4];
    }

    public void exibir(){
        String elementosPilha = "";
        for(int i = 0; i <= this.array.length - 1; i++){
            elementosPilha += array[i] + ", ";
        }

        elementosPilha += array[4];
        System.out.println(elementosPilha);
    }
}
