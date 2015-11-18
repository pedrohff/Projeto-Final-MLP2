package escola.model;

import java.util.ArrayList;

public class Curso {
	private int id;
	private String nome;
	
	Professor prof;
	ArrayList <Aluno> lista = new ArrayList<Aluno>();
	public Curso(int id, String nome, Professor P, ArrayList<Aluno> lista){
		this.id=id;
		this.nome=nome;
		this.prof=P;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public int getMat(){
		return lista.size()+1;
	}
	
	public Aluno criarAluno(String nome, int cpf, int rg, int idade){
		return new Aluno(nome,rg,idade,getMat(),true);
	}
	
	public void addAluno(Aluno A){
		lista.add(A);
	}
	
	public void setProfessor(String nome, int rg, int cpf, int idade, int matricula){
		Professor setprof = new Professor(nome,rg,idade,matricula);
		this.prof=setprof;
	}
	
}
