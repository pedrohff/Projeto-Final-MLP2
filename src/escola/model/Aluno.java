package escola.model;

public class Aluno extends Pessoa{
	private int matricula;
	private boolean matriculado;
	public Aluno(String nome, int cpf, int rg, int idade, int matricula, boolean matriculado, Endereco end){
		super(nome,rg,cpf,idade,end);
		this.matricula=matricula;
		this.matriculado=matriculado;
		
	}
	
	
}
