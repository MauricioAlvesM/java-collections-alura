package br.com.mauricio;

public class TesteBuscaAlunosNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 22));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Luffy Taro", 55555);
		Aluno a3 = new Aluno("Zoro Juro", 56783);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem e o aluno com matricula 55555");
		Aluno aluno = javaColecoes.buscaMatriculado(55555);
		System.out.println("Aluno :" +aluno);
		

	}

}
