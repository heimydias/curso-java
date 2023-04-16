import java.util.Scanner;

public class exercico_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int nFuncionario; 
		int hTrabalhadas;
		double vHora;
		double salario;
		
		
		System.out.print("Digite o número do funcionário: ");
		nFuncionario= sc.nextInt();
		System.out.print("Digite as horas trabalhadas: ");
		hTrabalhadas = sc.nextInt();
		System.out.print("Digite o valor recebido por hora: ");
		vHora = sc.nextDouble();
		
		salario = hTrabalhadas * vHora;
		
		System.out.println("Funcionário nº " + nFuncionario);
		System.out.printf("Salário = %.2f", salario);
		
		sc.close();
	}

}
