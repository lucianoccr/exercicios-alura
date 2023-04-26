package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculadora.FiltroDeRecomendacao;

public class Main {

	public static void main(String[] args) {
		Filme poderosoChefao = new Filme();
		poderosoChefao.setNome("O Poderoso Chefão");
		poderosoChefao.setAnoDeLancamento(1970);
		poderosoChefao.setDuracaoEmMinutos(180);
		
		poderosoChefao.exibeFichaTecnica();
		poderosoChefao.avaliaNota(9);
		poderosoChefao.avaliaNota(5);
		poderosoChefao.avaliaNota(6);
		System.out.println("O total de avaliacoes e: " + poderosoChefao.getTotalAvaliacoes());
		System.out.println(poderosoChefao.pegaMedia());
		
		Filme avatar = new Filme();
		avatar.setNome("Avatar: O caminho das Aguas");
		avatar.setAnoDeLancamento(2023);
		avatar.setDuracaoEmMinutos(180);
		
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(12);
		lost.setMinutosPorEpisodio(51);
		lost.getDuracaoEmMinutos();
		System.out.println("Duração para maratonar: " + lost.getDuracaoEmMinutos());
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(avatar);
		calculadora.inclui(poderosoChefao);
		calculadora.inclui(lost);
		System.out.println("Voce Levara uma media de: " + calculadora.getTempoTotal() + " " + "minutos.");
		
		FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
		filtro.filtra(avatar);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
		}
	
}
