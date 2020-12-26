package Questao3;

public class Senha {
    public String valor;

    public void iguais(String valor){
        if(valor.equals(this.valor)){
            System.out.println("São iguais");
        } else{
            System.out.println("São diferentes");
        }
    }

    public void iguaisTrim(String valor){
        String senhaSemEspacos = valor.trim();
        
        if(senhaSemEspacos.equals(this.valor)){
            System.out.println("São iguais");
        } else{
            System.out.println("São diferentes");
        }
    }

    public boolean tamanhoSeguro(){
        if(this.valor.length() >= 6){
            return true;
        }
        return false;
    }

    public boolean possuiMaiusculaMinuscula(){
        int qtdCharMai = 0;
        int qtdCharMin = 0;

        for(int i = 0 , tam = this.valor.length(); i < tam; i++){
            if(valor.charAt(i) >= 'A' && valor.charAt(i) <= 'Z'){
                qtdCharMai ++;
            }

            if(valor.charAt(i) >= 'a' && valor.charAt(i) <= 'z'){
                qtdCharMin ++;
            }
        }

        if(qtdCharMai > 0 && qtdCharMin > 0){
            return true;
        }
        return false;
    }

    public boolean possuiNumero(){
        int qtdCharNum = 0;

        for(int i = 0, tam = this.valor.length(); i < tam; i++){
            if(valor.charAt(i) >= '0' && valor.charAt(i) <='9'){
                qtdCharNum ++;
            }
        }

        if(qtdCharNum > 0){
            return true;
        }
        return false;
    }

    public boolean ehValida(){
        if(tamanhoSeguro() && possuiMaiusculaMinuscula() && possuiNumero()){
            return true;
        }
        return false;
    }
}
