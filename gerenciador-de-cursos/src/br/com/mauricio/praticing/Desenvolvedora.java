package br.com.mauricio.praticing;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Desenvolvedora {

	private String nome;
	private String dev;
	private List<Jogos> jogos = new LinkedList<>();
	
	
	
	public Desenvolvedora(String nome, String dev) {
		this.nome = nome;
		this.dev = dev;
	}

	public String getNome() {
		return nome;
	}
	
	public String getDev() {
		return dev;
	}
	
	public List<Jogos> getJogos(){
		return Collections.unmodifiableList(jogos);
	}
	
	public void adiciona(Jogos jogo) {
		this.jogos.add(jogo);
	}
	
}
