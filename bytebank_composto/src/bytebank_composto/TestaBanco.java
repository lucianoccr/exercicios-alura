package bytebank_composto;

public class TestaBanco {

	public static void main(String[] args) {
		
		//Criei o objeto conta.
		Cliente luciano = new Cliente();
		luciano.nome = "Luciano Caetano";
		luciano.cpf = "222.222.222-222";
		luciano.profissao = "programador";
		
		//Usei o método deposita para depositar dinheiro.
		Conta contaDoLuciano = new Conta ();
		contaDoLuciano.deposita(100);
		
		//Associa o cliente Luciano a conta contaDoLuciano
		contaDoLuciano.titular = luciano;
		System.out.println(contaDoLuciano.titular.nome);
		
	}

}