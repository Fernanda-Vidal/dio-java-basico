package escola;

public class Aluno {
	private String nome;
	private int idade;
	private String sobrenome;
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String newNome) {
		this.nome = newNome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
}
