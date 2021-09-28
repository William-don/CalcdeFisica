package calculadora;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escolha a matéria desejada: ");

		System.out.println("1 - Força Centripeda");
		System.out.println("2 - Força Elástica");
		System.out.println("3 - Força Peso");
		System.out.println("4 - Impulso");
		System.out.println("5 - MRU");
		System.out.println("6 - MRUV");
		System.out.println("7 - Velocidade Média");
		System.out.println("0 - Sair");

		double op = teclado.nextInt();
		double n1, n2, n3;
	
		if (op == 1) {
			System.out.println("Insira o valor 1:");
			n1 = teclado.nextInt();
			System.out.println("Insira o valor 2:");
			n2 = teclado.nextInt();
			System.out.println("Insira o valor 3:");
			n3 = teclado.nextInt();
			System.out.println("O valor da Força Centripeda é: " + n1 * ((float) Math.pow(n2, 2) / n3));
		} else if (op == 2) {
			System.out.println("Insira o valor 1:");
			n1 = teclado.nextInt();
			System.out.println("Insira o valor 2:");
			n2 = teclado.nextInt();
			System.out.println("O valor da Força Elástica é: " + n1 * n2);
		}

		else if (op == 3) {
			System.out.println("Insira o valor 1:");
			n1 = teclado.nextInt();
			System.out.println("Insira o valor 2:");
			n2 = teclado.nextInt();
			System.out.println("O valor da Força Peso é " + n1 * n2);
		} else if (op == 4) {
			System.out.println("Insira o valor 1:");
			n1 = teclado.nextInt();
			System.out.println("Insira o valor 2:");
			n2 = teclado.nextInt();
			System.out.println("O valor do Impulso é: " + n1 * n2);
		}

		else if (op == 5) {
			System.out.println("Insira o valor 1:");
			n1 = teclado.nextInt();
			System.out.println("Insira o valor 2:");
			n2 = teclado.nextInt();
			System.out.println("Insira o valor 3:");
			n3 = teclado.nextInt();
			System.out.println("O valor do MRU é: " + n1 + (n2 * n3));
		}

		else if (op == 6) {
			System.out.println("Insira o valor 1:");
			n1 = teclado.nextInt();
			System.out.println("Insira o valor 2:");
			n2 = teclado.nextInt();
			System.out.println("Insira o valor 3:");
			n3 = teclado.nextInt();
			System.out.println("O valor do MRUV é: " + n1 / n2);
		}

		else if (op == 7) {
			System.out.println("Insira o valor 1:");
			n1 = teclado.nextInt();
			System.out.println("Insira o valor 2:");
			n2 = teclado.nextInt();

			System.out.println("O valor do MRUV é: " + n1 / n2);
		}

		else if (op == 0) {
			teclado.close();
			System.out.print("Até logo!!!");
		} else if (op != 7) {

			System.out.print("Selecione uma opção!");
			
		}

	}
}
