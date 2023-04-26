package bytebank;

/*Classe criada para testar chamando um método*/


public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.saldo = 100;
		
		conta.deposita(50);
		System.out.println(conta.saldo);
		
		boolean conseguiuRetirar = conta.saca(20);
		System.out.println(conta.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(1000);
		
		if (segundaConta.transfere(300, conta)) {
			System.out.println("transferencia feita com sucesso!");
		} else {
			System.out.println("Saldo Insuficiente.");
		}
		System.out.println(segundaConta.saldo);
	}
		

}

