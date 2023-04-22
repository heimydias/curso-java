package lista;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial;
		int horaFinal;
		int duracao = 0;
		
		System.out.print("Digite a hora inicial e a hora final do jogo: ");
		String[] entrada= sc.nextLine().split(" ");
		horaInicial = Integer.parseInt(entrada[0]);
		horaFinal = Integer.parseInt(entrada[1]);
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.print("O JOGO DUROU " + duracao + " HORA(s)");
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
			System.out.print("O JOGO DUROU " + duracao + " HORA(s)");
		}
		
		sc.close();
	}
}
