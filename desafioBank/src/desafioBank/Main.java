package desafioBank;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome;
		String sobrenome;
		int selecionaConta;
		String tipoConta = "Corrente";
		double saldo = 2500.00;
		int opcao = 0;
		
		System.out.println("Digite seu nome: ");
		nome = scanner.next();
		
		System.out.println("Digite seu sobrenome: ");
		sobrenome = scanner.next();
		
		System.out.println("""
			Qual conta deseja acessar: 
			1 - Corrente
			2 - Poupanca""");
		selecionaConta = scanner.nextInt();
		
		if(selecionaConta == 1) {
			System.out.println("Conta Corrente selecionada com sucesso!");
		}else {
			System.out.println("Conta poupança não localizada nesse cadastro!");
			}
		
		System.out.println("""
				***********************
				Dados Inicias do Cliente:
				""");
		System.out.println("Nome: " + nome + " " + sobrenome);
		System.out.println("Tipo da Conta: " + tipoConta);
		System.out.println("Saldo Inicial: " + saldo);
		
		System.out.println("***********************");
		
		String menu = """
				Digite sua opcao
				
				1 - Consultar saldo
				2 - Transferir valor
				3 - Receber valor
				4 - Sair
				""";
		while(opcao != 4) {
			System.out.println(menu);
			opcao = scanner.nextInt();
			
			if(opcao ==1) {
				System.out.println("O saldo atual é: " + saldo);
			}else if (opcao == 2) {
				System.out.println("Qual o valor que deseja transfeir? " );
				double valor = scanner.nextDouble();
				if(valor > saldo) {
					System.out.println("Saldo Insuficiente");
				}else {
					saldo -= valor;
					System.out.println("Novo Saldo " + saldo);
				}
			}else if(opcao == 3) {
				System.out.println("Valor recebido: ");
				double valor = scanner.nextDouble();
				saldo+= valor;
				System.out.println("Novo saldo" + saldo);
			}else if(opcao != 4) {
				System.out.println("Opcao Invalida");
			}
		}

	}

}
