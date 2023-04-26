package jogo_adivinhacao;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int random = new Random().nextInt(100);
		int insereNumero = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i <=4; i++ ) {

			if (random != insereNumero) {
				System.out.println("Digite um numero: ");
				insereNumero = scanner.nextInt();
			
			}else {
				int resultado = insereNumero;
				System.out.println("Voce acertou! O numero é: " + resultado);
				break;
			}
		}
		
	}

}


