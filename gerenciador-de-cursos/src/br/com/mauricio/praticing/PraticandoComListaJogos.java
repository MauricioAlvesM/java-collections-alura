package br.com.mauricio.praticing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PraticandoComListaJogos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jogos j1 = new Jogos("Destiny 2", 2017);
		Jogos j2 = new Jogos("Call of Duty", 2019);
		Jogos j3 = new Jogos("Forza", 2022);
		Jogos j4 = new Jogos("Genshin impact", 2019);

		ArrayList<Jogos> jogos = new ArrayList<>();
		jogos.add(j1);
		jogos.add(j2);
		jogos.add(j3);
		jogos.add(j4);
		System.out.println(jogos);

		Collections.sort(jogos);
		System.out.println("Jogos Ordenados por titulo" + jogos);
		jogos.sort(Comparator.comparing(Jogos::getAnoLancamento));
		System.out.println("Jogos Ordenados por data de lançamento: " + jogos);

	}

}
