package escola.model;

public abstract class Pessoa {
	protected String nome;
	protected int rg;
	protected int cpf;
	protected int idade;
	public Pessoa(String nome, int rg, int cpf, int idade, Endereco end){
		this.nome=nome;
		this.rg=rg;
		this.cpf=cpf;
		this.idade=idade;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public int getCpf(){
		return cpf;
	}
	
	public void setCpf(int cpf){
		this.cpf=cpf;
	}
	
	public int getRg(){
		return rg;
	}
	
	public void setRg(int rg){
		this.rg=rg;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade=idade;
	}

}
