package br.com.alura.screenmatch.calculadora;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal;
	
	public int getTempoTotal () {
		return tempoTotal;
		
	}

	public void inclui(Titulo titulo) {
		System.out.println("Adicionando duracao em minutos de..." + titulo);
		this.tempoTotal += titulo.getDuracaoEmMinutos();
	}
}
