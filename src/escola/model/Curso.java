package escola.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Curso implements Serializable {
	private int id;
	private String nome;
	private int periodo;
	

	ArrayList <Aluno> lista = new ArrayList<Aluno>();
	public Curso(int id, String nome, int periodo){
		this.id=id;
		this.nome=nome;
		this.periodo=periodo;
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
	
	public int getPeriodo(){
		return periodo;
	}
	
	public void setPeriodo(int periodo){
		this.periodo=periodo;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + this.nome + this.periodo;
	}
}
