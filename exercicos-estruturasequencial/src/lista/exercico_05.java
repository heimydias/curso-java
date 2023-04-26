package lista;
import java.util.Scanner;

public class exercico_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int cPeca1;
		int cPeca2; 
		int nPeca1;
		int nPeca2;
		double vPeca1;
		double vPeca2;
		double vPagar;
		
		
		System.out.print("Peça 1 \nDigite o código, quantidade e valor unitário de uma peça: ");
		String[] entrada1= sc.nextLine().split(" ");
		cPeca1 = Integer.parseInt(entrada1[0]);
		nPeca1 = Integer.parseInt(entrada1[1]);
		vPeca1 = Double.parseDouble(entrada1[2]);
		
		System.out.print("Peça 2 \nDigite o código, quantidade e valor unitário de uma peça: ");
		String[] entrada2= sc.nextLine().split(" ");
		cPeca2 = Integer.parseInt(entrada2[0]);
		nPeca2 = Integer.parseInt(entrada2[1]);
		vPeca2 = Double.parseDouble(entrada2[2]);
		
		vPagar = (vPeca1 * nPeca1) + (vPeca2 * nPeca2);
		
		System.out.printf("Valor a pagar: %.2f", vPagar);
		System.out.println(", pelas peças de código: " + cPeca1 + " e " + cPeca2);
		
		
		
		sc.close();
	}

}
