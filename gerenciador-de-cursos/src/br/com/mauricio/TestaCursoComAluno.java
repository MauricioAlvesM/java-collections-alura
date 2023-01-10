package br.com.mauricio;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes", "Paulo");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Luffy Taro", 55555);
		Aluno a3 = new Aluno("Zoro Juro", 56783);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno ->{
			System.out.println(aluno);
		});
		
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterator = alunos.iterator();
		System.out.println("----------------------------------");
		while(iterator.hasNext()) {
			Aluno proximo = iterator.next();
			System.out.println(proximo);
		}
		
		
		System.out.println("O aluno" + a1 + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno turini  = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse esta?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		System.out.println(a1.equals(turini));
		// obrigatoriamente o seguinte é true:
		
		System.out.println(a1.hashCode() == turini.hashCode());
	}

}
