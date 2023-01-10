package br.com.mauricio.praticing;

public class Jogos implements Comparable<Jogos>{
	private String titulo;
	private int anoLancamento;
	
	
	public Jogos (String titulo, int ano) {
		this.titulo = titulo;
		this.anoLancamento = ano;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "NOME: " + this.titulo + ", DATA DE LANÇAMENTO: "+ this.anoLancamento;
	}

	@Override
	public int compareTo(Jogos outroJogo) {
		return this.titulo.compareTo(outroJogo.getTitulo());
	}
}
