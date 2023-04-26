package bytebank_encapsulado;

/*Classe*/
public class Conta {
	
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia, int numero) {
		
		Conta.total ++;
		System.out.println("Conta criada com sucesso!!");
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta" + this.numero);
	}

	/* Metodo */
	public void deposita(double valor){
		 this.saldo = this.saldo + valor;
	}
	/* Metodo */
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		
		}	
			return false;
		}
		
	/* Metodo com classe privada */
		public double getSaldo() {
			return this.saldo;
			
	}
		
		/* Conceito de Get e Set */
		
		public void setNumero(int numeroConta) {
			if(numero <= 0) {
				System.out.println("nao pode valor menor ou igual a 0");
			}
			this.numero = numeroConta;
			
		}
		
		public int getNumero() {
			return this.numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		
		public void setAgencia(int agencia) {
			if(agencia <= 0) {
				System.out.println("nao pode valor menor ou igual a 0");
				return;
			}
			this.agencia = agencia;
		}
		
		public void setTitular(Cliente titular) {
			this.titular = titular;
		}
		
		public Cliente getTitular() {
			return titular;
		}
		
		public static int getTotal() {
			return Conta.total;
		}
}









