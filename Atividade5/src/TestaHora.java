package Atividade5.src;

public class TestaHora {
	public static void main(String[] args) {
		Hora hora = new Hora(16,34,47);
		
		hora.getHorario();
		
		hora.setHora(20);
		
		hora.getHorario();
		
		hora.setMinutos(25);
		
		hora.getHorario();
		
		hora.setSegundos(12);
		
		hora.getHorario();

	}
}
