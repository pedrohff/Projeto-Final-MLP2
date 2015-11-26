package escola.model;

import java.io.Serializable;

public class Aluno extends Pessoa implements Serializable{
	private int matricula;
	private boolean matriculado;
	public Aluno(String nome, int rg, int idade, int matricula, boolean matriculado){
		super(nome,rg,idade);
		this.matricula=matricula;
		this.matriculado=matriculado;
		
	}
	
	public int getMatricula(){
		return matricula;
	}
	
	public void setMatricula(int matricula){
		this.matricula=matricula;
	}
	
	public boolean getMatriculado(){
		return matriculado;
	}
	
	public void setMatriculado(boolean matriculado){
		this.matriculado=matriculado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + this.matricula + this.rg + this.idade;
	}
	
}
