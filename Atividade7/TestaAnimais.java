package Atividade7;

public class TestaAnimais {

	public static void main(String[] args) {
		Animal[] animais = new Animal[7];
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		
		Peixe peixe1 = new Peixe();
		Peixe peixe2 = new Peixe();
		
		Bovino bovino1 = new Bovino();
		Bovino bovino2 = new Bovino();
		Bovino bovino3 = new Bovino();
		
		animais[0] = animal1;
		animais[1] = animal2;
		animais[2] = peixe1;
		animais[3] = peixe2;
		animais[4] = bovino1;
		animais[5] = bovino2;
		animais[6] = bovino3;
		
		for (int i = 0; i < animais.length; i++) {
			if (animais[i] instanceof Bovino) {
				System.out.println("Bovino.");
			} else if (animais[i] instanceof Peixe){
				System.out.println("Peixe");
			} else if (animais[i] instanceof Animal) {
				System.out.println("Animal.");
			}
			
		}
	}

}
