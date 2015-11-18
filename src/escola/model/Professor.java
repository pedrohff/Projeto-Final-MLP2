package escola.model;

public class Professor extends Pessoa{
	private int matricula;
	public Professor(String nome, int rg, int idade, int matricula){
		super(nome,rg,idade);
		this.matricula=matricula;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	
	public void setMatricula(int matricula){
		this.matricula=matricula;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome + this.matricula;
	}
}
