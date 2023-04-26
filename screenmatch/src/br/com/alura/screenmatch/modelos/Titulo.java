package br.com.alura.screenmatch.modelos;

public class Titulo {
	
	private String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalAvaliacoes;
	private int duracaoEmMinutos;
	
	int getTotalAvaliacoes() {
		return totalAvaliacoes;
	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}



	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}



	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}



	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}



	public double getSomaDasAvaliacoes() {
		return somaDasAvaliacoes;
	}



	public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
		this.somaDasAvaliacoes = somaDasAvaliacoes;
	}



	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}



	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}



	public void setTotalAvaliacoes(int totalAvaliacoes) {
		this.totalAvaliacoes = totalAvaliacoes;
	}



	void exibeFichaTecnica() {
		
		System.out.println("Nome do filme" + nome);
		System.out.println("Ano de Lancamento" + anoDeLancamento);
		
	}
	
	void avaliaNota(double nota) {
		somaDasAvaliacoes += nota;
		totalAvaliacoes++;
	}
	
	double pegaMedia() {
		return somaDasAvaliacoes / totalAvaliacoes;
	}
}
