package escola.model;

public class Endereco {
	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private int cep;
	
	public Endereco(String rua, int numero, String bairro, String cidade, int cep){
		this.rua=rua;
		this.numero=numero;
		this.bairro=bairro;
		this.cidade=cidade;
		this.cep=cep;
	}
	
	public String getRua(){
		return rua;
	}
	
	public void setRua(String r){
		this.rua=r;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public void setNumero(int n){
		this.numero=n;
	}
	
	public String getBairro(){
		return bairro;
	}
	
	public void setBairro(String b){
		this.bairro=b;
	}
	
	public String getCidade(){
		return cidade;
	}
	
	public void setCidade(String c){
		this.cidade=c;
	}
	
	public int getCep(){
		return cep;
	}
	
	public void setCep(int cep){
		this.cep=cep;
	}
	
	@Override
	public String toString() {
		
		return this.rua + ", " + this.numero + ", " + this.bairro + "." + this.cidade + "CEP: " + this.cep;
	}
	
}
