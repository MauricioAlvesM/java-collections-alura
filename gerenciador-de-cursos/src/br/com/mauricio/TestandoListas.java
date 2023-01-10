package br.com.mauricio;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		aulas.remove(aula1);
		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula eh: " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("aula : " + aulas.get(i));
		}

		System.out.println("Contem: " + aulas.size() + " aulas");

		aulas.forEach(aula -> {
			System.out.println("percorrendo :" + aula);
		});

		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas);
		System.out.println("Depois de ordenado: "+aulas);

	}

}
