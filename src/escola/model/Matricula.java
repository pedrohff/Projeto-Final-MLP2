package escola.model;

import java.io.Serializable;

public class Matricula implements Serializable{
	private int idCurso;
	private int matricula;
	
	public Matricula(int idCurso, int matricula){
		this.idCurso=idCurso;
		this.matricula=matricula;
	}
	
	public int getId(){
		return idCurso;
	}
	
	public void setId(int id){
		this.idCurso=id;
	}
	
	public int getMatricula(){
		return matricula;
	}
	
	public void setMatricula(int matricula){
		this.matricula=matricula;
	}
}
