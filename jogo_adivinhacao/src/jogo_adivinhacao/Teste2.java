package jogo_adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {

		int random = new Random().nextInt(3);
		int insereNumero = 0;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {

			System.out.println("Digite um numero: ");
			insereNumero = scanner.nextInt();
			
			if(insereNumero < random) {
				System.out.println("O numero é menor que random.");
			}else {
				System.out.println("O numero é maior que random.");
			}

			if (insereNumero == random) {
				System.out.println("Parabens!!! Voce Acertou!!");
				return;
			}
		}
		System.out.println("Que pena!! Nao Acertou =( ");

	}
}

