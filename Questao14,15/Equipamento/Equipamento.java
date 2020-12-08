public class Equipamento {
    boolean ligado;
    void liga(){
        if(ligado == false){
            ligado = true;
        } else {

        }

    }
    void desliga(){
        if(ligado == true){
            ligado = false;
        } else {

        }
    }
    void inverte(){
        if(ligado == true){
            ligado = false;
        } else {
            ligado = true;
        }
    }
    boolean estaLigado(){
        if(ligado == true){
            return true;
        } else {
            return false;
        }
    }

}
