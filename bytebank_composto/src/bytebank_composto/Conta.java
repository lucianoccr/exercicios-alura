package bytebank_composto;

/*Classe*/
public class Conta {
	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
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
}







