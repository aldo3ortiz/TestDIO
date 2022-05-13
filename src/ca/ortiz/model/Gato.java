package ca.ortiz.model;

public class Gato {
	
	private String nome;
	private String cor;
	private int idade;
	
	
	public Gato() {
		
	}
	
	public Gato(String nome, String cor, int idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	
	///GETTERS
	
	public String getNome() {
		return nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public int getIdade() {
		return idade;
	}
	
	///SETTERS
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String toString(){
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}
	
}
