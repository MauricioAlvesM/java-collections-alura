package br.com.mauricio.praticing;

import java.util.ArrayList;
import java.util.List;

public class TestaJogo {
	public static void main(String[] args) {

		Desenvolvedora titulos = new Desenvolvedora("Bungie", "Qualquer um");
		List<Jogos> jogos = titulos.getJogos();

//		titulos.getJogos().add(new Jogos("Destiny 2", 2017));
//		titulos.getJogos().add(new Jogos("Halo Infinity", 2019));

		titulos.adiciona(new Jogos("Destiny 2", 2017));
		titulos.adiciona(new Jogos("Halo Infinity", 2019));

		List<String> listaTeste = new ArrayList<>();
		listaTeste.add("String 1");
		listaTeste.add("String 2");
		System.out.println(listaTeste.size());
		System.out.println(listaTeste);
		
		listaTeste.sort(null);
		for (String string : listaTeste) {
			System.out.println("[" +string+"]");
		}
	}
}
