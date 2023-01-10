package br.com.mauricio.praticing;

import java.util.ArrayList;
import java.util.Collections;

public class PraticandoComListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jogo1 = "Destiny 2";
		String jogo2 = "Valorant";
		String jogo3 = "Call of duty";
		
		ArrayList<String> jogos = new ArrayList<>();
		jogos.add(jogo1);
		jogos.add(jogo2);
		jogos.add(jogo3);
		
		System.out.println(jogos);
		jogos.remove(jogo2);
		// ou jogos.remove(0); passando o indice
		System.out.println("Lista depois de remover: "+jogos);
		jogos.get(0);
		System.out.println("Primeiro elemento da lista: " +jogos.get(0));

		jogos.forEach(jogo ->{
			System.out.println("Jogos :" +jogo);
		});
		
		Collections.sort(jogos);
		System.out.println("Jogos Ordenados: "+ jogos);
		
		for (String item : jogos) {
			System.out.println("Jogos: " +item);
		}
		
		
	}

}
